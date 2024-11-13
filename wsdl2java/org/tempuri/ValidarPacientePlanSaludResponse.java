
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidarPacientePlanSaludResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validarPacientePlanSaludResult"
})
@XmlRootElement(name = "ValidarPacientePlanSaludResponse")
public class ValidarPacientePlanSaludResponse {

    @XmlElement(name = "ValidarPacientePlanSaludResult")
    protected Boolean validarPacientePlanSaludResult;

    /**
     * Gets the value of the validarPacientePlanSaludResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidarPacientePlanSaludResult() {
        return validarPacientePlanSaludResult;
    }

    /**
     * Sets the value of the validarPacientePlanSaludResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidarPacientePlanSaludResult(Boolean value) {
        this.validarPacientePlanSaludResult = value;
    }

}
