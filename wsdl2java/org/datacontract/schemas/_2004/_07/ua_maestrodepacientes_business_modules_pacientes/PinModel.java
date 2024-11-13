
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PinModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PacienteId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="PinCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PinCodeRepeated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinModel", propOrder = {
    "pacienteId",
    "pinCode",
    "pinCodeRepeated"
})
public class PinModel {

    @XmlElement(name = "PacienteId")
    protected String pacienteId;
    @XmlElementRef(name = "PinCode", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pinCode;
    @XmlElementRef(name = "PinCodeRepeated", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pinCodeRepeated;

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
     * Gets the value of the pinCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCode() {
        return pinCode;
    }

    /**
     * Sets the value of the pinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCode(JAXBElement<String> value) {
        this.pinCode = value;
    }

    /**
     * Gets the value of the pinCodeRepeated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPinCodeRepeated() {
        return pinCodeRepeated;
    }

    /**
     * Sets the value of the pinCodeRepeated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPinCodeRepeated(JAXBElement<String> value) {
        this.pinCodeRepeated = value;
    }

}
