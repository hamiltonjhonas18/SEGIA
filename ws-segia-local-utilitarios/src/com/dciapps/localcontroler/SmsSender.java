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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HJC2K8
 */
public class SmsSender {
    
    public void sendSMS(String shortcut, String number, String message)
    {
      try {
            
            
            BufferedWriter br = new BufferedWriter(new FileWriter("C:\\SD\\RECIVERS.txt"));
            br.write(shortcut+";"+number+";"+message+";");
            br.close();

            Runtime.getRuntime().exec("java -jar C:\\SD\\SoicoDeskClientSMS.jar");
            
            mensagensEnviadas(shortcut+";"+number+";"+message+";");;
        
         //  File f;
            // create new file
          //  f = new File("C:\\SD\\RECIVERS.txt");

            // tries to delete a non-existing file
           // f.delete();
            
        } catch (IOException ex) {
        }
    }
    
    public void mensagensEnviadas(String texto)
    {
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter("C:\\SD\\logMensagens.txt", true));
            br.write(texto);
            br.newLine();
            br.close();
            
        } catch (IOException ex) {
            Logger.getLogger(SmsSender.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(SmsSender.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
   
}
