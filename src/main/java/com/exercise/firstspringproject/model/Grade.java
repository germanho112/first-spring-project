package com.exercise.firstspringproject.model;

public class Grade {
   private String studentName;
   private Double studentScore;
   private String subjectName;

   public Grade(String studentName, double studentScore, String subjectName){
      this.studentName = studentName;
      this.studentScore = studentScore;
      this.subjectName = subjectName;
   }

   public String getStudentName(){
      return studentName;
   }

   public double getStudentScore(){
      return studentScore;
   }

   public String getSubjectName(){
      return subjectName;
   }
}
