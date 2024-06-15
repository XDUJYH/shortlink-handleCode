package org.jyh.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
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
}
