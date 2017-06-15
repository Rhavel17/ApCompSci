/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class IPCalculator {
    
    final int BASE_10 = 10;
    final int BASE_2 = 2;
    final int BASE_16 = 16;
    
    public boolean verifyBase(String input, int base) {
        String possibleHexChars = "0123456789abcdefABCDEF";
        boolean isCorrect = true;
        
        for(int index = 0; index < input.length() && isCorrect == true; index++) {
            char character = input.charAt(index);
            if ( base == BASE_10 && Character.isDigit(character) == false) {
                isCorrect = false;
            }
            if (base == BASE_16) {
                if (!possibleHexChars.contains(String.valueOf(character))) {
                    isCorrect = false;
                } // end of if statement
            } // end of if statement
            if (base == BASE_2) {
                if ((int) character != 48 && (int) character != 49) {
                    isCorrect = false;
                } //end of if
            } // end of if
        } //end for statement
        return isCorrect;
    } // end method verifyBase()
    public String binaryConv(String nbr, int base) {
        String number = nbr;

        if (base == BASE_10) {
            number = Long.toString(Long.parseLong(nbr, 2));
        } // end of if statement
        if (base == BASE_16) {
            number = Long.toHexString(Long.parseLong(nbr));
        }
        return number;
    } // end method binaryConv()
    public String decimalConv(String nbr, int base) {
        String number = nbr;
        
        if (base == BASE_2) {
            number = Long.toBinaryString(Long.parseLong(nbr));
        } // end of if statement
        if (base == BASE_16) {
            number = Long.toHexString(Long.parseLong(nbr));
        } // end of if statement
        return number;
    } // end method decimalConv()
    public String hexConv(String nbr, int base) {
        String number = nbr;
        
        if (base == BASE_2) {
            number = Long.toBinaryString(Long.parseLong(nbr, 16));
        } // end of if statement
        if (base == BASE_10) {
            number = Long.toString(Long.parseLong(nbr, 16));
        } // end of if statement
        return number;
    } // end of method hexConv()
} // end class IPCalculator
