
/*
 * 
 */

package com.webservice.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2015-12-20T19:51:52.223+08:00
 * Generated source version: 2.4.0
 * 
 */


@WebServiceClient(name = "hello", 
                  wsdlLocation = "http://192.168.0.161:8089/helloword?wsdl",
                  targetNamespace = "http://impl.service.webservice.com/") 
public class Hello extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.webservice.com/", "hello");
    public final static QName HelloImplPort = new QName("http://impl.service.webservice.com/", "HelloImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.0.161:8089/helloword?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Hello.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.0.161:8089/helloword?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Hello(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Hello(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Hello() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Hello(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Hello(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Hello(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloImplPort")
    public com.webservice.service.Hello getHelloImplPort() {
        return super.getPort(HelloImplPort, com.webservice.service.Hello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Hello
     */
    @WebEndpoint(name = "HelloImplPort")
    public com.webservice.service.Hello getHelloImplPort(WebServiceFeature... features) {
        return super.getPort(HelloImplPort, com.webservice.service.Hello.class, features);
    }

}