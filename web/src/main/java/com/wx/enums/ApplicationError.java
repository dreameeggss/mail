package com.wx.enums;

/**
 * Created by duqingxiang on 17/5/31.
 */
public enum ApplicationError {

    AGENT_UNEXIST(-11, "经纪人状态异常，请联系经纪人"),
    REPEAT_REQUEST(-12, "重复提交"),

    CUSTOMER_UNEXIST(-13,"租客不存在"),
    CONTRACT_EXIST(-14,""),
    APPLICATION_ERROR(-15,"申请异常"),
    APPLICATION_STATUS_ERROR(-16,"申请状态异常"),
    BRANCH_ERROR(-17,"部门异常"),
    CONTRACT_REPAY_ERROR(-18,"不可再次申请"),

    VERIFY_CODE_ERROR(-201, ""),
    SAVE_ERROR(-1, "提交失败");

    private int key;

    private String template;

    ApplicationError(int key, String template) {
        this.key = key;
        this.template = template;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public static ApplicationError valuesOf(int key){
        for (ApplicationError error : values()) {
            if (error.getKey() == key) {
                return error;
            }
        }
        return null;
    }
}
