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
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *
 * @author HJC2K8
 */
public class ExceptionWriter {

    PCInfo info = new PCInfo();

    public void writeToFile(String datetime, String msg) {

        String nomeFicheiro = "C:\\exceptions\\" + datetime + ".txt";

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFicheiro));

            bw.write(msg);
            bw.close();
        } catch (IOException ioe) {

        }
    }

    public String getStackTrace(final Throwable throwable) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }

}
