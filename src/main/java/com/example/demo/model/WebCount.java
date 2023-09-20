package com.example.demo.model;

/**
 * @作者 zhubin
 * @日期 2023/1/14
 * @描述
 */
public class WebCount {


    private int count = 0;

    private static  WebCount instance = null;

    private WebCount(){

    }

    public static  WebCount getInstance(){
        if(null == instance){
            instance = new WebCount();
            synchronized(WebCount.class){
                if(null == instance){
                    instance = new WebCount();
                }
            }
        }
     return  instance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
