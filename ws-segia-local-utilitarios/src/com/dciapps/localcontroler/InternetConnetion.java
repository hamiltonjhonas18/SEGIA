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

import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author HJC2K8
 */
public class InternetConnetion {

    public boolean haveInternet() {
        try {
            try {
                URL url = new URL("http://www.google.com");
                System.out.println(url.getHost());
                HttpURLConnection con = (HttpURLConnection) url
                        .openConnection();
                con.connect();
                if (con.getResponseCode() == 200) {
                    System.out.println("Connection established!!");

                    return true;
                }
            } catch (Exception exception) {
                System.out.println("No Connection");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
