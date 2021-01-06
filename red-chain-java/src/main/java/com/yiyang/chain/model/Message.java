package com.yiyang.chain.model;

import lombok.Data;

import java.io.Serializable;

/**
 * description: p2p消息对象 <br>
 * date: 2021/1/6 9:21 <br>
 * author: wangyiyang <br>
 * version: 1.0 <br>
 */

@Data
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 消息类型
     */
    private int type;
    /**
     * 消息内容
     */
    private String data;

    public Message() {
    }

    public Message(int type) {
        this.type = type;
    }

    public Message(int type, String data) {
        this.type = type;
        this.data = data;
    }

}
