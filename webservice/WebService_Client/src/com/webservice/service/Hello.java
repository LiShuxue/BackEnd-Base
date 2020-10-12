package com.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2015-12-20T19:51:52.179+08:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://service.webservice.com/", name = "Hello")
@XmlSeeAlso({ObjectFactory.class})
public interface Hello {

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://service.webservice.com/Hello/getBooksByUserRequest", output = "http://service.webservice.com/Hello/getBooksByUserResponse")
    @RequestWrapper(localName = "getBooksByUser", targetNamespace = "http://service.webservice.com/", className = "com.webservice.service.GetBooksByUser")
    @WebMethod
    @ResponseWrapper(localName = "getBooksByUserResponse", targetNamespace = "http://service.webservice.com/", className = "com.webservice.service.GetBooksByUserResponse")
    public java.util.List<com.webservice.service.Book> getBooksByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.webservice.service.User arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @Action(input = "http://service.webservice.com/Hello/sayHelloRequest", output = "http://service.webservice.com/Hello/sayHelloResponse")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://service.webservice.com/", className = "com.webservice.service.SayHello")
    @WebMethod
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.webservice.com/", className = "com.webservice.service.SayHelloResponse")
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}