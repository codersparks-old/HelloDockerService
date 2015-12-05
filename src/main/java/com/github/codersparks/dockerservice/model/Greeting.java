package com.github.codersparks.dockerservice.model;

/**
 * Created by codersparks on 05/12/2015.
 */
public class Greeting {

    private String name;
    private String greeting = "hello";

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
