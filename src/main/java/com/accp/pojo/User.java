package com.accp.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/16 17:24
 * @Version: 1.0
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private  String username;
    @Column
    private  String password;
    @Column
    private  Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
