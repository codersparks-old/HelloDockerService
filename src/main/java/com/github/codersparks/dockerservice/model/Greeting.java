package com.github.codersparks.dockerservice.model;

import java.util.Date;

/**
 * Created by codersparks on 05/12/2015.
 */
public class Greeting {

    private String name;
    private String greeting = "hello";
    private Date date = new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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
