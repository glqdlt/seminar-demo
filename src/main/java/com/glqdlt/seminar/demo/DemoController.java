package com.glqdlt.seminar.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    DemoService demoService;


    @RequestMapping(value = "/api/heroes", method = RequestMethod.GET)
    public ResponseEntity<List<Hero>> GetHeroes() {
        demoService.getList().forEach(x -> log.info(x.toString()));

        return new ResponseEntity<>(demoService.getList(), HttpStatus.OK);
    }

    @RequestMapping(value = "/set/user", method = RequestMethod.PUT)
    public ResponseEntity<?> SetUser(@RequestParam(name = "hero") Hero hero) {
        demoService.setList(hero);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
