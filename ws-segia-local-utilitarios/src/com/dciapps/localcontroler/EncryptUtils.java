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

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 *
 * @author HJC2K8
 */
public class EncryptUtils {


    public String encodeString(String str) {
        String strEncoded = "";
        try {
            // encode data on your side using BASE64
            strEncoded = Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
        } //base64
        catch (UnsupportedEncodingException ex) {
        }

        return strEncoded;
    }
    
    public String decodeString(String strEncoded)
    {
        String strDecoded = "";
        try {
            // Decode data on other side, by processing encoded data
            byte[] decodedStr = Base64.getDecoder().decode(strEncoded);
            strDecoded = new String(decodedStr, "utf-8");
        } //base64
        catch (UnsupportedEncodingException ex) {
        }
        
        return strDecoded;
    }

}//class
