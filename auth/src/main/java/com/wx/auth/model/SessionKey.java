package com.wx.auth.model;

import com.wx.auth.BaseModel;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Author: 郭政
 * @Date: 2018/5/12  23:23
 */
@Entity
@Table(name = "base_session_key",indexes = {
        @Index(name = "base_session_openId_index",columnList = "openId",unique = true)
})
@Data
@Builder
public class SessionKey extends BaseModel {

    @Id
    @GeneratedValue(generator = "sys_uuid")
    @GenericGenerator(name = "sys_uuid",strategy = "uuid")
    @Column(length = 32)
    private String id;

    private String openId;

    private String sessionKey;
}
