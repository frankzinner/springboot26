package com.example.demo.domain.model;

import lombok.Data;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Package: com.example.demo.domain.model
 * <p>
 * User: frankzinner
 * Date: 21.12.21
 */
@Data
public class DomainModel {

    UUID id;
    String identifier;

    public DomainModel() {
        id = UUID.randomUUID();
        identifier = "DomainModel from Kubernetes part 4";
    }

    @Override
    public String toString() {
        return identifier;
    }

}
