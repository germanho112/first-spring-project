package com.exercise.firstspringproject.controller;

import com.exercise.firstspringproject.model.Grade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class FirstController {

    // List<String> test = new ArrayList<String>(Arrays.asList("String123","String456","String789"));

    Grade studentGrade1 = new Grade("Alex", 70.2, "Java Fundamentals");
    Grade studentGrade2 = new Grade("Betty", 72.2, "Java Fundamentals");
    Grade studentGrade3 = new Grade("Cathy", 73.2, "Java Fundamentals");

    List<Grade> test = new ArrayList<Grade>(Arrays.asList(studentGrade1, studentGrade2, studentGrade3));


    @GetMapping("/tests")
    List<Grade> getAllTest(){
        return test;
    }
}
