
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author havelr
 */
public class SortLibMain {
    public static void main(String args[]) {
        int[] myArray = new int[10];
        char[][] myCharArray = new char[20][25];
        SortLib c2 = new SortLib();
        
        //String[] myStringArray = {"Jan","Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        

//        algorithm.FillArray(myArray);
        //algorithm.FillCharArray(myCharArray);
//        algorithm.bubbleSortString(myStringArray);
//        algorithm.insertionSortString(myStringArray);
//        algorithm.selectionSortString(myStringArray);
//        algorithm.mergeSortString(myStringArray);

//        algorithm.selectionSort(myArray); 
//        algorithm.insertionSort(myArray);
//        algorithm.bubbleSort(myArray);
//        algorithm.mergeSort(myArray);
        
//Factorial Recursion
//        System.out.printf("\nSorted Array: %s\n", Arrays.toString(myArray));
//        long n = 25;
//        long rslt = algorithm.factorial(n);
//        System.out.printf("factorial(%d) = %d\n",n, rslt);

//Mult Recursion
//        int a = 100;
//        int b = 50;
//        int rslt = algorithm.Mult(a,b);
//        System.out.printf("Mult(%d, %d) = %d\n", a, b, rslt);
        
////Fib Recursion
//          int n = 25;
//          int rslt = algorithm.fib(n);
//          System.out.printf("fib(%d) = %d\n",n, rslt);

//2D Array Sorting
        //int[][] my2DArray = new int[4][]; 
        //String[][] my2DArray = new String[4][];
        //algorithm.Fill2DArray(my2DArray); //Fills 2D Array with Ints
        
        //algorithm.Fill2DStringArray(my2DArray); //Fills 2D Array with Strings
        
//        //Prints out entire 2D Array (If needed)
//        for(int i = 0; i < my2DArray.length; i++) {
//            System.out.println(Arrays.toString(my2DArray[i]));
//        } //End for

//        algorithm.RowSortRubiks(my2DArray);
        //algorithm.ColSortRubiks(my2DArray);
        
        //algorithm.RowStringSortRubiks(my2DArray);
        //algorithm.ColStringSortRubiks(my2DArray);
        //System.out.println();
        //int[] intArray = {0,1,2,3,4,5,6,7,8,9};
        
//        int[] intArray = new int[50000000];
//        for(int index = 0; index < intArray.length; index++) {
//            intArray[index] = index;
//        }
//        
//        int output = algorithm.binarySearch(intArray, 4157275);
//        System.out.println(output);
//
//        //SwapSides practice
//        int[] anArray = {12,15,18,100,45,34,32,18,5,12};
//        int[] anArray2 = {1,2,3,4,5,6,7};
//        int[] anArray3 = {1};
//        int[] anArray4 = {10,11,12,13,14,15,16,17,9,1,2,3,4,5,6,7,8};
//        algorithm.SwapSides(anArray4);
//        System.out.println(Arrays.toString(anArray4));
          boolean isTrue = true;
        while(isTrue) {
            System.out.println("-----------------------------------");
            System.out.println("|         Choose A Method         |");
            System.out.println("|        1. Format Address        |");
            System.out.println("|        2. Hex Validation        |");
            System.out.println("|        3. Diagonal Match        |");
            System.out.println("|        4. Binary Search         |");
            System.out.println("|        5. Swap Sides            |");
            System.out.println("|        6. Non Zero Sort         |");
            System.out.println("|        7. Letters Only          |");
            System.out.println("|        8. Quit                  |");
            System.out.println("-----------------------------------");

            
            
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Pick Your Number --> ");
            int caseNumber = myScanner.nextInt();
            
            System.out.println();
            System.out.println();
                    
            
            switch(caseNumber) {
                case 8:
                    isTrue = false;
                    break;
                case 1: 
                    //Format Address
                    System.out.println("----------------");
                    System.out.println("|Format Address|");
                    System.out.println("----------------\n");
                    String[] addressArray = {"HillsboroughNJ088441499", "OaklandCA19856", "HILLSBOROUGHNJ088441499", "New YorkNY718", "OAKLANDCA19856"};
                    System.out.println(Arrays.toString(addressArray));
                    c2.formatAddrIndustrial(addressArray);
                    System.out.println(Arrays.toString(addressArray));
                    break;
                case 2:
                    //Hex Validation
                    System.out.println("----------------");
                    System.out.println("|Hex Validation|");
                    System.out.println("----------------\n");
                    String hexValues[][] = {{"Af012", "34fgH", "1234567"},{"ghikl", "34f00", "fdeAB56k"},{"Af02k", "34fbe", "f0034AB"}};
                    String tempString = "";
                    for(int index = 0; index < hexValues.length; index++) {
                    for(int j = 0; j < hexValues[0].length; j++) {
                        tempString += String.format(" %s,", hexValues[index][j]);
                    } //End for
                    tempString += String.format("\n");
                    } //End for
                    System.out.println(tempString);
                    c2.hexValidation(hexValues);
                    break;
                case 3:
                    //Diagonal Match
                    System.out.println("----------------");
                    System.out.println("|Diagonal Match|");
                    System.out.println("----------------\n");
                    int[][] myFirstArray = {{3,5,5,6},{3,9,4,5},{7,6,2,1},{3,4,8,7}};
                    int[][] mySecondArray = {{1,12,53,64,2},{8,23,53,2,9},{23,423,3,45,3},{2,43,789,7,4},{2,3,1,2,5}};
                    int[][] myThirdArray = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
                    System.out.println(c2.diagMatch(myFirstArray));
                    break;
                case 4:
                    //Binary Search
                    System.out.println("---------------");
                    System.out.println("|Binary Search|");
                    System.out.println("---------------\n");
                    int[] intArray = {1,5,7,9,11,15,23,43,52,69,75};
                    System.out.println(Arrays.toString(intArray));
                    System.out.print("Please Insert Your Targeted Number --> ");
                    int chosenNumber = myScanner.nextInt();
                    int output = c2.binarySearch(intArray, chosenNumber);
                    System.out.println("Index = " + output);
                    break;
                case 5:
                    //Swap Sides
                    System.out.println("------------");
                    System.out.println("|Swap Sides|");
                    System.out.println("------------\n");
                    int[] anArray = {12,15,18,100,45,34,32,18,5,12};
                    int[] anArray2 = {1,2,3,4,5,6,7};
                    int[] anArray3 = {1};
                    int[] anArray4 = {10,11,12,13,14,15,16,17,9,1,2,3,4,5,6,7,8};
                    int[] anArray5 = {1,2,3,4,5,6,7,8,9,10};
                    System.out.println(Arrays.toString(anArray5));
                    c2.SwapSides(anArray5);
                    System.out.println(Arrays.toString(anArray5));
                    System.out.println();
                    System.out.println(Arrays.toString(anArray2));
                    c2.SwapSides(anArray2);
                    System.out.println(Arrays.toString(anArray2));
                    break;
                case 6:
                    ///Non Zero Sort
                    System.out.println("---------------");
                    System.out.println("|Non Zero Sort|");
                    System.out.println("---------------\n");
                    int[] zeroArray = {0,0,18,0,0,0,-2,0,0,5,0,0,0,6,0,12};
                    System.out.println("Unsorted Array With Zeros: " + Arrays.toString(zeroArray));
                    c2.nonZeroSort(zeroArray);
                    System.out.println("Sorted Array With Zeros:   " + Arrays.toString(zeroArray));
                    break;
                case 7:
                    System.out.println("---------------");
                    System.out.println("| Letters Only|");
                    System.out.println("---------------\n");
                    System.out.print("\n" + "");
                    Scanner elScanner = new Scanner(System.in);
                    ArrayList<StringBuilder> myList = new ArrayList<StringBuilder>();
                    
                    //System.out.print("Please Enter the Number of Strings You Would Like to Test: ");
                    //int stringCounter = elScanner.nextInt();
                    String inputedString;
                    StringBuilder myString;
//                    for(int index = 0; index < stringCounter; index++) {
//                        System.out.println("Please Input String " + (index + 1) + ":\n");
//                        inputedString = elScanner.nextLine();
//                        myString = new StringBuilder(inputedString);
//                        myList.add(myString);
//                    } //End for
                    
                    System.out.print("Please Enter String: \n");
                    inputedString = elScanner.nextLine();
                    myString = new StringBuilder(inputedString);
                    myList.add(myString);
                    
                    System.out.println("Original String: " + myList.toString());
                    c2.lettersOnly(myList);
                    System.out.println("Formated String " + myList.toString());
                    break;

            } //End switch
            System.out.println();
            System.out.println();
        } //End while loop
    } //End main
} //End class
