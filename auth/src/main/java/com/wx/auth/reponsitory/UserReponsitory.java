package com.wx.auth.reponsitory;

import com.wx.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: 郭政
 * @Date: 2018/5/12  23:28
 */
public interface UserReponsitory extends JpaRepository<User,String>,JpaSpecificationExecutor<User> {

}
