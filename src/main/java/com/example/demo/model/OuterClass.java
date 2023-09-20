package com.example.demo.model;

import lombok.extern.slf4j.Slf4j;


/**
 * @作者 zhubin
 * @日期 2023/1/16
 * @描述 静态内部类 在静态方法里，使用⾮静态内部类依赖于外部类的实例，也就是说需要先创建外部类实例，才能用这个实例去创建非静态内部类。⽽静态内部类不需要。
 */
@Slf4j
public class OuterClass {
    class InnerClass {
        public void test() {
            log.info("------------- this is InnerClass");
        }
    }

    static class StaticInnerClass {
        public void test() {
            log.info("------------- this is StaticInnerClass");
        }
    }

    public void nonStaticMethod() {
        InnerClass innerClass = new InnerClass();
        log.info("------------------ nonStaticMethod...");
    }

    // 静态代码快
    private static String startDate,endDate;
    static {
        startDate = "2008";
        endDate = "2010";
    }

    public void test(){
        log.info("------------ startDate {}",startDate);
        log.info("------------ endDate {}",endDate);
    }
    // 静态变量： 静态变量被所有的对象共享，在内存中只有一个副本，它当且仅当在类初次加载时会被初始化。而非静态变量是对象所拥有的，在创建对象的时候被初始化，存在多个副本，各个对象拥有的副本互不影响
    private static final  int age = 27;
    // 静态方法：静态方法不依赖于任何对象就可以进行访问，通过类名即可调用静态方法。
    public static  void print(){
        log.info("------ hello ,this is static method.");
    }

    public static void main(String[] args) {
        // 在静态方法里，不能直接使用OuterClass.this去创建InnerClass的实例
        // 需要先创建OuterClass的实例o，然后通过o创建InnerClass的实例
        // InnerClass innerClass = new InnerClass();
        log.info("------------- age {}",OuterClass.age);
        OuterClass.print();
        OuterClass outerClass = new OuterClass();
        outerClass.nonStaticMethod();
        outerClass.test();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.test();
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.test();
    }
}
