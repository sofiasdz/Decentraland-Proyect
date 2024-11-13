
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidacionParaVincularModelDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidacionParaVincularModelDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PacienteId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="PreguntaNombreCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RespuestaCorrectaNroAfiliadoCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RespuestaNroAfiliadoCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Validado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidacionParaVincularModelDTO", propOrder = {
    "pacienteId",
    "preguntaNombreCobertura",
    "respuestaCorrectaNroAfiliadoCobertura",
    "respuestaNroAfiliadoCobertura",
    "validado"
})
public class ValidacionParaVincularModelDTO {

    @XmlElement(name = "PacienteId")
    protected String pacienteId;
    @XmlElementRef(name = "PreguntaNombreCobertura", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preguntaNombreCobertura;
    @XmlElementRef(name = "RespuestaCorrectaNroAfiliadoCobertura", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> respuestaCorrectaNroAfiliadoCobertura;
    @XmlElementRef(name = "RespuestaNroAfiliadoCobertura", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> respuestaNroAfiliadoCobertura;
    @XmlElement(name = "Validado")
    protected Boolean validado;

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
     * Gets the value of the preguntaNombreCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreguntaNombreCobertura() {
        return preguntaNombreCobertura;
    }

    /**
     * Sets the value of the preguntaNombreCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreguntaNombreCobertura(JAXBElement<String> value) {
        this.preguntaNombreCobertura = value;
    }

    /**
     * Gets the value of the respuestaCorrectaNroAfiliadoCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRespuestaCorrectaNroAfiliadoCobertura() {
        return respuestaCorrectaNroAfiliadoCobertura;
    }

    /**
     * Sets the value of the respuestaCorrectaNroAfiliadoCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRespuestaCorrectaNroAfiliadoCobertura(JAXBElement<String> value) {
        this.respuestaCorrectaNroAfiliadoCobertura = value;
    }

    /**
     * Gets the value of the respuestaNroAfiliadoCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRespuestaNroAfiliadoCobertura() {
        return respuestaNroAfiliadoCobertura;
    }

    /**
     * Sets the value of the respuestaNroAfiliadoCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRespuestaNroAfiliadoCobertura(JAXBElement<String> value) {
        this.respuestaNroAfiliadoCobertura = value;
    }

    /**
     * Gets the value of the validado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidado() {
        return validado;
    }

    /**
     * Sets the value of the validado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidado(Boolean value) {
        this.validado = value;
    }

}
