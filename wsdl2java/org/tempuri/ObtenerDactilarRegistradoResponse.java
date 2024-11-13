
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.DactilarRegistradoModel;


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
 *         &lt;element name="ObtenerDactilarRegistradoResult" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}DactilarRegistradoModel" minOccurs="0"/&gt;
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
    "obtenerDactilarRegistradoResult"
})
@XmlRootElement(name = "ObtenerDactilarRegistradoResponse")
public class ObtenerDactilarRegistradoResponse {

    @XmlElementRef(name = "ObtenerDactilarRegistradoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DactilarRegistradoModel> obtenerDactilarRegistradoResult;

    /**
     * Gets the value of the obtenerDactilarRegistradoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DactilarRegistradoModel }{@code >}
     *     
     */
    public JAXBElement<DactilarRegistradoModel> getObtenerDactilarRegistradoResult() {
        return obtenerDactilarRegistradoResult;
    }

    /**
     * Sets the value of the obtenerDactilarRegistradoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DactilarRegistradoModel }{@code >}
     *     
     */
    public void setObtenerDactilarRegistradoResult(JAXBElement<DactilarRegistradoModel> value) {
        this.obtenerDactilarRegistradoResult = value;
    }

}
