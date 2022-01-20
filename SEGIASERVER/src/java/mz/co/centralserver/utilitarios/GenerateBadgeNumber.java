/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package mz.co.centralserver.utilitarios;

/**
 *
 * @author HJC2K8
 */
public class GenerateBadgeNumber {


    public String getBadgeNumber(String prefix, int number) {
       

        String badgenumber = prefix + "" + number;

        if (number <= 9) {
            badgenumber = prefix + "00" + number;
        }

        if (number > 9 && number <= 99) {
            badgenumber = prefix + "0" + number;
        }

        if (number > 99 && number <= 999) {
            badgenumber = prefix + number;
        }

        return badgenumber;
    }
}
