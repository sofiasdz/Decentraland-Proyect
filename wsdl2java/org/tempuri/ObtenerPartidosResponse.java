
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
 *         &lt;element name="ObtenerPartidosResult" type="{http://schemas.datacontract.org/2004/07/UA.Core.Models}ArrayOfListItemModel" minOccurs="0"/&gt;
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
    "obtenerPartidosResult"
})
@XmlRootElement(name = "ObtenerPartidosResponse")
public class ObtenerPartidosResponse {

    @XmlElementRef(name = "ObtenerPartidosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfListItemModel> obtenerPartidosResult;

    /**
     * Gets the value of the obtenerPartidosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfListItemModel> getObtenerPartidosResult() {
        return obtenerPartidosResult;
    }

    /**
     * Sets the value of the obtenerPartidosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     *     
     */
    public void setObtenerPartidosResult(JAXBElement<ArrayOfListItemModel> value) {
        this.obtenerPartidosResult = value;
    }

}
