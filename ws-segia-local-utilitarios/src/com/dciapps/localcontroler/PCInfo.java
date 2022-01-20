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
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author HJC2K8
 */
public class PCInfo {

    InetAddress ip;

    public PCInfo() {
        try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException exception) {

        }
    }

    public List<String> getMacAddress() {
        List<String> macAddress = new ArrayList();
        try {
            ip = InetAddress.getLocalHost();
            //  System.out.println("Current IP address : " + ip.getHostAddress());

            Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
            while (networks.hasMoreElements()) {
                NetworkInterface network = networks.nextElement();
                byte[] mac = network.getHardwareAddress();

                if (mac != null) {

                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < mac.length; i++) {
                        macAddress.add(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
                    }
                }
            }
        } catch (UnknownHostException | SocketException e) {

        }

        return macAddress;
    }

    public String getIPAddress() {

        return ip.getHostAddress();
    }

    public String getPCName() {
        return ip.getHostName();
    }
  
}
