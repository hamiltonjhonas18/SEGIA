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

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class GmailSLL {

    final String username = "soicodesk@gmail.com";
    final String password = "soico2015";

    public void sendMail(String to, String subject, String msg, String categorizacao) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setContent("Content-Type", "text/html; charset=utf-8");
            message.setHeader("Content-Transfer-Encoding", "quoted-printable");
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            if (categorizacao.equals("Alto Alto")) {

                InternetAddress messageCC[] = {new InternetAddress("hassan.sale@soico.co.mz"), new InternetAddress("celso.nguila@soico.co.mz"), new InternetAddress("igor.frechauth@soico.co.mz")};

                message.setRecipients(Message.RecipientType.CC, messageCC);

            }

            message.setSubject(subject);
            message.setText(msg);

            Transport.send(message);

            System.out.println("Mail sent succesfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
