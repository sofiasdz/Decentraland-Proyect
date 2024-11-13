
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidoLinkPinMasivoWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidoLinkPinMasivoWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EsValido" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PinMasivo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidoLinkPinMasivoWrapper", propOrder = {
    "esValido",
    "pinMasivo"
})
public class ValidoLinkPinMasivoWrapper {

    @XmlElement(name = "EsValido")
    protected Boolean esValido;
    @XmlElement(name = "PinMasivo")
    protected Boolean pinMasivo;

    /**
     * Gets the value of the esValido property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsValido() {
        return esValido;
    }

    /**
     * Sets the value of the esValido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsValido(Boolean value) {
        this.esValido = value;
    }

    /**
     * Gets the value of the pinMasivo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPinMasivo() {
        return pinMasivo;
    }

    /**
     * Sets the value of the pinMasivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPinMasivo(Boolean value) {
        this.pinMasivo = value;
    }

}
