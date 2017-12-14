package com.nokia.oss.neo.hackathon.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonHandler {
	
	List<String> persons = new ArrayList<>();

    @RequestMapping("/add")
    public String add(@RequestParam(value="name", required=true) String name) {
    	persons.add(name);
        return name;
    }
    
    @RequestMapping("/get")
    public String get(@RequestParam(value="index", required=true) int index) {
    	return persons.get(index);
    }
}

