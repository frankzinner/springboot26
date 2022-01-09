package com.example.demo.application;

import com.example.demo.domain.model.DomainModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Package: com.example.demo.application
 * <p>
 * User: frankzinner
 * Date: 21.12.21
 */
@Configuration
public class ApplicationConfiguration {

    @Bean
    public DomainModel getDomainModel() {
        return new DomainModel();
    }

}
