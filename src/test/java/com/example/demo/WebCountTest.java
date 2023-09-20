package com.example.demo;

import com.example.demo.model.Visitor;
import com.example.demo.model.WebCount;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @作者 zhubin
 * @日期 2023/1/14
 * @描述
 */
@SpringBootTest
@Slf4j
public class WebCountTest {

    @Test
    public  void testWebCount(){
        WebCount webCount1 = WebCount.getInstance();

        WebCount webCount2 = WebCount.getInstance();

        Visitor visitor1 = new Visitor(webCount1);
        Visitor visitor2 = new Visitor(webCount2);
        if(webCount1.equals(webCount2)){
            log.info("--------------- 是");
        }else {
            log.info("--------------- 否");
        }

        visitor1.visit();
        log.info("--------------- 访问量："+ webCount1.getCount());
        visitor2.visit();
        log.info("--------------- 访问量："+ webCount2.getCount());
    }
}
