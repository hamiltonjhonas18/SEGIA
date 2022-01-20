/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mz.co.centralserver.utilitarios;

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
