/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class TestAbstract {
    public static void main(String args[])
    {
    AbstractSub01 a01 = new AbstractSub01();
    AbstractSub02 a02 = new AbstractSub02();
    AbstractSub03 a03 = new AbstractSub03();
    AbstractSuper players[] = new AbstractSuper[3];
    
    players[0] = a01;
    players[1] = a02;
    players[2] = a03;
    
    for(int i = 0; i<players.length; i++) {
        players[i].methA();
    } //End of for 
    
    
//    a01.methB();
//    a02.methB();
//    a03.methB();
    a01.methC();
    System.out.println(a01);
    System.out.println(a02);
    System.out.println(a03);
    
    
    }// end main
}// end TestAbstract

