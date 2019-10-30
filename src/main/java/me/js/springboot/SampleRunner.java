package me.js.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
    @Value("${jong.fullName}")
    private String name;

    @Value("${jong.age}")
    private String age;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("============");
        System.out.println(name);
        System.out.println(age);
        System.out.println("============");

    }
}
