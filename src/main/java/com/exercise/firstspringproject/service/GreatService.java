package com.exercise.firstspringproject.service;

import com.exercise.firstspringproject.model.Grade;
import com.exercise.firstspringproject.repository.GreatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GreatService {

    @Autowired
    GreatRepo greatRepo;
    public List<Grade> greatService(){
        //GreatRepo repo = new GreatRepo();
        return greatRepo.findGrades();

    }

    public List<Grade> addGrade(Grade grade){
        greatRepo.addGrade(grade);
        return greatRepo.findGrades();
    }

    public List<Grade> updateGrade(int studentId, Grade studentScore){
        greatRepo.updateGrade(studentId, studentScore);
        return greatRepo.findGrades();
    }

//    public List<Grade> deleteGrade(int studentId){
//        greatRepo.deleteGrade(studentId);
//        return greatRepo.findGrades();
//    }


}
