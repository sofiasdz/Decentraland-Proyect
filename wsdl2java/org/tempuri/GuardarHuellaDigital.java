
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.HuellaModel;


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
 *         &lt;element name="huella" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}HuellaModel" minOccurs="0"/&gt;
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
    "huella"
})
@XmlRootElement(name = "GuardarHuellaDigital")
public class GuardarHuellaDigital {

    @XmlElementRef(name = "huella", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<HuellaModel> huella;

    /**
     * Gets the value of the huella property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     *     
     */
    public JAXBElement<HuellaModel> getHuella() {
        return huella;
    }

    /**
     * Sets the value of the huella property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     *     
     */
    public void setHuella(JAXBElement<HuellaModel> value) {
        this.huella = value;
    }

}
