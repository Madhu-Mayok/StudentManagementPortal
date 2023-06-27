package com.example.Student.Management.Portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

//@RequestMapping("random")
public class StudentController {

    // public Logger logger = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    Service service;

    @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int admnNo){
        return service.get_info(admnNo);
    }

    @PostMapping("/add")
    ResponseEntity addStudent(@RequestBody() Student student){
        service.addStudent(student);
        return new ResponseEntity<>("Added", HttpStatus.CREATED);
    }


//    @DeleteMapping("/delete/{id}")
//    String deleteStudent(@PathVariable("id") int admnNo){
//
//    }

    // Homework
    // Put - id
    // Get API - name
}