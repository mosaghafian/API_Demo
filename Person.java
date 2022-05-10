package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    //  Initializing an id for the person class
    //  The final means the variable is basically a constant and its value cannot be changed. Essentialy the variable should have
    //  have an initialization value that sets it as a constant
    //private final UUID id;
    // Initializing a name for the person class

    private final String name;

    private final int age;

    // Constructors
    // Parsing our json to
    public Person(@JsonProperty("name") String name, @JsonProperty("age") int age) {
        //this.id = id;
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
