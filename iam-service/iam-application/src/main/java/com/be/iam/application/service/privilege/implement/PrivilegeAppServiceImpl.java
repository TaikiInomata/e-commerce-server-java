package com.be.iam.application.service.privilege.implement;

import org.springframework.stereotype.Service;

import com.be.iam.application.service.privilege.PrivilegeAppService;
import com.be.iam.domain.service.PrivilegeDomainService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PrivilegeAppServiceImpl implements PrivilegeAppService {

    private final PrivilegeDomainService privilegeDomainService;

    @Override
    public String test() {
        return privilegeDomainService.test();
    }

    @Override
    public String create(String privilege) {
        return privilegeDomainService.create(privilege);
    }

}
