package com.example.education.model;

import org.springframework.web.multipart.MultipartFile;

public class Student {
    private String name;
    private String email;
    private String subject;
    private String message;
    private String img;
    private long number;
    private MultipartFile file;

    public Student(String name, String email, String subject, String message, String img, long number, MultipartFile file) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
        this.img = img;
        this.number = number;
        this.file = file;
    }

    public Student() {;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", img='" + img + '\'' +
                ", number=" + number +
                ", file=" + file +
                '}';
    }
}
