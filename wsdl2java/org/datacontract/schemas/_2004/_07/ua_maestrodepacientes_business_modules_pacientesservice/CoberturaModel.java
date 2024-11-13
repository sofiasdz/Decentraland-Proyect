
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoberturaModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoberturaModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUITFinanciador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCondicionPaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPlanFinanciador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CondicionPaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionPlanFinanciador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="NombreFinanciador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroAfiliado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoberturaModel", propOrder = {
    "cuitFinanciador",
    "codigoCondicionPaciente",
    "codigoPlanFinanciador",
    "condicionPaciente",
    "descripcionPlanFinanciador",
    "id",
    "nombreFinanciador",
    "numeroAfiliado"
})
public class CoberturaModel {

    @XmlElementRef(name = "CUITFinanciador", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuitFinanciador;
    @XmlElementRef(name = "CodigoCondicionPaciente", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoCondicionPaciente;
    @XmlElementRef(name = "CodigoPlanFinanciador", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPlanFinanciador;
    @XmlElementRef(name = "CondicionPaciente", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> condicionPaciente;
    @XmlElementRef(name = "DescripcionPlanFinanciador", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionPlanFinanciador;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElementRef(name = "NombreFinanciador", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreFinanciador;
    @XmlElementRef(name = "NumeroAfiliado", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroAfiliado;

    /**
     * Gets the value of the cuitFinanciador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCUITFinanciador() {
        return cuitFinanciador;
    }

    /**
     * Sets the value of the cuitFinanciador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCUITFinanciador(JAXBElement<String> value) {
        this.cuitFinanciador = value;
    }

    /**
     * Gets the value of the codigoCondicionPaciente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoCondicionPaciente() {
        return codigoCondicionPaciente;
    }

    /**
     * Sets the value of the codigoCondicionPaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoCondicionPaciente(JAXBElement<String> value) {
        this.codigoCondicionPaciente = value;
    }

    /**
     * Gets the value of the codigoPlanFinanciador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPlanFinanciador() {
        return codigoPlanFinanciador;
    }

    /**
     * Sets the value of the codigoPlanFinanciador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPlanFinanciador(JAXBElement<String> value) {
        this.codigoPlanFinanciador = value;
    }

    /**
     * Gets the value of the condicionPaciente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCondicionPaciente() {
        return condicionPaciente;
    }

    /**
     * Sets the value of the condicionPaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCondicionPaciente(JAXBElement<String> value) {
        this.condicionPaciente = value;
    }

    /**
     * Gets the value of the descripcionPlanFinanciador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionPlanFinanciador() {
        return descripcionPlanFinanciador;
    }

    /**
     * Sets the value of the descripcionPlanFinanciador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionPlanFinanciador(JAXBElement<String> value) {
        this.descripcionPlanFinanciador = value;
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
     * Gets the value of the nombreFinanciador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreFinanciador() {
        return nombreFinanciador;
    }

    /**
     * Sets the value of the nombreFinanciador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreFinanciador(JAXBElement<String> value) {
        this.nombreFinanciador = value;
    }

    /**
     * Gets the value of the numeroAfiliado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroAfiliado() {
        return numeroAfiliado;
    }

    /**
     * Sets the value of the numeroAfiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroAfiliado(JAXBElement<String> value) {
        this.numeroAfiliado = value;
    }

}
