
package com.you07.client;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SamService", targetNamespace = "http://api.spl.ruijie.com/", wsdlLocation = "http://10.18.30.1:8080/sam/services/samapi?wsdl")
public class SamService
    extends Service
{

    private final static URL SAMSERVICE_WSDL_LOCATION;
    private final static WebServiceException SAMSERVICE_EXCEPTION;
    private final static QName SAMSERVICE_QNAME = new QName("http://api.spl.ruijie.com/", "SamService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.18.30.1:8080/sam/services/samapi?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SAMSERVICE_WSDL_LOCATION = url;
        SAMSERVICE_EXCEPTION = e;
    }

    public SamService() {
        super(__getWsdlLocation(), SAMSERVICE_QNAME);
    }

    public SamService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SAMSERVICE_QNAME);
    }

    public SamService(URL wsdlLocation) {
        super(wsdlLocation, SAMSERVICE_QNAME);
    }

    public SamService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SAMSERVICE_QNAME);
    }

    public SamService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SamService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns SamServicePortType
     */
    @WebEndpoint(name = "SamServicePort")
    public SamServicePortType getSamServicePort() {
        return super.getPort(new QName("http://api.spl.ruijie.com/", "SamServicePort"), SamServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SamServicePortType
     */
    @WebEndpoint(name = "SamServicePort")
    public SamServicePortType getSamServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.spl.ruijie.com/", "SamServicePort"), SamServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SAMSERVICE_EXCEPTION!= null) {
            throw SAMSERVICE_EXCEPTION;
        }
        return SAMSERVICE_WSDL_LOCATION;
    }

}
