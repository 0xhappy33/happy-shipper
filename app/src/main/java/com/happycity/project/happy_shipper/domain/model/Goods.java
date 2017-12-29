package com.happycity.project.happy_shipper.domain.model;

/**
 * Created by Ha Truong on 12/28/2017.
 * This is a App
 * into the com.happycity.project.happy_shipper.domain.model
 */

public class Goods {
    private String idGoods;
    private String fromAddress;
    private String toAddress;
    private String km;
    private String shipMoney;
    private String payMoney;

    public Goods(String idGoods, String fromAddress, String toAddress, String km, String shipMoney, String payMoney) {
        this.idGoods = idGoods;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.km = km;
        this.shipMoney = shipMoney;
        this.payMoney = payMoney;
    }

    public Goods(String idGoods, String fromAddress, String toAddress) {
        this.idGoods = idGoods;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
    }

    public String getIdGoods() {
        return idGoods;
    }

    public Goods setIdGoods(String idGoods) {
        this.idGoods = idGoods;
        return this;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public Goods setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    public String getToAddress() {
        return toAddress;
    }

    public Goods setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }

    public String getKm() {
        return km;
    }

    public Goods setKm(String km) {
        this.km = km;
        return this;
    }

    public String getShipMoney() {
        return shipMoney;
    }

    public Goods setShipMoney(String shipMoney) {
        this.shipMoney = shipMoney;
        return this;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public Goods setPayMoney(String payMoney) {
        this.payMoney = payMoney;
        return this;
    }
}
