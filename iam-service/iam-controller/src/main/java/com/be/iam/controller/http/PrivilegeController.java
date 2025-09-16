package com.be.iam.controller.http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.be.iam.application.service.privilege.PrivilegeAppService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/role")
public class PrivilegeController {

    private final PrivilegeAppService privilegeAppService;

    @GetMapping
    public String test() {
        return privilegeAppService.test();
    }

    @PostMapping("/create")
    public String create(@RequestBody String privilege) {
        return privilegeAppService.create(privilege);
    }
}
