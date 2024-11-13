
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.ArrayOfVinculoFamiliarModel;


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
 *         &lt;element name="ObtenerVinculosGestionadosResult" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}ArrayOfVinculoFamiliarModel" minOccurs="0"/&gt;
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
    "obtenerVinculosGestionadosResult"
})
@XmlRootElement(name = "ObtenerVinculosGestionadosResponse")
public class ObtenerVinculosGestionadosResponse {

    @XmlElementRef(name = "ObtenerVinculosGestionadosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVinculoFamiliarModel> obtenerVinculosGestionadosResult;

    /**
     * Gets the value of the obtenerVinculosGestionadosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVinculoFamiliarModel> getObtenerVinculosGestionadosResult() {
        return obtenerVinculosGestionadosResult;
    }

    /**
     * Sets the value of the obtenerVinculosGestionadosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     *     
     */
    public void setObtenerVinculosGestionadosResult(JAXBElement<ArrayOfVinculoFamiliarModel> value) {
        this.obtenerVinculosGestionadosResult = value;
    }

}
