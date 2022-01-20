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

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author hamil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //    try {
        ExcelCtrl excelCtrl = new ExcelCtrl();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

        List<String> lines = excelCtrl.readExel("contacts");

        StringTokenizer tok;

        for (String s : lines) {

            tok = new StringTokenizer(s, ";");

            String name = tok.nextToken();
            String surname = tok.nextToken();
            String email = tok.nextToken();
            String birth = replaceMonth(tok.nextToken());

            System.out.println(name + " " + surname + " " + email + " " + birth);
        }

        /*   Date date = sdf.parse("08-abr-2018");

            System.out.println(sdf2.format(date));*/
 /*/} catch (ParseException ex) {

            System.out.println(ex);
        }*/
    }

    private static String replaceMonth(String str) {
        StringTokenizer tok = new StringTokenizer(str.toUpperCase(), "-");

        String strDate = tok.nextToken();

        String month = tok.nextToken();

        String newMonth = "01";

        switch (month) {
            case "FEB": {
                newMonth = "02";
            }
            ;
            break;
            case "MAR": {
                newMonth = "03";
            }
            ;
            break;
            case "APR": {
                newMonth = "04";
            }
            ;
            break;
            case "MAY": {
                newMonth = "05";
            }
            ;
            break;
            case "JUN": {
                newMonth = "06";
            }
            ;
            break;
            case "JUL": {
                newMonth = "07";
            }
            ;
            break;
            case "AUG": {
                newMonth = "08";
            }
            ;
            break;
            case "SEP": {
                newMonth = "09";
            }
            ;
            break;
            case "OCT": {
                newMonth = "10";
            }
            ;
            break;
            case "NOV": {
                newMonth = "11";
            }
            ;
            break;
            case "DEC": {
                newMonth = "12";
            }
            ;
        }

        strDate += "/" + newMonth + "/" + tok.nextToken();

        return strDate;
    }

}
