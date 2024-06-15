package org.jyh.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.jyh.shortlink.admin.dto.resp.UserRespDTO;
import org.jyh.shortlink.admin.service.UserService;

/**
 * 用户管理层
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    public final UserService userService;


    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public UserRespDTO getUserByUserName(@PathVariable("username") String username){
        return userService.getUserByUserName(username);
    }



}
