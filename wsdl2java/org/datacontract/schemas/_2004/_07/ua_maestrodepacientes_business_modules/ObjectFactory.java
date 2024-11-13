
package org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientes.PinModel;
import org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules_pacientesservice.PacienteModel;
import org.datacontract.schemas._2004._07.wcfinterfaz.EstadoRespuesta;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules package. 
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

    private final static QName _PacientesReducidosWrapper_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "PacientesReducidosWrapper");
    private final static QName _ArrayOfPacienteReducidoWrapper_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "ArrayOfPacienteReducidoWrapper");
    private final static QName _PacienteReducidoWrapper_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "PacienteReducidoWrapper");
    private final static QName _PinModelWrapper_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "PinModelWrapper");
    private final static QName _PacienteModelWrapper_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "PacienteModelWrapper");
    private final static QName _ResultadoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.SharedModels", "ResultadoOperacion");
    private final static QName _ArrayOfResultadoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.SharedModels", "ArrayOfResultadoOperacion");
    private final static QName _PacienteModelWrapperImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "Image");
    private final static QName _PacienteModelWrapperOperationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "OperationResult");
    private final static QName _PacienteModelWrapperPacienteModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "PacienteModel");
    private final static QName _ResultadoOperacionMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.SharedModels", "Mensaje");
    private final static QName _PinModelWrapperPinModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "PinModel");
    private final static QName _PacienteReducidoWrapperApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "Apellido");
    private final static QName _PacienteReducidoWrapperCorreoElectronico_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "CorreoElectronico");
    private final static QName _PacienteReducidoWrapperHistoriaClinica_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "HistoriaClinica");
    private final static QName _PacienteReducidoWrapperLink_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "Link");
    private final static QName _PacienteReducidoWrapperNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "Nombre");
    private final static QName _PacientesReducidosWrapperPacientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", "pacientes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ua_maestrodepacientes_business_modules
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PacientesReducidosWrapper }
     * 
     */
    public PacientesReducidosWrapper createPacientesReducidosWrapper() {
        return new PacientesReducidosWrapper();
    }

    /**
     * Create an instance of {@link PacienteReducidoWrapper }
     * 
     */
    public PacienteReducidoWrapper createPacienteReducidoWrapper() {
        return new PacienteReducidoWrapper();
    }

    /**
     * Create an instance of {@link PinModelWrapper }
     * 
     */
    public PinModelWrapper createPinModelWrapper() {
        return new PinModelWrapper();
    }

    /**
     * Create an instance of {@link ResultadoOperacion }
     * 
     */
    public ResultadoOperacion createResultadoOperacion() {
        return new ResultadoOperacion();
    }

    /**
     * Create an instance of {@link ArrayOfResultadoOperacion }
     * 
     */
    public ArrayOfResultadoOperacion createArrayOfResultadoOperacion() {
        return new ArrayOfResultadoOperacion();
    }

    /**
     * Create an instance of {@link PacienteModelWrapper }
     * 
     */
    public PacienteModelWrapper createPacienteModelWrapper() {
        return new PacienteModelWrapper();
    }

    /**
     * Create an instance of {@link ArrayOfPacienteReducidoWrapper }
     * 
     */
    public ArrayOfPacienteReducidoWrapper createArrayOfPacienteReducidoWrapper() {
        return new ArrayOfPacienteReducidoWrapper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacientesReducidosWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "PacientesReducidosWrapper")
    public JAXBElement<PacientesReducidosWrapper> createPacientesReducidosWrapper(PacientesReducidosWrapper value) {
        return new JAXBElement<PacientesReducidosWrapper>(_PacientesReducidosWrapper_QNAME, PacientesReducidosWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPacienteReducidoWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPacienteReducidoWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "ArrayOfPacienteReducidoWrapper")
    public JAXBElement<ArrayOfPacienteReducidoWrapper> createArrayOfPacienteReducidoWrapper(ArrayOfPacienteReducidoWrapper value) {
        return new JAXBElement<ArrayOfPacienteReducidoWrapper>(_ArrayOfPacienteReducidoWrapper_QNAME, ArrayOfPacienteReducidoWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteReducidoWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteReducidoWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "PacienteReducidoWrapper")
    public JAXBElement<PacienteReducidoWrapper> createPacienteReducidoWrapper(PacienteReducidoWrapper value) {
        return new JAXBElement<PacienteReducidoWrapper>(_PacienteReducidoWrapper_QNAME, PacienteReducidoWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PinModelWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PinModelWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "PinModelWrapper")
    public JAXBElement<PinModelWrapper> createPinModelWrapper(PinModelWrapper value) {
        return new JAXBElement<PinModelWrapper>(_PinModelWrapper_QNAME, PinModelWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteModelWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteModelWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "PacienteModelWrapper")
    public JAXBElement<PacienteModelWrapper> createPacienteModelWrapper(PacienteModelWrapper value) {
        return new JAXBElement<PacienteModelWrapper>(_PacienteModelWrapper_QNAME, PacienteModelWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.SharedModels", name = "ResultadoOperacion")
    public JAXBElement<ResultadoOperacion> createResultadoOperacion(ResultadoOperacion value) {
        return new JAXBElement<ResultadoOperacion>(_ResultadoOperacion_QNAME, ResultadoOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResultadoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResultadoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.SharedModels", name = "ArrayOfResultadoOperacion")
    public JAXBElement<ArrayOfResultadoOperacion> createArrayOfResultadoOperacion(ArrayOfResultadoOperacion value) {
        return new JAXBElement<ArrayOfResultadoOperacion>(_ArrayOfResultadoOperacion_QNAME, ArrayOfResultadoOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "Image", scope = PacienteModelWrapper.class)
    public JAXBElement<byte[]> createPacienteModelWrapperImage(byte[] value) {
        return new JAXBElement<byte[]>(_PacienteModelWrapperImage_QNAME, byte[].class, PacienteModelWrapper.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "OperationResult", scope = PacienteModelWrapper.class)
    public JAXBElement<EstadoRespuesta> createPacienteModelWrapperOperationResult(EstadoRespuesta value) {
        return new JAXBElement<EstadoRespuesta>(_PacienteModelWrapperOperationResult_QNAME, EstadoRespuesta.class, PacienteModelWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacienteModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "PacienteModel", scope = PacienteModelWrapper.class)
    public JAXBElement<PacienteModel> createPacienteModelWrapperPacienteModel(PacienteModel value) {
        return new JAXBElement<PacienteModel>(_PacienteModelWrapperPacienteModel_QNAME, PacienteModel.class, PacienteModelWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.SharedModels", name = "Mensaje", scope = ResultadoOperacion.class)
    public JAXBElement<String> createResultadoOperacionMensaje(String value) {
        return new JAXBElement<String>(_ResultadoOperacionMensaje_QNAME, String.class, ResultadoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "OperationResult", scope = PinModelWrapper.class)
    public JAXBElement<EstadoRespuesta> createPinModelWrapperOperationResult(EstadoRespuesta value) {
        return new JAXBElement<EstadoRespuesta>(_PacienteModelWrapperOperationResult_QNAME, EstadoRespuesta.class, PinModelWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PinModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PinModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "PinModel", scope = PinModelWrapper.class)
    public JAXBElement<PinModel> createPinModelWrapperPinModel(PinModel value) {
        return new JAXBElement<PinModel>(_PinModelWrapperPinModel_QNAME, PinModel.class, PinModelWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "Apellido", scope = PacienteReducidoWrapper.class)
    public JAXBElement<String> createPacienteReducidoWrapperApellido(String value) {
        return new JAXBElement<String>(_PacienteReducidoWrapperApellido_QNAME, String.class, PacienteReducidoWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "CorreoElectronico", scope = PacienteReducidoWrapper.class)
    public JAXBElement<String> createPacienteReducidoWrapperCorreoElectronico(String value) {
        return new JAXBElement<String>(_PacienteReducidoWrapperCorreoElectronico_QNAME, String.class, PacienteReducidoWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "HistoriaClinica", scope = PacienteReducidoWrapper.class)
    public JAXBElement<String> createPacienteReducidoWrapperHistoriaClinica(String value) {
        return new JAXBElement<String>(_PacienteReducidoWrapperHistoriaClinica_QNAME, String.class, PacienteReducidoWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "Link", scope = PacienteReducidoWrapper.class)
    public JAXBElement<String> createPacienteReducidoWrapperLink(String value) {
        return new JAXBElement<String>(_PacienteReducidoWrapperLink_QNAME, String.class, PacienteReducidoWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "Nombre", scope = PacienteReducidoWrapper.class)
    public JAXBElement<String> createPacienteReducidoWrapperNombre(String value) {
        return new JAXBElement<String>(_PacienteReducidoWrapperNombre_QNAME, String.class, PacienteReducidoWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "OperationResult", scope = PacientesReducidosWrapper.class)
    public JAXBElement<EstadoRespuesta> createPacientesReducidosWrapperOperationResult(EstadoRespuesta value) {
        return new JAXBElement<EstadoRespuesta>(_PacienteModelWrapperOperationResult_QNAME, EstadoRespuesta.class, PacientesReducidosWrapper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPacienteReducidoWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPacienteReducidoWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.MaestroDePacientes.Business.Modules.PacientesService", name = "pacientes", scope = PacientesReducidosWrapper.class)
    public JAXBElement<ArrayOfPacienteReducidoWrapper> createPacientesReducidosWrapperPacientes(ArrayOfPacienteReducidoWrapper value) {
        return new JAXBElement<ArrayOfPacienteReducidoWrapper>(_PacientesReducidosWrapperPacientes_QNAME, ArrayOfPacienteReducidoWrapper.class, PacientesReducidosWrapper.class, value);
    }

}
