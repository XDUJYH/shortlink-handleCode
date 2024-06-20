package org.jyh.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.jyh.shortlink.admin.common.convention.result.Result;
import org.jyh.shortlink.admin.common.convention.result.Results;
import org.jyh.shortlink.admin.common.enums.UserErrorCodeEnum;
import org.jyh.shortlink.admin.dto.req.UserRegisterReqDTO;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/api/short-link/v1/user/{username}")
    public Result<UserRespDTO> getUserByUserName(@PathVariable("username") String username){
        UserRespDTO result = userService.getUserByUserName(username);
        return Results.success(result);
    }

    /**
     * 查询用户名是否存在
     */
    @GetMapping("/api/short-link/admin/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username) {
        return Results.success(userService.hasUsername(username));
    }


    /**
     * 注册用户
     */
    @PostMapping("/api/short-link/admin/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

}
