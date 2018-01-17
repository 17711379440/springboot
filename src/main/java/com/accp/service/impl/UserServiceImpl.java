package com.accp.service.impl;

import com.accp.pojo.User;
import com.accp.repository.UserRepository;
import com.accp.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/16 17:37
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) throws Exception {
        return userRepository.findById(id);
    }

    @Override
    public Page<User> getList(Integer pageIndex,Integer pageSize) throws Exception {
        return userRepository.findAll(new PageRequest(pageIndex,pageSize));
    }

    @Override
    public void save(User user) throws Exception {
        userRepository.save(user);
    }

    @Override
    public void delete(Integer id) throws Exception {
        userRepository.delete(id);
    }

    @Override
    public void edit(User user) throws Exception {
        userRepository.save(user);
    }
}
