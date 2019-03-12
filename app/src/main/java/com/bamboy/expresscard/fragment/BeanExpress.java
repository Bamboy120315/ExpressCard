package com.bamboy.expresscard.fragment;

import java.util.List;

/**
 * Created by liushaochen on 2019/3/1.
 */
public class BeanExpress {

    /**
     * 收货人
     */
    private String consignee;
    /**
     * 物流名称
     */
    private String express;
    /**
     * 运送信息
     */
    private List<String> convey_info;

    /**
     * 收货人
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 收货人
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * 物流名称
     */
    public String getExpress() {
        return express;
    }

    /**
     * 物流名称
     */
    public void setExpress(String express) {
        this.express = express;
    }

    /**
     * 运送信息
     */
    public List<String> getConvey_info() {
        return convey_info;
    }

    /**
     * 运送信息
     */
    public void setConvey_info(List<String> convey_info) {
        this.convey_info = convey_info;
    }
}
