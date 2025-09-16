package com.be.iam.domain.service.implement;

import org.springframework.stereotype.Service;

import com.be.iam.domain.repository.PrivilegeDomainRepository;
import com.be.iam.domain.service.PrivilegeDomainService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PrivilegeDomainServiceImpl implements PrivilegeDomainService {
    private final PrivilegeDomainRepository privilegeDomainRepository;

    @Override
    public String test() {
        return privilegeDomainRepository.test();
    }

    @Override
    public String create(String privilege) {
        return privilegeDomainRepository.create(privilege);
    }

}
