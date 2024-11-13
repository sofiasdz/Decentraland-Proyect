
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VinculoFamiliarModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VinculoFamiliarModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gestiona" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HistoriaClinPaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="PacienteDestino" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}PacienteModel" minOccurs="0"/&gt;
 *         &lt;element name="PacienteDestinoID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="PacienteOrigenID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeVinculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeVinculoID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VinculoFamiliarModel", propOrder = {
    "gestiona",
    "historiaClinPaciente",
    "id",
    "pacienteDestino",
    "pacienteDestinoID",
    "pacienteOrigenID",
    "tipoDeVinculo",
    "tipoDeVinculoID"
})
public class VinculoFamiliarModel {

    @XmlElement(name = "Gestiona")
    protected Boolean gestiona;
    @XmlElementRef(name = "HistoriaClinPaciente", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> historiaClinPaciente;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElementRef(name = "PacienteDestino", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<PacienteModel> pacienteDestino;
    @XmlElement(name = "PacienteDestinoID")
    protected String pacienteDestinoID;
    @XmlElement(name = "PacienteOrigenID")
    protected String pacienteOrigenID;
    @XmlElementRef(name = "TipoDeVinculo", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDeVinculo;
    @XmlElement(name = "TipoDeVinculoID")
    protected String tipoDeVinculoID;

    /**
     * Gets the value of the gestiona property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGestiona() {
        return gestiona;
    }

    /**
     * Sets the value of the gestiona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGestiona(Boolean value) {
        this.gestiona = value;
    }

    /**
     * Gets the value of the historiaClinPaciente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHistoriaClinPaciente() {
        return historiaClinPaciente;
    }

    /**
     * Sets the value of the historiaClinPaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHistoriaClinPaciente(JAXBElement<String> value) {
        this.historiaClinPaciente = value;
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
     * Gets the value of the pacienteDestino property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     *     
     */
    public JAXBElement<PacienteModel> getPacienteDestino() {
        return pacienteDestino;
    }

    /**
     * Sets the value of the pacienteDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     *     
     */
    public void setPacienteDestino(JAXBElement<PacienteModel> value) {
        this.pacienteDestino = value;
    }

    /**
     * Gets the value of the pacienteDestinoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteDestinoID() {
        return pacienteDestinoID;
    }

    /**
     * Sets the value of the pacienteDestinoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteDestinoID(String value) {
        this.pacienteDestinoID = value;
    }

    /**
     * Gets the value of the pacienteOrigenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteOrigenID() {
        return pacienteOrigenID;
    }

    /**
     * Sets the value of the pacienteOrigenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteOrigenID(String value) {
        this.pacienteOrigenID = value;
    }

    /**
     * Gets the value of the tipoDeVinculo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDeVinculo() {
        return tipoDeVinculo;
    }

    /**
     * Sets the value of the tipoDeVinculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDeVinculo(JAXBElement<String> value) {
        this.tipoDeVinculo = value;
    }

    /**
     * Gets the value of the tipoDeVinculoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeVinculoID() {
        return tipoDeVinculoID;
    }

    /**
     * Sets the value of the tipoDeVinculoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeVinculoID(String value) {
        this.tipoDeVinculoID = value;
    }

}
