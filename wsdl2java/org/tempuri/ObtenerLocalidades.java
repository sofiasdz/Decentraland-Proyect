
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="partido" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
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
    "partido"
})
@XmlRootElement(name = "ObtenerLocalidades")
public class ObtenerLocalidades {

    protected String partido;

    /**
     * Gets the value of the partido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartido() {
        return partido;
    }

    /**
     * Sets the value of the partido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartido(String value) {
        this.partido = value;
    }

}
