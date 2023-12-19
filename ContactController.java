package com.example.education.controller;

import com.example.education.model.Student;
import com.example.education.service.StudentService;
import com.example.education.storage.StorageFileNotFoundException;
import com.example.education.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ContactController {

    private StorageService storageService;
    @Autowired
    private StudentService service;
    @Autowired
    public ContactController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/contact")
    public String getContact(Model model){
        model.addAttribute("student", new Student());
        return "contact";
    }
    @PostMapping("/contact")
    public String addContact(@ModelAttribute Student student,
                             Model model,
                             @RequestParam ("file") MultipartFile file){
        storageService.store(file);
        Student newStudent = service.save(student);
        model.addAttribute("student", newStudent);
        model.addAttribute("files", storageService.loadAll().map(
        path -> MvcUriComponentsBuilder.fromMethodName(ContactController.class,
                                "serveFile", path.getFileName().toString()).build().toUri().toString())
                .collect(Collectors.toList()));
        return "result";
    }

    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

        Resource file = storageService.loadAsResource(filename);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }

    @PostMapping("/result")
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {

        storageService.store(file);
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");
        return "redirect:/result";
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }
//    @GetMapping("/files")
//    public String listFiles(Model model) {
//        List<String> fileUrls = new ArrayList<>();
//        fileUrls.add("http://localhost/files/first.txt");
//        fileUrls.add("http://localhost/files/second.txt");
//        model.addAttribute("files", fileUrls);
//        return "files/list";
//    }

}
