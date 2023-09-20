package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @作者 zhubin
 * @日期 2023/1/14
 * @描述
 */
public class Student {
    @Setter
    @Getter
    private String studentName;

    @Setter
    @Getter
    public int studentAge;

    public Student() {
    }

    private Student(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    private String show(String message) {
        System.out.println("show: " + studentName + "," + studentAge + "," + message);
        return "testReturnValue";
    }
}
