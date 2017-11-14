package com.glqdlt.seminar.demo;

import org.springframework.stereotype.Service;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {


    public String sendMsg(String message) {
        return "Nice to Meet You, " + message;
    }


}
