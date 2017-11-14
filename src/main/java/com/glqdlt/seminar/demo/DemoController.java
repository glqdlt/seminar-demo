package com.glqdlt.seminar.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.plugin2.message.Message;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/greeting")
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<String> AddMessage(@RequestBody String message) {

        log.info("Get Message ==> " + message);
        return new ResponseEntity<>(demoService.sendMsg(message), HttpStatus.OK);

    }


}
