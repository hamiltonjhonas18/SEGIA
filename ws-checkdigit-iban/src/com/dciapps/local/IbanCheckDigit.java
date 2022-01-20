/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dciapps.local;

/**
 *
 * @author hamil
 */
public enum IbanCheckDigit {
    INSTANCE;

    private static final int BBAN_INDEX = 4;

    private static final long CHECK_DIGITS_MAX = 999999999;
    private static final long CHECK_DIGITS_MODULUS = 97;
    private static final int CHECK_DIGITS_REMAINDER = 1;

    /**
     * Validate the given IBAN check digit.
     *
     * @param iban a non null string.
     * @return {@code true} if the given IBAN check digit is valid,
     * {@code false} otherwise.
     * @throws IllegalArgumentException if the given IBAN is null or if its size
     * is not at least four characters.
     */
    public boolean validate(String iban) {
        return modulus_bci(iban) == CHECK_DIGITS_REMAINDER;
    }

    /**
     * Calculate the given IBAN check digit. For a valid calculation the given
     * IBAN its characters have to be alphanumeric ([a-zA-Z0-9]) and check digit
     * characters have to be set to zero.
     *
     * @param iban a non null string
     * @return the given IBAN check digit
     */
    public String calculate(String iban) {
        int modulusResult = modulus_bci(iban);
        int charValue = (98 - modulusResult);
        String checkDigit = Integer.toString(charValue);
        return (charValue > 9 ? checkDigit : "0" + checkDigit);
    }

    private int modulus_iban(String iban) {
        if (iban == null) {
            throw new IllegalArgumentException("IBAN não pode ser nulo");
        }
        if (iban.length() <= BBAN_INDEX) {
            throw new IllegalArgumentException("IBAN deve ser superior que " + BBAN_INDEX);
        }

        String reformattedIban = iban.substring(BBAN_INDEX) + iban.substring(0, BBAN_INDEX);
        long total = 0;
        for (int i = 0; i < reformattedIban.length(); i++) {
            int charValue = Character.getNumericValue(reformattedIban.charAt(i));
            total = (charValue > 9 ? total * 100 : total * 10) + charValue;
            if (total > CHECK_DIGITS_MAX) {
                total = total % CHECK_DIGITS_MODULUS;
            }
        }

        return (int) (total % CHECK_DIGITS_MODULUS);
    }

    private int modulus_bci(String iban) {

        String reformattedIban = iban;

        long pi = 0;

        for (int i = 0; i < reformattedIban.length(); i++) {

            int digito = Character.getNumericValue(reformattedIban.charAt(i));
            long si = digito + pi;

            pi = (si * 10) % 97;

        }

        return (int) ((pi * 10) % CHECK_DIGITS_MODULUS);
    }
}
