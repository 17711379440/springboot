package com.accp.repository;
import com.accp.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/16 17:27
 * @Version: 1.0
 */

public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(Integer id);
}
