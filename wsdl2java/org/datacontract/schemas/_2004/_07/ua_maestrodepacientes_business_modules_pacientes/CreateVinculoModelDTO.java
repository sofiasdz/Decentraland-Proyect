
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateVinculoModelDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateVinculoModelDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Gestiona" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDeHistoriaClinica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTramiteVinculado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTramiteVinculante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeDocumento" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="VinculanteId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="VinculoId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVinculoModelDTO", propOrder = {
    "gestiona",
    "numeroDeDocumento",
    "numeroDeHistoriaClinica",
    "numeroTramiteVinculado",
    "numeroTramiteVinculante",
    "tipoDeDocumento",
    "vinculanteId",
    "vinculoId"
})
public class CreateVinculoModelDTO {

    @XmlElement(name = "Gestiona")
    protected Boolean gestiona;
    @XmlElementRef(name = "NumeroDeDocumento", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDeDocumento;
    @XmlElementRef(name = "NumeroDeHistoriaClinica", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDeHistoriaClinica;
    @XmlElementRef(name = "NumeroTramiteVinculado", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroTramiteVinculado;
    @XmlElementRef(name = "NumeroTramiteVinculante", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroTramiteVinculante;
    @XmlElement(name = "TipoDeDocumento")
    protected String tipoDeDocumento;
    @XmlElement(name = "VinculanteId")
    protected String vinculanteId;
    @XmlElement(name = "VinculoId")
    protected String vinculoId;

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
     * Gets the value of the numeroDeHistoriaClinica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDeHistoriaClinica() {
        return numeroDeHistoriaClinica;
    }

    /**
     * Sets the value of the numeroDeHistoriaClinica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDeHistoriaClinica(JAXBElement<String> value) {
        this.numeroDeHistoriaClinica = value;
    }

    /**
     * Gets the value of the numeroTramiteVinculado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTramiteVinculado() {
        return numeroTramiteVinculado;
    }

    /**
     * Sets the value of the numeroTramiteVinculado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTramiteVinculado(JAXBElement<String> value) {
        this.numeroTramiteVinculado = value;
    }

    /**
     * Gets the value of the numeroTramiteVinculante property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTramiteVinculante() {
        return numeroTramiteVinculante;
    }

    /**
     * Sets the value of the numeroTramiteVinculante property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTramiteVinculante(JAXBElement<String> value) {
        this.numeroTramiteVinculante = value;
    }

    /**
     * Gets the value of the tipoDeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    /**
     * Sets the value of the tipoDeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeDocumento(String value) {
        this.tipoDeDocumento = value;
    }

    /**
     * Gets the value of the vinculanteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinculanteId() {
        return vinculanteId;
    }

    /**
     * Sets the value of the vinculanteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinculanteId(String value) {
        this.vinculanteId = value;
    }

    /**
     * Gets the value of the vinculoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinculoId() {
        return vinculoId;
    }

    /**
     * Sets the value of the vinculoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinculoId(String value) {
        this.vinculoId = value;
    }

}
