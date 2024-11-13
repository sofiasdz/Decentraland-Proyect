
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ua_core.ArrayOfListItemModel;


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
 *         &lt;element name="ObtenerPaisesResult" type="{http://schemas.datacontract.org/2004/07/UA.Core.Models}ArrayOfListItemModel" minOccurs="0"/&gt;
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
    "obtenerPaisesResult"
})
@XmlRootElement(name = "ObtenerPaisesResponse")
public class ObtenerPaisesResponse {

    @XmlElementRef(name = "ObtenerPaisesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfListItemModel> obtenerPaisesResult;

    /**
     * Gets the value of the obtenerPaisesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfListItemModel> getObtenerPaisesResult() {
        return obtenerPaisesResult;
    }

    /**
     * Sets the value of the obtenerPaisesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     *     
     */
    public void setObtenerPaisesResult(JAXBElement<ArrayOfListItemModel> value) {
        this.obtenerPaisesResult = value;
    }

}
