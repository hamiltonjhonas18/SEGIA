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

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 *
 * @author HJC2K8
 */
public class ServerInfo {
    
    public static String server = "serverdesk.soico.co.mz";  
    public static String username = "hamilton-jho@hotmail.com";
    public static String password = "fskcar2010";
    
    public static String ip()
    {
        String eth = "";
        try {
            InetAddress IP=InetAddress.getLocalHost();
            eth = IP.getHostAddress();
        } catch (UnknownHostException ex) {
        }
        
        return eth;
    }
    
}
