package com.github.codersparks.dockerservice.web;

import com.github.codersparks.dockerservice.model.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by codersparks on 05/12/2015.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public ResponseEntity<Greeting> home() {

        return this.home("world");
    }

    @RequestMapping("/{name}")
    public ResponseEntity<Greeting> home(@PathVariable("name") String name) {

        Greeting greeting = new Greeting();
        greeting.setName(name);

        return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
    }
}
