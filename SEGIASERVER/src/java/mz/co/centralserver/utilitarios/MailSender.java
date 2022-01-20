/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.centralserver.utilitarios;

import java.io.IOException;

/**
 *
 * @author HJC2K8
 */
public class MailSender {
    
    
    public void sendMail(String to, String subject, String message, String category)
    {
      try {
            Runtime.getRuntime().exec("java -jar C:\\SD\\SoicoDeskMAIL.jar \"" + to + "\" \"" + subject + "\" \"" + message + "\" "+ "\"" + category + "\"");
            
        } catch (IOException ex) {
        }
    }
    
}
