package com.glqdlt.seminar.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.List;

@ComponentScan
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


    @Autowired
    DemoService demoService;

    @Override
    public void run(String... strings) throws Exception {

        demoService.setList(new Hero(1, "JhunIlWoong"));
        demoService.setList(new Hero(2, "kimSooWoong"));
        demoService.setList(new Hero(3, "KimGiTae"));


    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
