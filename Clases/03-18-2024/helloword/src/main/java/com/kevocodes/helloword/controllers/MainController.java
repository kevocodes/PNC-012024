package com.kevocodes.helloword.controllers;

import com.kevocodes.helloword.dtos.GeneralResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/hello-world")
    private ResponseEntity<GeneralResponse> getHelloWorld() {
        return new ResponseEntity<>(
                new GeneralResponse("Hello world", 20),
                HttpStatus.OK
        );
    }

    @GetMapping("/hello-world/{name}")
    private ResponseEntity<GeneralResponse> getHelloWorldNamed(@PathVariable String name) {
        return new ResponseEntity<>(
                new GeneralResponse("Hello ", name),
                HttpStatus.OK
        );
    }
}