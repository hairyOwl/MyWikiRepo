package com.owl.wiki.response;

/**
 * @description: 通用返回体
 * @version: 1.0
 * @author: 小哈
 * @date: 2022/6/12 16:10
 */

public class CommonResponse<T> {

    private boolean success = true; //业务上的成功或失败
    private String message; //返回信息
    private T content; //返回泛型数据，自定义类型

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResponseDto{");
        sb.append("success=").append(success);
        sb.append(", message='").append(message).append('\'');
        sb.append(", content=").append(content);
        sb.append('}');
        return sb.toString();
    }
}
