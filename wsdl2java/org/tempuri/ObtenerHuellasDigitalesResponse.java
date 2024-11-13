
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.ArrayOfHuellaModel;


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
 *         &lt;element name="ObtenerHuellasDigitalesResult" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}ArrayOfHuellaModel" minOccurs="0"/&gt;
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
    "obtenerHuellasDigitalesResult"
})
@XmlRootElement(name = "ObtenerHuellasDigitalesResponse")
public class ObtenerHuellasDigitalesResponse {

    @XmlElementRef(name = "ObtenerHuellasDigitalesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHuellaModel> obtenerHuellasDigitalesResult;

    /**
     * Gets the value of the obtenerHuellasDigitalesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHuellaModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHuellaModel> getObtenerHuellasDigitalesResult() {
        return obtenerHuellasDigitalesResult;
    }

    /**
     * Sets the value of the obtenerHuellasDigitalesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHuellaModel }{@code >}
     *     
     */
    public void setObtenerHuellasDigitalesResult(JAXBElement<ArrayOfHuellaModel> value) {
        this.obtenerHuellasDigitalesResult = value;
    }

}
