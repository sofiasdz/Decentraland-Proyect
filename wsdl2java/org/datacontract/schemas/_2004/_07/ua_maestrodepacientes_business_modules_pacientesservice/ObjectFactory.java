
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcfinterfaz.EstadoRespuesta;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidoLinkPinMasivoWrapper_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "ValidoLinkPinMasivoWrapper");
    private final static QName _DatosPersonalesModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "DatosPersonalesModel");
    private final static QName _ArrayOfCoberturaModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "ArrayOfCoberturaModel");
    private final static QName _CoberturaModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CoberturaModel");
    private final static QName _ArrayOfDocumentoModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "ArrayOfDocumentoModel");
    private final static QName _DocumentoModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "DocumentoModel");
    private final static QName _PacienteModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "PacienteModel");
    private final static QName _ArrayOfDiscapacidadModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "ArrayOfDiscapacidadModel");
    private final static QName _DiscapacidadModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "DiscapacidadModel");
    private final static QName _ArrayOfVinculoFamiliarModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "ArrayOfVinculoFamiliarModel");
    private final static QName _VinculoFamiliarModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "VinculoFamiliarModel");
    private final static QName _HuellaModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "HuellaModel");
    private final static QName _TipoDeHuellaModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "TipoDeHuellaModel");
    private final static QName _ArrayOfHuellaModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "ArrayOfHuellaModel");
    private final static QName _DactilarRegistradoModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "DactilarRegistradoModel");
    private final static QName _TipoDeHuellaModelNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Nombre");
    private final static QName _VinculoFamiliarModelHistoriaClinPaciente_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "HistoriaClinPaciente");
    private final static QName _VinculoFamiliarModelPacienteDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "PacienteDestino");
    private final static QName _VinculoFamiliarModelTipoDeVinculo_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "TipoDeVinculo");
    private final static QName _DiscapacidadModelNumeroCertificado_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "NumeroCertificado");
    private final static QName _DocumentoModelDescripcionTipoDeDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "DescripcionTipoDeDocumento");
    private final static QName _DocumentoModelNumeroDeDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "NumeroDeDocumento");
    private final static QName _DocumentoModelTipoDeDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "TipoDeDocumento");
    private final static QName _DactilarRegistradoModelDactiularCapturado_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "DactiularCapturado");
    private final static QName _DactilarRegistradoModelEstadoRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "EstadoRespuesta");
    private final static QName _CoberturaModelCUITFinanciador_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CUITFinanciador");
    private final static QName _CoberturaModelCodigoCondicionPaciente_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoCondicionPaciente");
    private final static QName _CoberturaModelCodigoPlanFinanciador_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoPlanFinanciador");
    private final static QName _CoberturaModelCondicionPaciente_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CondicionPaciente");
    private final static QName _CoberturaModelDescripcionPlanFinanciador_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "DescripcionPlanFinanciador");
    private final static QName _CoberturaModelNombreFinanciador_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "NombreFinanciador");
    private final static QName _CoberturaModelNumeroAfiliado_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "NumeroAfiliado");
    private final static QName _HuellaModelPaciente_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Paciente");
    private final static QName _HuellaModelTipoDeHuella_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "TipoDeHuella");
    private final static QName _HuellaModelValorHuella_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "ValorHuella");
    private final static QName _PacienteModelApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Apellido");
    private final static QName _PacienteModelApellido2_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Apellido2");
    private final static QName _PacienteModelApellido3_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Apellido3");
    private final static QName _PacienteModelBarrio_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Barrio");
    private final static QName _PacienteModelBarrioTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "BarrioTemporal");
    private final static QName _PacienteModelCalle_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Calle");
    private final static QName _PacienteModelCalleTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CalleTemporal");
    private final static QName _PacienteModelCoberturas_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Coberturas");
    private final static QName _PacienteModelCodigoLocalidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoLocalidad");
    private final static QName _PacienteModelCodigoLocalidadTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoLocalidadTemporal");
    private final static QName _PacienteModelCodigoPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoPais");
    private final static QName _PacienteModelCodigoPaisTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoPaisTemporal");
    private final static QName _PacienteModelCodigoPartido_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoPartido");
    private final static QName _PacienteModelCodigoPartidoTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoPartidoTemporal");
    private final static QName _PacienteModelCodigoPostal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoPostal");
    private final static QName _PacienteModelCodigoProvincia_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoProvincia");
    private final static QName _PacienteModelCodigoProvinciaTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoProvinciaTemporal");
    private final static QName _PacienteModelCodigoTipoDePaciente_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CodigoTipoDePaciente");
    private final static QName _PacienteModelCorreoElectronico_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "CorreoElectronico");
    private final static QName _PacienteModelDactilarCapturado_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "DactilarCapturado");
    private final static QName _PacienteModelDescripcionTipoDePaciente_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "DescripcionTipoDePaciente");
    private final static QName _PacienteModelDiscapacidades_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Discapacidades");
    private final static QName _PacienteModelDocumentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Documentos");
    private final static QName _PacienteModelFechaFallecimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "FechaFallecimiento");
    private final static QName _PacienteModelLocalidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Localidad");
    private final static QName _PacienteModelLocalidadTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "LocalidadTemporal");
    private final static QName _PacienteModelNoHistoriaClinica_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "NoHistoriaClinica");
    private final static QName _PacienteModelNumero_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Numero");
    private final static QName _PacienteModelNumeroTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "NumeroTemporal");
    private final static QName _PacienteModelPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Pais");
    private final static QName _PacienteModelPaisTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "PaisTemporal");
    private final static QName _PacienteModelPartido_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Partido");
    private final static QName _PacienteModelPartidoTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "PartidoTemporal");
    private final static QName _PacienteModelPisoDto_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "PisoDto");
    private final static QName _PacienteModelPisoDtoTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "PisoDtoTemporal");
    private final static QName _PacienteModelProvincia_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Provincia");
    private final static QName _PacienteModelProvinciaTemporal_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "ProvinciaTemporal");
    private final static QName _PacienteModelSexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Sexo");
    private final static QName _PacienteModelTelefono1_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Telefono1");
    private final static QName _PacienteModelTelefono2_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Telefono2");
    private final static QName _PacienteModelTelefono3_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Telefono3");
    private final static QName _PacienteModelTipoNovedad_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "TipoNovedad");
    private final static QName _PacienteModelUsuarioModificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "UsuarioModificacion");
    private final static QName _PacienteModelVigencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Vigencia");
    private final static QName _PacienteModelVinculados_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Vinculados");
    private final static QName _DatosPersonalesModelArea1_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Area1");
    private final static QName _DatosPersonalesModelArea2_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Area2");
    private final static QName _DatosPersonalesModelArea3_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "Area3");
    private final static QName _DatosPersonalesModelFechaModificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "FechaModificacion");
    private final static QName _DatosPersonalesModelFechaNacimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "FechaNacimiento");
    private final static QName _DatosPersonalesModelHistoriaClinica_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "HistoriaClinica");
    private final static QName _DatosPersonalesModelVigenciaHC_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", "VigenciaHC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidoLinkPinMasivoWrapper }
     * 
     */
    public ValidoLinkPinMasivoWrapper createValidoLinkPinMasivoWrapper() {
        return new ValidoLinkPinMasivoWrapper();
    }

    /**
     * Create an instance of {@link DatosPersonalesModel }
     * 
     */
    public DatosPersonalesModel createDatosPersonalesModel() {
        return new DatosPersonalesModel();
    }

    /**
     * Create an instance of {@link PacienteModel }
     * 
     */
    public PacienteModel createPacienteModel() {
        return new PacienteModel();
    }

    /**
     * Create an instance of {@link HuellaModel }
     * 
     */
    public HuellaModel createHuellaModel() {
        return new HuellaModel();
    }

    /**
     * Create an instance of {@link ArrayOfHuellaModel }
     * 
     */
    public ArrayOfHuellaModel createArrayOfHuellaModel() {
        return new ArrayOfHuellaModel();
    }

    /**
     * Create an instance of {@link CoberturaModel }
     * 
     */
    public CoberturaModel createCoberturaModel() {
        return new CoberturaModel();
    }

    /**
     * Create an instance of {@link ArrayOfVinculoFamiliarModel }
     * 
     */
    public ArrayOfVinculoFamiliarModel createArrayOfVinculoFamiliarModel() {
        return new ArrayOfVinculoFamiliarModel();
    }

    /**
     * Create an instance of {@link DactilarRegistradoModel }
     * 
     */
    public DactilarRegistradoModel createDactilarRegistradoModel() {
        return new DactilarRegistradoModel();
    }

    /**
     * Create an instance of {@link ArrayOfCoberturaModel }
     * 
     */
    public ArrayOfCoberturaModel createArrayOfCoberturaModel() {
        return new ArrayOfCoberturaModel();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentoModel }
     * 
     */
    public ArrayOfDocumentoModel createArrayOfDocumentoModel() {
        return new ArrayOfDocumentoModel();
    }

    /**
     * Create an instance of {@link DocumentoModel }
     * 
     */
    public DocumentoModel createDocumentoModel() {
        return new DocumentoModel();
    }

    /**
     * Create an instance of {@link ArrayOfDiscapacidadModel }
     * 
     */
    public ArrayOfDiscapacidadModel createArrayOfDiscapacidadModel() {
        return new ArrayOfDiscapacidadModel();
    }

    /**
     * Create an instance of {@link DiscapacidadModel }
     * 
     */
    public DiscapacidadModel createDiscapacidadModel() {
        return new DiscapacidadModel();
    }

    /**
     * Create an instance of {@link VinculoFamiliarModel }
     * 
     */
    public VinculoFamiliarModel createVinculoFamiliarModel() {
        return new VinculoFamiliarModel();
    }

    /**
     * Create an instance of {@link TipoDeHuellaModel }
     * 
     */
    public TipoDeHuellaModel createTipoDeHuellaModel() {
        return new TipoDeHuellaModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidoLinkPinMasivoWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidoLinkPinMasivoWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "ValidoLinkPinMasivoWrapper")
    public JAXBElement<ValidoLinkPinMasivoWrapper> createValidoLinkPinMasivoWrapper(ValidoLinkPinMasivoWrapper value) {
        return new JAXBElement<ValidoLinkPinMasivoWrapper>(_ValidoLinkPinMasivoWrapper_QNAME, ValidoLinkPinMasivoWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosPersonalesModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosPersonalesModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "DatosPersonalesModel")
    public JAXBElement<DatosPersonalesModel> createDatosPersonalesModel(DatosPersonalesModel value) {
        return new JAXBElement<DatosPersonalesModel>(_DatosPersonalesModel_QNAME, DatosPersonalesModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoberturaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCoberturaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "ArrayOfCoberturaModel")
    public JAXBElement<ArrayOfCoberturaModel> createArrayOfCoberturaModel(ArrayOfCoberturaModel value) {
        return new JAXBElement<ArrayOfCoberturaModel>(_ArrayOfCoberturaModel_QNAME, ArrayOfCoberturaModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoberturaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CoberturaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CoberturaModel")
    public JAXBElement<CoberturaModel> createCoberturaModel(CoberturaModel value) {
        return new JAXBElement<CoberturaModel>(_CoberturaModel_QNAME, CoberturaModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "ArrayOfDocumentoModel")
    public JAXBElement<ArrayOfDocumentoModel> createArrayOfDocumentoModel(ArrayOfDocumentoModel value) {
        return new JAXBElement<ArrayOfDocumentoModel>(_ArrayOfDocumentoModel_QNAME, ArrayOfDocumentoModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentoModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "DocumentoModel")
    public JAXBElement<DocumentoModel> createDocumentoModel(DocumentoModel value) {
        return new JAXBElement<DocumentoModel>(_DocumentoModel_QNAME, DocumentoModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "PacienteModel")
    public JAXBElement<PacienteModel> createPacienteModel(PacienteModel value) {
        return new JAXBElement<PacienteModel>(_PacienteModel_QNAME, PacienteModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiscapacidadModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDiscapacidadModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "ArrayOfDiscapacidadModel")
    public JAXBElement<ArrayOfDiscapacidadModel> createArrayOfDiscapacidadModel(ArrayOfDiscapacidadModel value) {
        return new JAXBElement<ArrayOfDiscapacidadModel>(_ArrayOfDiscapacidadModel_QNAME, ArrayOfDiscapacidadModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscapacidadModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiscapacidadModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "DiscapacidadModel")
    public JAXBElement<DiscapacidadModel> createDiscapacidadModel(DiscapacidadModel value) {
        return new JAXBElement<DiscapacidadModel>(_DiscapacidadModel_QNAME, DiscapacidadModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "ArrayOfVinculoFamiliarModel")
    public JAXBElement<ArrayOfVinculoFamiliarModel> createArrayOfVinculoFamiliarModel(ArrayOfVinculoFamiliarModel value) {
        return new JAXBElement<ArrayOfVinculoFamiliarModel>(_ArrayOfVinculoFamiliarModel_QNAME, ArrayOfVinculoFamiliarModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VinculoFamiliarModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VinculoFamiliarModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "VinculoFamiliarModel")
    public JAXBElement<VinculoFamiliarModel> createVinculoFamiliarModel(VinculoFamiliarModel value) {
        return new JAXBElement<VinculoFamiliarModel>(_VinculoFamiliarModel_QNAME, VinculoFamiliarModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "HuellaModel")
    public JAXBElement<HuellaModel> createHuellaModel(HuellaModel value) {
        return new JAXBElement<HuellaModel>(_HuellaModel_QNAME, HuellaModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDeHuellaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoDeHuellaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "TipoDeHuellaModel")
    public JAXBElement<TipoDeHuellaModel> createTipoDeHuellaModel(TipoDeHuellaModel value) {
        return new JAXBElement<TipoDeHuellaModel>(_TipoDeHuellaModel_QNAME, TipoDeHuellaModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHuellaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHuellaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "ArrayOfHuellaModel")
    public JAXBElement<ArrayOfHuellaModel> createArrayOfHuellaModel(ArrayOfHuellaModel value) {
        return new JAXBElement<ArrayOfHuellaModel>(_ArrayOfHuellaModel_QNAME, ArrayOfHuellaModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DactilarRegistradoModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DactilarRegistradoModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "DactilarRegistradoModel")
    public JAXBElement<DactilarRegistradoModel> createDactilarRegistradoModel(DactilarRegistradoModel value) {
        return new JAXBElement<DactilarRegistradoModel>(_DactilarRegistradoModel_QNAME, DactilarRegistradoModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Nombre", scope = TipoDeHuellaModel.class)
    public JAXBElement<String> createTipoDeHuellaModelNombre(String value) {
        return new JAXBElement<String>(_TipoDeHuellaModelNombre_QNAME, String.class, TipoDeHuellaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "HistoriaClinPaciente", scope = VinculoFamiliarModel.class)
    public JAXBElement<String> createVinculoFamiliarModelHistoriaClinPaciente(String value) {
        return new JAXBElement<String>(_VinculoFamiliarModelHistoriaClinPaciente_QNAME, String.class, VinculoFamiliarModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "PacienteDestino", scope = VinculoFamiliarModel.class)
    public JAXBElement<PacienteModel> createVinculoFamiliarModelPacienteDestino(PacienteModel value) {
        return new JAXBElement<PacienteModel>(_VinculoFamiliarModelPacienteDestino_QNAME, PacienteModel.class, VinculoFamiliarModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "TipoDeVinculo", scope = VinculoFamiliarModel.class)
    public JAXBElement<String> createVinculoFamiliarModelTipoDeVinculo(String value) {
        return new JAXBElement<String>(_VinculoFamiliarModelTipoDeVinculo_QNAME, String.class, VinculoFamiliarModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "NumeroCertificado", scope = DiscapacidadModel.class)
    public JAXBElement<String> createDiscapacidadModelNumeroCertificado(String value) {
        return new JAXBElement<String>(_DiscapacidadModelNumeroCertificado_QNAME, String.class, DiscapacidadModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "DescripcionTipoDeDocumento", scope = DocumentoModel.class)
    public JAXBElement<String> createDocumentoModelDescripcionTipoDeDocumento(String value) {
        return new JAXBElement<String>(_DocumentoModelDescripcionTipoDeDocumento_QNAME, String.class, DocumentoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "NumeroDeDocumento", scope = DocumentoModel.class)
    public JAXBElement<String> createDocumentoModelNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_DocumentoModelNumeroDeDocumento_QNAME, String.class, DocumentoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "TipoDeDocumento", scope = DocumentoModel.class)
    public JAXBElement<String> createDocumentoModelTipoDeDocumento(String value) {
        return new JAXBElement<String>(_DocumentoModelTipoDeDocumento_QNAME, String.class, DocumentoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "DactiularCapturado", scope = DactilarRegistradoModel.class)
    public JAXBElement<String> createDactilarRegistradoModelDactiularCapturado(String value) {
        return new JAXBElement<String>(_DactilarRegistradoModelDactiularCapturado_QNAME, String.class, DactilarRegistradoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "EstadoRespuesta", scope = DactilarRegistradoModel.class)
    public JAXBElement<EstadoRespuesta> createDactilarRegistradoModelEstadoRespuesta(EstadoRespuesta value) {
        return new JAXBElement<EstadoRespuesta>(_DactilarRegistradoModelEstadoRespuesta_QNAME, EstadoRespuesta.class, DactilarRegistradoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CUITFinanciador", scope = CoberturaModel.class)
    public JAXBElement<String> createCoberturaModelCUITFinanciador(String value) {
        return new JAXBElement<String>(_CoberturaModelCUITFinanciador_QNAME, String.class, CoberturaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoCondicionPaciente", scope = CoberturaModel.class)
    public JAXBElement<String> createCoberturaModelCodigoCondicionPaciente(String value) {
        return new JAXBElement<String>(_CoberturaModelCodigoCondicionPaciente_QNAME, String.class, CoberturaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoPlanFinanciador", scope = CoberturaModel.class)
    public JAXBElement<String> createCoberturaModelCodigoPlanFinanciador(String value) {
        return new JAXBElement<String>(_CoberturaModelCodigoPlanFinanciador_QNAME, String.class, CoberturaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CondicionPaciente", scope = CoberturaModel.class)
    public JAXBElement<String> createCoberturaModelCondicionPaciente(String value) {
        return new JAXBElement<String>(_CoberturaModelCondicionPaciente_QNAME, String.class, CoberturaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "DescripcionPlanFinanciador", scope = CoberturaModel.class)
    public JAXBElement<String> createCoberturaModelDescripcionPlanFinanciador(String value) {
        return new JAXBElement<String>(_CoberturaModelDescripcionPlanFinanciador_QNAME, String.class, CoberturaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "NombreFinanciador", scope = CoberturaModel.class)
    public JAXBElement<String> createCoberturaModelNombreFinanciador(String value) {
        return new JAXBElement<String>(_CoberturaModelNombreFinanciador_QNAME, String.class, CoberturaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "NumeroAfiliado", scope = CoberturaModel.class)
    public JAXBElement<String> createCoberturaModelNumeroAfiliado(String value) {
        return new JAXBElement<String>(_CoberturaModelNumeroAfiliado_QNAME, String.class, CoberturaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Paciente", scope = HuellaModel.class)
    public JAXBElement<PacienteModel> createHuellaModelPaciente(PacienteModel value) {
        return new JAXBElement<PacienteModel>(_HuellaModelPaciente_QNAME, PacienteModel.class, HuellaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDeHuellaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoDeHuellaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "TipoDeHuella", scope = HuellaModel.class)
    public JAXBElement<TipoDeHuellaModel> createHuellaModelTipoDeHuella(TipoDeHuellaModel value) {
        return new JAXBElement<TipoDeHuellaModel>(_HuellaModelTipoDeHuella_QNAME, TipoDeHuellaModel.class, HuellaModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "ValorHuella", scope = HuellaModel.class)
    public JAXBElement<byte[]> createHuellaModelValorHuella(byte[] value) {
        return new JAXBElement<byte[]>(_HuellaModelValorHuella_QNAME, byte[].class, HuellaModel.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Apellido", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelApellido(String value) {
        return new JAXBElement<String>(_PacienteModelApellido_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Apellido2", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelApellido2(String value) {
        return new JAXBElement<String>(_PacienteModelApellido2_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Apellido3", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelApellido3(String value) {
        return new JAXBElement<String>(_PacienteModelApellido3_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Barrio", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelBarrio(String value) {
        return new JAXBElement<String>(_PacienteModelBarrio_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "BarrioTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelBarrioTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelBarrioTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Calle", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCalle(String value) {
        return new JAXBElement<String>(_PacienteModelCalle_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CalleTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCalleTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelCalleTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoberturaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCoberturaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Coberturas", scope = PacienteModel.class)
    public JAXBElement<ArrayOfCoberturaModel> createPacienteModelCoberturas(ArrayOfCoberturaModel value) {
        return new JAXBElement<ArrayOfCoberturaModel>(_PacienteModelCoberturas_QNAME, ArrayOfCoberturaModel.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoLocalidad", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoLocalidad(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoLocalidad_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoLocalidadTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoLocalidadTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoLocalidadTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoPais", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoPais(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoPais_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoPaisTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoPaisTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoPaisTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoPartido", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoPartido(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoPartido_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoPartidoTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoPartidoTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoPartidoTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoPostal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoPostal(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoPostal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoProvincia", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoProvincia(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoProvincia_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoProvinciaTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoProvinciaTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoProvinciaTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoTipoDePaciente", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCodigoTipoDePaciente(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoTipoDePaciente_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CorreoElectronico", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelCorreoElectronico(String value) {
        return new JAXBElement<String>(_PacienteModelCorreoElectronico_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "DactilarCapturado", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelDactilarCapturado(String value) {
        return new JAXBElement<String>(_PacienteModelDactilarCapturado_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "DescripcionTipoDePaciente", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelDescripcionTipoDePaciente(String value) {
        return new JAXBElement<String>(_PacienteModelDescripcionTipoDePaciente_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDiscapacidadModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDiscapacidadModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Discapacidades", scope = PacienteModel.class)
    public JAXBElement<ArrayOfDiscapacidadModel> createPacienteModelDiscapacidades(ArrayOfDiscapacidadModel value) {
        return new JAXBElement<ArrayOfDiscapacidadModel>(_PacienteModelDiscapacidades_QNAME, ArrayOfDiscapacidadModel.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Documentos", scope = PacienteModel.class)
    public JAXBElement<ArrayOfDocumentoModel> createPacienteModelDocumentos(ArrayOfDocumentoModel value) {
        return new JAXBElement<ArrayOfDocumentoModel>(_PacienteModelDocumentos_QNAME, ArrayOfDocumentoModel.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "FechaFallecimiento", scope = PacienteModel.class)
    public JAXBElement<XMLGregorianCalendar> createPacienteModelFechaFallecimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PacienteModelFechaFallecimiento_QNAME, XMLGregorianCalendar.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Localidad", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelLocalidad(String value) {
        return new JAXBElement<String>(_PacienteModelLocalidad_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "LocalidadTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelLocalidadTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelLocalidadTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "NoHistoriaClinica", scope = PacienteModel.class)
    public JAXBElement<Long> createPacienteModelNoHistoriaClinica(Long value) {
        return new JAXBElement<Long>(_PacienteModelNoHistoriaClinica_QNAME, Long.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Nombre", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelNombre(String value) {
        return new JAXBElement<String>(_TipoDeHuellaModelNombre_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Numero", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelNumero(String value) {
        return new JAXBElement<String>(_PacienteModelNumero_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "NumeroTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelNumeroTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelNumeroTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Pais", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelPais(String value) {
        return new JAXBElement<String>(_PacienteModelPais_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "PaisTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelPaisTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelPaisTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Partido", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelPartido(String value) {
        return new JAXBElement<String>(_PacienteModelPartido_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "PartidoTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelPartidoTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelPartidoTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "PisoDto", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelPisoDto(String value) {
        return new JAXBElement<String>(_PacienteModelPisoDto_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "PisoDtoTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelPisoDtoTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelPisoDtoTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Provincia", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelProvincia(String value) {
        return new JAXBElement<String>(_PacienteModelProvincia_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "ProvinciaTemporal", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelProvinciaTemporal(String value) {
        return new JAXBElement<String>(_PacienteModelProvinciaTemporal_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Sexo", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelSexo(String value) {
        return new JAXBElement<String>(_PacienteModelSexo_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Telefono1", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelTelefono1(String value) {
        return new JAXBElement<String>(_PacienteModelTelefono1_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Telefono2", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelTelefono2(String value) {
        return new JAXBElement<String>(_PacienteModelTelefono2_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Telefono3", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelTelefono3(String value) {
        return new JAXBElement<String>(_PacienteModelTelefono3_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "TipoNovedad", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelTipoNovedad(String value) {
        return new JAXBElement<String>(_PacienteModelTipoNovedad_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "UsuarioModificacion", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelUsuarioModificacion(String value) {
        return new JAXBElement<String>(_PacienteModelUsuarioModificacion_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Vigencia", scope = PacienteModel.class)
    public JAXBElement<String> createPacienteModelVigencia(String value) {
        return new JAXBElement<String>(_PacienteModelVigencia_QNAME, String.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Vinculados", scope = PacienteModel.class)
    public JAXBElement<ArrayOfVinculoFamiliarModel> createPacienteModelVinculados(ArrayOfVinculoFamiliarModel value) {
        return new JAXBElement<ArrayOfVinculoFamiliarModel>(_PacienteModelVinculados_QNAME, ArrayOfVinculoFamiliarModel.class, PacienteModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Apellido", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelApellido(String value) {
        return new JAXBElement<String>(_PacienteModelApellido_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Area1", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelArea1(String value) {
        return new JAXBElement<String>(_DatosPersonalesModelArea1_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Area2", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelArea2(String value) {
        return new JAXBElement<String>(_DatosPersonalesModelArea2_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Area3", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelArea3(String value) {
        return new JAXBElement<String>(_DatosPersonalesModelArea3_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Barrio", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelBarrio(String value) {
        return new JAXBElement<String>(_PacienteModelBarrio_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Calle", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelCalle(String value) {
        return new JAXBElement<String>(_PacienteModelCalle_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoberturaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCoberturaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Coberturas", scope = DatosPersonalesModel.class)
    public JAXBElement<ArrayOfCoberturaModel> createDatosPersonalesModelCoberturas(ArrayOfCoberturaModel value) {
        return new JAXBElement<ArrayOfCoberturaModel>(_PacienteModelCoberturas_QNAME, ArrayOfCoberturaModel.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CodigoPostal", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelCodigoPostal(String value) {
        return new JAXBElement<String>(_PacienteModelCodigoPostal_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "CorreoElectronico", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelCorreoElectronico(String value) {
        return new JAXBElement<String>(_PacienteModelCorreoElectronico_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Documentos", scope = DatosPersonalesModel.class)
    public JAXBElement<ArrayOfDocumentoModel> createDatosPersonalesModelDocumentos(ArrayOfDocumentoModel value) {
        return new JAXBElement<ArrayOfDocumentoModel>(_PacienteModelDocumentos_QNAME, ArrayOfDocumentoModel.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "FechaModificacion", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelFechaModificacion(String value) {
        return new JAXBElement<String>(_DatosPersonalesModelFechaModificacion_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "FechaNacimiento", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelFechaNacimiento(String value) {
        return new JAXBElement<String>(_DatosPersonalesModelFechaNacimiento_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "HistoriaClinica", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelHistoriaClinica(String value) {
        return new JAXBElement<String>(_DatosPersonalesModelHistoriaClinica_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Nombre", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelNombre(String value) {
        return new JAXBElement<String>(_TipoDeHuellaModelNombre_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Numero", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelNumero(String value) {
        return new JAXBElement<String>(_PacienteModelNumero_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "PisoDto", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelPisoDto(String value) {
        return new JAXBElement<String>(_PacienteModelPisoDto_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Sexo", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelSexo(String value) {
        return new JAXBElement<String>(_PacienteModelSexo_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Telefono1", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelTelefono1(String value) {
        return new JAXBElement<String>(_PacienteModelTelefono1_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Telefono2", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelTelefono2(String value) {
        return new JAXBElement<String>(_PacienteModelTelefono2_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "Telefono3", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelTelefono3(String value) {
        return new JAXBElement<String>(_PacienteModelTelefono3_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "UsuarioModificacion", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelUsuarioModificacion(String value) {
        return new JAXBElement<String>(_PacienteModelUsuarioModificacion_QNAME, String.class, DatosPersonalesModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService.Models", name = "VigenciaHC", scope = DatosPersonalesModel.class)
    public JAXBElement<String> createDatosPersonalesModelVigenciaHC(String value) {
        return new JAXBElement<String>(_DatosPersonalesModelVigenciaHC_QNAME, String.class, DatosPersonalesModel.class, value);
    }

}
