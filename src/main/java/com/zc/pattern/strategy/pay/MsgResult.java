package com.zc.pattern.strategy.pay;

/**
 * @ClassName MsgResult
 * @Author 周聪
 * @Date 2021/1/10 18:49
 * @Version 1.0
 * @Description 返回消息类
 */
public class MsgResult {

    private int code;
    private Object data;
    private String msg;

    public MsgResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
