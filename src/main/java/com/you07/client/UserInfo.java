
package com.you07.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for userInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorIpV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autologicDestroyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="baclName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canOverDraft" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="certNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="field1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="field9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="freeAuthen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ipv4MulticastAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipv4MulticastOption" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ipv6MulticastAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipv6MulticastOption" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="latelyLogoutTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="latestSelfSuspendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="loginInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextBillingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="onlineState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="overDraftFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="overDraftFeeLeft" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="packageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="periodLimitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preAccountFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="reserved0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserved9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfServPrem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stateFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPrivilege" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userVlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorsUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInfo", propOrder = {
    "accountFee",
    "accountId",
    "accountState",
    "address",
    "atName",
    "authorIp",
    "authorIpV6",
    "autologicDestroyTime",
    "baclName",
    "canOverDraft",
    "certNo",
    "certType",
    "edu",
    "email",
    "expireTime",
    "field1",
    "field10",
    "field11",
    "field12",
    "field13",
    "field14",
    "field15",
    "field16",
    "field17",
    "field18",
    "field19",
    "field2",
    "field20",
    "field3",
    "field4",
    "field5",
    "field6",
    "field7",
    "field8",
    "field9",
    "filterId",
    "freeAuthen",
    "ipv4MulticastAddress",
    "ipv4MulticastOption",
    "ipv6MulticastAddress",
    "ipv6MulticastOption",
    "latelyLogoutTime",
    "latestSelfSuspendTime",
    "loginInfo",
    "mobile",
    "nextBillingTime",
    "onlineState",
    "overDraftFee",
    "overDraftFeeLeft",
    "packageName",
    "periodStartTime",
    "periodLimitTime",
    "policyId",
    "postCode",
    "preAccountFee",
    "reserved0",
    "reserved1",
    "reserved2",
    "reserved3",
    "reserved4",
    "reserved5",
    "reserved6",
    "reserved7",
    "reserved8",
    "reserved9",
    "selfServPrem",
    "sex",
    "stateFlag",
    "suVersion",
    "suspendTime",
    "tel",
    "userGroupName",
    "userId",
    "userIp",
    "userName",
    "userPrivilege",
    "userVlan",
    "vlanName",
    "operatorsName",
    "operatorsUserId",
    "createTime"
})
public class UserInfo {

    protected BigDecimal accountFee;
    protected String accountId;
    protected int accountState;
    protected String address;
    protected String atName;
    protected String authorIp;
    protected String authorIpV6;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar autologicDestroyTime;
    protected String baclName;
    protected boolean canOverDraft;
    protected String certNo;
    protected int certType;
    protected String edu;
    protected String email;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireTime;
    protected String field1;
    protected String field10;
    protected String field11;
    protected String field12;
    protected String field13;
    protected String field14;
    protected String field15;
    protected String field16;
    protected String field17;
    protected String field18;
    protected String field19;
    protected String field2;
    protected String field20;
    protected String field3;
    protected String field4;
    protected String field5;
    protected String field6;
    protected String field7;
    protected String field8;
    protected String field9;
    protected String filterId;
    protected int freeAuthen;
    protected String ipv4MulticastAddress;
    protected Short ipv4MulticastOption;
    protected String ipv6MulticastAddress;
    protected Short ipv6MulticastOption;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latelyLogoutTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestSelfSuspendTime;
    protected String loginInfo;
    protected String mobile;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextBillingTime;
    protected int onlineState;
    protected BigDecimal overDraftFee;
    protected BigDecimal overDraftFeeLeft;
    protected String packageName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodStartTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodLimitTime;
    protected String policyId;
    protected String postCode;
    protected BigDecimal preAccountFee;
    protected String reserved0;
    protected String reserved1;
    protected String reserved2;
    protected String reserved3;
    protected String reserved4;
    protected String reserved5;
    protected String reserved6;
    protected String reserved7;
    protected String reserved8;
    protected String reserved9;
    protected String selfServPrem;
    protected int sex;
    protected int stateFlag;
    protected String suVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar suspendTime;
    protected String tel;
    protected String userGroupName;
    protected String userId;
    protected String userIp;
    protected String userName;
    protected String userPrivilege;
    protected String userVlan;
    protected String vlanName;
    protected String operatorsName;
    protected String operatorsUserId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;

    @Override
	public String toString() {
		return "UserInfo [accountFee=" + accountFee + ", accountId="
				+ accountId + ", accountState=" + accountState + ", address="
				+ address + ", atName=" + atName + ", authorIp=" + authorIp
				+ ", authorIpV6=" + authorIpV6 + ", autologicDestroyTime="
				+ autologicDestroyTime + ", baclName=" + baclName
				+ ", canOverDraft=" + canOverDraft + ", certNo=" + certNo
				+ ", certType=" + certType + ", edu=" + edu + ", email="
				+ email + ", expireTime=" + expireTime + ", field1=" + field1
				+ ", field10=" + field10 + ", field11=" + field11
				+ ", field12=" + field12 + ", field13=" + field13
				+ ", field14=" + field14 + ", field15=" + field15
				+ ", field16=" + field16 + ", field17=" + field17
				+ ", field18=" + field18 + ", field19=" + field19 + ", field2="
				+ field2 + ", field20=" + field20 + ", field3=" + field3
				+ ", field4=" + field4 + ", field5=" + field5 + ", field6="
				+ field6 + ", field7=" + field7 + ", field8=" + field8
				+ ", field9=" + field9 + ", filterId=" + filterId
				+ ", freeAuthen=" + freeAuthen + ", ipv4MulticastAddress="
				+ ipv4MulticastAddress + ", ipv4MulticastOption="
				+ ipv4MulticastOption + ", ipv6MulticastAddress="
				+ ipv6MulticastAddress + ", ipv6MulticastOption="
				+ ipv6MulticastOption + ", latelyLogoutTime="
				+ latelyLogoutTime + ", latestSelfSuspendTime="
				+ latestSelfSuspendTime + ", loginInfo=" + loginInfo
				+ ", mobile=" + mobile + ", nextBillingTime=" + nextBillingTime
				+ ", onlineState=" + onlineState + ", overDraftFee="
				+ overDraftFee + ", overDraftFeeLeft=" + overDraftFeeLeft
				+ ", packageName=" + packageName + ", periodStartTime="
				+ periodStartTime + ", periodLimitTime=" + periodLimitTime
				+ ", policyId=" + policyId + ", postCode=" + postCode
				+ ", preAccountFee=" + preAccountFee + ", reserved0="
				+ reserved0 + ", reserved1=" + reserved1 + ", reserved2="
				+ reserved2 + ", reserved3=" + reserved3 + ", reserved4="
				+ reserved4 + ", reserved5=" + reserved5 + ", reserved6="
				+ reserved6 + ", reserved7=" + reserved7 + ", reserved8="
				+ reserved8 + ", reserved9=" + reserved9 + ", selfServPrem="
				+ selfServPrem + ", sex=" + sex + ", stateFlag=" + stateFlag
				+ ", suVersion=" + suVersion + ", suspendTime=" + suspendTime
				+ ", tel=" + tel + ", userGroupName=" + userGroupName
				+ ", userId=" + userId + ", userIp=" + userIp + ", userName="
				+ userName + ", userPrivilege=" + userPrivilege + ", userVlan="
				+ userVlan + ", vlanName=" + vlanName + ", operatorsName="
				+ operatorsName + ", operatorsUserId=" + operatorsUserId
				+ ", createTime=" + createTime + "]";
	}

	/**
     * Gets the value of the accountFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountFee() {
        return accountFee;
    }

    /**
     * Sets the value of the accountFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountFee(BigDecimal value) {
        this.accountFee = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the accountState property.
     * 
     */
    public int getAccountState() {
        return accountState;
    }

    /**
     * Sets the value of the accountState property.
     * 
     */
    public void setAccountState(int value) {
        this.accountState = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the atName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtName() {
        return atName;
    }

    /**
     * Sets the value of the atName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtName(String value) {
        this.atName = value;
    }

    /**
     * Gets the value of the authorIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorIp() {
        return authorIp;
    }

    /**
     * Sets the value of the authorIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorIp(String value) {
        this.authorIp = value;
    }

    /**
     * Gets the value of the authorIpV6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorIpV6() {
        return authorIpV6;
    }

    /**
     * Sets the value of the authorIpV6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorIpV6(String value) {
        this.authorIpV6 = value;
    }

    /**
     * Gets the value of the autologicDestroyTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutologicDestroyTime() {
        return autologicDestroyTime;
    }

    /**
     * Sets the value of the autologicDestroyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutologicDestroyTime(XMLGregorianCalendar value) {
        this.autologicDestroyTime = value;
    }

    /**
     * Gets the value of the baclName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaclName() {
        return baclName;
    }

    /**
     * Sets the value of the baclName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaclName(String value) {
        this.baclName = value;
    }

    /**
     * Gets the value of the canOverDraft property.
     * 
     */
    public boolean isCanOverDraft() {
        return canOverDraft;
    }

    /**
     * Sets the value of the canOverDraft property.
     * 
     */
    public void setCanOverDraft(boolean value) {
        this.canOverDraft = value;
    }

    /**
     * Gets the value of the certNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * Sets the value of the certNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertNo(String value) {
        this.certNo = value;
    }

    /**
     * Gets the value of the certType property.
     * 
     */
    public int getCertType() {
        return certType;
    }

    /**
     * Sets the value of the certType property.
     * 
     */
    public void setCertType(int value) {
        this.certType = value;
    }

    /**
     * Gets the value of the edu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdu() {
        return edu;
    }

    /**
     * Sets the value of the edu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdu(String value) {
        this.edu = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the expireTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireTime() {
        return expireTime;
    }

    /**
     * Sets the value of the expireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireTime(XMLGregorianCalendar value) {
        this.expireTime = value;
    }

    /**
     * Gets the value of the field1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField1() {
        return field1;
    }

    /**
     * Sets the value of the field1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField1(String value) {
        this.field1 = value;
    }

    /**
     * Gets the value of the field10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField10() {
        return field10;
    }

    /**
     * Sets the value of the field10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField10(String value) {
        this.field10 = value;
    }

    /**
     * Gets the value of the field11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField11() {
        return field11;
    }

    /**
     * Sets the value of the field11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField11(String value) {
        this.field11 = value;
    }

    /**
     * Gets the value of the field12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField12() {
        return field12;
    }

    /**
     * Sets the value of the field12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField12(String value) {
        this.field12 = value;
    }

    /**
     * Gets the value of the field13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField13() {
        return field13;
    }

    /**
     * Sets the value of the field13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField13(String value) {
        this.field13 = value;
    }

    /**
     * Gets the value of the field14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField14() {
        return field14;
    }

    /**
     * Sets the value of the field14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField14(String value) {
        this.field14 = value;
    }

    /**
     * Gets the value of the field15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField15() {
        return field15;
    }

    /**
     * Sets the value of the field15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField15(String value) {
        this.field15 = value;
    }

    /**
     * Gets the value of the field16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField16() {
        return field16;
    }

    /**
     * Sets the value of the field16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField16(String value) {
        this.field16 = value;
    }

    /**
     * Gets the value of the field17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField17() {
        return field17;
    }

    /**
     * Sets the value of the field17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField17(String value) {
        this.field17 = value;
    }

    /**
     * Gets the value of the field18 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField18() {
        return field18;
    }

    /**
     * Sets the value of the field18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField18(String value) {
        this.field18 = value;
    }

    /**
     * Gets the value of the field19 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField19() {
        return field19;
    }

    /**
     * Sets the value of the field19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField19(String value) {
        this.field19 = value;
    }

    /**
     * Gets the value of the field2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField2() {
        return field2;
    }

    /**
     * Sets the value of the field2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField2(String value) {
        this.field2 = value;
    }

    /**
     * Gets the value of the field20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField20() {
        return field20;
    }

    /**
     * Sets the value of the field20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField20(String value) {
        this.field20 = value;
    }

    /**
     * Gets the value of the field3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField3() {
        return field3;
    }

    /**
     * Sets the value of the field3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField3(String value) {
        this.field3 = value;
    }

    /**
     * Gets the value of the field4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField4() {
        return field4;
    }

    /**
     * Sets the value of the field4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField4(String value) {
        this.field4 = value;
    }

    /**
     * Gets the value of the field5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField5() {
        return field5;
    }

    /**
     * Sets the value of the field5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField5(String value) {
        this.field5 = value;
    }

    /**
     * Gets the value of the field6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField6() {
        return field6;
    }

    /**
     * Sets the value of the field6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField6(String value) {
        this.field6 = value;
    }

    /**
     * Gets the value of the field7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField7() {
        return field7;
    }

    /**
     * Sets the value of the field7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField7(String value) {
        this.field7 = value;
    }

    /**
     * Gets the value of the field8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField8() {
        return field8;
    }

    /**
     * Sets the value of the field8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField8(String value) {
        this.field8 = value;
    }

    /**
     * Gets the value of the field9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField9() {
        return field9;
    }

    /**
     * Sets the value of the field9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField9(String value) {
        this.field9 = value;
    }

    /**
     * Gets the value of the filterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * Sets the value of the filterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterId(String value) {
        this.filterId = value;
    }

    /**
     * Gets the value of the freeAuthen property.
     * 
     */
    public int getFreeAuthen() {
        return freeAuthen;
    }

    /**
     * Sets the value of the freeAuthen property.
     * 
     */
    public void setFreeAuthen(int value) {
        this.freeAuthen = value;
    }

    /**
     * Gets the value of the ipv4MulticastAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv4MulticastAddress() {
        return ipv4MulticastAddress;
    }

    /**
     * Sets the value of the ipv4MulticastAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv4MulticastAddress(String value) {
        this.ipv4MulticastAddress = value;
    }

    /**
     * Gets the value of the ipv4MulticastOption property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIpv4MulticastOption() {
        return ipv4MulticastOption;
    }

    /**
     * Sets the value of the ipv4MulticastOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIpv4MulticastOption(Short value) {
        this.ipv4MulticastOption = value;
    }

    /**
     * Gets the value of the ipv6MulticastAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpv6MulticastAddress() {
        return ipv6MulticastAddress;
    }

    /**
     * Sets the value of the ipv6MulticastAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpv6MulticastAddress(String value) {
        this.ipv6MulticastAddress = value;
    }

    /**
     * Gets the value of the ipv6MulticastOption property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getIpv6MulticastOption() {
        return ipv6MulticastOption;
    }

    /**
     * Sets the value of the ipv6MulticastOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setIpv6MulticastOption(Short value) {
        this.ipv6MulticastOption = value;
    }

    /**
     * Gets the value of the latelyLogoutTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatelyLogoutTime() {
        return latelyLogoutTime;
    }

    /**
     * Sets the value of the latelyLogoutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatelyLogoutTime(XMLGregorianCalendar value) {
        this.latelyLogoutTime = value;
    }

    /**
     * Gets the value of the latestSelfSuspendTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestSelfSuspendTime() {
        return latestSelfSuspendTime;
    }

    /**
     * Sets the value of the latestSelfSuspendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestSelfSuspendTime(XMLGregorianCalendar value) {
        this.latestSelfSuspendTime = value;
    }

    /**
     * Gets the value of the loginInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginInfo() {
        return loginInfo;
    }

    /**
     * Sets the value of the loginInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginInfo(String value) {
        this.loginInfo = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the nextBillingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextBillingTime() {
        return nextBillingTime;
    }

    /**
     * Sets the value of the nextBillingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextBillingTime(XMLGregorianCalendar value) {
        this.nextBillingTime = value;
    }

    /**
     * Gets the value of the onlineState property.
     * 
     */
    public int getOnlineState() {
        return onlineState;
    }

    /**
     * Sets the value of the onlineState property.
     * 
     */
    public void setOnlineState(int value) {
        this.onlineState = value;
    }

    /**
     * Gets the value of the overDraftFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverDraftFee() {
        return overDraftFee;
    }

    /**
     * Sets the value of the overDraftFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverDraftFee(BigDecimal value) {
        this.overDraftFee = value;
    }

    /**
     * Gets the value of the overDraftFeeLeft property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverDraftFeeLeft() {
        return overDraftFeeLeft;
    }

    /**
     * Sets the value of the overDraftFeeLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverDraftFeeLeft(BigDecimal value) {
        this.overDraftFeeLeft = value;
    }

    /**
     * Gets the value of the packageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the value of the packageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageName(String value) {
        this.packageName = value;
    }

    /**
     * Gets the value of the periodStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodStartTime() {
        return periodStartTime;
    }

    /**
     * Sets the value of the periodStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodStartTime(XMLGregorianCalendar value) {
        this.periodStartTime = value;
    }

    /**
     * Gets the value of the periodLimitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodLimitTime() {
        return periodLimitTime;
    }

    /**
     * Sets the value of the periodLimitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodLimitTime(XMLGregorianCalendar value) {
        this.periodLimitTime = value;
    }

    /**
     * Gets the value of the policyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyId(String value) {
        this.policyId = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the preAccountFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreAccountFee() {
        return preAccountFee;
    }

    /**
     * Sets the value of the preAccountFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreAccountFee(BigDecimal value) {
        this.preAccountFee = value;
    }

    /**
     * Gets the value of the reserved0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved0() {
        return reserved0;
    }

    /**
     * Sets the value of the reserved0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved0(String value) {
        this.reserved0 = value;
    }

    /**
     * Gets the value of the reserved1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * Sets the value of the reserved1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved1(String value) {
        this.reserved1 = value;
    }

    /**
     * Gets the value of the reserved2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * Sets the value of the reserved2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved2(String value) {
        this.reserved2 = value;
    }

    /**
     * Gets the value of the reserved3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved3() {
        return reserved3;
    }

    /**
     * Sets the value of the reserved3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved3(String value) {
        this.reserved3 = value;
    }

    /**
     * Gets the value of the reserved4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved4() {
        return reserved4;
    }

    /**
     * Sets the value of the reserved4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved4(String value) {
        this.reserved4 = value;
    }

    /**
     * Gets the value of the reserved5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved5() {
        return reserved5;
    }

    /**
     * Sets the value of the reserved5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved5(String value) {
        this.reserved5 = value;
    }

    /**
     * Gets the value of the reserved6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved6() {
        return reserved6;
    }

    /**
     * Sets the value of the reserved6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved6(String value) {
        this.reserved6 = value;
    }

    /**
     * Gets the value of the reserved7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved7() {
        return reserved7;
    }

    /**
     * Sets the value of the reserved7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved7(String value) {
        this.reserved7 = value;
    }

    /**
     * Gets the value of the reserved8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved8() {
        return reserved8;
    }

    /**
     * Sets the value of the reserved8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved8(String value) {
        this.reserved8 = value;
    }

    /**
     * Gets the value of the reserved9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved9() {
        return reserved9;
    }

    /**
     * Sets the value of the reserved9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved9(String value) {
        this.reserved9 = value;
    }

    /**
     * Gets the value of the selfServPrem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfServPrem() {
        return selfServPrem;
    }

    /**
     * Sets the value of the selfServPrem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfServPrem(String value) {
        this.selfServPrem = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     */
    public int getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     */
    public void setSex(int value) {
        this.sex = value;
    }

    /**
     * Gets the value of the stateFlag property.
     * 
     */
    public int getStateFlag() {
        return stateFlag;
    }

    /**
     * Sets the value of the stateFlag property.
     * 
     */
    public void setStateFlag(int value) {
        this.stateFlag = value;
    }

    /**
     * Gets the value of the suVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuVersion() {
        return suVersion;
    }

    /**
     * Sets the value of the suVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuVersion(String value) {
        this.suVersion = value;
    }

    /**
     * Gets the value of the suspendTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendTime() {
        return suspendTime;
    }

    /**
     * Sets the value of the suspendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendTime(XMLGregorianCalendar value) {
        this.suspendTime = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the userGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGroupName() {
        return userGroupName;
    }

    /**
     * Sets the value of the userGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGroupName(String value) {
        this.userGroupName = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * Sets the value of the userIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIp(String value) {
        this.userIp = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPrivilege() {
        return userPrivilege;
    }

    /**
     * Sets the value of the userPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPrivilege(String value) {
        this.userPrivilege = value;
    }

    /**
     * Gets the value of the userVlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserVlan() {
        return userVlan;
    }

    /**
     * Sets the value of the userVlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserVlan(String value) {
        this.userVlan = value;
    }

    /**
     * Gets the value of the vlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlanName() {
        return vlanName;
    }

    /**
     * Sets the value of the vlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlanName(String value) {
        this.vlanName = value;
    }

    /**
     * Gets the value of the operatorsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorsName() {
        return operatorsName;
    }

    /**
     * Sets the value of the operatorsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorsName(String value) {
        this.operatorsName = value;
    }

    /**
     * Gets the value of the operatorsUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorsUserId() {
        return operatorsUserId;
    }

    /**
     * Sets the value of the operatorsUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorsUserId(String value) {
        this.operatorsUserId = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

}
