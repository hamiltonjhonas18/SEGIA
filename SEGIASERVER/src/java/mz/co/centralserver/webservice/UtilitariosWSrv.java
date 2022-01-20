/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import mz.co.centralserver.utilitarios.ExceptionWriter;
import mz.co.centralserver.utilitarios.GenerateBadgeNumber;
import mz.co.centralserver.utilitarios.MailSender;

/**
 *
 * @author HJC2K8
 */
@WebService(serviceName = "UtilitariosWSrv")
public class UtilitariosWSrv {

    /*=====================  EXCEPTION ===================*/
    ExceptionWriter exceptionWriter = new ExceptionWriter();

    @WebMethod(operationName = "registrar_excepcao")
    public void registrar_excepcao(@WebParam(name = "datetime") String datetime, @WebParam(name = "msg") String msg) {
        exceptionWriter.writeToFile(datetime, msg);
    }

    /**
     * ******************* END EXCEPTION ******************
     */
    /*===================== MAIL SENDER ===================*/
    MailSender mailSender = new MailSender();

    @WebMethod(operationName = "enviar_email")
    public void enviar_email(@WebParam(name = "to") String to, @WebParam(name = "subject") String subject, @WebParam(name = "message") String message, @WebParam(name = "category") String category) {
        mailSender.sendMail(to, subject, message, category);
    }
    /**
     * ******************* END MAIL SENDER ******************
     */

    /*=====================  GENERATE BADGE NUMBER ===================*/
    GenerateBadgeNumber generateBadgeNumber = new GenerateBadgeNumber();

    @WebMethod(operationName = "buscaBadgeNumber")
    public String buscaBadgeNumber(@WebParam(name = "prefix") String prefix, @WebParam(name = "number") int number) {
        return generateBadgeNumber.getBadgeNumber(prefix, number);
    }

    /**
     * ******************* END EXCEPTION ******************
     */
}
