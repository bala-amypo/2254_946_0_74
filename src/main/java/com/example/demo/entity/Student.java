package com.example.demo.entity;

import jakarta.persistence.*;


@Entity

public class Student {
    @Id
    private int id;
    private String studentname;
    private float cgpa;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public Student(int id, String studentname, float cgpa) {
        this.id = id;
        this.studentname = studentname;
        this.cgpa = cgpa;
    }
    public Student() {
    }



}

   