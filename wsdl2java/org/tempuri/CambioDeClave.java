
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="tipoDeDocumento" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="numeroDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claveNueva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmacionClaveNueva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "tipoDeDocumento",
    "numeroDeDocumento",
    "claveNueva",
    "confirmacionClaveNueva"
})
@XmlRootElement(name = "CambioDeClave")
public class CambioDeClave {

    protected String tipoDeDocumento;
    @XmlElementRef(name = "numeroDeDocumento", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDeDocumento;
    @XmlElementRef(name = "claveNueva", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claveNueva;
    @XmlElementRef(name = "confirmacionClaveNueva", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> confirmacionClaveNueva;

    /**
     * Gets the value of the tipoDeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    /**
     * Sets the value of the tipoDeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeDocumento(String value) {
        this.tipoDeDocumento = value;
    }

    /**
     * Gets the value of the numeroDeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    /**
     * Sets the value of the numeroDeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDeDocumento(JAXBElement<String> value) {
        this.numeroDeDocumento = value;
    }

    /**
     * Gets the value of the claveNueva property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaveNueva() {
        return claveNueva;
    }

    /**
     * Sets the value of the claveNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaveNueva(JAXBElement<String> value) {
        this.claveNueva = value;
    }

    /**
     * Gets the value of the confirmacionClaveNueva property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfirmacionClaveNueva() {
        return confirmacionClaveNueva;
    }

    /**
     * Sets the value of the confirmacionClaveNueva property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfirmacionClaveNueva(JAXBElement<String> value) {
        this.confirmacionClaveNueva = value;
    }

}
