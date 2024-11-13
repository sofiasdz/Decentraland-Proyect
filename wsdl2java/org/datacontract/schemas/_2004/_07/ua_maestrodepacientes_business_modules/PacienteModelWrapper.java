
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.PacienteModel;
import org.datacontract.schemas._2004._07.wcfinterfaz.EstadoRespuesta;


/**
 * <p>Java class for PacienteModelWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PacienteModelWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="OperationResult" type="{http://schemas.datacontract.org/2004/07/WCFInterfaz}EstadoRespuesta" minOccurs="0"/&gt;
 *         &lt;element name="PacienteModel" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}PacienteModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacienteModelWrapper", propOrder = {
    "image",
    "operationResult",
    "pacienteModel"
})
public class PacienteModelWrapper {

    @XmlElementRef(name = "Image", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> image;
    @XmlElementRef(name = "OperationResult", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", type = JAXBElement.class, required = false)
    protected JAXBElement<EstadoRespuesta> operationResult;
    @XmlElementRef(name = "PacienteModel", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", type = JAXBElement.class, required = false)
    protected JAXBElement<PacienteModel> pacienteModel;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setImage(JAXBElement<byte[]> value) {
        this.image = value;
    }

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
     * Gets the value of the pacienteModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     *     
     */
    public JAXBElement<PacienteModel> getPacienteModel() {
        return pacienteModel;
    }

    /**
     * Sets the value of the pacienteModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     *     
     */
    public void setPacienteModel(JAXBElement<PacienteModel> value) {
        this.pacienteModel = value;
    }

}
