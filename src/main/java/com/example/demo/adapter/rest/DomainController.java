package com.example.demo.adapter.rest;

import com.example.demo.domain.model.DomainModel;
import com.example.demo.domain.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Package: com.example.demo.adapter.rest
 * <p>
 * User: frankzinner
 * Date: 21.12.21
 */
@RestController
public class DomainController {

    private final DomainService domainService;

    @Autowired
    public DomainController(DomainService domainService) {
        assert domainService != null;
        this.domainService = domainService;
    }

    @GetMapping("/domain/v1/") // /domain/v1/ for versioning
    public DomainModel getDomainModel() {
        return domainService.getModel();
    }

    @GetMapping(value = "/domain/v2/{id}")
    public DomainModel getDomainModelV2(@RequestParam("id") int id) {
        return domainService.getModel();
    }

}
