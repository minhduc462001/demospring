package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    @GetMapping("/")
    public String h(){
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam("name") String name,
                       @RequestParam("file")MultipartFile file, Model model){
        UploadFile uploadFile = new UploadFile();
        uploadFile.setName(name);
        Path path = Paths.get("uploads/");
        try {
            InputStream inputStream = file.getInputStream();
            Files.copy(inputStream,path.resolve(file.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);
            uploadFile.setPhoto(file.getOriginalFilename().toLowerCase(Locale.ROOT));

            model.addAttribute("infor",uploadFile);
            model.addAttribute("file_name",file.getOriginalFilename());
        }catch (Exception e){
            e.printStackTrace();
        }
        return "img";
    }
}
