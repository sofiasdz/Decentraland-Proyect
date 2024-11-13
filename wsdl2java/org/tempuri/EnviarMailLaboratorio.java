
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="_historiaClinica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_timeStampEstudio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_nombreAdjunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="_sede" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="_adjunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "historiaClinica",
    "timeStampEstudio",
    "observaciones",
    "nombreAdjunto",
    "sede",
    "adjunto"
})
@XmlRootElement(name = "EnviarMailLaboratorio")
public class EnviarMailLaboratorio {

    @XmlElementRef(name = "_historiaClinica", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> historiaClinica;
    @XmlElementRef(name = "_timeStampEstudio", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeStampEstudio;
    @XmlElementRef(name = "_observaciones", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "_nombreAdjunto", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreAdjunto;
    @XmlElement(name = "_sede")
    protected Integer sede;
    @XmlElementRef(name = "_adjunto", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjunto;

    /**
     * Gets the value of the historiaClinica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHistoriaClinica() {
        return historiaClinica;
    }

    /**
     * Sets the value of the historiaClinica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHistoriaClinica(JAXBElement<String> value) {
        this.historiaClinica = value;
    }

    /**
     * Gets the value of the timeStampEstudio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeStampEstudio() {
        return timeStampEstudio;
    }

    /**
     * Sets the value of the timeStampEstudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeStampEstudio(JAXBElement<String> value) {
        this.timeStampEstudio = value;
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
     * Gets the value of the nombreAdjunto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreAdjunto() {
        return nombreAdjunto;
    }

    /**
     * Sets the value of the nombreAdjunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreAdjunto(JAXBElement<String> value) {
        this.nombreAdjunto = value;
    }

    /**
     * Gets the value of the sede property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSede() {
        return sede;
    }

    /**
     * Sets the value of the sede property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSede(Integer value) {
        this.sede = value;
    }

    /**
     * Gets the value of the adjunto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjunto() {
        return adjunto;
    }

    /**
     * Sets the value of the adjunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjunto(JAXBElement<String> value) {
        this.adjunto = value;
    }

}
