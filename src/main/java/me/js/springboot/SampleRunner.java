package me.js.springboot;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    JongseonProperties jongseonProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("============");
        System.out.println(name);
        System.out.println(jongseonProperties.getName());
        System.out.println(age);
        System.out.println(jongseonProperties.getAge());
        System.out.println(jongseonProperties.getSesstionTimeout());
        System.out.println("============");

    }
}
