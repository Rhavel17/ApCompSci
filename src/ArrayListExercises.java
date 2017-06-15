/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author havelr
 */
public class ArrayListExercises {
    public static void main(String args[]) {

      
      /*
      //Exercise 1
        Random rand = new Random();
        ArrayList<Double> dbList = new ArrayList<>();
        String outputMsg = "";
        
        for(int i = 0; i < 20; i++) {
            if(i != 0 & i % 4 == 0) {
                outputMsg = outputMsg + "\n";
            } //end if
            double randDouble = (rand.nextDouble()*10000 + 1);
            dbList.add(randDouble);
            outputMsg = outputMsg + String.format(" %10.5f |", randDouble);
        } //end for
        System.out.println(outputMsg);
      */
      
      /*
      //Exercise 2
        Random rand = new Random();
        Double[] dbArray = new Double[20];
        ArrayList<Double> dbList = new ArrayList<>();
        
        for(int i = 0; i < 20; i++) {
            double randDouble = rand.nextDouble()*10000 + 1;
            dbArray[i] = randDouble;
        } //end for
        dbList.addAll(Arrays.asList(dbArray));
        System.out.printf("dbArray: %s\n", Arrays.toString(dbArray));
        System.out.println("dbList:  " + dbList);
      */
      /*
      //Exercise 3
        Random rand = new Random();
        ArrayList<ArrayList<Character>> myList = new ArrayList<ArrayList<Character>>();
        ArrayList<Character> tempList = new ArrayList<Character>();
        String msg;
        String entireMsg = "";
        int colSize = rand.nextInt(8) + 1;
        int rowSize = rand.nextInt(8) + 1;
        
        for(int colIndex = 0; colIndex < colSize; colIndex++) {
            for(int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
                char letter = (char) (rand.nextInt(26) + 97);
                tempList.add(letter);
                msg = String.format("%2c", letter);
                entireMsg = entireMsg + msg;
            } //End for
            myList.add(tempList);
            entireMsg = entireMsg + "\n";
        } //End for
        System.out.println(entireMsg);
      */
      
      /*
      //Exercise 4
        Random rand = new Random();
        ArrayList<ArrayList<Double>> myList = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> tempList = new ArrayList<Double>();
        String msg;
        String entireMsg = "";
        int colSize = rand.nextInt(20) + 1;
        int  rowSize = rand.nextInt(8) + 1;
        
        for(int colIndex = 0; colIndex < colSize; colIndex++) {
            for(int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
                double number = (rand.nextDouble()*10 + 1);
                tempList.add(number);
                msg = String.format("| %6.3f |", number);
                entireMsg = entireMsg + msg;
            } //End for
            myList.add(tempList);
            entireMsg = entireMsg + "\n";
        } //End for
        System.out.println(entireMsg);
      */
      
    } //End method main
} //End class
