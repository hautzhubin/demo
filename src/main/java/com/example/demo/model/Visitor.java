package com.example.demo.model;

/**
 * @作者 zhubin
 * @日期 2023/1/14
 * @描述
 */
public class Visitor {

    public WebCount webCount;


    public Visitor(WebCount webCount) {
        this.webCount = webCount;
    }

    public void visit(){
        webCount.setCount(webCount.getCount()+1);
    }
}
