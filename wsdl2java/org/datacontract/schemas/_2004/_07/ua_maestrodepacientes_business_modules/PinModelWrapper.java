
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes.PinModel;
import org.datacontract.schemas._2004._07.wcfinterfaz.EstadoRespuesta;


/**
 * <p>Java class for PinModelWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinModelWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationResult" type="{http://schemas.datacontract.org/2004/07/WCFInterfaz}EstadoRespuesta" minOccurs="0"/&gt;
 *         &lt;element name="PinModel" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models}PinModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinModelWrapper", propOrder = {
    "operationResult",
    "pinModel"
})
public class PinModelWrapper {

    @XmlElementRef(name = "OperationResult", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", type = JAXBElement.class, required = false)
    protected JAXBElement<EstadoRespuesta> operationResult;
    @XmlElementRef(name = "PinModel", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", type = JAXBElement.class, required = false)
    protected JAXBElement<PinModel> pinModel;

    /**
     * Gets the value of the operationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     *     
     */
    public JAXBElement<EstadoRespuesta> getOperationResult() {
        return operationResult;
    }

    /**
     * Sets the value of the operationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     *     
     */
    public void setOperationResult(JAXBElement<EstadoRespuesta> value) {
        this.operationResult = value;
    }

    /**
     * Gets the value of the pinModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PinModel }{@code >}
     *     
     */
    public JAXBElement<PinModel> getPinModel() {
        return pinModel;
    }

    /**
     * Sets the value of the pinModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PinModel }{@code >}
     *     
     */
    public void setPinModel(JAXBElement<PinModel> value) {
        this.pinModel = value;
    }

}
