
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
 *         &lt;element name="ValidarCodigosTelefonoResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "validarCodigosTelefonoResult"
})
@XmlRootElement(name = "ValidarCodigosTelefonoResponse")
public class ValidarCodigosTelefonoResponse {

    @XmlElement(name = "ValidarCodigosTelefonoResult")
    protected Boolean validarCodigosTelefonoResult;

    /**
     * Gets the value of the validarCodigosTelefonoResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidarCodigosTelefonoResult() {
        return validarCodigosTelefonoResult;
    }

    /**
     * Sets the value of the validarCodigosTelefonoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidarCodigosTelefonoResult(Boolean value) {
        this.validarCodigosTelefonoResult = value;
    }

}
