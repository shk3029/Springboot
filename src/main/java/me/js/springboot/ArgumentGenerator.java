package me.js.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgumentGenerator {
    public ArgumentGenerator(ApplicationArguments arguments) {
        System.out.println("foo : " + arguments.containsOption("foo"));
        System.out.println("bar : " + arguments.containsOption("bar"));
    }
}
