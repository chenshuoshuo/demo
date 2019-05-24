package com.you07.location.ruijieidata.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "location_latest")
@ApiModel(value = "locationLatestNew", description = "用户最新位置信息")
public class LocationLatestNew {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "userid")
    private String userid;
    /**
     * 姓名
     */
    @Column(name = "realname")
    private String realname;

    /**
     * 性别
     */
    @Column(name = "gender")
    private String gender;
    /**
     * 上网账号/MAC
     */
    @Column(name = "account_mac")
    private String accountMac;
    /**
     * 组织机构代码
     */
    @Column(name = "org_code")
    private String orgCode;
    /**
     * 组织机构名称
     */
    @Column(name = "org_name")
    private String orgName;
    /**
     * 位置经度
     */
    @Column(name = "lng")
    private Double lng;
    /**
     * 位置纬度
     */
    @Column(name = "lat")
    private Double lat;
    /**
     * 灵奇地图楼层ID
     */
    @Column(name = "floorid")
    private String floorid;
    /**
     * 定位时间
     */
    @Column(name = "location_time")
    private Date locationTime;
    /**
     * 用户信息更新时间
     */
    @Column(name = "usr_update_time")
    private Date usrUpdateTime;
    /**
     * 定位方式，1ap,2接口定位
     */
    @Column(name = "location_mode")
    private String locationMode;
    /**
     * 室内/室外，1室内，2室外
     */
    @Column(name = "in_door")
    private Integer inDoor;
    /**
     * 校内/校外，1校内，2校外
     */
    @Column(name = "in_school")
    private Integer inSchool;
    /**
     * 排序
     */
    @Column(name = "orderid")
    private Integer orderid;
    /**
     * 备注
     */
    @Column(name = "memo")
    private String memo;

    @Override
    public String toString() {
        return "LocationLatestNew{" +
                "userid='" + userid + '\'' +
                ", realname='" + realname + '\'' +
                ", gender='" + gender + '\'' +
                ", accountMac='" + accountMac + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", orgName='" + orgName + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                ", floorid='" + floorid + '\'' +
                ", locationTime=" + locationTime +
                ", usrUpdateTime=" + usrUpdateTime +
                ", locationMode='" + locationMode + '\'' +
                ", inDoor=" + inDoor +
                ", inSchool=" + inSchool +
                ", orderid=" + orderid +
                ", memo='" + memo + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAccountMac() {
        return accountMac;
    }

    public void setAccountMac(String accountMac) {
        this.accountMac = accountMac;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getFloorid() {
        return floorid;
    }

    public void setFloorid(String floorid) {
        this.floorid = floorid;
    }

    public Date getLocationTime() {
        return locationTime;
    }

    public void setLocationTime(Date locationTime) {
        this.locationTime = locationTime;
    }

    public Date getUsrUpdateTime() {
        return usrUpdateTime;
    }

    public void setUsrUpdateTime(Date usrUpdateTime) {
        this.usrUpdateTime = usrUpdateTime;
    }

    public String getLocationMode() {
        return locationMode;
    }

    public void setLocationMode(String locationMode) {
        this.locationMode = locationMode;
    }

    public Integer getInDoor() {
        return inDoor;
    }

    public void setInDoor(Integer inDoor) {
        this.inDoor = inDoor;
    }

    public Integer getInSchool() {
        return inSchool;
    }

    public void setInSchool(Integer inSchool) {
        this.inSchool = inSchool;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public LocationLatestNew(String userid, String realname, String gender, String accountMac, String orgCode, String orgName, Double lng, Double lat, String floorid, Date locationTime, Date usrUpdateTime, String locationMode, Integer inDoor, Integer inSchool, Integer orderid, String memo, String accountId) {
        this.userid = userid;
        this.realname = realname;
        this.gender = gender;
        this.accountMac = accountMac;
        this.orgCode = orgCode;
        this.orgName = orgName;
        this.lng = lng;
        this.lat = lat;
        this.floorid = floorid;
        this.locationTime = locationTime;

        this.usrUpdateTime = usrUpdateTime;
        this.locationMode = locationMode;
        this.inDoor = inDoor;
        this.inSchool = inSchool;
        this.orderid = orderid;
        this.memo = memo;
        this.accountId = accountId;
    }

    public LocationLatestNew() {

    }

    /**
     * 上网账号
     */
    @Column(name = "account_id")

    private String accountId;
}
