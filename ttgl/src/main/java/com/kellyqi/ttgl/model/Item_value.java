package com.kellyqi.ttgl.model;

import java.math.BigDecimal;
import java.util.Date;

public class Item_value {
    private Integer id;

    private BigDecimal num;

    private Date createtime;

    private Integer itemid;

    private Integer lastrecord;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public Integer getLastrecord() {
        return lastrecord;
    }

    public void setLastrecord(Integer lastrecord) {
        this.lastrecord = lastrecord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}