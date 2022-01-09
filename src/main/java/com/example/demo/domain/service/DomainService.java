package com.example.demo.domain.service;

import com.example.demo.domain.model.DomainModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Package: com.example.demo.domain.service
 * <p>
 * User: frankzinner
 * Date: 21.12.21
 */
@Service
public class DomainService {

    private final DomainRepository domainRepository;

    @Autowired
    public DomainService(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
        assert (domainRepository != null);
    }

    public DomainModel getModel() {
        return domainRepository.getDomainModel();
    }

}
