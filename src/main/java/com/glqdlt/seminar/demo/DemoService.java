package com.glqdlt.seminar.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {


    private List<Hero> list = new ArrayList<>();

    public List<Hero> getList() {
        return list;
    }

    synchronized public void setList(Hero hero) {
        list.add(hero);
    }
}
