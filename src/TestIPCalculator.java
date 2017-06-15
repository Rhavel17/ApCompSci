/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class TestIPCalculator {
    public static void main(String args[]) {
        String input = "4abc";
        int base = 10;
        IPCalculator myCalculator = new IPCalculator();
        
        System.out.println(myCalculator.hexConv(input, base));
    } //end method main
} //end class TestIPCalculator
