
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
 *         &lt;element name="TieneCorreoElectronicoConfirmadoResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "tieneCorreoElectronicoConfirmadoResult"
})
@XmlRootElement(name = "TieneCorreoElectronicoConfirmadoResponse")
public class TieneCorreoElectronicoConfirmadoResponse {

    @XmlElement(name = "TieneCorreoElectronicoConfirmadoResult")
    protected Boolean tieneCorreoElectronicoConfirmadoResult;

    /**
     * Gets the value of the tieneCorreoElectronicoConfirmadoResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTieneCorreoElectronicoConfirmadoResult() {
        return tieneCorreoElectronicoConfirmadoResult;
    }

    /**
     * Sets the value of the tieneCorreoElectronicoConfirmadoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTieneCorreoElectronicoConfirmadoResult(Boolean value) {
        this.tieneCorreoElectronicoConfirmadoResult = value;
    }

}
