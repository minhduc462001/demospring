package com.example.demo;

import javax.persistence.*;
import java.util.Date;

    @Entity
    @Table(name = "user")
    public class User {
        @Id
        @GeneratedValue
        private int id;

        @Column(name = "first_name",nullable = false)
        private String firstName;

        @Column(name = "last_name",nullable = false)
        private String lastName;

        @Column(name = "password",nullable = false)
        private String password;

        @Column(name = "email")
        private String email;

        @Column(name = "phone_number")
        private String phoneNumber;

        @Column(name = "address")
        private String address;

        @Column(name = "birthday")
        private Date birthday;

        @Column(name = "sex")
        private int sex;

        @Column(name = "hometown")
        private String hometown;

        @Column(name = "description")
        private String description;

        @Column(name = "hobby")
        private String hobby;

        @Column(name = "avatar",nullable = false)
        private String avatar;

        @Column(name = "background",nullable = false)
        private String background;

        public User(int id, String firstName, String lastName, String password, String email, String phoneNumber,
                    String address, Date birthday, int sex, String hometown, String description,
                    String hobby, String avatar, String background) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.birthday = birthday;
            this.sex = sex;
            this.hometown = hometown;
            this.description = description;
            this.hobby = hobby;
            this.avatar = avatar;
            this.background = background;
        }

        public User() {
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", password='" + password + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", address='" + address + '\'' +
                    ", birthday=" + birthday +
                    ", sex=" + sex +
                    ", hometown='" + hometown + '\'' +
                    ", description='" + description + '\'' +
                    ", hobby='" + hobby + '\'' +
                    ", avatar='" + avatar + '\'' +
                    ", background='" + background + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Date getBirthday() {
            return birthday;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getHobby() {
            return hobby;
        }

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getBackground() {
            return background;
        }

        public void setBackground(String background) {
            this.background = background;
        }
    }

