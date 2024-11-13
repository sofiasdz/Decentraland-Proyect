
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentoModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescripcionTipoDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prioridad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeDocumentoId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoModel", propOrder = {
    "descripcionTipoDeDocumento",
    "numeroDeDocumento",
    "prioridad",
    "tipoDeDocumento",
    "tipoDeDocumentoId"
})
public class DocumentoModel {

    @XmlElementRef(name = "DescripcionTipoDeDocumento", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionTipoDeDocumento;
    @XmlElementRef(name = "NumeroDeDocumento", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDeDocumento;
    @XmlElement(name = "Prioridad")
    protected Boolean prioridad;
    @XmlElementRef(name = "TipoDeDocumento", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDeDocumento;
    @XmlElement(name = "TipoDeDocumentoId")
    protected String tipoDeDocumentoId;

    /**
     * Gets the value of the descripcionTipoDeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionTipoDeDocumento() {
        return descripcionTipoDeDocumento;
    }

    /**
     * Sets the value of the descripcionTipoDeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionTipoDeDocumento(JAXBElement<String> value) {
        this.descripcionTipoDeDocumento = value;
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
     * Gets the value of the prioridad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrioridad() {
        return prioridad;
    }

    /**
     * Sets the value of the prioridad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrioridad(Boolean value) {
        this.prioridad = value;
    }

    /**
     * Gets the value of the tipoDeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    /**
     * Sets the value of the tipoDeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDeDocumento(JAXBElement<String> value) {
        this.tipoDeDocumento = value;
    }

    /**
     * Gets the value of the tipoDeDocumentoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeDocumentoId() {
        return tipoDeDocumentoId;
    }

    /**
     * Sets the value of the tipoDeDocumentoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeDocumentoId(String value) {
        this.tipoDeDocumentoId = value;
    }

}
