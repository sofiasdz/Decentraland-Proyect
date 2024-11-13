
package org.datacontract.schemas._2004._07.ua_directorio_business_services_directorio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelefonoModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelefonoModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Corporativo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EmpresaTelefonoId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="EnvioSms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Interno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoTelefonoId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelefonoModel", propOrder = {
    "codigoArea",
    "codigoPais",
    "corporativo",
    "empresaTelefonoId",
    "envioSms",
    "interno",
    "numeroTelefono",
    "observaciones",
    "tipoTelefonoId",
    "valor"
})
public class TelefonoModel {

    @XmlElementRef(name = "CodigoArea", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoArea;
    @XmlElementRef(name = "CodigoPais", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPais;
    @XmlElementRef(name = "Corporativo", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> corporativo;
    @XmlElementRef(name = "EmpresaTelefonoId", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empresaTelefonoId;
    @XmlElementRef(name = "EnvioSms", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> envioSms;
    @XmlElementRef(name = "Interno", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interno;
    @XmlElementRef(name = "NumeroTelefono", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroTelefono;
    @XmlElementRef(name = "Observaciones", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "TipoTelefonoId", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoTelefonoId;
    @XmlElementRef(name = "Valor", namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> valor;

    /**
     * Gets the value of the codigoArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoArea() {
        return codigoArea;
    }

    /**
     * Sets the value of the codigoArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoArea(JAXBElement<String> value) {
        this.codigoArea = value;
    }

    /**
     * Gets the value of the codigoPais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPais(JAXBElement<String> value) {
        this.codigoPais = value;
    }

    /**
     * Gets the value of the corporativo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getCorporativo() {
        return corporativo;
    }

    /**
     * Sets the value of the corporativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setCorporativo(JAXBElement<Boolean> value) {
        this.corporativo = value;
    }

    /**
     * Gets the value of the empresaTelefonoId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpresaTelefonoId() {
        return empresaTelefonoId;
    }

    /**
     * Sets the value of the empresaTelefonoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpresaTelefonoId(JAXBElement<String> value) {
        this.empresaTelefonoId = value;
    }

    /**
     * Gets the value of the envioSms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEnvioSms() {
        return envioSms;
    }

    /**
     * Sets the value of the envioSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEnvioSms(JAXBElement<Boolean> value) {
        this.envioSms = value;
    }

    /**
     * Gets the value of the interno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterno() {
        return interno;
    }

    /**
     * Sets the value of the interno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterno(JAXBElement<String> value) {
        this.interno = value;
    }

    /**
     * Gets the value of the numeroTelefono property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Sets the value of the numeroTelefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTelefono(JAXBElement<String> value) {
        this.numeroTelefono = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the tipoTelefonoId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoTelefonoId() {
        return tipoTelefonoId;
    }

    /**
     * Sets the value of the tipoTelefonoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoTelefonoId(JAXBElement<String> value) {
        this.tipoTelefonoId = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValor(JAXBElement<String> value) {
        this.valor = value;
    }

}
