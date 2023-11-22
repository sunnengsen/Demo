package com.example.demo.Student;

import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private Integer age;
    private LocalDate dob;
    private String email;

    public Student(long id, String name, Integer age, LocalDate dob, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }
    public Student(String name, Integer age, LocalDate dob, String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;

    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate newDob) {
        this.dob = newDob;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", email=" + email + "]";

    }
}
