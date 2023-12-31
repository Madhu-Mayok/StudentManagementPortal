package com.example.Student.Management.Portal;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import java.util.logging.Logger;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;


    public Student get_info(int id){
        return repository.getInfo(id);
    }

    public void addStudent(Student student){
        repository.addStudent(student);
    }

}