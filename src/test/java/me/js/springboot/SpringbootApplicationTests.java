package me.js.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
//@TestPropertySource(properties = "jong.name=jsjs")
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    Environment environment;

    @Test
    public void contextLoads() {
        String property = environment.getProperty("jong.name");
        assertThat(property).isEqualTo("jongtest");
    }

}
