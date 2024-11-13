
package org.datacontract.schemas._2004._07.wcfinterfaz;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcfinterfaz package. 
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

    private final static QName _EstadoRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFInterfaz", "EstadoRespuesta");
    private final static QName _EstadoRespuestaCodigoRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFInterfaz", "CodigoRespuesta");
    private final static QName _EstadoRespuestaMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/WCFInterfaz", "Mensaje");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcfinterfaz
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EstadoRespuesta }
     * 
     */
    public EstadoRespuesta createEstadoRespuesta() {
        return new EstadoRespuesta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EstadoRespuesta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFInterfaz", name = "EstadoRespuesta")
    public JAXBElement<EstadoRespuesta> createEstadoRespuesta(EstadoRespuesta value) {
        return new JAXBElement<EstadoRespuesta>(_EstadoRespuesta_QNAME, EstadoRespuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFInterfaz", name = "CodigoRespuesta", scope = EstadoRespuesta.class)
    public JAXBElement<String> createEstadoRespuestaCodigoRespuesta(String value) {
        return new JAXBElement<String>(_EstadoRespuestaCodigoRespuesta_QNAME, String.class, EstadoRespuesta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WCFInterfaz", name = "Mensaje", scope = EstadoRespuesta.class)
    public JAXBElement<String> createEstadoRespuestaMensaje(String value) {
        return new JAXBElement<String>(_EstadoRespuestaMensaje_QNAME, String.class, EstadoRespuesta.class, value);
    }

}
