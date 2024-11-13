
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="token" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="tipoDeDocumento" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="numeroDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preguntaSecretaId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "token",
    "tipoDeDocumento",
    "numeroDeDocumento",
    "preguntaSecretaId",
    "respuesta",
    "clave"
})
@XmlRootElement(name = "ConfirmarActivacion")
public class ConfirmarActivacion {

    protected String token;
    protected String tipoDeDocumento;
    @XmlElementRef(name = "numeroDeDocumento", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDeDocumento;
    protected String preguntaSecretaId;
    @XmlElementRef(name = "respuesta", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> respuesta;
    @XmlElementRef(name = "clave", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clave;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
     * Gets the value of the preguntaSecretaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreguntaSecretaId() {
        return preguntaSecretaId;
    }

    /**
     * Sets the value of the preguntaSecretaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreguntaSecretaId(String value) {
        this.preguntaSecretaId = value;
    }

    /**
     * Gets the value of the respuesta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRespuesta(JAXBElement<String> value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClave(JAXBElement<String> value) {
        this.clave = value;
    }

}
