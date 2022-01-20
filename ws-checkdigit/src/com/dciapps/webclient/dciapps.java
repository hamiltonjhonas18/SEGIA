/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dciapps.webclient;

import java.util.StringTokenizer;

/**
 *
 * @author hamil
 */
public class dciapps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*  CheckDigit checkDigit = new CheckDigit();

        String entidade = "98100";
        String referencia = "1900005";
        String mes = "07";
        String ano = "2019";
        String dataLimite = "07052019";
        double valor = 1;

        System.out.println(checkDigit.getChckDg(true, entidade, referencia + mes, valor));*/
        String entidade = "98100";

        String factura = "1900005";
        String mes = "08";

        String montante = "200";

        String referencia = entidade + factura +mes + montante;

        int pi = 0;

        for (int i = 0; i < referencia.length(); i++) {
            int si = Character.getNumericValue(referencia.charAt(i)) + pi;
            pi = (si * 10) % 97;

        }

        int pn = (pi * 10) % 97;

        System.out.println("PN: " + pn);

        String chk = (98 - pn) + "";

        if ((98 - pn) < 10) {
            chk = "0" + (98 - pn);
        }

        String referenciaFinal = factura + mes + chk;

        System.out.println("CHECK DIGIT: " + chk);
        System.out.println("REFERÊNCIA: " + referenciaFinal);

    }

}
