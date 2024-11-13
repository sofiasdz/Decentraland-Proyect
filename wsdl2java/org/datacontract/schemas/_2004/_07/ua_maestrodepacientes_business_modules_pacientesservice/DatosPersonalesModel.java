
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosPersonalesModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosPersonalesModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Area1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Area2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Area3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Barrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Coberturas" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}ArrayOfCoberturaModel" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorreoElectronicoConfirmado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Documentos" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}ArrayOfDocumentoModel" minOccurs="0"/&gt;
 *         &lt;element name="FechaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HistoriaClinica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="IngresarPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Localidad" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtroTipo" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Pais" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Partido" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="PisoDto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Provincia" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsuarioModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VigenciaHC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosPersonalesModel", propOrder = {
    "apellido",
    "area1",
    "area2",
    "area3",
    "barrio",
    "calle",
    "coberturas",
    "codigoPostal",
    "correoElectronico",
    "correoElectronicoConfirmado",
    "documentos",
    "fechaModificacion",
    "fechaNacimiento",
    "historiaClinica",
    "id",
    "ingresarPortal",
    "localidad",
    "nombre",
    "numero",
    "otroTipo",
    "pais",
    "partido",
    "pisoDto",
    "provincia",
    "sexo",
    "telefono1",
    "telefono2",
    "telefono3",
    "usuarioModificacion",
    "vigenciaHC"
})
public class DatosPersonalesModel {

    @XmlElementRef(name = "Apellido", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido;
    @XmlElementRef(name = "Area1", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> area1;
    @XmlElementRef(name = "Area2", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> area2;
    @XmlElementRef(name = "Area3", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> area3;
    @XmlElementRef(name = "Barrio", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barrio;
    @XmlElementRef(name = "Calle", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calle;
    @XmlElementRef(name = "Coberturas", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCoberturaModel> coberturas;
    @XmlElementRef(name = "CodigoPostal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPostal;
    @XmlElementRef(name = "CorreoElectronico", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correoElectronico;
    @XmlElement(name = "CorreoElectronicoConfirmado")
    protected Boolean correoElectronicoConfirmado;
    @XmlElementRef(name = "Documentos", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentoModel> documentos;
    @XmlElementRef(name = "FechaModificacion", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaModificacion;
    @XmlElementRef(name = "FechaNacimiento", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaNacimiento;
    @XmlElementRef(name = "HistoriaClinica", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> historiaClinica;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "IngresarPortal")
    protected Boolean ingresarPortal;
    @XmlElement(name = "Localidad")
    protected String localidad;
    @XmlElementRef(name = "Nombre", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "Numero", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numero;
    @XmlElement(name = "OtroTipo")
    protected String otroTipo;
    @XmlElement(name = "Pais")
    protected String pais;
    @XmlElement(name = "Partido")
    protected String partido;
    @XmlElementRef(name = "PisoDto", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pisoDto;
    @XmlElement(name = "Provincia")
    protected String provincia;
    @XmlElementRef(name = "Sexo", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sexo;
    @XmlElementRef(name = "Telefono1", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono1;
    @XmlElementRef(name = "Telefono2", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono2;
    @XmlElementRef(name = "Telefono3", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono3;
    @XmlElementRef(name = "UsuarioModificacion", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioModificacion;
    @XmlElementRef(name = "VigenciaHC", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vigenciaHC;

    /**
     * Gets the value of the apellido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido() {
        return apellido;
    }

    /**
     * Sets the value of the apellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido(JAXBElement<String> value) {
        this.apellido = value;
    }

    /**
     * Gets the value of the area1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArea1() {
        return area1;
    }

    /**
     * Sets the value of the area1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArea1(JAXBElement<String> value) {
        this.area1 = value;
    }

    /**
     * Gets the value of the area2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArea2() {
        return area2;
    }

    /**
     * Sets the value of the area2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArea2(JAXBElement<String> value) {
        this.area2 = value;
    }

    /**
     * Gets the value of the area3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArea3() {
        return area3;
    }

    /**
     * Sets the value of the area3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArea3(JAXBElement<String> value) {
        this.area3 = value;
    }

    /**
     * Gets the value of the barrio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarrio() {
        return barrio;
    }

    /**
     * Sets the value of the barrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarrio(JAXBElement<String> value) {
        this.barrio = value;
    }

    /**
     * Gets the value of the calle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalle() {
        return calle;
    }

    /**
     * Sets the value of the calle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalle(JAXBElement<String> value) {
        this.calle = value;
    }

    /**
     * Gets the value of the coberturas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoberturaModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCoberturaModel> getCoberturas() {
        return coberturas;
    }

    /**
     * Sets the value of the coberturas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoberturaModel }{@code >}
     *     
     */
    public void setCoberturas(JAXBElement<ArrayOfCoberturaModel> value) {
        this.coberturas = value;
    }

    /**
     * Gets the value of the codigoPostal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Sets the value of the codigoPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPostal(JAXBElement<String> value) {
        this.codigoPostal = value;
    }

    /**
     * Gets the value of the correoElectronico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Sets the value of the correoElectronico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorreoElectronico(JAXBElement<String> value) {
        this.correoElectronico = value;
    }

    /**
     * Gets the value of the correoElectronicoConfirmado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorreoElectronicoConfirmado() {
        return correoElectronicoConfirmado;
    }

    /**
     * Sets the value of the correoElectronicoConfirmado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorreoElectronicoConfirmado(Boolean value) {
        this.correoElectronicoConfirmado = value;
    }

    /**
     * Gets the value of the documentos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentoModel> getDocumentos() {
        return documentos;
    }

    /**
     * Sets the value of the documentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentoModel }{@code >}
     *     
     */
    public void setDocumentos(JAXBElement<ArrayOfDocumentoModel> value) {
        this.documentos = value;
    }

    /**
     * Gets the value of the fechaModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Sets the value of the fechaModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaModificacion(JAXBElement<String> value) {
        this.fechaModificacion = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaNacimiento(JAXBElement<String> value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the historiaClinica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHistoriaClinica() {
        return historiaClinica;
    }

    /**
     * Sets the value of the historiaClinica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHistoriaClinica(JAXBElement<String> value) {
        this.historiaClinica = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ingresarPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIngresarPortal() {
        return ingresarPortal;
    }

    /**
     * Sets the value of the ingresarPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIngresarPortal(Boolean value) {
        this.ingresarPortal = value;
    }

    /**
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumero(JAXBElement<String> value) {
        this.numero = value;
    }

    /**
     * Gets the value of the otroTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtroTipo() {
        return otroTipo;
    }

    /**
     * Sets the value of the otroTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtroTipo(String value) {
        this.otroTipo = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

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

    /**
     * Gets the value of the pisoDto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPisoDto() {
        return pisoDto;
    }

    /**
     * Sets the value of the pisoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPisoDto(JAXBElement<String> value) {
        this.pisoDto = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSexo(JAXBElement<String> value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the telefono1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefono1() {
        return telefono1;
    }

    /**
     * Sets the value of the telefono1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefono1(JAXBElement<String> value) {
        this.telefono1 = value;
    }

    /**
     * Gets the value of the telefono2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefono2() {
        return telefono2;
    }

    /**
     * Sets the value of the telefono2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefono2(JAXBElement<String> value) {
        this.telefono2 = value;
    }

    /**
     * Gets the value of the telefono3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefono3() {
        return telefono3;
    }

    /**
     * Sets the value of the telefono3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefono3(JAXBElement<String> value) {
        this.telefono3 = value;
    }

    /**
     * Gets the value of the usuarioModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuarioModificacion() {
        return usuarioModificacion;
    }

    /**
     * Sets the value of the usuarioModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuarioModificacion(JAXBElement<String> value) {
        this.usuarioModificacion = value;
    }

    /**
     * Gets the value of the vigenciaHC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVigenciaHC() {
        return vigenciaHC;
    }

    /**
     * Sets the value of the vigenciaHC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVigenciaHC(JAXBElement<String> value) {
        this.vigenciaHC = value;
    }

}
