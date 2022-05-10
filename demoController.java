package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class demoController {


        @RequestMapping(path = "/", method = RequestMethod.GET)
        public Person getGreeting(){
            Person ali = new Person( "Sasha", 20);
            return ali;
        }
}



