package com.exercise.firstspringproject.controller;

import com.exercise.firstspringproject.model.Grade;
import com.exercise.firstspringproject.service.GreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class FirstController {

    @Autowired
    GreatService greatService;

    @GetMapping("/tests")
    List<Grade> getAllTest(){
        //GreatService service =  new GreatService();
        List<Grade> grades = greatService.greatService();
        System.out.print(grades);
        return grades;
    }

    @PostMapping("/tests")
        List<Grade> addGrade(@RequestBody Grade grade){
        return greatService.addGrade(grade);
    }

    @PutMapping("/tests/{id}")
        List<Grade> modifyGrade(@PathVariable Integer id, @RequestBody Grade grade){
        return greatService.updateGrade(id, grade);
    }

//    @DeleteMapping("tests/{id}")
//        List<Grade> deleteGrade(@PathVariable Integer id){
//        return greatService.deleteGrade(id);
//    }







}
