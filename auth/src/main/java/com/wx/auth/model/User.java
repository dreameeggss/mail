package com.wx.auth.model;

import com.wx.auth.BaseModel;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "base_user",indexes = {
        @Index(name = "base_user_openId_index",columnList = "openId",unique = true)
})
@Data
@Builder
public class User extends BaseModel {

    @Id
    @GeneratedValue(generator = "sys_uuid")
    @GenericGenerator(name = "sys_uuid",strategy = "uuid")
    @Column(length = 32)
    private String id;

    private String nickName;

    private String avatarUrl;

    private String gender;

    private String city;

    private String province;

    private String country;

    private String language;

    private String cellPhone;

    private String countryCode;

    private String openId;
}
