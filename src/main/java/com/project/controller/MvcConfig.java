package com.project.controller;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        Path brandUploadDir= Paths.get("./brand-logos");
        String brandUploadPath=brandUploadDir.toFile().getAbsolutePath();

        registry.addResourceHandler("/brand-logos/**").addResourceLocations("file:/"+brandUploadPath+"/");

    }
}
