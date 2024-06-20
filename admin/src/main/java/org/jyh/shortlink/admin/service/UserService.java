package org.jyh.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.jyh.shortlink.admin.dto.req.UserRegisterReqDTO;
import org.jyh.shortlink.admin.dto.resp.UserRespDTO;
import org.jyh.shortlink.admin.dao.entity.UserDO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUserName(String username);

    /**
     * 查询用户名是否存在
     * @param username 用户名
     * @return 存在返回true，不存在返回false
     */
    Boolean hasUsername(String username);

    /**
     * 注册用户
     * @param requestParam 注册用户参数
     */
    void register(UserRegisterReqDTO requestParam);
}
