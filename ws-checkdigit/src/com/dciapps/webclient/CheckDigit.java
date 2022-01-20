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
public class CheckDigit {

    
    public String getChckDg(boolean validaMontante, String entidade, String referencia, double valor) {

        @SuppressWarnings("UnusedAssignment")
        String numero = "";

        int somapeso1 = 0;
        String montante = convertValueToNumericString(valor);

        //Tipo de validação do ChkDg, valida o montante "sim" ou "não"?
        //Soma de Strings.
        if (validaMontante) {
            numero = entidade + referencia + montante; //Calculo Total
        } else {
            numero = entidade + referencia; //Calculo Parcial
        }

        int tamanho_num = numero.length(); //Tamanho do numero a calcular o Chkdg.

        for (int x = tamanho_num - 1; x >= 0; x--) {

            int val_posicao = Character.getNumericValue(numero.charAt(x));

            int peso = getPeso(tamanho_num - x + 3); //busca os pesos pré atribuídos

            somapeso1 += peso * val_posicao;
        }

        int somapeso2 = somapeso1 / 97;
        int somapeso3 = ((int) somapeso2) * 97;
        int somapeso4 = somapeso1 - somapeso3;

        int chkdig98 = 98 - somapeso4;

        String chk = chkdig98 + "";

        //Tem de se obter sempre dois dígitos!
        if (chkdig98 < 10) {
            chk = "0" + chkdig98;
        }

        return chk;
    }

    private String convertValueToNumericString(double value) {
        String valorStr = value + "";

        StringTokenizer st = new StringTokenizer(valorStr, ".00");

        String montF = st.nextToken();

        char numerico[] = {'0', '0', '0', '0', '0', '0', '0', '0'};

        for (int i = 0; i < montF.length(); i++) {
            numerico[i] = montF.charAt(i);
        }

        return new String(numerico);

    }

    private int getValorAleatorio(int n1, int n2) {
        return (int) (Math.floor(Math.random() * (n2 - n1) + 1) + n1);
    }

    private int getPeso(int num) {
        int value = 0;

        switch (num) {
            case 1:
                value = 1;
                break;
            case 2:
                value = 10;
                break;
            case 3:
                value = 3;
                break;
            case 4:
                value = 30;
                break;
            case 5:
                value = 9;
                break;
            case 6:
                value = 90;
                break;
            case 7:
                value = 27;
                break;
            case 8:
                value = 76;
                break;
            case 9:
                value = 81;
                break;
            case 10:
                value = 34;
                break;
            case 11:
                value = 49;
                break;
            case 12:
                value = 5;
                break;
            case 13:
                value = 50;
                break;
            case 14:
                value = 15;
                break;
            case 15:
                value = 53;
                break;
            case 16:
                value = 45;
                break;
            case 17:
                value = 62;
                break;
            case 18:
                value = 38;
                break;
            case 19:
                value = 89;
                break;
            case 20:
                value = 17;
                break;
            case 21:
                value = 73;
                break;
            case 22:
                value = 51;
                break;
            case 23:
                value = 25;
                break;
            case 24:
                value = 56;
                break;
            case 25:
                value = 75;
                break;
            case 27:
                value = 71;
                break;
            case 28:
                value = 19;
                break;
            case 29:
                value = 93;
                break;
            case 30:
                value = 57;
                break;
        }

        return value;
    }
}
