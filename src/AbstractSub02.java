/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
public class AbstractSub02 extends AbstractSuper{
    
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
 h = h +"\n" + this.getClass().toString()+ " has no local Instance Variables ";
return h;
}
    
}// end AbstractSub02

