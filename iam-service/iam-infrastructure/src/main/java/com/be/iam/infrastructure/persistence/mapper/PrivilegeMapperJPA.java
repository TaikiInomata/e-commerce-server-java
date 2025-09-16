package com.be.iam.infrastructure.persistence.mapper;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.be.iam.domain.model.entity.Privilege;

@Repository
public interface PrivilegeMapperJPA extends JpaRepository<Privilege, UUID> {

}
