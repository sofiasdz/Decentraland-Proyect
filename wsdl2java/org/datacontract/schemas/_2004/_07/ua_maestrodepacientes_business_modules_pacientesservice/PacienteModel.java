
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PacienteModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PacienteModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivoPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Apellido3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Barrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BarrioTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalleTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Coberturas" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}ArrayOfCoberturaModel" minOccurs="0"/&gt;
 *         &lt;element name="CodigoLocalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoLocalidadTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPaisTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPartido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPartidoTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoDePaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorreoElectronicoConfirmado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DactilarCapturado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionTipoDePaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Discapacidades" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}ArrayOfDiscapacidadModel" minOccurs="0"/&gt;
 *         &lt;element name="Documentos" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}ArrayOfDocumentoModel" minOccurs="0"/&gt;
 *         &lt;element name="FechaFallecimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaNovedad" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="IngresoPortal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalidadTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoHistoriaClinica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PacienteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Partido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartidoTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PisoDto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PisoDtoTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaTemporal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Telefono3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoNovedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsuarioModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vinculados" type="{http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models}ArrayOfVinculoFamiliarModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacienteModel", propOrder = {
    "activoPortal",
    "apellido",
    "apellido2",
    "apellido3",
    "barrio",
    "barrioTemporal",
    "calle",
    "calleTemporal",
    "coberturas",
    "codigoLocalidad",
    "codigoLocalidadTemporal",
    "codigoPais",
    "codigoPaisTemporal",
    "codigoPartido",
    "codigoPartidoTemporal",
    "codigoPostal",
    "codigoProvincia",
    "codigoProvinciaTemporal",
    "codigoTipoDePaciente",
    "correoElectronico",
    "correoElectronicoConfirmado",
    "dactilarCapturado",
    "descripcionTipoDePaciente",
    "discapacidades",
    "documentos",
    "fechaFallecimiento",
    "fechaModificacion",
    "fechaNacimiento",
    "fechaNovedad",
    "id",
    "ingresoPortal",
    "localidad",
    "localidadTemporal",
    "noHistoriaClinica",
    "nombre",
    "numero",
    "numeroTemporal",
    "pacienteId",
    "pais",
    "paisTemporal",
    "partido",
    "partidoTemporal",
    "pisoDto",
    "pisoDtoTemporal",
    "provincia",
    "provinciaTemporal",
    "sexo",
    "telefono1",
    "telefono2",
    "telefono3",
    "tipoNovedad",
    "usuarioModificacion",
    "vigencia",
    "vinculados"
})
public class PacienteModel {

    @XmlElement(name = "ActivoPortal")
    protected Boolean activoPortal;
    @XmlElementRef(name = "Apellido", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido;
    @XmlElementRef(name = "Apellido2", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2;
    @XmlElementRef(name = "Apellido3", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido3;
    @XmlElementRef(name = "Barrio", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barrio;
    @XmlElementRef(name = "BarrioTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barrioTemporal;
    @XmlElementRef(name = "Calle", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calle;
    @XmlElementRef(name = "CalleTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calleTemporal;
    @XmlElementRef(name = "Coberturas", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCoberturaModel> coberturas;
    @XmlElementRef(name = "CodigoLocalidad", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoLocalidad;
    @XmlElementRef(name = "CodigoLocalidadTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoLocalidadTemporal;
    @XmlElementRef(name = "CodigoPais", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPais;
    @XmlElementRef(name = "CodigoPaisTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPaisTemporal;
    @XmlElementRef(name = "CodigoPartido", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPartido;
    @XmlElementRef(name = "CodigoPartidoTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPartidoTemporal;
    @XmlElementRef(name = "CodigoPostal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPostal;
    @XmlElementRef(name = "CodigoProvincia", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoProvincia;
    @XmlElementRef(name = "CodigoProvinciaTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoProvinciaTemporal;
    @XmlElementRef(name = "CodigoTipoDePaciente", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoDePaciente;
    @XmlElementRef(name = "CorreoElectronico", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correoElectronico;
    @XmlElement(name = "CorreoElectronicoConfirmado")
    protected Boolean correoElectronicoConfirmado;
    @XmlElementRef(name = "DactilarCapturado", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dactilarCapturado;
    @XmlElementRef(name = "DescripcionTipoDePaciente", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionTipoDePaciente;
    @XmlElementRef(name = "Discapacidades", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDiscapacidadModel> discapacidades;
    @XmlElementRef(name = "Documentos", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentoModel> documentos;
    @XmlElementRef(name = "FechaFallecimiento", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaFallecimiento;
    @XmlElement(name = "FechaModificacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModificacion;
    @XmlElement(name = "FechaNacimiento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlElement(name = "FechaNovedad")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNovedad;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "IngresoPortal")
    protected Boolean ingresoPortal;
    @XmlElementRef(name = "Localidad", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localidad;
    @XmlElementRef(name = "LocalidadTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localidadTemporal;
    @XmlElementRef(name = "NoHistoriaClinica", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> noHistoriaClinica;
    @XmlElementRef(name = "Nombre", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "Numero", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numero;
    @XmlElementRef(name = "NumeroTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroTemporal;
    @XmlElement(name = "PacienteId")
    protected Long pacienteId;
    @XmlElementRef(name = "Pais", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pais;
    @XmlElementRef(name = "PaisTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paisTemporal;
    @XmlElementRef(name = "Partido", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partido;
    @XmlElementRef(name = "PartidoTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partidoTemporal;
    @XmlElementRef(name = "PisoDto", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pisoDto;
    @XmlElementRef(name = "PisoDtoTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pisoDtoTemporal;
    @XmlElementRef(name = "Provincia", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provincia;
    @XmlElementRef(name = "ProvinciaTemporal", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provinciaTemporal;
    @XmlElementRef(name = "Sexo", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sexo;
    @XmlElementRef(name = "Telefono1", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono1;
    @XmlElementRef(name = "Telefono2", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono2;
    @XmlElementRef(name = "Telefono3", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono3;
    @XmlElementRef(name = "TipoNovedad", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoNovedad;
    @XmlElementRef(name = "UsuarioModificacion", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioModificacion;
    @XmlElementRef(name = "Vigencia", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vigencia;
    @XmlElementRef(name = "Vinculados", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVinculoFamiliarModel> vinculados;

    /**
     * Gets the value of the activoPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivoPortal() {
        return activoPortal;
    }

    /**
     * Sets the value of the activoPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivoPortal(Boolean value) {
        this.activoPortal = value;
    }

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
     * Gets the value of the apellido2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido2() {
        return apellido2;
    }

    /**
     * Sets the value of the apellido2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido2(JAXBElement<String> value) {
        this.apellido2 = value;
    }

    /**
     * Gets the value of the apellido3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido3() {
        return apellido3;
    }

    /**
     * Sets the value of the apellido3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido3(JAXBElement<String> value) {
        this.apellido3 = value;
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
     * Gets the value of the barrioTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarrioTemporal() {
        return barrioTemporal;
    }

    /**
     * Sets the value of the barrioTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarrioTemporal(JAXBElement<String> value) {
        this.barrioTemporal = value;
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
     * Gets the value of the calleTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalleTemporal() {
        return calleTemporal;
    }

    /**
     * Sets the value of the calleTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalleTemporal(JAXBElement<String> value) {
        this.calleTemporal = value;
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
     * Gets the value of the codigoLocalidad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoLocalidad() {
        return codigoLocalidad;
    }

    /**
     * Sets the value of the codigoLocalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoLocalidad(JAXBElement<String> value) {
        this.codigoLocalidad = value;
    }

    /**
     * Gets the value of the codigoLocalidadTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoLocalidadTemporal() {
        return codigoLocalidadTemporal;
    }

    /**
     * Sets the value of the codigoLocalidadTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoLocalidadTemporal(JAXBElement<String> value) {
        this.codigoLocalidadTemporal = value;
    }

    /**
     * Gets the value of the codigoPais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPais(JAXBElement<String> value) {
        this.codigoPais = value;
    }

    /**
     * Gets the value of the codigoPaisTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPaisTemporal() {
        return codigoPaisTemporal;
    }

    /**
     * Sets the value of the codigoPaisTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPaisTemporal(JAXBElement<String> value) {
        this.codigoPaisTemporal = value;
    }

    /**
     * Gets the value of the codigoPartido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPartido() {
        return codigoPartido;
    }

    /**
     * Sets the value of the codigoPartido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPartido(JAXBElement<String> value) {
        this.codigoPartido = value;
    }

    /**
     * Gets the value of the codigoPartidoTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPartidoTemporal() {
        return codigoPartidoTemporal;
    }

    /**
     * Sets the value of the codigoPartidoTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPartidoTemporal(JAXBElement<String> value) {
        this.codigoPartidoTemporal = value;
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
     * Gets the value of the codigoProvincia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoProvincia() {
        return codigoProvincia;
    }

    /**
     * Sets the value of the codigoProvincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoProvincia(JAXBElement<String> value) {
        this.codigoProvincia = value;
    }

    /**
     * Gets the value of the codigoProvinciaTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoProvinciaTemporal() {
        return codigoProvinciaTemporal;
    }

    /**
     * Sets the value of the codigoProvinciaTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoProvinciaTemporal(JAXBElement<String> value) {
        this.codigoProvinciaTemporal = value;
    }

    /**
     * Gets the value of the codigoTipoDePaciente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoDePaciente() {
        return codigoTipoDePaciente;
    }

    /**
     * Sets the value of the codigoTipoDePaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoDePaciente(JAXBElement<String> value) {
        this.codigoTipoDePaciente = value;
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
     * Gets the value of the dactilarCapturado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDactilarCapturado() {
        return dactilarCapturado;
    }

    /**
     * Sets the value of the dactilarCapturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDactilarCapturado(JAXBElement<String> value) {
        this.dactilarCapturado = value;
    }

    /**
     * Gets the value of the descripcionTipoDePaciente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionTipoDePaciente() {
        return descripcionTipoDePaciente;
    }

    /**
     * Sets the value of the descripcionTipoDePaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionTipoDePaciente(JAXBElement<String> value) {
        this.descripcionTipoDePaciente = value;
    }

    /**
     * Gets the value of the discapacidades property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiscapacidadModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDiscapacidadModel> getDiscapacidades() {
        return discapacidades;
    }

    /**
     * Sets the value of the discapacidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDiscapacidadModel }{@code >}
     *     
     */
    public void setDiscapacidades(JAXBElement<ArrayOfDiscapacidadModel> value) {
        this.discapacidades = value;
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
     * Gets the value of the fechaFallecimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaFallecimiento() {
        return fechaFallecimiento;
    }

    /**
     * Sets the value of the fechaFallecimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaFallecimiento(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaFallecimiento = value;
    }

    /**
     * Gets the value of the fechaModificacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Sets the value of the fechaModificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaModificacion(XMLGregorianCalendar value) {
        this.fechaModificacion = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the fechaNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNovedad() {
        return fechaNovedad;
    }

    /**
     * Sets the value of the fechaNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNovedad(XMLGregorianCalendar value) {
        this.fechaNovedad = value;
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
     * Gets the value of the ingresoPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIngresoPortal() {
        return ingresoPortal;
    }

    /**
     * Sets the value of the ingresoPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIngresoPortal(Boolean value) {
        this.ingresoPortal = value;
    }

    /**
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalidad() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalidad(JAXBElement<String> value) {
        this.localidad = value;
    }

    /**
     * Gets the value of the localidadTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalidadTemporal() {
        return localidadTemporal;
    }

    /**
     * Sets the value of the localidadTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalidadTemporal(JAXBElement<String> value) {
        this.localidadTemporal = value;
    }

    /**
     * Gets the value of the noHistoriaClinica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getNoHistoriaClinica() {
        return noHistoriaClinica;
    }

    /**
     * Sets the value of the noHistoriaClinica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setNoHistoriaClinica(JAXBElement<Long> value) {
        this.noHistoriaClinica = value;
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
     * Gets the value of the numeroTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTemporal() {
        return numeroTemporal;
    }

    /**
     * Sets the value of the numeroTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTemporal(JAXBElement<String> value) {
        this.numeroTemporal = value;
    }

    /**
     * Gets the value of the pacienteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPacienteId() {
        return pacienteId;
    }

    /**
     * Sets the value of the pacienteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPacienteId(Long value) {
        this.pacienteId = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPais(JAXBElement<String> value) {
        this.pais = value;
    }

    /**
     * Gets the value of the paisTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaisTemporal() {
        return paisTemporal;
    }

    /**
     * Sets the value of the paisTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaisTemporal(JAXBElement<String> value) {
        this.paisTemporal = value;
    }

    /**
     * Gets the value of the partido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartido() {
        return partido;
    }

    /**
     * Sets the value of the partido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartido(JAXBElement<String> value) {
        this.partido = value;
    }

    /**
     * Gets the value of the partidoTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartidoTemporal() {
        return partidoTemporal;
    }

    /**
     * Sets the value of the partidoTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartidoTemporal(JAXBElement<String> value) {
        this.partidoTemporal = value;
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
     * Gets the value of the pisoDtoTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPisoDtoTemporal() {
        return pisoDtoTemporal;
    }

    /**
     * Sets the value of the pisoDtoTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPisoDtoTemporal(JAXBElement<String> value) {
        this.pisoDtoTemporal = value;
    }

    /**
     * Gets the value of the provincia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvincia() {
        return provincia;
    }

    /**
     * Sets the value of the provincia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvincia(JAXBElement<String> value) {
        this.provincia = value;
    }

    /**
     * Gets the value of the provinciaTemporal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvinciaTemporal() {
        return provinciaTemporal;
    }

    /**
     * Sets the value of the provinciaTemporal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvinciaTemporal(JAXBElement<String> value) {
        this.provinciaTemporal = value;
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
     * Gets the value of the tipoNovedad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Sets the value of the tipoNovedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoNovedad(JAXBElement<String> value) {
        this.tipoNovedad = value;
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
     * Gets the value of the vigencia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVigencia() {
        return vigencia;
    }

    /**
     * Sets the value of the vigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVigencia(JAXBElement<String> value) {
        this.vigencia = value;
    }

    /**
     * Gets the value of the vinculados property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVinculoFamiliarModel> getVinculados() {
        return vinculados;
    }

    /**
     * Sets the value of the vinculados property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     *     
     */
    public void setVinculados(JAXBElement<ArrayOfVinculoFamiliarModel> value) {
        this.vinculados = value;
    }

}
