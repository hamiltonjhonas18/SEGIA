
package com.dciapps.webclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GestaoWSrv", targetNamespace = "http://webservice.centralserver.co.mz/", wsdlLocation = "http://localhost:8085/segiaserver/GestaoWSrv?wsdl")
public class GestaoWSrv_Service
    extends Service
{

    private final static URL GESTAOWSRV_WSDL_LOCATION;
    private final static WebServiceException GESTAOWSRV_EXCEPTION;
    private final static QName GESTAOWSRV_QNAME = new QName("http://webservice.centralserver.co.mz/", "GestaoWSrv");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/segiaserver/GestaoWSrv?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GESTAOWSRV_WSDL_LOCATION = url;
        GESTAOWSRV_EXCEPTION = e;
    }

    public GestaoWSrv_Service() {
        super(__getWsdlLocation(), GESTAOWSRV_QNAME);
    }

    public GestaoWSrv_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GESTAOWSRV_QNAME, features);
    }

    public GestaoWSrv_Service(URL wsdlLocation) {
        super(wsdlLocation, GESTAOWSRV_QNAME);
    }

    public GestaoWSrv_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GESTAOWSRV_QNAME, features);
    }

    public GestaoWSrv_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestaoWSrv_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GestaoWSrv
     */
    @WebEndpoint(name = "GestaoWSrvPort")
    public GestaoWSrv getGestaoWSrvPort() {
        return super.getPort(new QName("http://webservice.centralserver.co.mz/", "GestaoWSrvPort"), GestaoWSrv.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestaoWSrv
     */
    @WebEndpoint(name = "GestaoWSrvPort")
    public GestaoWSrv getGestaoWSrvPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.centralserver.co.mz/", "GestaoWSrvPort"), GestaoWSrv.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GESTAOWSRV_EXCEPTION!= null) {
            throw GESTAOWSRV_EXCEPTION;
        }
        return GESTAOWSRV_WSDL_LOCATION;
    }

}
