
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVinculoFamiliarModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVinculoFamiliarModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VinculoFamiliarModel" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}VinculoFamiliarModel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVinculoFamiliarModel", propOrder = {
    "vinculoFamiliarModel"
})
public class ArrayOfVinculoFamiliarModel {

    @XmlElement(name = "VinculoFamiliarModel", nillable = true)
    protected List<VinculoFamiliarModel> vinculoFamiliarModel;

    /**
     * Gets the value of the vinculoFamiliarModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vinculoFamiliarModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVinculoFamiliarModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VinculoFamiliarModel }
     * 
     * 
     */
    public List<VinculoFamiliarModel> getVinculoFamiliarModel() {
        if (vinculoFamiliarModel == null) {
            vinculoFamiliarModel = new ArrayList<VinculoFamiliarModel>();
        }
        return this.vinculoFamiliarModel;
    }

}
