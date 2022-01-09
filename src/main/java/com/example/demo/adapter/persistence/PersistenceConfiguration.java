package com.example.demo.adapter.persistence;

import com.example.demo.domain.service.DomainRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Package: com.example.demo.adapter
 * <p>
 * User: frankzinner
 * Date: 22.12.21
 */
@Configuration
public class PersistenceConfiguration {

    @Bean
    public DomainRepository getDomainRepository() {
        return new SqlRepositoryImpl();
    }

}
