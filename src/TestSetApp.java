/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
import java.util.Scanner;

public class TestSetApp {
    public static void main(String[] args) {
        Set mySetObject = new Set();
        boolean isTrue = true;
        while(isTrue) {
            System.out.println("-------------------------------------");
            System.out.println("|    1. Set A - Add/Delete Range    |");
            System.out.println("|    2. Set B - Add/Delete Range    |");
            System.out.println("|    3. Intersection of A and B     |");
            System.out.println("|    4. A\\B                         |");
            System.out.println("|    5. B\\A                         |");
            System.out.println("|    6. Print Set A                 |");
            System.out.println("|    7. Print Set B                 |");
            System.out.println("|    8. Quit                        |");
            System.out.println("-------------------------------------");
            
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Please Enter A Choice --> ");
            int caseNumber = myScanner.nextInt();
            System.out.println();
            System.out.println();
            
            switch(caseNumber) {
                case 8: 
                    isTrue = false;
                    break;
                case 1:
                    System.out.println("1) Add Range");
                    System.out.println("2) Delete Range");
                    System.out.print("Please Enter A Choice --> ");
                    int chosenNumber = myScanner.nextInt();
                    
                    if(chosenNumber == 1) {
                        System.out.println("***** Add A Range to Set A *****");
                        System.out.print("Please Enter Low Value --> ");
                        int lowNumber = myScanner.nextInt();
                        
                        System.out.print("\nPlease Enter High Value --> ");
                        int highNumber = myScanner.nextInt();
                        Range rangeObject = new Range(lowNumber, highNumber);
                        mySetObject.addRange(rangeObject);
                        System.out.println("Current Set: " + mySetObject.displaySet());
                        //System.out.println("Adding Range {" + lowNumber + "..." + highNumber + "} to Set A\n");
                    } //End if
                    
                    if(chosenNumber == 2) {
                        System.out.println("***** Delete A Range to Set A *****");
                        System.out.print("Please Enter Low Value --> ");
                        int lowNumber = myScanner.nextInt();
                        
                        System.out.print("\nPlease Enter High Value --> ");
                        int highNumber = myScanner.nextInt();
                        System.out.println("Deleting Range {" + lowNumber + "..." + highNumber + "} to Set A\n");
                    } //End if
                    break;
                case 2:
                    System.out.println("1) Add Range");
                    System.out.println("2) Delete Range");
                    System.out.print("Please Enter A Choice --> ");
                    int myChosenNumber = myScanner.nextInt();
                    
                    if(myChosenNumber == 1) {
                        System.out.println("***** Add A Range to Set B *****");
                        System.out.print("Please Enter Low Value --> ");
                        int lowNumber = myScanner.nextInt();
                        
                        System.out.print("\nPlease Enter High Value --> ");
                        int highNumber = myScanner.nextInt();
                        System.out.println("Adding Range {" + lowNumber + "..." + highNumber + "} to Set B\n");
                    } //End if
                    
                    if(myChosenNumber == 2) {
                        System.out.println("***** Delete A Range to Set B *****");
                        System.out.print("Please Enter Low Value --> ");
                        int lowNumber = myScanner.nextInt();
                        
                        System.out.print("\nPlease Enter High Value --> ");
                        int highNumber = myScanner.nextInt();
                        System.out.println("Deleting Range {" + lowNumber + "..." + highNumber + "} to Set B\n");
                    } //End if
                    break;
                    
               
                
                
                
            } //End switch
            
            
        } //End while loop
    } //End main
}
