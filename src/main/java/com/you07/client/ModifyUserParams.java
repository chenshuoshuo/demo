
package com.you07.client;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for modifyUserParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyUserParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorIpV6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autologicDestroyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="baclName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="edu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="canOverDraft_Login" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ipV4MulticastAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipV4MulticastOption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ipV6MulticastAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ipV6MulticastOption" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loginInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodForeDownCumut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="periodForeUpCumut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="periodInlandDownCumut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="periodInlandUpCumut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="periodNtdFlowSumCumut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="periodTimeCumut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="periodTrafficCumut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPrivilege" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userVlan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyUserParams", propOrder = {
    "address",
    "authorIp",
    "authorIpV6",
    "autologicDestroyTime",
    "baclName",
    "certNo",
    "certType",
    "edu",
    "canOverDraftLogin",
    "email",
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
    "ipV4MulticastAddress",
    "ipV4MulticastOption",
    "ipV6MulticastAddress",
    "ipV6MulticastOption",
    "loginInfo",
    "mobile",
    "periodForeDownCumut",
    "periodForeUpCumut",
    "periodInlandDownCumut",
    "periodInlandUpCumut",
    "periodNtdFlowSumCumut",
    "periodTimeCumut",
    "periodTrafficCumut",
    "postCode",
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
    "tel",
    "userId",
    "userIp",
    "userName",
    "userPrivilege",
    "userVlan",
    "vlanName"
})
public class ModifyUserParams {

    protected String address;
    protected String authorIp;
    protected String authorIpV6;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar autologicDestroyTime;
    protected String baclName;
    protected String certNo;
    protected int certType;
    protected int edu;
    @XmlElement(name = "canOverDraft_Login")
    protected Boolean canOverDraftLogin;
    protected String email;
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
    protected String ipV4MulticastAddress;
    protected int ipV4MulticastOption;
    protected String ipV6MulticastAddress;
    protected int ipV6MulticastOption;
    protected String loginInfo;
    protected String mobile;
    protected BigDecimal periodForeDownCumut;
    protected BigDecimal periodForeUpCumut;
    protected BigDecimal periodInlandDownCumut;
    protected BigDecimal periodInlandUpCumut;
    protected BigDecimal periodNtdFlowSumCumut;
    protected BigDecimal periodTimeCumut;
    protected BigDecimal periodTrafficCumut;
    protected String postCode;
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
    protected String tel;
    protected String userId;
    protected String userIp;
    protected String userName;
    protected int userPrivilege;
    protected int userVlan;
    protected String vlanName;

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
     */
    public int getEdu() {
        return edu;
    }

    /**
     * Sets the value of the edu property.
     * 
     */
    public void setEdu(int value) {
        this.edu = value;
    }

    /**
     * Gets the value of the canOverDraftLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanOverDraftLogin() {
        return canOverDraftLogin;
    }

    /**
     * Sets the value of the canOverDraftLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanOverDraftLogin(Boolean value) {
        this.canOverDraftLogin = value;
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
     * Gets the value of the ipV4MulticastAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpV4MulticastAddress() {
        return ipV4MulticastAddress;
    }

    /**
     * Sets the value of the ipV4MulticastAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpV4MulticastAddress(String value) {
        this.ipV4MulticastAddress = value;
    }

    /**
     * Gets the value of the ipV4MulticastOption property.
     * 
     */
    public int getIpV4MulticastOption() {
        return ipV4MulticastOption;
    }

    /**
     * Sets the value of the ipV4MulticastOption property.
     * 
     */
    public void setIpV4MulticastOption(int value) {
        this.ipV4MulticastOption = value;
    }

    /**
     * Gets the value of the ipV6MulticastAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpV6MulticastAddress() {
        return ipV6MulticastAddress;
    }

    /**
     * Sets the value of the ipV6MulticastAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpV6MulticastAddress(String value) {
        this.ipV6MulticastAddress = value;
    }

    /**
     * Gets the value of the ipV6MulticastOption property.
     * 
     */
    public int getIpV6MulticastOption() {
        return ipV6MulticastOption;
    }

    /**
     * Sets the value of the ipV6MulticastOption property.
     * 
     */
    public void setIpV6MulticastOption(int value) {
        this.ipV6MulticastOption = value;
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
     * Gets the value of the periodForeDownCumut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodForeDownCumut() {
        return periodForeDownCumut;
    }

    /**
     * Sets the value of the periodForeDownCumut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodForeDownCumut(BigDecimal value) {
        this.periodForeDownCumut = value;
    }

    /**
     * Gets the value of the periodForeUpCumut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodForeUpCumut() {
        return periodForeUpCumut;
    }

    /**
     * Sets the value of the periodForeUpCumut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodForeUpCumut(BigDecimal value) {
        this.periodForeUpCumut = value;
    }

    /**
     * Gets the value of the periodInlandDownCumut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodInlandDownCumut() {
        return periodInlandDownCumut;
    }

    /**
     * Sets the value of the periodInlandDownCumut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodInlandDownCumut(BigDecimal value) {
        this.periodInlandDownCumut = value;
    }

    /**
     * Gets the value of the periodInlandUpCumut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodInlandUpCumut() {
        return periodInlandUpCumut;
    }

    /**
     * Sets the value of the periodInlandUpCumut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodInlandUpCumut(BigDecimal value) {
        this.periodInlandUpCumut = value;
    }

    /**
     * Gets the value of the periodNtdFlowSumCumut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodNtdFlowSumCumut() {
        return periodNtdFlowSumCumut;
    }

    /**
     * Sets the value of the periodNtdFlowSumCumut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodNtdFlowSumCumut(BigDecimal value) {
        this.periodNtdFlowSumCumut = value;
    }

    /**
     * Gets the value of the periodTimeCumut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodTimeCumut() {
        return periodTimeCumut;
    }

    /**
     * Sets the value of the periodTimeCumut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodTimeCumut(BigDecimal value) {
        this.periodTimeCumut = value;
    }

    /**
     * Gets the value of the periodTrafficCumut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodTrafficCumut() {
        return periodTrafficCumut;
    }

    /**
     * Sets the value of the periodTrafficCumut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodTrafficCumut(BigDecimal value) {
        this.periodTrafficCumut = value;
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
     */
    public int getUserPrivilege() {
        return userPrivilege;
    }

    /**
     * Sets the value of the userPrivilege property.
     * 
     */
    public void setUserPrivilege(int value) {
        this.userPrivilege = value;
    }

    /**
     * Gets the value of the userVlan property.
     * 
     */
    public int getUserVlan() {
        return userVlan;
    }

    /**
     * Sets the value of the userVlan property.
     * 
     */
    public void setUserVlan(int value) {
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

}
