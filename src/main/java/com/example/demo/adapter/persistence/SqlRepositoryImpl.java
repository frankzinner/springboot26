package com.example.demo.adapter.persistence;

import com.example.demo.domain.model.DomainModel;
import com.example.demo.domain.service.DomainRepository;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Package: com.example.demo.adapter.persistence
 * <p>
 * User: frankzinner
 * Date: 21.12.21
 */
public class SqlRepositoryImpl implements DomainRepository {

    public DomainModel getDomainModel() {
        return new DomainModel();
    }

}
