
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules.PacientesReducidosWrapper;


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
 *         &lt;element name="ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService}PacientesReducidosWrapper" minOccurs="0"/&gt;
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
    "obtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult"
})
@XmlRootElement(name = "ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponse")
public class ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponse {

    @XmlElementRef(name = "ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PacientesReducidosWrapper> obtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult;

    /**
     * Gets the value of the obtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     *     
     */
    public JAXBElement<PacientesReducidosWrapper> getObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult() {
        return obtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult;
    }

    /**
     * Sets the value of the obtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     *     
     */
    public void setObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult(JAXBElement<PacientesReducidosWrapper> value) {
        this.obtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult = value;
    }

}