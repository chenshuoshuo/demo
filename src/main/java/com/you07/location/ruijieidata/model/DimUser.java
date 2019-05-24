package com.you07.location.ruijieidata.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "dim_user")
@ApiModel(value = "dimUser", description = "学工信息")
public class DimUser {
    @Id
    @Column(name = "user_sk")
    private String userSk;

    @Column(name = "auth_user_id")
    private String authUserId;

    @Column(name = "auth_user_name")
    private String authUserName;

    @Column(name = "class_name")
    private String className;

    @Column(name = "degree")
    private String degree;

    @Column(name = "enrollment_date")
    private String enrollmentDate;

    @Column(name = "grade")
    private String grade;

    @Column(name = "id")
    private String id;

    @Column(name = "institute")
    private String institute;

    @Column(name = "is_graduated")
    private String isGraduated;

    @Column(name = "major")
    private String major;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "schedule")
    private String schedule;

    @Column(name = "sex")
    private String sex;

    public void setUserSk(String userSk) {
        this.userSk = userSk;
    }

    public void setAuthUserId(String authUserId) {
        this.authUserId = authUserId;
    }

    public void setAuthUserName(String authUserName) {
        this.authUserName = authUserName;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public void setIsGraduated(String isGraduated) {
        this.isGraduated = isGraduated;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "DimUser{" +
                "userSk='" + userSk + '\'' +
                ", authUserId='" + authUserId + '\'' +
                ", authUserName='" + authUserName + '\'' +
                ", className='" + className + '\'' +
                ", degree='" + degree + '\'' +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", grade='" + grade + '\'' +

                ", id='" + id + '\'' +
                ", institute='" + institute + '\'' +
                ", isGraduated='" + isGraduated + '\'' +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", schedule='" + schedule + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getUserSk() {
        return userSk;
    }

    public String getAuthUserId() {
        return authUserId;
    }

    public String getAuthUserName() {
        return authUserName;
    }

    public String getClassName() {
        return className;
    }

    public String getDegree() {
        return degree;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public String getInstitute() {
        return institute;
    }

    public String getIsGraduated() {
        return isGraduated;
    }

    public String getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getSex() {
        return sex;
    }

    public DimUser(String userSk, String authUserId, String authUserName, String className, String degree, String enrollmentDate, String grade, String id, String institute, String isGraduated, String major, String name, String phone, String schedule, String sex) {

        this.userSk = userSk;
        this.authUserId = authUserId;
        this.authUserName = authUserName;
        this.className = className;
        this.degree = degree;
        this.enrollmentDate = enrollmentDate;
        this.grade = grade;
        this.id = id;
        this.institute = institute;
        this.isGraduated = isGraduated;
        this.major = major;
        this.name = name;
        this.phone = phone;
        this.schedule = schedule;
        this.sex = sex;
    }

    public DimUser() {

    }
}
