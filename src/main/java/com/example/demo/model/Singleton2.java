package com.example.demo.model;

/**
 * @作者 zhubin
 * @日期 2023/1/14
 * @描述 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 *
 * 何时使用：当您想控制实例数目，节省系统资源的时候。
 *
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
 *
 * 关键代码：构造函数是私有的。
 */
public class Singleton2 {

    private static final Singleton2  instance = new Singleton2();

    private  Singleton2(){

    }

    public static Singleton2 getInstance(){
        return instance;
    }
}
