package com.example.demo.model;

import lombok.Data;

/**
 * @作者 zhubin
 * @日期 2023/1/14
 * @描述
 */
@Data
public class Persons {

    private Integer id;

    private String name;

    private Integer sex;

    public Persons(Integer id, String name, Integer sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Persons() {
    }
}
