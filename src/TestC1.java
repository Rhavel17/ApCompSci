/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class TestC1 {
    public static void main(String args[]) {
        C1 myC1 = new C1(4, "Hello World");
        System.out.printf("Field val01: %d\n", myC1.val01);
        System.out.printf("Field str01: %s\n", myC1.str01);
        System.out.println("\nObject State:\n" + myC1);
    } //End method main
} //End class TestC1
