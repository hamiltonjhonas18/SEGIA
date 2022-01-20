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

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 *
 * @author HJC2K8
 */
public class AppPDF {

    public void openPdfAwt(String path) {

        try {

            File pdfFile = new File(path);
            if (pdfFile.exists()) {

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);

                    System.err.println("Done");
                } else {
                    System.err.println("Awt Desktop is not supported!");
                }

            } else {
                System.err.println("File is not exists!");
            }

        } catch (Exception ex) {
        }

    }

    public void openPdfDLL(String path) {

        try {

            if ((new File(path)).exists()) {

                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler " + path);
                p.waitFor();

                System.err.println("Done");
            } else {

                System.err.println("File is not exists");

            }

        } catch (IOException | InterruptedException ex) {

        }

    }

    public void openPdfCMD(String path) {

        try {

            if ((new File(path)).exists()) {

                Process p = Runtime
                        .getRuntime()
                        .exec(new String[]{"cmd.exe", "/c", "start", path});
                p.waitFor();

                System.err.println("Done");
            } else {

                System.err.println("File is not exists");

            }

        } catch (IOException | InterruptedException ex) {

        }

    }

    public void openPdfPB(String path) {

        try {

            if ((new File(path)).exists()) {

                ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Adobe\\Acrobat 11.0\\Acrobat\\Acrobat.exe", path);
                Process p = pb.start();

                System.err.println("Done");
            } else {

                System.err.println("File is not exists");

            }

        } catch (IOException ex) {

        }

    }

    public void navegateUrl(String pdf) {
        try {
            // Create desktop object
            Desktop desktop = Desktop.getDesktop();

            pdf = pdf.replace('\\', '/');
            System.out.println("[PDF PATH]: " + pdf);
            // Browse a URL
            desktop.browse(new URI("file:///" + pdf));
        } catch (Exception e) {

            System.out.println(e.toString());
        }
    }
}
