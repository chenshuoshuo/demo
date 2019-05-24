package com.you07.location.ruijieidata.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "DWD_STA_LOCATION")
@ApiModel(value = "dwdStaLocation", description = "定位信息")
public class DwdStaLocation {
    @Id
    @Column(name = "user_sk")
    private String userSk;

    @Column(name = "ap_sk")
    private Integer apMk;

    @Column(name = "sta_mac")
    private String staMac;

    @Column(name = "ap_mac")
    private String apMac;

    @Column(name = "region_sk")
    private Integer regionSk;

    @Column(name = "loc_x")
    private Double locX;

    @Column(name = "loc_y")
    private Double locY;

    @Column(name = "aptime")
    private Long aptime;

    @Column(name = "rssi")
    private Integer rssi;

    @Column(name = "is_associated")
    private Integer isAssociated;

    @Column(name = "year")
    private String year;

    @Column(name = "month")
    private String month;

    @Column(name = "day")
    private String day;

    @Column(name = "hour")
    private String hour;

    @Override
    public String toString() {
        return "DwdStaLocation{" +
                "userSk='" + userSk + '\'' +
                ", apMk=" + apMk +
                ", staMac='" + staMac + '\'' +
                ", apMac='" + apMac + '\'' +
                ", regionSk=" + regionSk +
                ", locX=" + locX +
                ", locY=" + locY +
                ", aptime=" + aptime +
                ", rssi=" + rssi +
                ", isAssociated=" + isAssociated +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", hour='" + hour + '\'' +
                '}';
    }

    public String getUserSk() {
        return userSk;
    }

    public void setUserSk(String userSk) {
        this.userSk = userSk;
    }

    public Integer getApMk() {
        return apMk;
    }

    public void setApMk(Integer apMk) {
        this.apMk = apMk;
    }

    public String getStaMac() {
        return staMac;
    }

    public void setStaMac(String staMac) {
        this.staMac = staMac;
    }

    public String getApMac() {
        return apMac;
    }

    public void setApMac(String apMac) {
        this.apMac = apMac;
    }

    public Integer getRegionSk() {
        return regionSk;
    }

    public void setRegionSk(Integer regionSk) {
        this.regionSk = regionSk;
    }

    public Double getLocX() {
        return locX;
    }

    public void setLocX(Double locX) {
        this.locX = locX;
    }

    public Double getLocY() {
        return locY;
    }

    public void setLocY(Double locY) {
        this.locY = locY;
    }

    public Long getAptime() {
        return aptime;
    }

    public void setAptime(Long aptime) {
        this.aptime = aptime;
    }

    public Integer getRssi() {
        return rssi;
    }

    public void setRssi(Integer rssi) {
        this.rssi = rssi;
    }

    public Integer getIsAssociated() {
        return isAssociated;
    }

    public void setIsAssociated(Integer isAssociated) {
        this.isAssociated = isAssociated;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public DwdStaLocation() {

    }

    public DwdStaLocation(String userSk, Integer apMk, String staMac, String apMac, Integer regionSk, Double locX, Double locY, Long aptime, Integer rssi, Integer isAssociated, String year, String month, String day, String hour) {

        this.userSk = userSk;
        this.apMk = apMk;
        this.staMac = staMac;
        this.apMac = apMac;
        this.regionSk = regionSk;
        this.locX = locX;
        this.locY = locY;
        this.aptime = aptime;
        this.rssi = rssi;
        this.isAssociated = isAssociated;
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
    }
}
