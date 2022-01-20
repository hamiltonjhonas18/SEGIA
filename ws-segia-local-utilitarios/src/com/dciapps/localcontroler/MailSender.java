/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.localcontroler;

import java.io.IOException;

/**
 *
 * @author HJC2K8
 */
public class MailSender {

    public void sendMail(String to, String subject, String message, String category) {
        try {
            Runtime.getRuntime().exec("java -jar C:\\GESTAONLINEMAILSENDER\\GESTAONLINEMAILSENDER.jar \"" + to + "\" \"" + subject + "\" \"" + message + "\"");

        } catch (IOException ex) {
        }
    }

}
