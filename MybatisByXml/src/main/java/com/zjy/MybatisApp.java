package com.zjy;

import com.zjy.entity.RsProduct;
import com.zjy.service.RsProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MybatisApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext.xml");
        RsProductService rsProductService = applicationContext.getBean(RsProductService.class);
        List<RsProduct> rsProducts = rsProductService.selectAll();
        rsProducts.forEach(System.out::println);
    }
}
