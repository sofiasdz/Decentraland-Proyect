
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes.PacienteVinculoModel;


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
 *         &lt;element name="vinculo" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models}PacienteVinculoModel" minOccurs="0"/&gt;
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
    "vinculo"
})
@XmlRootElement(name = "CrearVinculo")
public class CrearVinculo {

    protected String pacienteId;
    @XmlElementRef(name = "vinculo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PacienteVinculoModel> vinculo;

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
     * Gets the value of the vinculo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PacienteVinculoModel }{@code >}
     *     
     */
    public JAXBElement<PacienteVinculoModel> getVinculo() {
        return vinculo;
    }

    /**
     * Sets the value of the vinculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PacienteVinculoModel }{@code >}
     *     
     */
    public void setVinculo(JAXBElement<PacienteVinculoModel> value) {
        this.vinculo = value;
    }

}
