/*
 * CENTRAL MASTER SERVER APPLICATION (Web, Desktop and Mobile)
 * 
 * [DEVELOPER]:    Hamilton Jhonas  | Software Engennier
 *   [CONTACT]:    hamilton.jhonas18@gmail.com  | + (258) 82 690 07984/ 84 690 07984
 * 
 * This Server is based on Hibernate framework, Webservices, Servlets and supported by JDK 1.8 
 * All rights reserved  * 

 */
package com.dciapps.webclientcontroler;

import com.dciapps.local.IbanCheckDigit;

/**
 *
 * @author Hamilton Jhonas
 */
public class IbanCtrl {

    public String referenciaPagamento(String entidade, String codigo, String mes, String ano, String dataLimite, String montante) {

        IbanCheckDigit ibanCheckDigit = IbanCheckDigit.INSTANCE;

        String iban = entidade + codigo + ano + mes + dataLimite + montante;

        String checkDigit = ibanCheckDigit.calculate(iban);
        
        System.err.println("CHECK DIGIT:" +checkDigit);

        String referencia = codigo + mes + checkDigit;

        return referencia;
    }
}
