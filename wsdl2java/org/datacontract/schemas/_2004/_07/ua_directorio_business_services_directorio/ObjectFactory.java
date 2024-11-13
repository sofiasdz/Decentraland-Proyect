
package org.datacontract.schemas._2004._07.ua_directorio_business_services_directorio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ua_directorio_business_services_directorio package. 
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

    private final static QName _TelefonoModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "TelefonoModel");
    private final static QName _TelefonoModelCodigoArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "CodigoArea");
    private final static QName _TelefonoModelCodigoPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "CodigoPais");
    private final static QName _TelefonoModelCorporativo_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "Corporativo");
    private final static QName _TelefonoModelEmpresaTelefonoId_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "EmpresaTelefonoId");
    private final static QName _TelefonoModelEnvioSms_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "EnvioSms");
    private final static QName _TelefonoModelInterno_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "Interno");
    private final static QName _TelefonoModelNumeroTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "NumeroTelefono");
    private final static QName _TelefonoModelObservaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "Observaciones");
    private final static QName _TelefonoModelTipoTelefonoId_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "TipoTelefonoId");
    private final static QName _TelefonoModelValor_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", "Valor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ua_directorio_business_services_directorio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TelefonoModel }
     * 
     */
    public TelefonoModel createTelefonoModel() {
        return new TelefonoModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefonoModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TelefonoModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "TelefonoModel")
    public JAXBElement<TelefonoModel> createTelefonoModel(TelefonoModel value) {
        return new JAXBElement<TelefonoModel>(_TelefonoModel_QNAME, TelefonoModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "CodigoArea", scope = TelefonoModel.class)
    public JAXBElement<String> createTelefonoModelCodigoArea(String value) {
        return new JAXBElement<String>(_TelefonoModelCodigoArea_QNAME, String.class, TelefonoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "CodigoPais", scope = TelefonoModel.class)
    public JAXBElement<String> createTelefonoModelCodigoPais(String value) {
        return new JAXBElement<String>(_TelefonoModelCodigoPais_QNAME, String.class, TelefonoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "Corporativo", scope = TelefonoModel.class)
    public JAXBElement<Boolean> createTelefonoModelCorporativo(Boolean value) {
        return new JAXBElement<Boolean>(_TelefonoModelCorporativo_QNAME, Boolean.class, TelefonoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "EmpresaTelefonoId", scope = TelefonoModel.class)
    public JAXBElement<String> createTelefonoModelEmpresaTelefonoId(String value) {
        return new JAXBElement<String>(_TelefonoModelEmpresaTelefonoId_QNAME, String.class, TelefonoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "EnvioSms", scope = TelefonoModel.class)
    public JAXBElement<Boolean> createTelefonoModelEnvioSms(Boolean value) {
        return new JAXBElement<Boolean>(_TelefonoModelEnvioSms_QNAME, Boolean.class, TelefonoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "Interno", scope = TelefonoModel.class)
    public JAXBElement<String> createTelefonoModelInterno(String value) {
        return new JAXBElement<String>(_TelefonoModelInterno_QNAME, String.class, TelefonoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "NumeroTelefono", scope = TelefonoModel.class)
    public JAXBElement<String> createTelefonoModelNumeroTelefono(String value) {
        return new JAXBElement<String>(_TelefonoModelNumeroTelefono_QNAME, String.class, TelefonoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "Observaciones", scope = TelefonoModel.class)
    public JAXBElement<String> createTelefonoModelObservaciones(String value) {
        return new JAXBElement<String>(_TelefonoModelObservaciones_QNAME, String.class, TelefonoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "TipoTelefonoId", scope = TelefonoModel.class)
    public JAXBElement<String> createTelefonoModelTipoTelefonoId(String value) {
        return new JAXBElement<String>(_TelefonoModelTipoTelefonoId_QNAME, String.class, TelefonoModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Directorio.Business.Services.Directorio.Models", name = "Valor", scope = TelefonoModel.class)
    public JAXBElement<String> createTelefonoModelValor(String value) {
        return new JAXBElement<String>(_TelefonoModelValor_QNAME, String.class, TelefonoModel.class, value);
    }

}
