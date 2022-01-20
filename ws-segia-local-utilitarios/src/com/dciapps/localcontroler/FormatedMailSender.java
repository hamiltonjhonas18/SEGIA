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

/**
 *
 * @author HJC2K8
 */
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class FormatedMailSender {

    public void sendHtmlEmail(String toAddress,
            String subject, String message) throws AddressException,
            MessagingException {

        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "upgapps@gmail.com";
        String password = "upgr@de2016";

        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mailFrom, password);
            }
        };

        Session session = Session.getInstance(properties, auth);

        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(mailFrom));
        InternetAddress[] toAddresses = {new InternetAddress(toAddress)};
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());

        // set plain text message
        msg.setContent(message, "text/html; charset=UTF-8");

        // sends the e-mail
        Transport.send(msg);

    }

    /**
     * Test the send html e-mail method
     *
     */
    public static void main(String[] args) {
        // SMTP server information

        // outgoing message information
        String mailTo = "hamilton.jhonas18@gmail.com";
        String subject = "Kugulla [REGISTO]";

        String msgTexto = "<table width=\"565\" border=\"0\" >\n"
                + "  <tr>\n"
                + "    <td colspan=\"2\"><div align=\"center\">\n"
                + "      <h2><img src=\"http://129.232.209.146:8081/suc/images/app-icons/dc-market-banner_v2.png\"  alt=\"\"/></h2>\n"
                + "    </div>    </td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td colspan=\"2\">Olá Hamilton Jhonas <strong>(Kagulla)</strong>,\n"
                + "      a sua conta foi criada com sucesso para um periodo de teste de 30 dias. Por favor conclua o seu cadastro efectuando a activação da sua conta atráves do link abaixo:<br>\n"
                + "      <br>\n"
                + "      <a href=\"http://129.232.209.146:8080/sysmicro\" target=\"_blank\" style=\"width: 9.5em;\n"
                + "	display: block;\n"
                + "	-webkit-border-radius: 6px;\n"
                + "	-moz-border-radius: 6px;\n"
                + "	-ie-border-radius: 6px;\n"
                + "	border-radius: 6px;\n"
                + "	padding: .48em .8em;\n"
                + "	text-shadow: rgba(0,0,0,.5) 0px -1px 0px;\n"
                + "	font-size: 18px;\n"
                + "	font-weight: 700;\n"
                + "	-webkit-transition-property: background-color;\n"
                + "	-webkit-transition-duration: .15s;\n"
                + "	-webkit-transition-timing-function: ease-in-out;\n"
                + "	cursor: pointer;\n"
                + "	text-decoration: none;\n"
                + "	margin-bottom: 20px;\n"
                + "    	background-color: #cc3747;\n"
                + "	color: #ffdada;\n"
                + "	-webkit-box-shadow: 0px 0px 0px 1px #8d1b27 inset, 0px 0px 0px 2px #dd4356 inset, 0px 4px 0px 0px #8d1b27, 0px 5px 0px 0px #65141c, 0px 8px 0px 0px rgba(0,0,0,.15);\n"
                + "	-moz-box-shadow: 0px 0px 0px 1px #8d1b27 inset, 0px 0px 0px 2px #dd4356 inset, 0px 4px 0px 0px #8d1b27, 0px 5px 0px 0px #65141c, 0px 8px 0px 0px rgba(0,0,0,.15);\n"
                + "	-ie-box-shadow: 0px 0px 0px 1px #8d1b27 inset, 0px 0px 0px 2px #dd4356 inset, 0px 4px 0px 0px #8d1b27, 0px 5px 0px 0px #65141c, 0px 8px 0px 0px rgba(0,0,0,.15);\n"
                + "	box-shadow: 0px 0px 0px 1px #8d1b27 inset, 0px 0px 0px 2px #dd4356 inset, 0px 4px 0px 0px #8d1b27, 0px 5px 0px 0px #65141c, 0px 8px 0px 0px rgba(0,0,0,.15);\n"
                + "     text-align: center;\n"
                + "     text-transform:uppercase;\n"
                + "    \"> Activar Conta</a>\n"
                + "     \n"
                + "      <p style = \"color:#41628b\"><strong>Detalhes da conta</strong></p>\n"
                + "      <strong>Usuário: </strong> hamilton.jhonas18@gmail.com<br>\n"
                + "      <strong>Password: </strong> *********<br>\n"
                + "      <i>Não esqueça de alterar a password após ao primeiro login.</i>\n"
                + "      <br><br>\n"
                + "      Obrigado !    </td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td colspan=\"2\">\n"
                + "      <p style=\"color:#41628b\">\n"
                + "        Kagulla Online, LDA.<br>\n"
                + "        Telefax: 84 963 9764<br>\n"
                + "        Av. Tomas Ndunda Nº 434. \n"
                + "      <p>\n"
                + "    </td>\n"
                + "  </tr>\n"
                + "\n"
                + "    <td colspan=\"2\">\n"
                + "    <div align=\"center\">\n"
                + "      <h2><img src=\"http://129.232.209.146:8081/suc/images/app-icons/dc-inovaction-footer.png\"  alt=\"\"/></h2>\n"
                + "    </div> \n"
                + "    </td>\n"
                + "  </tr>\n"
                + "</table>";

        FormatedMailSender mailer = new FormatedMailSender();

        try {
            mailer.sendHtmlEmail(mailTo,
                    subject, msgTexto);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Failed to sent email.");
            ex.printStackTrace();
        }
    }

}
