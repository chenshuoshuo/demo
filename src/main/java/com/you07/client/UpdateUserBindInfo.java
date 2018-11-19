
package com.you07.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{http://api.spl.ruijie.com/}spiUserBindInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "params"
})
@XmlRootElement(name = "updateUserBindInfo")
public class UpdateUserBindInfo {

    protected SpiUserBindInfo params;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link SpiUserBindInfo }
     *     
     */
    public SpiUserBindInfo getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpiUserBindInfo }
     *     
     */
    public void setParams(SpiUserBindInfo value) {
        this.params = value;
    }

}
