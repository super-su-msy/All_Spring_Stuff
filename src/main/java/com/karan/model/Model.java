package com.karan.model;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class Model {
@RequestMapping("/check")
    public String Check(){
        return "Just Checking ";
    }
}
