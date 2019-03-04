package com.ssl.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping
    public ResponseEntity<?> sayHellow(){

        Model model = new Model();
        model.setMessage("hello");


        return new ResponseEntity<>(model, HttpStatus.OK);
    }

}
