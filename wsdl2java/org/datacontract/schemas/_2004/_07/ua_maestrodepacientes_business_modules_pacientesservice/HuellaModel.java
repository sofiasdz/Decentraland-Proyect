
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HuellaModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HuellaModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dedo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Paciente" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}PacienteModel" minOccurs="0"/&gt;
 *         &lt;element name="PacienteId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeHuella" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}TipoDeHuellaModel" minOccurs="0"/&gt;
 *         &lt;element name="ValorHuella" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HuellaModel", propOrder = {
    "dedo",
    "id",
    "mask",
    "paciente",
    "pacienteId",
    "tipoDeHuella",
    "valorHuella"
})
public class HuellaModel {

    @XmlElement(name = "Dedo")
    protected Integer dedo;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Mask")
    protected Integer mask;
    @XmlElementRef(name = "Paciente", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<PacienteModel> paciente;
    @XmlElement(name = "PacienteId")
    protected String pacienteId;
    @XmlElementRef(name = "TipoDeHuella", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<TipoDeHuellaModel> tipoDeHuella;
    @XmlElementRef(name = "ValorHuella", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> valorHuella;

    /**
     * Gets the value of the dedo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDedo() {
        return dedo;
    }

    /**
     * Sets the value of the dedo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDedo(Integer value) {
        this.dedo = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMask(Integer value) {
        this.mask = value;
    }

    /**
     * Gets the value of the paciente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     *     
     */
    public JAXBElement<PacienteModel> getPaciente() {
        return paciente;
    }

    /**
     * Sets the value of the paciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     *     
     */
    public void setPaciente(JAXBElement<PacienteModel> value) {
        this.paciente = value;
    }

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
     * Gets the value of the tipoDeHuella property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoDeHuellaModel }{@code >}
     *     
     */
    public JAXBElement<TipoDeHuellaModel> getTipoDeHuella() {
        return tipoDeHuella;
    }

    /**
     * Sets the value of the tipoDeHuella property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoDeHuellaModel }{@code >}
     *     
     */
    public void setTipoDeHuella(JAXBElement<TipoDeHuellaModel> value) {
        this.tipoDeHuella = value;
    }

    /**
     * Gets the value of the valorHuella property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getValorHuella() {
        return valorHuella;
    }

    /**
     * Sets the value of the valorHuella property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setValorHuella(JAXBElement<byte[]> value) {
        this.valorHuella = value;
    }

}
