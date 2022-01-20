/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.dciapps;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author hamil
 */
public class Test {

    public static void main(String args[]) {
        try (BufferedInputStream inputStream = new BufferedInputStream(new URL("http://197.249.4.236:8081/suc/excel/imp_senhas_10072019.xlsx").openStream());
                FileOutputStream fileOS = new FileOutputStream("C:\\import\\imp_senhas_10072019_novo.xlsx")) {
            byte data[] = new byte[1024];
            int byteContent;
            while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
                fileOS.write(data, 0, byteContent);
            }
        } catch (IOException e) {
            // handles IO exceptions
        }
    }
}
