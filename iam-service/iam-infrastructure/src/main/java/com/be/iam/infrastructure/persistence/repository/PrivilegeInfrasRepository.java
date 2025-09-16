package com.be.iam.infrastructure.persistence.repository;

import org.springframework.stereotype.Service;

import com.be.iam.domain.model.entity.Privilege;
import com.be.iam.domain.repository.PrivilegeDomainRepository;
import com.be.iam.infrastructure.persistence.mapper.PrivilegeMapperJPA;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PrivilegeInfrasRepository implements PrivilegeDomainRepository {

    private final PrivilegeMapperJPA privilegeMapperJPA;

    @Override
    public String test() {
        return "DOMAIN CHECK";
    }

    @Override
    public String create(String privilege) {
        Privilege newPrivilege = Privilege.builder().code(privilege).build();
        privilegeMapperJPA.save(newPrivilege);
        return "successful";
    }

}
