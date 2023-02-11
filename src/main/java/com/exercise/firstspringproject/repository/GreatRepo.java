package com.exercise.firstspringproject.repository;

import com.exercise.firstspringproject.model.Grade;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GreatRepo {

    Grade studentGrade1 = new Grade(1, "Alex", 70.2, "Java Fundamentals");
    Grade studentGrade2 = new Grade(2, "Betty", 72.2, "Java Fundamentals");
    Grade studentGrade3 = new Grade(3, "Cathy", 73.2, "Java Fundamentals");

    List<Grade> test = new ArrayList<Grade>(Arrays.asList(studentGrade1, studentGrade2, studentGrade3));

    public List<Grade> findGrades(){
        return test;
    }

    public void addGrade(Grade grade){
        test.add(grade);
    }

    public void updateGrade(int studentId, Grade grade){
        for (Grade studentGrade: test){
            if (studentGrade.getStudentId() == studentId){
                studentGrade.setStudentGrade(grade);
            }
        }
    }

//    public void deleteGrade(int studentId){
//        for (Grade studentGrade: test){
//            if (studentGrade.getStudentId() == studentId){
//                test.remove(studentGrade);
//            }
//        }
//    }
}
