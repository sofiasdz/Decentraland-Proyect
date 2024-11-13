
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes.ValidacionParaVincularModelDTO;


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
 *         &lt;element name="GetValidacionParaVincularModelResult" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models}ValidacionParaVincularModelDTO" minOccurs="0"/&gt;
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
    "getValidacionParaVincularModelResult"
})
@XmlRootElement(name = "GetValidacionParaVincularModelResponse")
public class GetValidacionParaVincularModelResponse {

    @XmlElementRef(name = "GetValidacionParaVincularModelResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ValidacionParaVincularModelDTO> getValidacionParaVincularModelResult;

    /**
     * Gets the value of the getValidacionParaVincularModelResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValidacionParaVincularModelDTO }{@code >}
     *     
     */
    public JAXBElement<ValidacionParaVincularModelDTO> getGetValidacionParaVincularModelResult() {
        return getValidacionParaVincularModelResult;
    }

    /**
     * Sets the value of the getValidacionParaVincularModelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValidacionParaVincularModelDTO }{@code >}
     *     
     */
    public void setGetValidacionParaVincularModelResult(JAXBElement<ValidacionParaVincularModelDTO> value) {
        this.getValidacionParaVincularModelResult = value;
    }

}
