package com.be.iam.application.service.privilege.implement;

import org.springframework.stereotype.Service;

import com.be.iam.application.service.privilege.PrivilegeAppService;

@Service
public class PrivilegeAppServiceImpl implements PrivilegeAppService{

    @Override
    public String test() {
        return "OK in App Layer";
    }

}
