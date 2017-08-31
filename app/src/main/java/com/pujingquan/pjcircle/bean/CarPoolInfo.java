package com.pujingquan.pjcircle.bean;

/**
 * Description:
 * Created on 2017/8/30
 */

public class CarPoolInfo {
    private int id;
    private String startAddress;
    private String endAddress;
    private String rideDate;
    private String contactName;
    private String tel;
    private String price;
    private int seatNum;
    private String note;

    public CarPoolInfo(){}

    public CarPoolInfo(int id, String startAddress, String endAddress, String rideDate, String contactName, String tel, String price, int seatNum, String note) {
        this.id = id;
        this.startAddress = startAddress;
        this.endAddress = endAddress;
        this.rideDate = rideDate;
        this.contactName = contactName;
        this.tel = tel;
        this.price = price;
        this.seatNum = seatNum;
        this.note = note;
    }

    @Override
    public String toString() {
        return "CarPoolInfo{" +
                "id=" + id +
                ", startAddress='" + startAddress + '\'' +
                ", endAddress='" + endAddress + '\'' +
                ", rideDate='" + rideDate + '\'' +
                ", contactName='" + contactName + '\'' +
                ", tel='" + tel + '\'' +
                ", price='" + price + '\'' +
                ", seatNum=" + seatNum +
                ", note='" + note + '\'' +
                '}';
    }
}
