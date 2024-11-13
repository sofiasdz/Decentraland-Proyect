
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.ua_core.ArrayOfListItemModel;
import org.datacontract.schemas._2004._07.ua_directorio_business_services_directorio.TelefonoModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules.ArrayOfResultadoOperacion;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules.PacienteModelWrapper;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules.PacienteReducidoWrapper;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules.PacientesReducidosWrapper;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules.PinModelWrapper;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules.ResultadoOperacion;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes.CreateVinculoModelDTO;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes.PacienteVinculoModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes.ValidacionParaVincularModelDTO;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.ArrayOfHuellaModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.ArrayOfVinculoFamiliarModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.CoberturaModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.DactilarRegistradoModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.DatosPersonalesModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.HuellaModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.PacienteModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.ValidoLinkPinMasivoWrapper;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _ObtenerPacientesConPlanSaludSinPinConEmailValidoResponseObtenerPacientesConPlanSaludSinPinConEmailValidoResult_QNAME = new QName("http://tempuri.org/", "ObtenerPacientesConPlanSaludSinPinConEmailValidoResult");
    private final static QName _ObtenerPacientesSinPlanSaludSinPinConEmailValidoResponseObtenerPacientesSinPlanSaludSinPinConEmailValidoResult_QNAME = new QName("http://tempuri.org/", "ObtenerPacientesSinPlanSaludSinPinConEmailValidoResult");
    private final static QName _ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponseObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult_QNAME = new QName("http://tempuri.org/", "ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult");
    private final static QName _ObtenerPacientesConPinMasivoNoGeneradoResponseObtenerPacientesConPinMasivoNoGeneradoResult_QNAME = new QName("http://tempuri.org/", "ObtenerPacientesConPinMasivoNoGeneradoResult");
    private final static QName _ObtenerLinkParaGenerarPinResponseObtenerLinkParaGenerarPinResult_QNAME = new QName("http://tempuri.org/", "ObtenerLinkParaGenerarPinResult");
    private final static QName _GenerarPinAutomaticoResponseGenerarPinAutomaticoResult_QNAME = new QName("http://tempuri.org/", "GenerarPinAutomaticoResult");
    private final static QName _ObtenerPacientexTelefonoSTeleono_QNAME = new QName("http://tempuri.org/", "sTeleono");
    private final static QName _ObtenerPacientexTelefonoResponseObtenerPacientexTelefonoResult_QNAME = new QName("http://tempuri.org/", "ObtenerPacientexTelefonoResult");
    private final static QName _EsValidoLinkGeneracionPinMasivoResponseEsValidoLinkGeneracionPinMasivoResult_QNAME = new QName("http://tempuri.org/", "EsValidoLinkGeneracionPinMasivoResult");
    private final static QName _GetBodyMailLinkGeneracionPinPacienteReducidoWrapper_QNAME = new QName("http://tempuri.org/", "pacienteReducidoWrapper");
    private final static QName _GetBodyMailLinkGeneracionPinResponseGetBodyMailLinkGeneracionPinResult_QNAME = new QName("http://tempuri.org/", "GetBodyMailLinkGeneracionPinResult");
    private final static QName _EnviarMailGeneracionPinResponseEnviarMailGeneracionPinResult_QNAME = new QName("http://tempuri.org/", "EnviarMailGeneracionPinResult");
    private final static QName _ObtenerPreguntasSecretasResponseObtenerPreguntasSecretasResult_QNAME = new QName("http://tempuri.org/", "ObtenerPreguntasSecretasResult");
    private final static QName _ObtenerPaisesResponseObtenerPaisesResult_QNAME = new QName("http://tempuri.org/", "ObtenerPaisesResult");
    private final static QName _CodigosTelefonoResponseCodigosTelefonoResult_QNAME = new QName("http://tempuri.org/", "CodigosTelefonoResult");
    private final static QName _DeconstruccionTelefonoTelefono_QNAME = new QName("http://tempuri.org/", "telefono");
    private final static QName _DeconstruccionTelefonoResponseDeconstruccionTelefonoResult_QNAME = new QName("http://tempuri.org/", "DeconstruccionTelefonoResult");
    private final static QName _ObtenerPartidosResponseObtenerPartidosResult_QNAME = new QName("http://tempuri.org/", "ObtenerPartidosResult");
    private final static QName _ObtenerLocalidadesResponseObtenerLocalidadesResult_QNAME = new QName("http://tempuri.org/", "ObtenerLocalidadesResult");
    private final static QName _ObtenerProvinciasResponseObtenerProvinciasResult_QNAME = new QName("http://tempuri.org/", "ObtenerProvinciasResult");
    private final static QName _ModificarPacienteServiceModel_QNAME = new QName("http://tempuri.org/", "model");
    private final static QName _EnviarMailActivacionResponseEnviarMailActivacionResult_QNAME = new QName("http://tempuri.org/", "EnviarMailActivacionResult");
    private final static QName _ConfirmarActivacionNumeroDeDocumento_QNAME = new QName("http://tempuri.org/", "numeroDeDocumento");
    private final static QName _ConfirmarActivacionRespuesta_QNAME = new QName("http://tempuri.org/", "respuesta");
    private final static QName _ConfirmarActivacionClave_QNAME = new QName("http://tempuri.org/", "clave");
    private final static QName _ConfirmarActivacionResponseConfirmarActivacionResult_QNAME = new QName("http://tempuri.org/", "ConfirmarActivacionResult");
    private final static QName _InformarPacientePaciente_QNAME = new QName("http://tempuri.org/", "paciente");
    private final static QName _InformarPacienteResponseInformarPacienteResult_QNAME = new QName("http://tempuri.org/", "InformarPacienteResult");
    private final static QName _DatosPersonalesPacienteTipoDocumentoId_QNAME = new QName("http://tempuri.org/", "tipoDocumentoId");
    private final static QName _DatosPersonalesPacienteResponseDatosPersonalesPacienteResult_QNAME = new QName("http://tempuri.org/", "DatosPersonalesPacienteResult");
    private final static QName _EnviarMailDesbloqueoPreguntaSecretaResponseEnviarMailDesbloqueoPreguntaSecretaResult_QNAME = new QName("http://tempuri.org/", "EnviarMailDesbloqueoPreguntaSecretaResult");
    private final static QName _ValidacionOlvidoDeConstraseñaResponseValidacionOlvidoDeConstraseñaResult_QNAME = new QName("http://tempuri.org/", "ValidacionOlvidoDeConstrase\u00f1aResult");
    private final static QName _CambioDeClaveClaveNueva_QNAME = new QName("http://tempuri.org/", "claveNueva");
    private final static QName _CambioDeClaveConfirmacionClaveNueva_QNAME = new QName("http://tempuri.org/", "confirmacionClaveNueva");
    private final static QName _CambioDeClaveResponseCambioDeClaveResult_QNAME = new QName("http://tempuri.org/", "CambioDeClaveResult");
    private final static QName _ConfirmarLimpiezaSeguridadResponseConfirmarLimpiezaSeguridadResult_QNAME = new QName("http://tempuri.org/", "ConfirmarLimpiezaSeguridadResult");
    private final static QName _ObtenerHuellaDigitalResponseObtenerHuellaDigitalResult_QNAME = new QName("http://tempuri.org/", "ObtenerHuellaDigitalResult");
    private final static QName _ObtenerHuellasDigitalesDate_QNAME = new QName("http://tempuri.org/", "date");
    private final static QName _ObtenerHuellasDigitalesResponseObtenerHuellasDigitalesResult_QNAME = new QName("http://tempuri.org/", "ObtenerHuellasDigitalesResult");
    private final static QName _GuardarHuellaDigitalHuella_QNAME = new QName("http://tempuri.org/", "huella");
    private final static QName _GuardarHuellaDigitalResponseGuardarHuellaDigitalResult_QNAME = new QName("http://tempuri.org/", "GuardarHuellaDigitalResult");
    private final static QName _EliminarHuellaDigitalResponseEliminarHuellaDigitalResult_QNAME = new QName("http://tempuri.org/", "EliminarHuellaDigitalResult");
    private final static QName _ProcesarCoberturaPacienteCobertura_QNAME = new QName("http://tempuri.org/", "cobertura");
    private final static QName _ProcesarCoberturaPacienteTipoNovedad_QNAME = new QName("http://tempuri.org/", "tipoNovedad");
    private final static QName _ProcesarCoberturaPacienteResponseProcesarCoberturaPacienteResult_QNAME = new QName("http://tempuri.org/", "ProcesarCoberturaPacienteResult");
    private final static QName _DesactivarPacienteResponseDesactivarPacienteResult_QNAME = new QName("http://tempuri.org/", "DesactivarPacienteResult");
    private final static QName _LoadImagenPacientePacienteId_QNAME = new QName("http://tempuri.org/", "pacienteId");
    private final static QName _LoadImagenPacienteExtension_QNAME = new QName("http://tempuri.org/", "extension");
    private final static QName _LoadImagenPacienteResponseLoadImagenPacienteResult_QNAME = new QName("http://tempuri.org/", "LoadImagenPacienteResult");
    private final static QName _EnviarMailsActivacionLabCodePacientes_QNAME = new QName("http://tempuri.org/", "labCodePacientes");
    private final static QName _EnviarMailsActivacionResponseEnviarMailsActivacionResult_QNAME = new QName("http://tempuri.org/", "EnviarMailsActivacionResult");
    private final static QName _ObtenerVinculosFamiliaresResponseObtenerVinculosFamiliaresResult_QNAME = new QName("http://tempuri.org/", "ObtenerVinculosFamiliaresResult");
    private final static QName _ObtenerVinculosGestionadosResponseObtenerVinculosGestionadosResult_QNAME = new QName("http://tempuri.org/", "ObtenerVinculosGestionadosResult");
    private final static QName _ObtenerDactilarRegistradoResponseObtenerDactilarRegistradoResult_QNAME = new QName("http://tempuri.org/", "ObtenerDactilarRegistradoResult");
    private final static QName _ObtenerPacienteCodigoPaciente_QNAME = new QName("http://tempuri.org/", "codigoPaciente");
    private final static QName _ObtenerPacienteHistoriaClinica_QNAME = new QName("http://tempuri.org/", "historiaClinica");
    private final static QName _ObtenerPacienteNombre_QNAME = new QName("http://tempuri.org/", "nombre");
    private final static QName _ObtenerPacienteApellido_QNAME = new QName("http://tempuri.org/", "apellido");
    private final static QName _ObtenerPacienteTipoDeDocumento_QNAME = new QName("http://tempuri.org/", "tipoDeDocumento");
    private final static QName _ObtenerPacienteResponseObtenerPacienteResult_QNAME = new QName("http://tempuri.org/", "ObtenerPacienteResult");
    private final static QName _ObtenerPacienteReporteResponseObtenerPacienteReporteResult_QNAME = new QName("http://tempuri.org/", "ObtenerPacienteReporteResult");
    private final static QName _EnviarMailConfirmaCorreoLabCoreHistoriaClinica_QNAME = new QName("http://tempuri.org/", "_historiaClinica");
    private final static QName _EnviarMailConfirmaCorreoLabCoreEmail_QNAME = new QName("http://tempuri.org/", "_email");
    private final static QName _EnviarMailConfirmaCorreoLabCoreSede_QNAME = new QName("http://tempuri.org/", "_sede");
    private final static QName _EnviarMailConfirmaCorreoLink_QNAME = new QName("http://tempuri.org/", "_link");
    private final static QName _EnviarMailConfirmaCorreoVigencia_QNAME = new QName("http://tempuri.org/", "_vigencia");
    private final static QName _EnviarMailNotificarCambioCorreoNuevoEmail_QNAME = new QName("http://tempuri.org/", "_nuevoEmail");
    private final static QName _EnviarMailLaboratorioTimeStampEstudio_QNAME = new QName("http://tempuri.org/", "_timeStampEstudio");
    private final static QName _EnviarMailLaboratorioObservaciones_QNAME = new QName("http://tempuri.org/", "_observaciones");
    private final static QName _EnviarMailLaboratorioNombreAdjunto_QNAME = new QName("http://tempuri.org/", "_nombreAdjunto");
    private final static QName _EnviarMailLaboratorioAdjunto_QNAME = new QName("http://tempuri.org/", "_adjunto");
    private final static QName _ObtenerTiposDeVinculoResponseObtenerTiposDeVinculoResult_QNAME = new QName("http://tempuri.org/", "ObtenerTiposDeVinculoResult");
    private final static QName _GetValidacionParaVincularModelResponseGetValidacionParaVincularModelResult_QNAME = new QName("http://tempuri.org/", "GetValidacionParaVincularModelResult");
    private final static QName _CrearVinculoVinculo_QNAME = new QName("http://tempuri.org/", "vinculo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CantidadPacientesConPlanSaludSinPin }
     * 
     */
    public CantidadPacientesConPlanSaludSinPin createCantidadPacientesConPlanSaludSinPin() {
        return new CantidadPacientesConPlanSaludSinPin();
    }

    /**
     * Create an instance of {@link CantidadPacientesConPlanSaludSinPinResponse }
     * 
     */
    public CantidadPacientesConPlanSaludSinPinResponse createCantidadPacientesConPlanSaludSinPinResponse() {
        return new CantidadPacientesConPlanSaludSinPinResponse();
    }

    /**
     * Create an instance of {@link CantidadPacientesSinPlanSaludSinPin }
     * 
     */
    public CantidadPacientesSinPlanSaludSinPin createCantidadPacientesSinPlanSaludSinPin() {
        return new CantidadPacientesSinPlanSaludSinPin();
    }

    /**
     * Create an instance of {@link CantidadPacientesSinPlanSaludSinPinResponse }
     * 
     */
    public CantidadPacientesSinPlanSaludSinPinResponse createCantidadPacientesSinPlanSaludSinPinResponse() {
        return new CantidadPacientesSinPlanSaludSinPinResponse();
    }

    /**
     * Create an instance of {@link ObtenerPacientesConPlanSaludSinPinConEmailValido }
     * 
     */
    public ObtenerPacientesConPlanSaludSinPinConEmailValido createObtenerPacientesConPlanSaludSinPinConEmailValido() {
        return new ObtenerPacientesConPlanSaludSinPinConEmailValido();
    }

    /**
     * Create an instance of {@link ObtenerPacientesConPlanSaludSinPinConEmailValidoResponse }
     * 
     */
    public ObtenerPacientesConPlanSaludSinPinConEmailValidoResponse createObtenerPacientesConPlanSaludSinPinConEmailValidoResponse() {
        return new ObtenerPacientesConPlanSaludSinPinConEmailValidoResponse();
    }

    /**
     * Create an instance of {@link ObtenerPacientesSinPlanSaludSinPinConEmailValido }
     * 
     */
    public ObtenerPacientesSinPlanSaludSinPinConEmailValido createObtenerPacientesSinPlanSaludSinPinConEmailValido() {
        return new ObtenerPacientesSinPlanSaludSinPinConEmailValido();
    }

    /**
     * Create an instance of {@link ObtenerPacientesSinPlanSaludSinPinConEmailValidoResponse }
     * 
     */
    public ObtenerPacientesSinPlanSaludSinPinConEmailValidoResponse createObtenerPacientesSinPlanSaludSinPinConEmailValidoResponse() {
        return new ObtenerPacientesSinPlanSaludSinPinConEmailValidoResponse();
    }

    /**
     * Create an instance of {@link ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidos }
     * 
     */
    public ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidos createObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidos() {
        return new ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidos();
    }

    /**
     * Create an instance of {@link ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponse }
     * 
     */
    public ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponse createObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponse() {
        return new ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponse();
    }

    /**
     * Create an instance of {@link ObtenerPacientesConPinMasivoNoGenerado }
     * 
     */
    public ObtenerPacientesConPinMasivoNoGenerado createObtenerPacientesConPinMasivoNoGenerado() {
        return new ObtenerPacientesConPinMasivoNoGenerado();
    }

    /**
     * Create an instance of {@link ObtenerPacientesConPinMasivoNoGeneradoResponse }
     * 
     */
    public ObtenerPacientesConPinMasivoNoGeneradoResponse createObtenerPacientesConPinMasivoNoGeneradoResponse() {
        return new ObtenerPacientesConPinMasivoNoGeneradoResponse();
    }

    /**
     * Create an instance of {@link ObtenerLinkParaGenerarPin }
     * 
     */
    public ObtenerLinkParaGenerarPin createObtenerLinkParaGenerarPin() {
        return new ObtenerLinkParaGenerarPin();
    }

    /**
     * Create an instance of {@link ObtenerLinkParaGenerarPinResponse }
     * 
     */
    public ObtenerLinkParaGenerarPinResponse createObtenerLinkParaGenerarPinResponse() {
        return new ObtenerLinkParaGenerarPinResponse();
    }

    /**
     * Create an instance of {@link GenerarPinAutomatico }
     * 
     */
    public GenerarPinAutomatico createGenerarPinAutomatico() {
        return new GenerarPinAutomatico();
    }

    /**
     * Create an instance of {@link GenerarPinAutomaticoResponse }
     * 
     */
    public GenerarPinAutomaticoResponse createGenerarPinAutomaticoResponse() {
        return new GenerarPinAutomaticoResponse();
    }

    /**
     * Create an instance of {@link ObtenerPacientexTelefono }
     * 
     */
    public ObtenerPacientexTelefono createObtenerPacientexTelefono() {
        return new ObtenerPacientexTelefono();
    }

    /**
     * Create an instance of {@link ObtenerPacientexTelefonoResponse }
     * 
     */
    public ObtenerPacientexTelefonoResponse createObtenerPacientexTelefonoResponse() {
        return new ObtenerPacientexTelefonoResponse();
    }

    /**
     * Create an instance of {@link EsValidoLinkGeneracionPin }
     * 
     */
    public EsValidoLinkGeneracionPin createEsValidoLinkGeneracionPin() {
        return new EsValidoLinkGeneracionPin();
    }

    /**
     * Create an instance of {@link EsValidoLinkGeneracionPinResponse }
     * 
     */
    public EsValidoLinkGeneracionPinResponse createEsValidoLinkGeneracionPinResponse() {
        return new EsValidoLinkGeneracionPinResponse();
    }

    /**
     * Create an instance of {@link EsValidoLinkGeneracionPinMasivo }
     * 
     */
    public EsValidoLinkGeneracionPinMasivo createEsValidoLinkGeneracionPinMasivo() {
        return new EsValidoLinkGeneracionPinMasivo();
    }

    /**
     * Create an instance of {@link EsValidoLinkGeneracionPinMasivoResponse }
     * 
     */
    public EsValidoLinkGeneracionPinMasivoResponse createEsValidoLinkGeneracionPinMasivoResponse() {
        return new EsValidoLinkGeneracionPinMasivoResponse();
    }

    /**
     * Create an instance of {@link TieneLinkValidoParaGenerarPin }
     * 
     */
    public TieneLinkValidoParaGenerarPin createTieneLinkValidoParaGenerarPin() {
        return new TieneLinkValidoParaGenerarPin();
    }

    /**
     * Create an instance of {@link TieneLinkValidoParaGenerarPinResponse }
     * 
     */
    public TieneLinkValidoParaGenerarPinResponse createTieneLinkValidoParaGenerarPinResponse() {
        return new TieneLinkValidoParaGenerarPinResponse();
    }

    /**
     * Create an instance of {@link GetBodyMailLinkGeneracionPin }
     * 
     */
    public GetBodyMailLinkGeneracionPin createGetBodyMailLinkGeneracionPin() {
        return new GetBodyMailLinkGeneracionPin();
    }

    /**
     * Create an instance of {@link GetBodyMailLinkGeneracionPinResponse }
     * 
     */
    public GetBodyMailLinkGeneracionPinResponse createGetBodyMailLinkGeneracionPinResponse() {
        return new GetBodyMailLinkGeneracionPinResponse();
    }

    /**
     * Create an instance of {@link EnviarMailGeneracionPin }
     * 
     */
    public EnviarMailGeneracionPin createEnviarMailGeneracionPin() {
        return new EnviarMailGeneracionPin();
    }

    /**
     * Create an instance of {@link EnviarMailGeneracionPinResponse }
     * 
     */
    public EnviarMailGeneracionPinResponse createEnviarMailGeneracionPinResponse() {
        return new EnviarMailGeneracionPinResponse();
    }

    /**
     * Create an instance of {@link ObtenerPreguntasSecretas }
     * 
     */
    public ObtenerPreguntasSecretas createObtenerPreguntasSecretas() {
        return new ObtenerPreguntasSecretas();
    }

    /**
     * Create an instance of {@link ObtenerPreguntasSecretasResponse }
     * 
     */
    public ObtenerPreguntasSecretasResponse createObtenerPreguntasSecretasResponse() {
        return new ObtenerPreguntasSecretasResponse();
    }

    /**
     * Create an instance of {@link ObtenerLabCodePaciente }
     * 
     */
    public ObtenerLabCodePaciente createObtenerLabCodePaciente() {
        return new ObtenerLabCodePaciente();
    }

    /**
     * Create an instance of {@link ObtenerLabCodePacienteResponse }
     * 
     */
    public ObtenerLabCodePacienteResponse createObtenerLabCodePacienteResponse() {
        return new ObtenerLabCodePacienteResponse();
    }

    /**
     * Create an instance of {@link ObtenerPaises }
     * 
     */
    public ObtenerPaises createObtenerPaises() {
        return new ObtenerPaises();
    }

    /**
     * Create an instance of {@link ObtenerPaisesResponse }
     * 
     */
    public ObtenerPaisesResponse createObtenerPaisesResponse() {
        return new ObtenerPaisesResponse();
    }

    /**
     * Create an instance of {@link CodigosTelefono }
     * 
     */
    public CodigosTelefono createCodigosTelefono() {
        return new CodigosTelefono();
    }

    /**
     * Create an instance of {@link CodigosTelefonoResponse }
     * 
     */
    public CodigosTelefonoResponse createCodigosTelefonoResponse() {
        return new CodigosTelefonoResponse();
    }

    /**
     * Create an instance of {@link ValidarCodigosTelefono }
     * 
     */
    public ValidarCodigosTelefono createValidarCodigosTelefono() {
        return new ValidarCodigosTelefono();
    }

    /**
     * Create an instance of {@link ValidarCodigosTelefonoResponse }
     * 
     */
    public ValidarCodigosTelefonoResponse createValidarCodigosTelefonoResponse() {
        return new ValidarCodigosTelefonoResponse();
    }

    /**
     * Create an instance of {@link DeconstruccionTelefono }
     * 
     */
    public DeconstruccionTelefono createDeconstruccionTelefono() {
        return new DeconstruccionTelefono();
    }

    /**
     * Create an instance of {@link DeconstruccionTelefonoResponse }
     * 
     */
    public DeconstruccionTelefonoResponse createDeconstruccionTelefonoResponse() {
        return new DeconstruccionTelefonoResponse();
    }

    /**
     * Create an instance of {@link ObtenerPartidos }
     * 
     */
    public ObtenerPartidos createObtenerPartidos() {
        return new ObtenerPartidos();
    }

    /**
     * Create an instance of {@link ObtenerPartidosResponse }
     * 
     */
    public ObtenerPartidosResponse createObtenerPartidosResponse() {
        return new ObtenerPartidosResponse();
    }

    /**
     * Create an instance of {@link ObtenerLocalidades }
     * 
     */
    public ObtenerLocalidades createObtenerLocalidades() {
        return new ObtenerLocalidades();
    }

    /**
     * Create an instance of {@link ObtenerLocalidadesResponse }
     * 
     */
    public ObtenerLocalidadesResponse createObtenerLocalidadesResponse() {
        return new ObtenerLocalidadesResponse();
    }

    /**
     * Create an instance of {@link ObtenerProvincias }
     * 
     */
    public ObtenerProvincias createObtenerProvincias() {
        return new ObtenerProvincias();
    }

    /**
     * Create an instance of {@link ObtenerProvinciasResponse }
     * 
     */
    public ObtenerProvinciasResponse createObtenerProvinciasResponse() {
        return new ObtenerProvinciasResponse();
    }

    /**
     * Create an instance of {@link ModificarPacienteService }
     * 
     */
    public ModificarPacienteService createModificarPacienteService() {
        return new ModificarPacienteService();
    }

    /**
     * Create an instance of {@link ModificarPacienteServiceResponse }
     * 
     */
    public ModificarPacienteServiceResponse createModificarPacienteServiceResponse() {
        return new ModificarPacienteServiceResponse();
    }

    /**
     * Create an instance of {@link EnviarMailActivacion }
     * 
     */
    public EnviarMailActivacion createEnviarMailActivacion() {
        return new EnviarMailActivacion();
    }

    /**
     * Create an instance of {@link EnviarMailActivacionResponse }
     * 
     */
    public EnviarMailActivacionResponse createEnviarMailActivacionResponse() {
        return new EnviarMailActivacionResponse();
    }

    /**
     * Create an instance of {@link ConfirmarActivacion }
     * 
     */
    public ConfirmarActivacion createConfirmarActivacion() {
        return new ConfirmarActivacion();
    }

    /**
     * Create an instance of {@link ConfirmarActivacionResponse }
     * 
     */
    public ConfirmarActivacionResponse createConfirmarActivacionResponse() {
        return new ConfirmarActivacionResponse();
    }

    /**
     * Create an instance of {@link InformarPaciente }
     * 
     */
    public InformarPaciente createInformarPaciente() {
        return new InformarPaciente();
    }

    /**
     * Create an instance of {@link InformarPacienteResponse }
     * 
     */
    public InformarPacienteResponse createInformarPacienteResponse() {
        return new InformarPacienteResponse();
    }

    /**
     * Create an instance of {@link DatosPersonalesPaciente }
     * 
     */
    public DatosPersonalesPaciente createDatosPersonalesPaciente() {
        return new DatosPersonalesPaciente();
    }

    /**
     * Create an instance of {@link DatosPersonalesPacienteResponse }
     * 
     */
    public DatosPersonalesPacienteResponse createDatosPersonalesPacienteResponse() {
        return new DatosPersonalesPacienteResponse();
    }

    /**
     * Create an instance of {@link EnviarMailDesbloqueoPreguntaSecreta }
     * 
     */
    public EnviarMailDesbloqueoPreguntaSecreta createEnviarMailDesbloqueoPreguntaSecreta() {
        return new EnviarMailDesbloqueoPreguntaSecreta();
    }

    /**
     * Create an instance of {@link EnviarMailDesbloqueoPreguntaSecretaResponse }
     * 
     */
    public EnviarMailDesbloqueoPreguntaSecretaResponse createEnviarMailDesbloqueoPreguntaSecretaResponse() {
        return new EnviarMailDesbloqueoPreguntaSecretaResponse();
    }

    /**
     * Create an instance of {@link ValidacionOlvidoDeConstraseña }
     * 
     */
    public ValidacionOlvidoDeConstraseña createValidacionOlvidoDeConstraseña() {
        return new ValidacionOlvidoDeConstraseña();
    }

    /**
     * Create an instance of {@link ValidacionOlvidoDeConstraseñaResponse }
     * 
     */
    public ValidacionOlvidoDeConstraseñaResponse createValidacionOlvidoDeConstraseñaResponse() {
        return new ValidacionOlvidoDeConstraseñaResponse();
    }

    /**
     * Create an instance of {@link CambioDeClave }
     * 
     */
    public CambioDeClave createCambioDeClave() {
        return new CambioDeClave();
    }

    /**
     * Create an instance of {@link CambioDeClaveResponse }
     * 
     */
    public CambioDeClaveResponse createCambioDeClaveResponse() {
        return new CambioDeClaveResponse();
    }

    /**
     * Create an instance of {@link ConfirmarLimpiezaSeguridad }
     * 
     */
    public ConfirmarLimpiezaSeguridad createConfirmarLimpiezaSeguridad() {
        return new ConfirmarLimpiezaSeguridad();
    }

    /**
     * Create an instance of {@link ConfirmarLimpiezaSeguridadResponse }
     * 
     */
    public ConfirmarLimpiezaSeguridadResponse createConfirmarLimpiezaSeguridadResponse() {
        return new ConfirmarLimpiezaSeguridadResponse();
    }

    /**
     * Create an instance of {@link ObtenerHuellaDigital }
     * 
     */
    public ObtenerHuellaDigital createObtenerHuellaDigital() {
        return new ObtenerHuellaDigital();
    }

    /**
     * Create an instance of {@link ObtenerHuellaDigitalResponse }
     * 
     */
    public ObtenerHuellaDigitalResponse createObtenerHuellaDigitalResponse() {
        return new ObtenerHuellaDigitalResponse();
    }

    /**
     * Create an instance of {@link ObtenerHuellasDigitales }
     * 
     */
    public ObtenerHuellasDigitales createObtenerHuellasDigitales() {
        return new ObtenerHuellasDigitales();
    }

    /**
     * Create an instance of {@link ObtenerHuellasDigitalesResponse }
     * 
     */
    public ObtenerHuellasDigitalesResponse createObtenerHuellasDigitalesResponse() {
        return new ObtenerHuellasDigitalesResponse();
    }

    /**
     * Create an instance of {@link GuardarHuellaDigital }
     * 
     */
    public GuardarHuellaDigital createGuardarHuellaDigital() {
        return new GuardarHuellaDigital();
    }

    /**
     * Create an instance of {@link GuardarHuellaDigitalResponse }
     * 
     */
    public GuardarHuellaDigitalResponse createGuardarHuellaDigitalResponse() {
        return new GuardarHuellaDigitalResponse();
    }

    /**
     * Create an instance of {@link EliminarHuellaDigital }
     * 
     */
    public EliminarHuellaDigital createEliminarHuellaDigital() {
        return new EliminarHuellaDigital();
    }

    /**
     * Create an instance of {@link EliminarHuellaDigitalResponse }
     * 
     */
    public EliminarHuellaDigitalResponse createEliminarHuellaDigitalResponse() {
        return new EliminarHuellaDigitalResponse();
    }

    /**
     * Create an instance of {@link ProcesarCoberturaPaciente }
     * 
     */
    public ProcesarCoberturaPaciente createProcesarCoberturaPaciente() {
        return new ProcesarCoberturaPaciente();
    }

    /**
     * Create an instance of {@link ProcesarCoberturaPacienteResponse }
     * 
     */
    public ProcesarCoberturaPacienteResponse createProcesarCoberturaPacienteResponse() {
        return new ProcesarCoberturaPacienteResponse();
    }

    /**
     * Create an instance of {@link DesactivarPaciente }
     * 
     */
    public DesactivarPaciente createDesactivarPaciente() {
        return new DesactivarPaciente();
    }

    /**
     * Create an instance of {@link DesactivarPacienteResponse }
     * 
     */
    public DesactivarPacienteResponse createDesactivarPacienteResponse() {
        return new DesactivarPacienteResponse();
    }

    /**
     * Create an instance of {@link LoadImagenPaciente }
     * 
     */
    public LoadImagenPaciente createLoadImagenPaciente() {
        return new LoadImagenPaciente();
    }

    /**
     * Create an instance of {@link LoadImagenPacienteResponse }
     * 
     */
    public LoadImagenPacienteResponse createLoadImagenPacienteResponse() {
        return new LoadImagenPacienteResponse();
    }

    /**
     * Create an instance of {@link EnviarMailsActivacion }
     * 
     */
    public EnviarMailsActivacion createEnviarMailsActivacion() {
        return new EnviarMailsActivacion();
    }

    /**
     * Create an instance of {@link EnviarMailsActivacionResponse }
     * 
     */
    public EnviarMailsActivacionResponse createEnviarMailsActivacionResponse() {
        return new EnviarMailsActivacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerVinculosFamiliares }
     * 
     */
    public ObtenerVinculosFamiliares createObtenerVinculosFamiliares() {
        return new ObtenerVinculosFamiliares();
    }

    /**
     * Create an instance of {@link ObtenerVinculosFamiliaresResponse }
     * 
     */
    public ObtenerVinculosFamiliaresResponse createObtenerVinculosFamiliaresResponse() {
        return new ObtenerVinculosFamiliaresResponse();
    }

    /**
     * Create an instance of {@link ObtenerVinculosGestionados }
     * 
     */
    public ObtenerVinculosGestionados createObtenerVinculosGestionados() {
        return new ObtenerVinculosGestionados();
    }

    /**
     * Create an instance of {@link ObtenerVinculosGestionadosResponse }
     * 
     */
    public ObtenerVinculosGestionadosResponse createObtenerVinculosGestionadosResponse() {
        return new ObtenerVinculosGestionadosResponse();
    }

    /**
     * Create an instance of {@link ObtenerDactilarRegistrado }
     * 
     */
    public ObtenerDactilarRegistrado createObtenerDactilarRegistrado() {
        return new ObtenerDactilarRegistrado();
    }

    /**
     * Create an instance of {@link ObtenerDactilarRegistradoResponse }
     * 
     */
    public ObtenerDactilarRegistradoResponse createObtenerDactilarRegistradoResponse() {
        return new ObtenerDactilarRegistradoResponse();
    }

    /**
     * Create an instance of {@link ObtenerPaciente }
     * 
     */
    public ObtenerPaciente createObtenerPaciente() {
        return new ObtenerPaciente();
    }

    /**
     * Create an instance of {@link ObtenerPacienteResponse }
     * 
     */
    public ObtenerPacienteResponse createObtenerPacienteResponse() {
        return new ObtenerPacienteResponse();
    }

    /**
     * Create an instance of {@link BloquearPaciente }
     * 
     */
    public BloquearPaciente createBloquearPaciente() {
        return new BloquearPaciente();
    }

    /**
     * Create an instance of {@link BloquearPacienteResponse }
     * 
     */
    public BloquearPacienteResponse createBloquearPacienteResponse() {
        return new BloquearPacienteResponse();
    }

    /**
     * Create an instance of {@link ObtenerPacienteReporte }
     * 
     */
    public ObtenerPacienteReporte createObtenerPacienteReporte() {
        return new ObtenerPacienteReporte();
    }

    /**
     * Create an instance of {@link ObtenerPacienteReporteResponse }
     * 
     */
    public ObtenerPacienteReporteResponse createObtenerPacienteReporteResponse() {
        return new ObtenerPacienteReporteResponse();
    }

    /**
     * Create an instance of {@link ValidarPacientePlanSalud }
     * 
     */
    public ValidarPacientePlanSalud createValidarPacientePlanSalud() {
        return new ValidarPacientePlanSalud();
    }

    /**
     * Create an instance of {@link ValidarPacientePlanSaludResponse }
     * 
     */
    public ValidarPacientePlanSaludResponse createValidarPacientePlanSaludResponse() {
        return new ValidarPacientePlanSaludResponse();
    }

    /**
     * Create an instance of {@link EnviarMailConfirmaCorreoLabCore }
     * 
     */
    public EnviarMailConfirmaCorreoLabCore createEnviarMailConfirmaCorreoLabCore() {
        return new EnviarMailConfirmaCorreoLabCore();
    }

    /**
     * Create an instance of {@link EnviarMailConfirmaCorreoLabCoreResponse }
     * 
     */
    public EnviarMailConfirmaCorreoLabCoreResponse createEnviarMailConfirmaCorreoLabCoreResponse() {
        return new EnviarMailConfirmaCorreoLabCoreResponse();
    }

    /**
     * Create an instance of {@link EnviarMailConfirmaCorreo }
     * 
     */
    public EnviarMailConfirmaCorreo createEnviarMailConfirmaCorreo() {
        return new EnviarMailConfirmaCorreo();
    }

    /**
     * Create an instance of {@link EnviarMailConfirmaCorreoResponse }
     * 
     */
    public EnviarMailConfirmaCorreoResponse createEnviarMailConfirmaCorreoResponse() {
        return new EnviarMailConfirmaCorreoResponse();
    }

    /**
     * Create an instance of {@link EnviarMailNotificarCambioCorreo }
     * 
     */
    public EnviarMailNotificarCambioCorreo createEnviarMailNotificarCambioCorreo() {
        return new EnviarMailNotificarCambioCorreo();
    }

    /**
     * Create an instance of {@link EnviarMailNotificarCambioCorreoResponse }
     * 
     */
    public EnviarMailNotificarCambioCorreoResponse createEnviarMailNotificarCambioCorreoResponse() {
        return new EnviarMailNotificarCambioCorreoResponse();
    }

    /**
     * Create an instance of {@link EnviarMailLaboratorio }
     * 
     */
    public EnviarMailLaboratorio createEnviarMailLaboratorio() {
        return new EnviarMailLaboratorio();
    }

    /**
     * Create an instance of {@link EnviarMailLaboratorioResponse }
     * 
     */
    public EnviarMailLaboratorioResponse createEnviarMailLaboratorioResponse() {
        return new EnviarMailLaboratorioResponse();
    }

    /**
     * Create an instance of {@link TieneCorreoElectronicoConfirmado }
     * 
     */
    public TieneCorreoElectronicoConfirmado createTieneCorreoElectronicoConfirmado() {
        return new TieneCorreoElectronicoConfirmado();
    }

    /**
     * Create an instance of {@link TieneCorreoElectronicoConfirmadoResponse }
     * 
     */
    public TieneCorreoElectronicoConfirmadoResponse createTieneCorreoElectronicoConfirmadoResponse() {
        return new TieneCorreoElectronicoConfirmadoResponse();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeVinculo }
     * 
     */
    public ObtenerTiposDeVinculo createObtenerTiposDeVinculo() {
        return new ObtenerTiposDeVinculo();
    }

    /**
     * Create an instance of {@link ObtenerTiposDeVinculoResponse }
     * 
     */
    public ObtenerTiposDeVinculoResponse createObtenerTiposDeVinculoResponse() {
        return new ObtenerTiposDeVinculoResponse();
    }

    /**
     * Create an instance of {@link GetValidacionParaVincularModel }
     * 
     */
    public GetValidacionParaVincularModel createGetValidacionParaVincularModel() {
        return new GetValidacionParaVincularModel();
    }

    /**
     * Create an instance of {@link GetValidacionParaVincularModelResponse }
     * 
     */
    public GetValidacionParaVincularModelResponse createGetValidacionParaVincularModelResponse() {
        return new GetValidacionParaVincularModelResponse();
    }

    /**
     * Create an instance of {@link CrearVinculo }
     * 
     */
    public CrearVinculo createCrearVinculo() {
        return new CrearVinculo();
    }

    /**
     * Create an instance of {@link CrearVinculoResponse }
     * 
     */
    public CrearVinculoResponse createCrearVinculoResponse() {
        return new CrearVinculoResponse();
    }

    /**
     * Create an instance of {@link EliminarVinculo }
     * 
     */
    public EliminarVinculo createEliminarVinculo() {
        return new EliminarVinculo();
    }

    /**
     * Create an instance of {@link EliminarVinculoResponse }
     * 
     */
    public EliminarVinculoResponse createEliminarVinculoResponse() {
        return new EliminarVinculoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPacientesConPlanSaludSinPinConEmailValidoResult", scope = ObtenerPacientesConPlanSaludSinPinConEmailValidoResponse.class)
    public JAXBElement<PacientesReducidosWrapper> createObtenerPacientesConPlanSaludSinPinConEmailValidoResponseObtenerPacientesConPlanSaludSinPinConEmailValidoResult(PacientesReducidosWrapper value) {
        return new JAXBElement<PacientesReducidosWrapper>(_ObtenerPacientesConPlanSaludSinPinConEmailValidoResponseObtenerPacientesConPlanSaludSinPinConEmailValidoResult_QNAME, PacientesReducidosWrapper.class, ObtenerPacientesConPlanSaludSinPinConEmailValidoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPacientesSinPlanSaludSinPinConEmailValidoResult", scope = ObtenerPacientesSinPlanSaludSinPinConEmailValidoResponse.class)
    public JAXBElement<PacientesReducidosWrapper> createObtenerPacientesSinPlanSaludSinPinConEmailValidoResponseObtenerPacientesSinPlanSaludSinPinConEmailValidoResult(PacientesReducidosWrapper value) {
        return new JAXBElement<PacientesReducidosWrapper>(_ObtenerPacientesSinPlanSaludSinPinConEmailValidoResponseObtenerPacientesSinPlanSaludSinPinConEmailValidoResult_QNAME, PacientesReducidosWrapper.class, ObtenerPacientesSinPlanSaludSinPinConEmailValidoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult", scope = ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponse.class)
    public JAXBElement<PacientesReducidosWrapper> createObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponseObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult(PacientesReducidosWrapper value) {
        return new JAXBElement<PacientesReducidosWrapper>(_ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponseObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResult_QNAME, PacientesReducidosWrapper.class, ObtenerPacientesSinPlanSaludSinPinConEmailValidoAtendidosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPacientesConPinMasivoNoGeneradoResult", scope = ObtenerPacientesConPinMasivoNoGeneradoResponse.class)
    public JAXBElement<PacientesReducidosWrapper> createObtenerPacientesConPinMasivoNoGeneradoResponseObtenerPacientesConPinMasivoNoGeneradoResult(PacientesReducidosWrapper value) {
        return new JAXBElement<PacientesReducidosWrapper>(_ObtenerPacientesConPinMasivoNoGeneradoResponseObtenerPacientesConPinMasivoNoGeneradoResult_QNAME, PacientesReducidosWrapper.class, ObtenerPacientesConPinMasivoNoGeneradoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteReducidoWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteReducidoWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerLinkParaGenerarPinResult", scope = ObtenerLinkParaGenerarPinResponse.class)
    public JAXBElement<PacienteReducidoWrapper> createObtenerLinkParaGenerarPinResponseObtenerLinkParaGenerarPinResult(PacienteReducidoWrapper value) {
        return new JAXBElement<PacienteReducidoWrapper>(_ObtenerLinkParaGenerarPinResponseObtenerLinkParaGenerarPinResult_QNAME, PacienteReducidoWrapper.class, ObtenerLinkParaGenerarPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PinModelWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PinModelWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GenerarPinAutomaticoResult", scope = GenerarPinAutomaticoResponse.class)
    public JAXBElement<PinModelWrapper> createGenerarPinAutomaticoResponseGenerarPinAutomaticoResult(PinModelWrapper value) {
        return new JAXBElement<PinModelWrapper>(_GenerarPinAutomaticoResponseGenerarPinAutomaticoResult_QNAME, PinModelWrapper.class, GenerarPinAutomaticoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sTeleono", scope = ObtenerPacientexTelefono.class)
    public JAXBElement<String> createObtenerPacientexTelefonoSTeleono(String value) {
        return new JAXBElement<String>(_ObtenerPacientexTelefonoSTeleono_QNAME, String.class, ObtenerPacientexTelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPacientexTelefonoResult", scope = ObtenerPacientexTelefonoResponse.class)
    public JAXBElement<PacientesReducidosWrapper> createObtenerPacientexTelefonoResponseObtenerPacientexTelefonoResult(PacientesReducidosWrapper value) {
        return new JAXBElement<PacientesReducidosWrapper>(_ObtenerPacientexTelefonoResponseObtenerPacientexTelefonoResult_QNAME, PacientesReducidosWrapper.class, ObtenerPacientexTelefonoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidoLinkPinMasivoWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidoLinkPinMasivoWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EsValidoLinkGeneracionPinMasivoResult", scope = EsValidoLinkGeneracionPinMasivoResponse.class)
    public JAXBElement<ValidoLinkPinMasivoWrapper> createEsValidoLinkGeneracionPinMasivoResponseEsValidoLinkGeneracionPinMasivoResult(ValidoLinkPinMasivoWrapper value) {
        return new JAXBElement<ValidoLinkPinMasivoWrapper>(_EsValidoLinkGeneracionPinMasivoResponseEsValidoLinkGeneracionPinMasivoResult_QNAME, ValidoLinkPinMasivoWrapper.class, EsValidoLinkGeneracionPinMasivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteReducidoWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteReducidoWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pacienteReducidoWrapper", scope = GetBodyMailLinkGeneracionPin.class)
    public JAXBElement<PacienteReducidoWrapper> createGetBodyMailLinkGeneracionPinPacienteReducidoWrapper(PacienteReducidoWrapper value) {
        return new JAXBElement<PacienteReducidoWrapper>(_GetBodyMailLinkGeneracionPinPacienteReducidoWrapper_QNAME, PacienteReducidoWrapper.class, GetBodyMailLinkGeneracionPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBodyMailLinkGeneracionPinResult", scope = GetBodyMailLinkGeneracionPinResponse.class)
    public JAXBElement<String> createGetBodyMailLinkGeneracionPinResponseGetBodyMailLinkGeneracionPinResult(String value) {
        return new JAXBElement<String>(_GetBodyMailLinkGeneracionPinResponseGetBodyMailLinkGeneracionPinResult_QNAME, String.class, GetBodyMailLinkGeneracionPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnviarMailGeneracionPinResult", scope = EnviarMailGeneracionPinResponse.class)
    public JAXBElement<ResultadoOperacion> createEnviarMailGeneracionPinResponseEnviarMailGeneracionPinResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_EnviarMailGeneracionPinResponseEnviarMailGeneracionPinResult_QNAME, ResultadoOperacion.class, EnviarMailGeneracionPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPreguntasSecretasResult", scope = ObtenerPreguntasSecretasResponse.class)
    public JAXBElement<ArrayOfListItemModel> createObtenerPreguntasSecretasResponseObtenerPreguntasSecretasResult(ArrayOfListItemModel value) {
        return new JAXBElement<ArrayOfListItemModel>(_ObtenerPreguntasSecretasResponseObtenerPreguntasSecretasResult_QNAME, ArrayOfListItemModel.class, ObtenerPreguntasSecretasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPaisesResult", scope = ObtenerPaisesResponse.class)
    public JAXBElement<ArrayOfListItemModel> createObtenerPaisesResponseObtenerPaisesResult(ArrayOfListItemModel value) {
        return new JAXBElement<ArrayOfListItemModel>(_ObtenerPaisesResponseObtenerPaisesResult_QNAME, ArrayOfListItemModel.class, ObtenerPaisesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CodigosTelefonoResult", scope = CodigosTelefonoResponse.class)
    public JAXBElement<ArrayOfListItemModel> createCodigosTelefonoResponseCodigosTelefonoResult(ArrayOfListItemModel value) {
        return new JAXBElement<ArrayOfListItemModel>(_CodigosTelefonoResponseCodigosTelefonoResult_QNAME, ArrayOfListItemModel.class, CodigosTelefonoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "telefono", scope = DeconstruccionTelefono.class)
    public JAXBElement<String> createDeconstruccionTelefonoTelefono(String value) {
        return new JAXBElement<String>(_DeconstruccionTelefonoTelefono_QNAME, String.class, DeconstruccionTelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefonoModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TelefonoModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeconstruccionTelefonoResult", scope = DeconstruccionTelefonoResponse.class)
    public JAXBElement<TelefonoModel> createDeconstruccionTelefonoResponseDeconstruccionTelefonoResult(TelefonoModel value) {
        return new JAXBElement<TelefonoModel>(_DeconstruccionTelefonoResponseDeconstruccionTelefonoResult_QNAME, TelefonoModel.class, DeconstruccionTelefonoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPartidosResult", scope = ObtenerPartidosResponse.class)
    public JAXBElement<ArrayOfListItemModel> createObtenerPartidosResponseObtenerPartidosResult(ArrayOfListItemModel value) {
        return new JAXBElement<ArrayOfListItemModel>(_ObtenerPartidosResponseObtenerPartidosResult_QNAME, ArrayOfListItemModel.class, ObtenerPartidosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerLocalidadesResult", scope = ObtenerLocalidadesResponse.class)
    public JAXBElement<ArrayOfListItemModel> createObtenerLocalidadesResponseObtenerLocalidadesResult(ArrayOfListItemModel value) {
        return new JAXBElement<ArrayOfListItemModel>(_ObtenerLocalidadesResponseObtenerLocalidadesResult_QNAME, ArrayOfListItemModel.class, ObtenerLocalidadesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerProvinciasResult", scope = ObtenerProvinciasResponse.class)
    public JAXBElement<ArrayOfListItemModel> createObtenerProvinciasResponseObtenerProvinciasResult(ArrayOfListItemModel value) {
        return new JAXBElement<ArrayOfListItemModel>(_ObtenerProvinciasResponseObtenerProvinciasResult_QNAME, ArrayOfListItemModel.class, ObtenerProvinciasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosPersonalesModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosPersonalesModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "model", scope = ModificarPacienteService.class)
    public JAXBElement<DatosPersonalesModel> createModificarPacienteServiceModel(DatosPersonalesModel value) {
        return new JAXBElement<DatosPersonalesModel>(_ModificarPacienteServiceModel_QNAME, DatosPersonalesModel.class, ModificarPacienteService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnviarMailActivacionResult", scope = EnviarMailActivacionResponse.class)
    public JAXBElement<ResultadoOperacion> createEnviarMailActivacionResponseEnviarMailActivacionResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_EnviarMailActivacionResponseEnviarMailActivacionResult_QNAME, ResultadoOperacion.class, EnviarMailActivacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = ConfirmarActivacion.class)
    public JAXBElement<String> createConfirmarActivacionNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, ConfirmarActivacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "respuesta", scope = ConfirmarActivacion.class)
    public JAXBElement<String> createConfirmarActivacionRespuesta(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionRespuesta_QNAME, String.class, ConfirmarActivacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clave", scope = ConfirmarActivacion.class)
    public JAXBElement<String> createConfirmarActivacionClave(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionClave_QNAME, String.class, ConfirmarActivacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmarActivacionResult", scope = ConfirmarActivacionResponse.class)
    public JAXBElement<ResultadoOperacion> createConfirmarActivacionResponseConfirmarActivacionResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_ConfirmarActivacionResponseConfirmarActivacionResult_QNAME, ResultadoOperacion.class, ConfirmarActivacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paciente", scope = InformarPaciente.class)
    public JAXBElement<PacienteModel> createInformarPacientePaciente(PacienteModel value) {
        return new JAXBElement<PacienteModel>(_InformarPacientePaciente_QNAME, PacienteModel.class, InformarPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InformarPacienteResult", scope = InformarPacienteResponse.class)
    public JAXBElement<ResultadoOperacion> createInformarPacienteResponseInformarPacienteResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_InformarPacienteResponseInformarPacienteResult_QNAME, ResultadoOperacion.class, InformarPacienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipoDocumentoId", scope = DatosPersonalesPaciente.class)
    public JAXBElement<String> createDatosPersonalesPacienteTipoDocumentoId(String value) {
        return new JAXBElement<String>(_DatosPersonalesPacienteTipoDocumentoId_QNAME, String.class, DatosPersonalesPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosPersonalesModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosPersonalesModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DatosPersonalesPacienteResult", scope = DatosPersonalesPacienteResponse.class)
    public JAXBElement<DatosPersonalesModel> createDatosPersonalesPacienteResponseDatosPersonalesPacienteResult(DatosPersonalesModel value) {
        return new JAXBElement<DatosPersonalesModel>(_DatosPersonalesPacienteResponseDatosPersonalesPacienteResult_QNAME, DatosPersonalesModel.class, DatosPersonalesPacienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = EnviarMailDesbloqueoPreguntaSecreta.class)
    public JAXBElement<String> createEnviarMailDesbloqueoPreguntaSecretaNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, EnviarMailDesbloqueoPreguntaSecreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnviarMailDesbloqueoPreguntaSecretaResult", scope = EnviarMailDesbloqueoPreguntaSecretaResponse.class)
    public JAXBElement<ResultadoOperacion> createEnviarMailDesbloqueoPreguntaSecretaResponseEnviarMailDesbloqueoPreguntaSecretaResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_EnviarMailDesbloqueoPreguntaSecretaResponseEnviarMailDesbloqueoPreguntaSecretaResult_QNAME, ResultadoOperacion.class, EnviarMailDesbloqueoPreguntaSecretaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = ValidacionOlvidoDeConstraseña.class)
    public JAXBElement<String> createValidacionOlvidoDeConstraseñaNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, ValidacionOlvidoDeConstraseña.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "respuesta", scope = ValidacionOlvidoDeConstraseña.class)
    public JAXBElement<String> createValidacionOlvidoDeConstraseñaRespuesta(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionRespuesta_QNAME, String.class, ValidacionOlvidoDeConstraseña.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ValidacionOlvidoDeConstrase\u00f1aResult", scope = ValidacionOlvidoDeConstraseñaResponse.class)
    public JAXBElement<ResultadoOperacion> createValidacionOlvidoDeConstraseñaResponseValidacionOlvidoDeConstraseñaResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_ValidacionOlvidoDeConstraseñaResponseValidacionOlvidoDeConstraseñaResult_QNAME, ResultadoOperacion.class, ValidacionOlvidoDeConstraseñaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = CambioDeClave.class)
    public JAXBElement<String> createCambioDeClaveNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, CambioDeClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "claveNueva", scope = CambioDeClave.class)
    public JAXBElement<String> createCambioDeClaveClaveNueva(String value) {
        return new JAXBElement<String>(_CambioDeClaveClaveNueva_QNAME, String.class, CambioDeClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "confirmacionClaveNueva", scope = CambioDeClave.class)
    public JAXBElement<String> createCambioDeClaveConfirmacionClaveNueva(String value) {
        return new JAXBElement<String>(_CambioDeClaveConfirmacionClaveNueva_QNAME, String.class, CambioDeClave.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CambioDeClaveResult", scope = CambioDeClaveResponse.class)
    public JAXBElement<ResultadoOperacion> createCambioDeClaveResponseCambioDeClaveResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_CambioDeClaveResponseCambioDeClaveResult_QNAME, ResultadoOperacion.class, CambioDeClaveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = ConfirmarLimpiezaSeguridad.class)
    public JAXBElement<String> createConfirmarLimpiezaSeguridadNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, ConfirmarLimpiezaSeguridad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "respuesta", scope = ConfirmarLimpiezaSeguridad.class)
    public JAXBElement<String> createConfirmarLimpiezaSeguridadRespuesta(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionRespuesta_QNAME, String.class, ConfirmarLimpiezaSeguridad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "clave", scope = ConfirmarLimpiezaSeguridad.class)
    public JAXBElement<String> createConfirmarLimpiezaSeguridadClave(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionClave_QNAME, String.class, ConfirmarLimpiezaSeguridad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmarLimpiezaSeguridadResult", scope = ConfirmarLimpiezaSeguridadResponse.class)
    public JAXBElement<ResultadoOperacion> createConfirmarLimpiezaSeguridadResponseConfirmarLimpiezaSeguridadResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_ConfirmarLimpiezaSeguridadResponseConfirmarLimpiezaSeguridadResult_QNAME, ResultadoOperacion.class, ConfirmarLimpiezaSeguridadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerHuellaDigitalResult", scope = ObtenerHuellaDigitalResponse.class)
    public JAXBElement<HuellaModel> createObtenerHuellaDigitalResponseObtenerHuellaDigitalResult(HuellaModel value) {
        return new JAXBElement<HuellaModel>(_ObtenerHuellaDigitalResponseObtenerHuellaDigitalResult_QNAME, HuellaModel.class, ObtenerHuellaDigitalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "date", scope = ObtenerHuellasDigitales.class)
    public JAXBElement<XMLGregorianCalendar> createObtenerHuellasDigitalesDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ObtenerHuellasDigitalesDate_QNAME, XMLGregorianCalendar.class, ObtenerHuellasDigitales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHuellaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfHuellaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerHuellasDigitalesResult", scope = ObtenerHuellasDigitalesResponse.class)
    public JAXBElement<ArrayOfHuellaModel> createObtenerHuellasDigitalesResponseObtenerHuellasDigitalesResult(ArrayOfHuellaModel value) {
        return new JAXBElement<ArrayOfHuellaModel>(_ObtenerHuellasDigitalesResponseObtenerHuellasDigitalesResult_QNAME, ArrayOfHuellaModel.class, ObtenerHuellasDigitalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "huella", scope = GuardarHuellaDigital.class)
    public JAXBElement<HuellaModel> createGuardarHuellaDigitalHuella(HuellaModel value) {
        return new JAXBElement<HuellaModel>(_GuardarHuellaDigitalHuella_QNAME, HuellaModel.class, GuardarHuellaDigital.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GuardarHuellaDigitalResult", scope = GuardarHuellaDigitalResponse.class)
    public JAXBElement<ResultadoOperacion> createGuardarHuellaDigitalResponseGuardarHuellaDigitalResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_GuardarHuellaDigitalResponseGuardarHuellaDigitalResult_QNAME, ResultadoOperacion.class, GuardarHuellaDigitalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HuellaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "huella", scope = EliminarHuellaDigital.class)
    public JAXBElement<HuellaModel> createEliminarHuellaDigitalHuella(HuellaModel value) {
        return new JAXBElement<HuellaModel>(_GuardarHuellaDigitalHuella_QNAME, HuellaModel.class, EliminarHuellaDigital.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EliminarHuellaDigitalResult", scope = EliminarHuellaDigitalResponse.class)
    public JAXBElement<ResultadoOperacion> createEliminarHuellaDigitalResponseEliminarHuellaDigitalResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_EliminarHuellaDigitalResponseEliminarHuellaDigitalResult_QNAME, ResultadoOperacion.class, EliminarHuellaDigitalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoberturaModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CoberturaModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cobertura", scope = ProcesarCoberturaPaciente.class)
    public JAXBElement<CoberturaModel> createProcesarCoberturaPacienteCobertura(CoberturaModel value) {
        return new JAXBElement<CoberturaModel>(_ProcesarCoberturaPacienteCobertura_QNAME, CoberturaModel.class, ProcesarCoberturaPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipoNovedad", scope = ProcesarCoberturaPaciente.class)
    public JAXBElement<String> createProcesarCoberturaPacienteTipoNovedad(String value) {
        return new JAXBElement<String>(_ProcesarCoberturaPacienteTipoNovedad_QNAME, String.class, ProcesarCoberturaPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcesarCoberturaPacienteResult", scope = ProcesarCoberturaPacienteResponse.class)
    public JAXBElement<ResultadoOperacion> createProcesarCoberturaPacienteResponseProcesarCoberturaPacienteResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_ProcesarCoberturaPacienteResponseProcesarCoberturaPacienteResult_QNAME, ResultadoOperacion.class, ProcesarCoberturaPacienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DesactivarPacienteResult", scope = DesactivarPacienteResponse.class)
    public JAXBElement<ResultadoOperacion> createDesactivarPacienteResponseDesactivarPacienteResult(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_DesactivarPacienteResponseDesactivarPacienteResult_QNAME, ResultadoOperacion.class, DesactivarPacienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pacienteId", scope = LoadImagenPaciente.class)
    public JAXBElement<String> createLoadImagenPacientePacienteId(String value) {
        return new JAXBElement<String>(_LoadImagenPacientePacienteId_QNAME, String.class, LoadImagenPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "extension", scope = LoadImagenPaciente.class)
    public JAXBElement<String> createLoadImagenPacienteExtension(String value) {
        return new JAXBElement<String>(_LoadImagenPacienteExtension_QNAME, String.class, LoadImagenPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoadImagenPacienteResult", scope = LoadImagenPacienteResponse.class)
    public JAXBElement<byte[]> createLoadImagenPacienteResponseLoadImagenPacienteResult(byte[] value) {
        return new JAXBElement<byte[]>(_LoadImagenPacienteResponseLoadImagenPacienteResult_QNAME, byte[].class, LoadImagenPacienteResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "labCodePacientes", scope = EnviarMailsActivacion.class)
    public JAXBElement<String> createEnviarMailsActivacionLabCodePacientes(String value) {
        return new JAXBElement<String>(_EnviarMailsActivacionLabCodePacientes_QNAME, String.class, EnviarMailsActivacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnviarMailsActivacionResult", scope = EnviarMailsActivacionResponse.class)
    public JAXBElement<ArrayOfResultadoOperacion> createEnviarMailsActivacionResponseEnviarMailsActivacionResult(ArrayOfResultadoOperacion value) {
        return new JAXBElement<ArrayOfResultadoOperacion>(_EnviarMailsActivacionResponseEnviarMailsActivacionResult_QNAME, ArrayOfResultadoOperacion.class, EnviarMailsActivacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerVinculosFamiliaresResult", scope = ObtenerVinculosFamiliaresResponse.class)
    public JAXBElement<ArrayOfVinculoFamiliarModel> createObtenerVinculosFamiliaresResponseObtenerVinculosFamiliaresResult(ArrayOfVinculoFamiliarModel value) {
        return new JAXBElement<ArrayOfVinculoFamiliarModel>(_ObtenerVinculosFamiliaresResponseObtenerVinculosFamiliaresResult_QNAME, ArrayOfVinculoFamiliarModel.class, ObtenerVinculosFamiliaresResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVinculoFamiliarModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerVinculosGestionadosResult", scope = ObtenerVinculosGestionadosResponse.class)
    public JAXBElement<ArrayOfVinculoFamiliarModel> createObtenerVinculosGestionadosResponseObtenerVinculosGestionadosResult(ArrayOfVinculoFamiliarModel value) {
        return new JAXBElement<ArrayOfVinculoFamiliarModel>(_ObtenerVinculosGestionadosResponseObtenerVinculosGestionadosResult_QNAME, ArrayOfVinculoFamiliarModel.class, ObtenerVinculosGestionadosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = ObtenerDactilarRegistrado.class)
    public JAXBElement<String> createObtenerDactilarRegistradoNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, ObtenerDactilarRegistrado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DactilarRegistradoModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DactilarRegistradoModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerDactilarRegistradoResult", scope = ObtenerDactilarRegistradoResponse.class)
    public JAXBElement<DactilarRegistradoModel> createObtenerDactilarRegistradoResponseObtenerDactilarRegistradoResult(DactilarRegistradoModel value) {
        return new JAXBElement<DactilarRegistradoModel>(_ObtenerDactilarRegistradoResponseObtenerDactilarRegistradoResult_QNAME, DactilarRegistradoModel.class, ObtenerDactilarRegistradoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pacienteId", scope = ObtenerPaciente.class)
    public JAXBElement<String> createObtenerPacientePacienteId(String value) {
        return new JAXBElement<String>(_LoadImagenPacientePacienteId_QNAME, String.class, ObtenerPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codigoPaciente", scope = ObtenerPaciente.class)
    public JAXBElement<Long> createObtenerPacienteCodigoPaciente(Long value) {
        return new JAXBElement<Long>(_ObtenerPacienteCodigoPaciente_QNAME, Long.class, ObtenerPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "historiaClinica", scope = ObtenerPaciente.class)
    public JAXBElement<Long> createObtenerPacienteHistoriaClinica(Long value) {
        return new JAXBElement<Long>(_ObtenerPacienteHistoriaClinica_QNAME, Long.class, ObtenerPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = ObtenerPaciente.class)
    public JAXBElement<String> createObtenerPacienteNombre(String value) {
        return new JAXBElement<String>(_ObtenerPacienteNombre_QNAME, String.class, ObtenerPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apellido", scope = ObtenerPaciente.class)
    public JAXBElement<String> createObtenerPacienteApellido(String value) {
        return new JAXBElement<String>(_ObtenerPacienteApellido_QNAME, String.class, ObtenerPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipoDeDocumento", scope = ObtenerPaciente.class)
    public JAXBElement<String> createObtenerPacienteTipoDeDocumento(String value) {
        return new JAXBElement<String>(_ObtenerPacienteTipoDeDocumento_QNAME, String.class, ObtenerPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = ObtenerPaciente.class)
    public JAXBElement<String> createObtenerPacienteNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, ObtenerPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteModelWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteModelWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPacienteResult", scope = ObtenerPacienteResponse.class)
    public JAXBElement<PacienteModelWrapper> createObtenerPacienteResponseObtenerPacienteResult(PacienteModelWrapper value) {
        return new JAXBElement<PacienteModelWrapper>(_ObtenerPacienteResponseObtenerPacienteResult_QNAME, PacienteModelWrapper.class, ObtenerPacienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pacienteId", scope = BloquearPaciente.class)
    public JAXBElement<String> createBloquearPacientePacienteId(String value) {
        return new JAXBElement<String>(_LoadImagenPacientePacienteId_QNAME, String.class, BloquearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codigoPaciente", scope = BloquearPaciente.class)
    public JAXBElement<Long> createBloquearPacienteCodigoPaciente(Long value) {
        return new JAXBElement<Long>(_ObtenerPacienteCodigoPaciente_QNAME, Long.class, BloquearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "historiaClinica", scope = BloquearPaciente.class)
    public JAXBElement<Long> createBloquearPacienteHistoriaClinica(Long value) {
        return new JAXBElement<Long>(_ObtenerPacienteHistoriaClinica_QNAME, Long.class, BloquearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = BloquearPaciente.class)
    public JAXBElement<String> createBloquearPacienteNombre(String value) {
        return new JAXBElement<String>(_ObtenerPacienteNombre_QNAME, String.class, BloquearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apellido", scope = BloquearPaciente.class)
    public JAXBElement<String> createBloquearPacienteApellido(String value) {
        return new JAXBElement<String>(_ObtenerPacienteApellido_QNAME, String.class, BloquearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipoDeDocumento", scope = BloquearPaciente.class)
    public JAXBElement<String> createBloquearPacienteTipoDeDocumento(String value) {
        return new JAXBElement<String>(_ObtenerPacienteTipoDeDocumento_QNAME, String.class, BloquearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = BloquearPaciente.class)
    public JAXBElement<String> createBloquearPacienteNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, BloquearPaciente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipoDeDocumento", scope = ObtenerPacienteReporte.class)
    public JAXBElement<String> createObtenerPacienteReporteTipoDeDocumento(String value) {
        return new JAXBElement<String>(_ObtenerPacienteTipoDeDocumento_QNAME, String.class, ObtenerPacienteReporte.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = ObtenerPacienteReporte.class)
    public JAXBElement<String> createObtenerPacienteReporteNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, ObtenerPacienteReporte.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteModelWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteModelWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerPacienteReporteResult", scope = ObtenerPacienteReporteResponse.class)
    public JAXBElement<PacienteModelWrapper> createObtenerPacienteReporteResponseObtenerPacienteReporteResult(PacienteModelWrapper value) {
        return new JAXBElement<PacienteModelWrapper>(_ObtenerPacienteReporteResponseObtenerPacienteReporteResult_QNAME, PacienteModelWrapper.class, ObtenerPacienteReporteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipoDeDocumento", scope = ValidarPacientePlanSalud.class)
    public JAXBElement<String> createValidarPacientePlanSaludTipoDeDocumento(String value) {
        return new JAXBElement<String>(_ObtenerPacienteTipoDeDocumento_QNAME, String.class, ValidarPacientePlanSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = ValidarPacientePlanSalud.class)
    public JAXBElement<String> createValidarPacientePlanSaludNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, ValidarPacientePlanSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_historiaClinica", scope = EnviarMailConfirmaCorreoLabCore.class)
    public JAXBElement<String> createEnviarMailConfirmaCorreoLabCoreHistoriaClinica(String value) {
        return new JAXBElement<String>(_EnviarMailConfirmaCorreoLabCoreHistoriaClinica_QNAME, String.class, EnviarMailConfirmaCorreoLabCore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_email", scope = EnviarMailConfirmaCorreoLabCore.class)
    public JAXBElement<String> createEnviarMailConfirmaCorreoLabCoreEmail(String value) {
        return new JAXBElement<String>(_EnviarMailConfirmaCorreoLabCoreEmail_QNAME, String.class, EnviarMailConfirmaCorreoLabCore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_sede", scope = EnviarMailConfirmaCorreoLabCore.class)
    public JAXBElement<String> createEnviarMailConfirmaCorreoLabCoreSede(String value) {
        return new JAXBElement<String>(_EnviarMailConfirmaCorreoLabCoreSede_QNAME, String.class, EnviarMailConfirmaCorreoLabCore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_link", scope = EnviarMailConfirmaCorreo.class)
    public JAXBElement<String> createEnviarMailConfirmaCorreoLink(String value) {
        return new JAXBElement<String>(_EnviarMailConfirmaCorreoLink_QNAME, String.class, EnviarMailConfirmaCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_email", scope = EnviarMailConfirmaCorreo.class)
    public JAXBElement<String> createEnviarMailConfirmaCorreoEmail(String value) {
        return new JAXBElement<String>(_EnviarMailConfirmaCorreoLabCoreEmail_QNAME, String.class, EnviarMailConfirmaCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_vigencia", scope = EnviarMailConfirmaCorreo.class)
    public JAXBElement<String> createEnviarMailConfirmaCorreoVigencia(String value) {
        return new JAXBElement<String>(_EnviarMailConfirmaCorreoVigencia_QNAME, String.class, EnviarMailConfirmaCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_email", scope = EnviarMailNotificarCambioCorreo.class)
    public JAXBElement<String> createEnviarMailNotificarCambioCorreoEmail(String value) {
        return new JAXBElement<String>(_EnviarMailConfirmaCorreoLabCoreEmail_QNAME, String.class, EnviarMailNotificarCambioCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_nuevoEmail", scope = EnviarMailNotificarCambioCorreo.class)
    public JAXBElement<String> createEnviarMailNotificarCambioCorreoNuevoEmail(String value) {
        return new JAXBElement<String>(_EnviarMailNotificarCambioCorreoNuevoEmail_QNAME, String.class, EnviarMailNotificarCambioCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_historiaClinica", scope = EnviarMailLaboratorio.class)
    public JAXBElement<String> createEnviarMailLaboratorioHistoriaClinica(String value) {
        return new JAXBElement<String>(_EnviarMailConfirmaCorreoLabCoreHistoriaClinica_QNAME, String.class, EnviarMailLaboratorio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_timeStampEstudio", scope = EnviarMailLaboratorio.class)
    public JAXBElement<String> createEnviarMailLaboratorioTimeStampEstudio(String value) {
        return new JAXBElement<String>(_EnviarMailLaboratorioTimeStampEstudio_QNAME, String.class, EnviarMailLaboratorio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_observaciones", scope = EnviarMailLaboratorio.class)
    public JAXBElement<String> createEnviarMailLaboratorioObservaciones(String value) {
        return new JAXBElement<String>(_EnviarMailLaboratorioObservaciones_QNAME, String.class, EnviarMailLaboratorio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_nombreAdjunto", scope = EnviarMailLaboratorio.class)
    public JAXBElement<String> createEnviarMailLaboratorioNombreAdjunto(String value) {
        return new JAXBElement<String>(_EnviarMailLaboratorioNombreAdjunto_QNAME, String.class, EnviarMailLaboratorio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "_adjunto", scope = EnviarMailLaboratorio.class)
    public JAXBElement<String> createEnviarMailLaboratorioAdjunto(String value) {
        return new JAXBElement<String>(_EnviarMailLaboratorioAdjunto_QNAME, String.class, EnviarMailLaboratorio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pacienteId", scope = TieneCorreoElectronicoConfirmado.class)
    public JAXBElement<String> createTieneCorreoElectronicoConfirmadoPacienteId(String value) {
        return new JAXBElement<String>(_LoadImagenPacientePacienteId_QNAME, String.class, TieneCorreoElectronicoConfirmado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "codigoPaciente", scope = TieneCorreoElectronicoConfirmado.class)
    public JAXBElement<Long> createTieneCorreoElectronicoConfirmadoCodigoPaciente(Long value) {
        return new JAXBElement<Long>(_ObtenerPacienteCodigoPaciente_QNAME, Long.class, TieneCorreoElectronicoConfirmado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "historiaClinica", scope = TieneCorreoElectronicoConfirmado.class)
    public JAXBElement<Long> createTieneCorreoElectronicoConfirmadoHistoriaClinica(Long value) {
        return new JAXBElement<Long>(_ObtenerPacienteHistoriaClinica_QNAME, Long.class, TieneCorreoElectronicoConfirmado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nombre", scope = TieneCorreoElectronicoConfirmado.class)
    public JAXBElement<String> createTieneCorreoElectronicoConfirmadoNombre(String value) {
        return new JAXBElement<String>(_ObtenerPacienteNombre_QNAME, String.class, TieneCorreoElectronicoConfirmado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "apellido", scope = TieneCorreoElectronicoConfirmado.class)
    public JAXBElement<String> createTieneCorreoElectronicoConfirmadoApellido(String value) {
        return new JAXBElement<String>(_ObtenerPacienteApellido_QNAME, String.class, TieneCorreoElectronicoConfirmado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tipoDeDocumento", scope = TieneCorreoElectronicoConfirmado.class)
    public JAXBElement<String> createTieneCorreoElectronicoConfirmadoTipoDeDocumento(String value) {
        return new JAXBElement<String>(_ObtenerPacienteTipoDeDocumento_QNAME, String.class, TieneCorreoElectronicoConfirmado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "numeroDeDocumento", scope = TieneCorreoElectronicoConfirmado.class)
    public JAXBElement<String> createTieneCorreoElectronicoConfirmadoNumeroDeDocumento(String value) {
        return new JAXBElement<String>(_ConfirmarActivacionNumeroDeDocumento_QNAME, String.class, TieneCorreoElectronicoConfirmado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ObtenerTiposDeVinculoResult", scope = ObtenerTiposDeVinculoResponse.class)
    public JAXBElement<ArrayOfListItemModel> createObtenerTiposDeVinculoResponseObtenerTiposDeVinculoResult(ArrayOfListItemModel value) {
        return new JAXBElement<ArrayOfListItemModel>(_ObtenerTiposDeVinculoResponseObtenerTiposDeVinculoResult_QNAME, ArrayOfListItemModel.class, ObtenerTiposDeVinculoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVinculoModelDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateVinculoModelDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "model", scope = GetValidacionParaVincularModel.class)
    public JAXBElement<CreateVinculoModelDTO> createGetValidacionParaVincularModelModel(CreateVinculoModelDTO value) {
        return new JAXBElement<CreateVinculoModelDTO>(_ModificarPacienteServiceModel_QNAME, CreateVinculoModelDTO.class, GetValidacionParaVincularModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidacionParaVincularModelDTO }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidacionParaVincularModelDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetValidacionParaVincularModelResult", scope = GetValidacionParaVincularModelResponse.class)
    public JAXBElement<ValidacionParaVincularModelDTO> createGetValidacionParaVincularModelResponseGetValidacionParaVincularModelResult(ValidacionParaVincularModelDTO value) {
        return new JAXBElement<ValidacionParaVincularModelDTO>(_GetValidacionParaVincularModelResponseGetValidacionParaVincularModelResult_QNAME, ValidacionParaVincularModelDTO.class, GetValidacionParaVincularModelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteVinculoModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteVinculoModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "vinculo", scope = CrearVinculo.class)
    public JAXBElement<PacienteVinculoModel> createCrearVinculoVinculo(PacienteVinculoModel value) {
        return new JAXBElement<PacienteVinculoModel>(_CrearVinculoVinculo_QNAME, PacienteVinculoModel.class, CrearVinculo.class, value);
    }

}
