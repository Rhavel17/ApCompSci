/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class C1 {
    int val01;
    String str01;
    public C1(int nbr, String str) {
        val01 = nbr;
        str01 = str;
    } //End of constructor
    
    public String toString() {
        
        String s1 = "Field val01: " + val01;
        String s2 = "Field str01: " + str01;
        return s1 + "\n" + s2;
    } //End method toString
} //End of class C1
