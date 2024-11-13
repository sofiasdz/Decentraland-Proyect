
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ObtenerLabCodePacienteResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "obtenerLabCodePacienteResult"
})
@XmlRootElement(name = "ObtenerLabCodePacienteResponse")
public class ObtenerLabCodePacienteResponse {

    @XmlElement(name = "ObtenerLabCodePacienteResult")
    protected Long obtenerLabCodePacienteResult;

    /**
     * Gets the value of the obtenerLabCodePacienteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getObtenerLabCodePacienteResult() {
        return obtenerLabCodePacienteResult;
    }

    /**
     * Sets the value of the obtenerLabCodePacienteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObtenerLabCodePacienteResult(Long value) {
        this.obtenerLabCodePacienteResult = value;
    }

}
