package com.wx.auth.reponsitory;


import com.wx.auth.model.SessionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: 郭政
 * @Date: 2018/5/12  23:29
 */
public interface SessionKeyReponsitory extends JpaRepository<SessionKey,String>,JpaSpecificationExecutor<SessionKey> {
}
