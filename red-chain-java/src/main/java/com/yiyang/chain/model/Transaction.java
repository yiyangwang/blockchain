package com.yiyang.chain.model;

import lombok.Data;
import java.io.Serializable;

/**
 * description: 交易信息 <br>
 * date: 2021/1/6 9:21 <br>
 * author: wangyiyang <br>
 * version: 1.0 <br>
 */

@Data
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 唯一标识
     */
    private String id;
    /**
     * 业务数据
     */
    private String businessInfo;
}
