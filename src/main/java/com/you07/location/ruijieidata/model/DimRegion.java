package com.you07.location.ruijieidata.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "dim_region")
@ApiModel(value = "dimRegion", description = "建筑信息")
public class DimRegion {
    @Id
    @Column(name = "region_sk")
    private String regionSk;

    @Column(name = "is_leaf")
    private String isLeaf;

    @Column(name = "is_teaching_area")
    private String isTeachingArea;

    @Column(name = "loc_x")
    private String locX;

    @Column(name = "loc_y")
    private String locY;

    @Column(name = "parent_region_sk")
    private String parentRegionSk;

    @Column(name = "region1_name")
    private String region1Name;

    @Column(name = "region1_sk")
    private String region1Sk;

    @Column(name = "region2_name")
    private String region2Name;

    @Column(name = "region2_sk")
    private String region2Sk;

    @Column(name = "region3_name")
    private String region3Name;

    @Column(name = "region3_sk")
    private String region3Sk;

    @Column(name = "region4_name")
    private String region4Name;

    @Column(name = "region4_sk")
    private String region4Sk;

    @Column(name = "region_level")
    private String regionLevel;

    @Column(name = "region_name")
    private String regionName;

    @Override
    public String toString() {
        return "DimRegion{" +
                "regionSk='" + regionSk + '\'' +
                ", isLeaf='" + isLeaf + '\'' +
                ", isTeachingArea='" + isTeachingArea + '\'' +
                ", locX='" + locX + '\'' +
                ", locY='" + locY + '\'' +
                ", parentRegionSk='" + parentRegionSk + '\'' +
                ", region1Name='" + region1Name + '\'' +
                ", region1Sk='" + region1Sk + '\'' +
                ", region2Name='" + region2Name + '\'' +
                ", region2Sk='" + region2Sk + '\'' +
                ", region3Name='" + region3Name + '\'' +
                ", region3Sk='" + region3Sk + '\'' +
                ", region4Name='" + region4Name + '\'' +
                ", region4Sk='" + region4Sk + '\'' +
                ", regionLevel='" + regionLevel + '\'' +
                ", regionName='" + regionName + '\'' +
                '}';
    }

    public String getRegionSk() {
        return regionSk;
    }

    public void setRegionSk(String regionSk) {
        this.regionSk = regionSk;
    }

    public String getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(String isLeaf) {
        this.isLeaf = isLeaf;
    }

    public String getIsTeachingArea() {
        return isTeachingArea;
    }

    public void setIsTeachingArea(String isTeachingArea) {
        this.isTeachingArea = isTeachingArea;
    }

    public String getLocX() {
        return locX;
    }

    public void setLocX(String locX) {
        this.locX = locX;
    }

    public String getLocY() {
        return locY;
    }

    public void setLocY(String locY) {
        this.locY = locY;
    }

    public String getParentRegionSk() {
        return parentRegionSk;
    }

    public void setParentRegionSk(String parentRegionSk) {
        this.parentRegionSk = parentRegionSk;
    }

    public String getRegion1Name() {
        return region1Name;
    }

    public void setRegion1Name(String region1Name) {
        this.region1Name = region1Name;
    }

    public String getRegion1Sk() {
        return region1Sk;
    }

    public void setRegion1Sk(String region1Sk) {
        this.region1Sk = region1Sk;
    }

    public String getRegion2Name() {
        return region2Name;
    }

    public void setRegion2Name(String region2Name) {
        this.region2Name = region2Name;
    }

    public String getRegion2Sk() {
        return region2Sk;
    }

    public void setRegion2Sk(String region2Sk) {
        this.region2Sk = region2Sk;
    }

    public String getRegion3Name() {
        return region3Name;
    }

    public void setRegion3Name(String region3Name) {
        this.region3Name = region3Name;
    }

    public String getRegion3Sk() {
        return region3Sk;
    }

    public void setRegion3Sk(String region3Sk) {
        this.region3Sk = region3Sk;
    }

    public String getRegion4Name() {
        return region4Name;
    }

    public void setRegion4Name(String region4Name) {
        this.region4Name = region4Name;
    }

    public String getRegion4Sk() {
        return region4Sk;
    }

    public void setRegion4Sk(String region4Sk) {
        this.region4Sk = region4Sk;
    }

    public String getRegionLevel() {
        return regionLevel;
    }

    public void setRegionLevel(String regionLevel) {
        this.regionLevel = regionLevel;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public DimRegion(String regionSk, String isLeaf, String isTeachingArea, String locX, String locY, String parentRegionSk, String region1Name, String region1Sk, String region2Name, String region2Sk, String region3Name, String region3Sk, String region4Name, String region4Sk, String regionLevel, String regionName) {

        this.regionSk = regionSk;
        this.isLeaf = isLeaf;
        this.isTeachingArea = isTeachingArea;
        this.locX = locX;
        this.locY = locY;
        this.parentRegionSk = parentRegionSk;
        this.region1Name = region1Name;
        this.region1Sk = region1Sk;
        this.region2Name = region2Name;
        this.region2Sk = region2Sk;
        this.region3Name = region3Name;
        this.region3Sk = region3Sk;
        this.region4Name = region4Name;
        this.region4Sk = region4Sk;
        this.regionLevel = regionLevel;
        this.regionName = regionName;
    }

    public DimRegion() {

    }
}
