package com.example.demo.model;

/**
 * @作者 zhubin
 * @日期 2023/1/14
 * @描述
 */
public class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() {

    }

    public static Singleton1 getInstanceA() {
        if (null == instance) {
            instance = new Singleton1();
        }
        return instance;
    }

    public static synchronized Singleton1 getInstanceB() {
        if (null == instance) {
            instance = new Singleton1();
        }
        return instance;
    }

    public static Singleton1 getInstanceC() {
        if (null == instance) {
            synchronized ((Singleton1.class)) {
                if (null == instance) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
