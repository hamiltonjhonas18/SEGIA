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

/**
 *
 * @author HJC2K8
 */
public class UriGen {
    
    public void gnUri(String jsp, String servlet, String uri) throws IOException {
        BufferedWriter br = new BufferedWriter((new FileWriter("uri.txt", true)));
        
        br.write("\n"
                + "    \n"
                + "    <servlet>\n"
                + "        <servlet-name>"+servlet+"</servlet-name>\n"
                + "        <jsp-file>"+jsp+"</jsp-file>\n"
                + "    </servlet>\n"
                + "\n"
                + "    <servlet-mapping>\n"
                + "        <servlet-name>"+servlet+"</servlet-name>\n"
                + "        <url-pattern>/"+uri+"</url-pattern>\n"
                + "    </servlet-mapping>");
        
        br.newLine();
        br.close();
    }
    
}
