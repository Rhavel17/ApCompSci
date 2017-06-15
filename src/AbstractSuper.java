/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public abstract class AbstractSuper {


String s01 = "ABCE";
int nbr01 = 12345;


public abstract void methA();

public void methB()
    {
    System.out.println("SuperClass Method B Print for "+ this.getClass().toString());
    
    }// end methB


public void methC()
    {
    System.out.println("SuperClass Method C Print for "+ this.getClass().toString());
    
    }// end methC


@Override
public String toString()
{
String h = "\n" + this.getClass().toString()+ 
        " Instance Variables Inherited from the SuperClass are : ";
h = h + "s01 = "+ s01 + " nbr01 = "+nbr01;
return h;
}




}// end AbstractSuper
