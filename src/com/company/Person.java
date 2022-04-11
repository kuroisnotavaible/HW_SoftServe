package com.company;


import java.util.Date;

public class Person {
    private int age;
    private Date dob;

    public Person (int age, Date dob) {
        this.age = age;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", dob=" + dob +
                '}';
    }
}
