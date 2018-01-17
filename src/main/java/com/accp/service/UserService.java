package com.accp.service;

import com.accp.pojo.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/16 17:32
 * @Version: 1.0
 */
public interface UserService {
    User findById(Integer id) throws Exception;

    Page<User> getList(Integer pageIndex,Integer pageSize) throws Exception;

    void save(User user) throws Exception;

    void delete(Integer id) throws Exception;

    void edit(User user) throws Exception;


}
