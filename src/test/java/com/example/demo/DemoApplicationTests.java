package com.example.demo;

import com.example.demo.application.ApplicationConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import({ApplicationConfiguration.class, InfrastructureTestConfiguration.class})
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
