
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.CoberturaModel;


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
 *         &lt;element name="cobertura" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}CoberturaModel" minOccurs="0"/&gt;
 *         &lt;element name="tipoNovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPaciente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "cobertura",
    "tipoNovedad",
    "idPaciente"
})
@XmlRootElement(name = "ProcesarCoberturaPaciente")
public class ProcesarCoberturaPaciente {

    @XmlElementRef(name = "cobertura", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CoberturaModel> cobertura;
    @XmlElementRef(name = "tipoNovedad", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoNovedad;
    protected Long idPaciente;

    /**
     * Gets the value of the cobertura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoberturaModel }{@code >}
     *     
     */
    public JAXBElement<CoberturaModel> getCobertura() {
        return cobertura;
    }

    /**
     * Sets the value of the cobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoberturaModel }{@code >}
     *     
     */
    public void setCobertura(JAXBElement<CoberturaModel> value) {
        this.cobertura = value;
    }

    /**
     * Gets the value of the tipoNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Sets the value of the tipoNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoNovedad(JAXBElement<String> value) {
        this.tipoNovedad = value;
    }

    /**
     * Gets the value of the idPaciente property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdPaciente() {
        return idPaciente;
    }

    /**
     * Sets the value of the idPaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdPaciente(Long value) {
        this.idPaciente = value;
    }

}
