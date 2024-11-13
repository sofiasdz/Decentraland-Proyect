
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
 *         &lt;element name="vinculanteId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="vinculadoId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
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
    "vinculanteId",
    "vinculadoId"
})
@XmlRootElement(name = "EliminarVinculo")
public class EliminarVinculo {

    protected String vinculanteId;
    protected String vinculadoId;

    /**
     * Gets the value of the vinculanteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinculanteId() {
        return vinculanteId;
    }

    /**
     * Sets the value of the vinculanteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinculanteId(String value) {
        this.vinculanteId = value;
    }

    /**
     * Gets the value of the vinculadoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinculadoId() {
        return vinculadoId;
    }

    /**
     * Sets the value of the vinculadoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinculadoId(String value) {
        this.vinculadoId = value;
    }

}
