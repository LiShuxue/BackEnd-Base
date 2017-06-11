
package com.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.service package. 
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

    private final static QName _GetBooksByUser_QNAME = new QName("http://service.webservice.com/", "getBooksByUser");
    private final static QName _GetBooksByUserResponse_QNAME = new QName("http://service.webservice.com/", "getBooksByUserResponse");
    private final static QName _SayHello_QNAME = new QName("http://service.webservice.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://service.webservice.com/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetBooksByUserResponse }
     * 
     */
    public GetBooksByUserResponse createGetBooksByUserResponse() {
        return new GetBooksByUserResponse();
    }

    /**
     * Create an instance of {@link GetBooksByUser }
     * 
     */
    public GetBooksByUser createGetBooksByUser() {
        return new GetBooksByUser();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.com/", name = "getBooksByUser")
    public JAXBElement<GetBooksByUser> createGetBooksByUser(GetBooksByUser value) {
        return new JAXBElement<GetBooksByUser>(_GetBooksByUser_QNAME, GetBooksByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.com/", name = "getBooksByUserResponse")
    public JAXBElement<GetBooksByUserResponse> createGetBooksByUserResponse(GetBooksByUserResponse value) {
        return new JAXBElement<GetBooksByUserResponse>(_GetBooksByUserResponse_QNAME, GetBooksByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
