package me.js.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
// 비추천 -> ApplicationRunner를 추천함
@Component
public class CommandLineRunnerTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("======== command Line Runner Test =====");
        Arrays.stream(args).forEach(System.out :: println);
    }
}
