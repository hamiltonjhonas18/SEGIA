
package com.dciapps.webclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dciapps.webclient package. 
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

    private final static QName _RegistrarExcepcaoResponse_QNAME = new QName("http://webservice.centralserver.co.mz/", "registrar_excepcaoResponse");
    private final static QName _BuscaBadgeNumber_QNAME = new QName("http://webservice.centralserver.co.mz/", "buscaBadgeNumber");
    private final static QName _EnviarEmailResponse_QNAME = new QName("http://webservice.centralserver.co.mz/", "enviar_emailResponse");
    private final static QName _RegistrarExcepcao_QNAME = new QName("http://webservice.centralserver.co.mz/", "registrar_excepcao");
    private final static QName _EnviarEmail_QNAME = new QName("http://webservice.centralserver.co.mz/", "enviar_email");
    private final static QName _BuscaBadgeNumberResponse_QNAME = new QName("http://webservice.centralserver.co.mz/", "buscaBadgeNumberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dciapps.webclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarExcepcaoResponse }
     * 
     */
    public RegistrarExcepcaoResponse createRegistrarExcepcaoResponse() {
        return new RegistrarExcepcaoResponse();
    }

    /**
     * Create an instance of {@link BuscaBadgeNumber }
     * 
     */
    public BuscaBadgeNumber createBuscaBadgeNumber() {
        return new BuscaBadgeNumber();
    }

    /**
     * Create an instance of {@link EnviarEmailResponse }
     * 
     */
    public EnviarEmailResponse createEnviarEmailResponse() {
        return new EnviarEmailResponse();
    }

    /**
     * Create an instance of {@link RegistrarExcepcao }
     * 
     */
    public RegistrarExcepcao createRegistrarExcepcao() {
        return new RegistrarExcepcao();
    }

    /**
     * Create an instance of {@link BuscaBadgeNumberResponse }
     * 
     */
    public BuscaBadgeNumberResponse createBuscaBadgeNumberResponse() {
        return new BuscaBadgeNumberResponse();
    }

    /**
     * Create an instance of {@link EnviarEmail }
     * 
     */
    public EnviarEmail createEnviarEmail() {
        return new EnviarEmail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarExcepcaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.centralserver.co.mz/", name = "registrar_excepcaoResponse")
    public JAXBElement<RegistrarExcepcaoResponse> createRegistrarExcepcaoResponse(RegistrarExcepcaoResponse value) {
        return new JAXBElement<RegistrarExcepcaoResponse>(_RegistrarExcepcaoResponse_QNAME, RegistrarExcepcaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaBadgeNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.centralserver.co.mz/", name = "buscaBadgeNumber")
    public JAXBElement<BuscaBadgeNumber> createBuscaBadgeNumber(BuscaBadgeNumber value) {
        return new JAXBElement<BuscaBadgeNumber>(_BuscaBadgeNumber_QNAME, BuscaBadgeNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.centralserver.co.mz/", name = "enviar_emailResponse")
    public JAXBElement<EnviarEmailResponse> createEnviarEmailResponse(EnviarEmailResponse value) {
        return new JAXBElement<EnviarEmailResponse>(_EnviarEmailResponse_QNAME, EnviarEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarExcepcao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.centralserver.co.mz/", name = "registrar_excepcao")
    public JAXBElement<RegistrarExcepcao> createRegistrarExcepcao(RegistrarExcepcao value) {
        return new JAXBElement<RegistrarExcepcao>(_RegistrarExcepcao_QNAME, RegistrarExcepcao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.centralserver.co.mz/", name = "enviar_email")
    public JAXBElement<EnviarEmail> createEnviarEmail(EnviarEmail value) {
        return new JAXBElement<EnviarEmail>(_EnviarEmail_QNAME, EnviarEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaBadgeNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.centralserver.co.mz/", name = "buscaBadgeNumberResponse")
    public JAXBElement<BuscaBadgeNumberResponse> createBuscaBadgeNumberResponse(BuscaBadgeNumberResponse value) {
        return new JAXBElement<BuscaBadgeNumberResponse>(_BuscaBadgeNumberResponse_QNAME, BuscaBadgeNumberResponse.class, null, value);
    }

}
