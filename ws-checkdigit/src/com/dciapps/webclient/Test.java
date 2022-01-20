/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dciapps.webclient;

/**
 *
 * @author hamil
 */
public class Test {

    public static void main(String args[]) {
        long id = 2; // Id Sequencial do cliente

        String nFact = "66"; // Id sequencial da factura

        long num = getNum(id);

        String strNum = num + "";

        char str[] = strNum.toCharArray();

        for (int i = 0; i < nFact.length(); i++) {

            str[(str.length - 1) - i] = nFact.charAt((nFact.length() - 1) - i);
        }
        
        strNum = new String (str);
        
        
        System.out.println(strNum);

    }

    public static long getNum(long num) {
        long value = num;

        if (num < 10) {
            value = num * 1000000;
        } else if (num > 10 && num < 100) {
            value = num * 100000;
        } else if (num > 100 && num < 1000) {
            value = num * 10000;
        } else if (num > 1000 && num < 10000) {
            value = num * 1000;
        } else if (num > 10000 && num < 100000) {
            value = num * 100;
        } else if (num > 100000 && num < 1000000) {
            value = num * 10;
        } else if (num > 1000000 && num < 10000000) {
            value = num * 1;
        }

        return value;
    }
}
