
package org.datacontract.schemas._2004._07.ua_core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ua_core package. 
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

    private final static QName _ArrayOfListItemModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Core.Models", "ArrayOfListItemModel");
    private final static QName _ListItemModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Core.Models", "ListItemModel");
    private final static QName _ListItemModelValor_QNAME = new QName("http://schemas.datacontract.org/2004/07/UA.Core.Models", "Valor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ua_core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfListItemModel }
     * 
     */
    public ArrayOfListItemModel createArrayOfListItemModel() {
        return new ArrayOfListItemModel();
    }

    /**
     * Create an instance of {@link ListItemModel }
     * 
     */
    public ListItemModel createListItemModel() {
        return new ListItemModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItemModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Core.Models", name = "ArrayOfListItemModel")
    public JAXBElement<ArrayOfListItemModel> createArrayOfListItemModel(ArrayOfListItemModel value) {
        return new JAXBElement<ArrayOfListItemModel>(_ArrayOfListItemModel_QNAME, ArrayOfListItemModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListItemModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListItemModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Core.Models", name = "ListItemModel")
    public JAXBElement<ListItemModel> createListItemModel(ListItemModel value) {
        return new JAXBElement<ListItemModel>(_ListItemModel_QNAME, ListItemModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UA.Core.Models", name = "Valor", scope = ListItemModel.class)
    public JAXBElement<String> createListItemModelValor(String value) {
        return new JAXBElement<String>(_ListItemModelValor_QNAME, String.class, ListItemModel.class, value);
    }

}
