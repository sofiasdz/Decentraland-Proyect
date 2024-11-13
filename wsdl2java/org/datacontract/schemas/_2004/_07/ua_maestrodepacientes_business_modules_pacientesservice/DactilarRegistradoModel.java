
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcfinterfaz.EstadoRespuesta;


/**
 * <p>Java class for DactilarRegistradoModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DactilarRegistradoModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoPaciente" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DactiularCapturado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoRespuesta" type="{http://schemas.datacontract.org/2004/07/WCFInterfaz}EstadoRespuesta" minOccurs="0"/&gt;
 *         &lt;element name="IdPaciente" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DactilarRegistradoModel", propOrder = {
    "codigoPaciente",
    "dactiularCapturado",
    "estadoRespuesta",
    "idPaciente"
})
public class DactilarRegistradoModel {

    @XmlElement(name = "CodigoPaciente")
    protected Long codigoPaciente;
    @XmlElementRef(name = "DactiularCapturado", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dactiularCapturado;
    @XmlElementRef(name = "EstadoRespuesta", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<EstadoRespuesta> estadoRespuesta;
    @XmlElement(name = "IdPaciente")
    protected String idPaciente;

    /**
     * Gets the value of the codigoPaciente property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoPaciente() {
        return codigoPaciente;
    }

    /**
     * Sets the value of the codigoPaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoPaciente(Long value) {
        this.codigoPaciente = value;
    }

    /**
     * Gets the value of the dactiularCapturado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDactiularCapturado() {
        return dactiularCapturado;
    }

    /**
     * Sets the value of the dactiularCapturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDactiularCapturado(JAXBElement<String> value) {
        this.dactiularCapturado = value;
    }

    /**
     * Gets the value of the estadoRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     *     
     */
    public JAXBElement<EstadoRespuesta> getEstadoRespuesta() {
        return estadoRespuesta;
    }

    /**
     * Sets the value of the estadoRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     *     
     */
    public void setEstadoRespuesta(JAXBElement<EstadoRespuesta> value) {
        this.estadoRespuesta = value;
    }

    /**
     * Gets the value of the idPaciente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaciente() {
        return idPaciente;
    }

    /**
     * Sets the value of the idPaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaciente(String value) {
        this.idPaciente = value;
    }

}
