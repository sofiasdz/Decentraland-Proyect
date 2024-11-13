
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PacienteVinculoModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PacienteVinculoModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Discapacidad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DiscapacidadFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscapacidadNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiscpacidadId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gestiona" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HistoriaClinPaciente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTramiteVinculado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTramiteVinculante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PacienteId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="TipoDeDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VigenciaHC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vinculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VinculoId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacienteVinculoModel", propOrder = {
    "apellido",
    "discapacidad",
    "discapacidadFecha",
    "discapacidadNumero",
    "discpacidadId",
    "estado",
    "fecha",
    "fechaNacimiento",
    "gestiona",
    "historiaClinPaciente",
    "id",
    "mensaje",
    "nombre",
    "numeroDeDocumento",
    "numeroTramiteVinculado",
    "numeroTramiteVinculante",
    "pacienteId",
    "tipoDeDocumento",
    "vigenciaHC",
    "vinculo",
    "vinculoId"
})
public class PacienteVinculoModel {

    @XmlElementRef(name = "Apellido", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido;
    @XmlElement(name = "Discapacidad")
    protected Boolean discapacidad;
    @XmlElementRef(name = "DiscapacidadFecha", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> discapacidadFecha;
    @XmlElementRef(name = "DiscapacidadNumero", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> discapacidadNumero;
    @XmlElementRef(name = "DiscpacidadId", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> discpacidadId;
    @XmlElementRef(name = "Estado", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "Fecha", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fecha;
    @XmlElementRef(name = "FechaNacimiento", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaNacimiento;
    @XmlElement(name = "Gestiona")
    protected Boolean gestiona;
    @XmlElementRef(name = "HistoriaClinPaciente", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> historiaClinPaciente;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElementRef(name = "Mensaje", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensaje;
    @XmlElementRef(name = "Nombre", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "NumeroDeDocumento", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDeDocumento;
    @XmlElementRef(name = "NumeroTramiteVinculado", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroTramiteVinculado;
    @XmlElementRef(name = "NumeroTramiteVinculante", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroTramiteVinculante;
    @XmlElement(name = "PacienteId")
    protected String pacienteId;
    @XmlElementRef(name = "TipoDeDocumento", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDeDocumento;
    @XmlElementRef(name = "VigenciaHC", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vigenciaHC;
    @XmlElementRef(name = "Vinculo", namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.Pacientes.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vinculo;
    @XmlElement(name = "VinculoId")
    protected String vinculoId;

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
     * Gets the value of the discapacidad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscapacidad() {
        return discapacidad;
    }

    /**
     * Sets the value of the discapacidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscapacidad(Boolean value) {
        this.discapacidad = value;
    }

    /**
     * Gets the value of the discapacidadFecha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscapacidadFecha() {
        return discapacidadFecha;
    }

    /**
     * Sets the value of the discapacidadFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscapacidadFecha(JAXBElement<String> value) {
        this.discapacidadFecha = value;
    }

    /**
     * Gets the value of the discapacidadNumero property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscapacidadNumero() {
        return discapacidadNumero;
    }

    /**
     * Sets the value of the discapacidadNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscapacidadNumero(JAXBElement<String> value) {
        this.discapacidadNumero = value;
    }

    /**
     * Gets the value of the discpacidadId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscpacidadId() {
        return discpacidadId;
    }

    /**
     * Sets the value of the discpacidadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscpacidadId(JAXBElement<String> value) {
        this.discpacidadId = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstado(JAXBElement<String> value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFecha(JAXBElement<String> value) {
        this.fecha = value;
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
     * Gets the value of the gestiona property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGestiona() {
        return gestiona;
    }

    /**
     * Sets the value of the gestiona property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGestiona(Boolean value) {
        this.gestiona = value;
    }

    /**
     * Gets the value of the historiaClinPaciente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHistoriaClinPaciente() {
        return historiaClinPaciente;
    }

    /**
     * Sets the value of the historiaClinPaciente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHistoriaClinPaciente(JAXBElement<String> value) {
        this.historiaClinPaciente = value;
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
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensaje(JAXBElement<String> value) {
        this.mensaje = value;
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
     * Gets the value of the numeroDeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    /**
     * Sets the value of the numeroDeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDeDocumento(JAXBElement<String> value) {
        this.numeroDeDocumento = value;
    }

    /**
     * Gets the value of the numeroTramiteVinculado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTramiteVinculado() {
        return numeroTramiteVinculado;
    }

    /**
     * Sets the value of the numeroTramiteVinculado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTramiteVinculado(JAXBElement<String> value) {
        this.numeroTramiteVinculado = value;
    }

    /**
     * Gets the value of the numeroTramiteVinculante property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTramiteVinculante() {
        return numeroTramiteVinculante;
    }

    /**
     * Sets the value of the numeroTramiteVinculante property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTramiteVinculante(JAXBElement<String> value) {
        this.numeroTramiteVinculante = value;
    }

    /**
     * Gets the value of the pacienteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacienteId() {
        return pacienteId;
    }

    /**
     * Sets the value of the pacienteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacienteId(String value) {
        this.pacienteId = value;
    }

    /**
     * Gets the value of the tipoDeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    /**
     * Sets the value of the tipoDeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDeDocumento(JAXBElement<String> value) {
        this.tipoDeDocumento = value;
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

    /**
     * Gets the value of the vinculo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVinculo() {
        return vinculo;
    }

    /**
     * Sets the value of the vinculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVinculo(JAXBElement<String> value) {
        this.vinculo = value;
    }

    /**
     * Gets the value of the vinculoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinculoId() {
        return vinculoId;
    }

    /**
     * Sets the value of the vinculoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinculoId(String value) {
        this.vinculoId = value;
    }

}
