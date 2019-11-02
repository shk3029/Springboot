package me.js.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
    private Logger logger = LoggerFactory.getLogger((SampleRunner.class));
    @Value("${jong.fullName}")
    private String name;

    @Value("${jong.age}")
    private String age;

    @Autowired
    JongseonProperties jongseonProperties;

    @Autowired
    String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("=========");
        logger.debug(hello);
        logger.debug(jongseonProperties.getFullName());
        logger.debug("=========");
        System.out.println("============");
        System.out.println(name);
        System.out.println(jongseonProperties.getName());
        System.out.println(age);
        System.out.println(jongseonProperties.getAge());
        System.out.println(jongseonProperties.getSesstionTimeout());
        System.out.println(jongseonProperties.getFullName());
        System.out.println("============");
        System.out.println("============");
        System.out.println("profile bean" + hello);
        System.out.println("============");

    }
}
