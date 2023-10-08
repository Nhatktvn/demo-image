package com.minhnhat.uploadimage.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private HttpServletRequest request;
    public static String uploadDirectory = System.getProperty("user.dir") + "/src/main/resources/static/images";
    @PostMapping
    public String uploadImage(@RequestParam("image") MultipartFile photo) {
        if(photo.isEmpty()){
            return "no image";
        }
        Path path = Paths.get(uploadDirectory);
        try{
            InputStream inputStream = photo.getInputStream();
            Files.copy(inputStream,path.resolve(photo.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e){
            e.getMessage();
        }
        return "redirect:/" + request.getServerName();
    }
}
