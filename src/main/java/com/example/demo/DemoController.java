package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/test")
    ResponseEntity<String> getGivenId(@RequestParam Integer id) {
        DemoEntity value = demoService.retrieveFromRepository(id);
        return new ResponseEntity<>(value.getValue(), HttpStatus.OK);
    }

    @PostMapping("/test")
    ResponseEntity<String> simplePost() {
        demoService.saveToRepository();
        return new ResponseEntity<>("saved successfully", HttpStatus.OK);
    }

}
