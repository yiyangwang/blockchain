package com.yiyang.chain.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * description: 区块 <br>
 * date: 2021/1/6 9:21 <br>
 * author: wangyiyang <br>
 * version: 1.0 <br>
 */
@Data
public class Block implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 区块索引号(区块高度)
     */
    private int index;
    /**
     * 当前区块的hash值,区块唯一标识
     */
    private String hash;
    /**
     * 前一个区块的hash值
     */
    private String previousHash;
    /**
     * 生成区块的时间戳
     */
    private long timestamp;
    /**
     * 工作量证明，计算正确hash值的次数
     */
    private int nonce;
    /**
     * 当前区块存储的业务数据集合（例如转账交易信息、票据信息、合同信息等）
     */
    private List<Transaction> transactions;

}
