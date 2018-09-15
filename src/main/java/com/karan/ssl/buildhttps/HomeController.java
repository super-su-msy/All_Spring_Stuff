package com.karan.ssl.buildhttps;

import com.karan.model.Model;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan({"basePackageClasses = Model.class","com.karan.ssl.buildhttps"})
@RestController
@RequestMapping()
public class HomeController {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Howdy " + name + ", have a good day!!";
    }

}
