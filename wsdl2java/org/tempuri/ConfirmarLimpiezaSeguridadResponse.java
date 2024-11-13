
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules.ResultadoOperacion;


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
 *         &lt;element name="ConfirmarLimpiezaSeguridadResult" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.SharedModels}ResultadoOperacion" minOccurs="0"/&gt;
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
    "confirmarLimpiezaSeguridadResult"
})
@XmlRootElement(name = "ConfirmarLimpiezaSeguridadResponse")
public class ConfirmarLimpiezaSeguridadResponse {

    @XmlElementRef(name = "ConfirmarLimpiezaSeguridadResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResultadoOperacion> confirmarLimpiezaSeguridadResult;

    /**
     * Gets the value of the confirmarLimpiezaSeguridadResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     *     
     */
    public JAXBElement<ResultadoOperacion> getConfirmarLimpiezaSeguridadResult() {
        return confirmarLimpiezaSeguridadResult;
    }

    /**
     * Sets the value of the confirmarLimpiezaSeguridadResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     *     
     */
    public void setConfirmarLimpiezaSeguridadResult(JAXBElement<ResultadoOperacion> value) {
        this.confirmarLimpiezaSeguridadResult = value;
    }

}
