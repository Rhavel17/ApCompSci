/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class AbstractSub01 extends AbstractSuper{
    String sub01 = "Sub01value";
    float flt01 = 01.01010101F;
        
    public void methA()
    {
    System.out.println("Print for "+ this.getClass().toString());
    
    }// end methA
    
    public void methB()
    {
    System.out.println("SubClass Method B Print for "+ this.getClass().toString());
    
    }// end methB
    
@Override
public String toString()
{
String h = super.toString();
 h = h + "\nObject of " + this.getClass().toString()+ " Non-Inherited Instance Variables are ";
h = h + "sub01 = "+ sub01 + " flt01 = "+flt01;
return h;
}
    
}// end AbstractSub01


