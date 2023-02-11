package com.exercise.firstspringproject.model;

public class Grade {
   private Integer studentId;
   private String studentName;
   private Double studentScore;
   private String subjectName;

   public Grade(Integer studentId, String studentName, double studentScore, String subjectName){
      this.studentId = studentId;
      this.studentName = studentName;
      this.studentScore = studentScore;
      this.subjectName = subjectName;
   }

   public Integer getStudentId() { return studentId; }
   public String getStudentName(){
      return studentName;
   }

   public double getStudentScore(){
      return studentScore;
   }

   public String getSubjectName(){
      return subjectName;
   }

   public void setStudentGrade(Grade grade) {
      this.studentScore = grade.studentScore;
   }
   @Override
   public String toString() {
      return "Grade{" +
              "studentId='" + studentId + '\'' +
              "studentName='" + studentName + '\'' +
              ", studentScore=" + studentScore +
              ", subjectName='" + subjectName + '\'' +
              '}';
   }
}
