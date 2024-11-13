
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
 *         &lt;element name="pacienteId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumentoId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
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
    "pacienteId",
    "tipoDocumentoId"
})
@XmlRootElement(name = "DatosPersonalesPaciente")
public class DatosPersonalesPaciente {

    protected String pacienteId;
    @XmlElementRef(name = "tipoDocumentoId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumentoId;

    /**
     * Gets the value of the pacienteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteId() {
        return pacienteId;
    }

    /**
     * Sets the value of the pacienteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteId(String value) {
        this.pacienteId = value;
    }

    /**
     * Gets the value of the tipoDocumentoId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumentoId() {
        return tipoDocumentoId;
    }

    /**
     * Sets the value of the tipoDocumentoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumentoId(JAXBElement<String> value) {
        this.tipoDocumentoId = value;
    }

}
