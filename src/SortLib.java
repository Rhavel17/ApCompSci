/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Character;
/**
 *
 * @author havelr
 */
public class SortLib {
    Random rand = new Random();
    int counter;
    public void FillArray(int[] emptyList) {
        for (int index = 0; index < emptyList.length; index++) {
            emptyList[index] = rand.nextInt(100);
        } //End for
    } //End FillArray()
    public void Fill2DArray(int[][] emptyList) {
        for (int index = 0; index < emptyList.length; index++) {           
            emptyList[index] = new int[rand.nextInt(4)+1]; 
            
            for (int i = 0; i < emptyList[index].length; i++) {      
                emptyList[index][i] = rand.nextInt(100);
                counter += 1;
            } //End for
        } //End for
    } //End Fill2DArray()
    
    public void Fill2DStringArray(String[][] emptyList) {
        int stringSize = (rand.nextInt(5) + 1);
        counter = 0;
        for(int index = 0; index < emptyList.length; index++) {            
            char charString;
            String entireString = "";
            
            emptyList[index] = new String[rand.nextInt(4) + 1];
            for(int innerIndex = 0; innerIndex < emptyList[index].length; innerIndex++) {
                for(int i = 0; i < stringSize; i++) {
                    charString = (char) (rand.nextInt(26) + 97);
                    entireString += Character.toString(charString);
                } //End inner nested for
                emptyList[index][innerIndex] = entireString;
                counter += 1;
                entireString = "";
            } //End nested for
        } //End for
    } //End Fill2DStringArray
    public void FillCharArray(char[][] emptyList) {
        String msg;
        String entireMsg = "";
        for (int index = 0; index < emptyList.length; index++) {
            for (int innerIndex = 0; innerIndex < emptyList[index].length; innerIndex++) {
                char letter = (char) (rand.nextInt(26) + 97);
                emptyList[index][innerIndex] = letter;
                msg = String.format("%2c", letter);
                entireMsg = entireMsg + msg;
            } //End for
            entireMsg = entireMsg + "\n";
        } //End for
        System.out.print(entireMsg);
    } //End FillCharArray
    public void selectionSort(int[] myList) {
        int tempElement;
        int indexOfMin;
        //System.out.println("------Selection Sort Algorithm------\n");
        //System.out.println("myArray = " + Arrays.toString(myList) + "\n");
        for (int currentIndex = 0; currentIndex < myList.length-1; currentIndex++) {
            indexOfMin = currentIndex;
            for (int i = currentIndex +1; i < myList.length; i++) {
                if (myList[indexOfMin] > myList[i]) {
                    indexOfMin = i;
                } //End if
            }
            if (currentIndex != indexOfMin) {
                tempElement = myList[currentIndex];
                myList[currentIndex] = myList[indexOfMin];
                myList[indexOfMin] = tempElement;
                //System.out.println("Swapped " + myList[indexOfMin] + " and " + myList[currentIndex] + " " + Arrays.toString(myList));
            } //End if
        } //End for
    } //End selectionSort
    public void insertionSort(int[] myList) {
        int tempElement;
        int currentElement;
        System.out.println("------Insertion Sort Algorithm------\n");
        System.out.println("myArray = " + Arrays.toString(myList) +"\n");

        for (int pass = 0; pass < myList.length - 1; pass++) {

            for (int nextIndex = pass + 1; nextIndex < myList.length && nextIndex > 0; nextIndex--) {
                currentElement = nextIndex - 1;
                if (myList[nextIndex] < myList[currentElement]) {
                    tempElement = myList[nextIndex];
                    myList[nextIndex] = myList[currentElement];
                    myList[currentElement] = tempElement;
                    System.out.println("Pass " + pass + " " + Arrays.toString(myList));
                } //End if
            } //End for
            System.out.printf("\n");
            
        } //End for
    } //End insertionSort
    public void bubbleSort(int[] myList) {
        int tempElement;
        int currentElement;
        System.out.println("-------Bubble Sort Algorithm-------\n");
        System.out.println("myArray = " + Arrays.toString(myList) + "\n");

       for (int pass = 0; pass < myList.length; pass++) {
            
            for (int nextIndex = 1; nextIndex < myList.length && nextIndex > 0; nextIndex++) {
                currentElement = nextIndex - 1;
                if (myList[nextIndex] < myList[currentElement]) {
                    tempElement = myList[nextIndex];
                    myList[nextIndex] = myList[currentElement];
                    myList[currentElement] = tempElement;
                    System.out.println(Arrays.toString(myList));
                } //End if
            } //End for
        } //End for
       
        if (myList[0] > myList[1]) {
            tempElement = myList[1];
            myList[1] = myList[0];
            myList[0] = tempElement;
        } //End bubbleSort
    } //End bubbleSort
    public void mergeSort(int[] myArray) {
        System.out.printf("Original Array: %s\n",Arrays.toString(myArray));
        int[] a = Arrays.copyOfRange(myArray, 0, (myArray.length/2));
        int[] b = Arrays.copyOfRange(myArray, myArray.length/2, myArray.length);

        System.out.println("Split Arrays:");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
        this.selectionSort(a);
        this.selectionSort(b);
        
        System.out.println("Sorted Split Arrays:");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int indexOfA = 0;
        int indexOfB = 0;
        int incrementedIndex = 2;   //A = 0    B = 1
        for(int indexOfOriginal = 0; indexOfOriginal < myArray.length; indexOfOriginal++) {
            

            if(indexOfA < a.length & indexOfB < b.length && a[indexOfA] <= b[indexOfB]) {
                myArray[indexOfOriginal] = a[indexOfA];
                System.out.printf("Added Number: %d\n", a[indexOfA]);

                incrementedIndex = 0;
            } //End of if
            if(indexOfA < a.length & indexOfB < b.length && a[indexOfA] > b[indexOfB]) {
                myArray[indexOfOriginal] = b[indexOfB];
                System.out.printf("Added Number: %d\n", b[indexOfB]);

                incrementedIndex = 1;

            } //End of if

            if(indexOfA >= a.length)  {
                myArray[indexOfOriginal] = b[indexOfB];
                incrementedIndex = 1;
            } //End if
            if(indexOfB >= b.length) {
                myArray[indexOfOriginal] = a[indexOfA];
                incrementedIndex = 0;
            } //End if
       
            if(incrementedIndex == 0)
                indexOfA++;
            if(incrementedIndex == 1)
                indexOfB++;
           
                
        } //End of for
        
    } //End mergeSort
    
    public long factorial(long n) {
        if(n==0) {
            return 1;
        } //End if
        else {
            return n * factorial(n-1);
        } //End else
        
        
    } //End factorial
    public int Mult(int a, int b) {
        if(b==1) {
            return a;
        } //End if
        else {
            return a + Mult(a,b-1);
        } //End else
    } //End Mult
    public int fib(int n) {
        if (n == 1) {
            return 0;
        } //End if
        if (n == 2) {
            return 1;
        } //End if
        else {
            return (fib(n-1) + fib(n-2));
        } //End else
    } //End fib
    public void bubbleSortString(String[] myList) {
        String tempElement = "";
        int currentElement;
        System.out.println("-------Bubble Sort Algorithm-------\n");
        System.out.println("myArray = " + Arrays.toString(myList) + "\n");

       for (int pass = 0; pass < myList.length; pass++) {
            
            for (int nextIndex = 1; nextIndex < myList.length && nextIndex > 0; nextIndex++) {
                currentElement = nextIndex - 1;
                
                if (myList[nextIndex].compareToIgnoreCase(myList[currentElement]) < 0) {
                    tempElement = myList[nextIndex];
                    myList[nextIndex] = myList[currentElement];
                    myList[currentElement] = tempElement;
                    System.out.println(Arrays.toString(myList));
                } //End if
            } //End for    
        } //End for
    /*
        if (myList[0].compareToIgnoreCase(myList[1]) > 0) {
            tempElement = myList[1];
            myList[1] = myList[0];
            myList[0] = tempElement;
*/
    } //End bubbleSortString

    public void insertionSortString(String[] myList) {
        String tempElement;
        int currentElement;
        System.out.println("------Insertion Sort Algorithm------\n");
        System.out.println("myArray = " + Arrays.toString(myList) +"\n");

        for (int pass = 0; pass < myList.length - 1; pass++) {

            for (int nextIndex = pass + 1; nextIndex < myList.length && nextIndex > 0; nextIndex--) {
                currentElement = nextIndex - 1;
                
                if (myList[currentElement].compareToIgnoreCase(myList[nextIndex]) > 0) {
                //if (myList[nextIndex] < myList[currentElement]) {
                    tempElement = myList[nextIndex];
                    myList[nextIndex] = myList[currentElement];
                    myList[currentElement] = tempElement;
                    System.out.println("Pass " + pass + " " + Arrays.toString(myList));
                } //End if
            } //End for
            System.out.printf("\n");
            
        } //End for
    } //End insertionSortString
    
    public void selectionSortString(String[] myList) {
        String tempElement;
        int indexOfMin;
        //System.out.println("------Selection Sort Algorithm------\n");
        //System.out.println("myArray = " + Arrays.toString(myList) + "\n");
        for (int currentIndex = 0; currentIndex < myList.length-1; currentIndex++) {
            indexOfMin = currentIndex;
            for (int i = currentIndex +1; i < myList.length; i++) {
                
                if (myList[i].compareToIgnoreCase(myList[indexOfMin]) < 0) {
                //if (myList[indexOfMin] > myList[i]) {
                    indexOfMin = i;
                } //End if
            }
            if (currentIndex != indexOfMin) {
                tempElement = myList[currentIndex];
                myList[currentIndex] = myList[indexOfMin];
                myList[indexOfMin] = tempElement;
                //System.out.println("Swapped " + myList[indexOfMin] + " and " + myList[currentIndex] + " " + Arrays.toString(myList));
            } //End if
        } //End for
    } //End selectionSortString
    
    public void mergeSortString(String[] myArray) {
        System.out.printf("Original Array: %s\n",Arrays.toString(myArray));
        String[] a = Arrays.copyOfRange(myArray, 0, (myArray.length/2));
        String[] b = Arrays.copyOfRange(myArray, myArray.length/2, myArray.length);

        System.out.println("Split Arrays:");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
        this.selectionSortString(a);
        this.selectionSortString(b);
        
        System.out.println("Sorted Split Arrays:");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int indexOfA = 0;
        int indexOfB = 0;
        int incrementedIndex = 2;   //A = 0    B = 1
        for(int indexOfOriginal = 0; indexOfOriginal < myArray.length; indexOfOriginal++) {
            

            if(indexOfA < a.length & indexOfB < b.length && b[indexOfB].compareToIgnoreCase(a[indexOfA]) >= 0) {
            //if(indexOfA < a.length & indexOfB < b.length && a[indexOfA] <= b[indexOfB]) {
                myArray[indexOfOriginal] = a[indexOfA];
                System.out.printf("Added Number: %s\n", a[indexOfA]);

                incrementedIndex = 0;
            } //End of if
            
            if(indexOfA < a.length & indexOfB < b.length && b[indexOfB].compareToIgnoreCase(a[indexOfA]) < 0) {
            //if(indexOfA < a.length & indexOfB < b.length && a[indexOfA] > b[indexOfB]) {
                myArray[indexOfOriginal] = b[indexOfB];
                System.out.printf("Added Number: %s\n", b[indexOfB]);

                incrementedIndex = 1;

            } //End of if

            if(indexOfA >= a.length)  {
                myArray[indexOfOriginal] = b[indexOfB];
                incrementedIndex = 1;
            } //End if
            if(indexOfB >= b.length) {
                myArray[indexOfOriginal] = a[indexOfA];
                incrementedIndex = 0;
            } //End if
       
            if(incrementedIndex == 0)
                indexOfA++;
            if(incrementedIndex == 1)
                indexOfB++;
           
                
        } //End of for
        System.out.println(Arrays.toString(myArray));
    } //End mergeSort
    public void RowSortRubiks(int my2DArray[][]) {
        int[] my1DArray = new int[counter];
        int counter1D = 0;
        int counter2D = 0;
        String msg;
        String entireMsg = "";
        
        //Fill 1D Array with elements in 2D Array
        for(int index = 0; index < my2DArray.length; index++) {
            for(int i = 0; i < my2DArray[index].length; i++) {
                counter1D += 1;
                my1DArray[counter1D-1] = my2DArray[index][i];
                msg = String.format("%3d", my2DArray[index][i]);
                entireMsg += msg;
            } //End for
            entireMsg += "\n";
        } //End for
        
        System.out.println(entireMsg);
        //Sort 1D Array
        this.selectionSort(my1DArray);
        
        entireMsg = "";
        //Sort 2D Array
        for(int index = 0; index < my2DArray.length; index++) { 
            for(int i = 0; i < my2DArray[index].length; i++) {
                my2DArray[index][i] = my1DArray[counter2D];
                counter2D += 1;
                msg = String.format("%3d", my2DArray[index][i]);
                entireMsg += msg;
            } //End for
            entireMsg += "\n";
        } //End for   
        System.out.println(entireMsg);
    } //End RowSortRubiks
    
    public void ColSortRubiks(int[][] my2DArray) {
        int[] my1DArray = new int[counter];
        int counter1D = 0;
        String msg;
        String entireMsg = "";
        
        //Fill 1D Array with elements in 2D Array
        for(int index = 0; index < my2DArray.length; index++) {
            for(int i = 0; i < my2DArray[index].length; i++) {
                counter1D += 1;
                my1DArray[counter1D-1] = my2DArray[index][i];
                msg = String.format("%3d", my2DArray[index][i]);
                entireMsg += msg;
            } //End for
            entireMsg += "\n";
        } //End for
        
        System.out.println(entireMsg);
        //Sort 1D Array
        this.selectionSort(my1DArray);
        
        //System.out.println(Arrays.toString(my1DArray));   <-- Only for checking purposes
        //Sort 2D Array
        int j = 0; //Counter for length of inner array
        int c = 0; //Counter for 1D Array
        entireMsg = "";
        for(int index = 0; index < my2DArray.length & c < my1DArray.length; index++) {
            
//        //Check    
//            System.out.printf("\nj = %d", j);
//            System.out.printf("\nc = %d", c);
//            System.out.printf("\nindex = %d\n", index);
//            for(int ind = 0; ind < my2DArray.length; ind++) {
//            System.out.println(Arrays.toString(my2DArray[ind]));
//            } //End for
//        //End Check
        
        
            if(j < my2DArray[index].length) {
                my2DArray[index][j] = my1DArray[c];
                c += 1;
            } //End if
            
            if(index + 1 == my2DArray.length) {
                index = -1;
                j += 1;
            } //End if
            
        } //End for
       
        entireMsg = "";
       for(int index = 0; index < my2DArray.length; index++) {
           for(int i = 0; i < my2DArray[index].length; i++) {
               entireMsg += String.format("%3d", my2DArray[index][i]);
           } //End nestted for
           entireMsg += "\n";
       } //End for
       System.out.println(entireMsg);
    } //End ColSortRubiks
    public void RowStringSortRubiks(String my2DArray[][]) {
        String[] my1DArray = new String[counter];
        int counter1D = 0;
        int counter2D = 0;
        String msg;
        String entireMsg = "";

        //Fill 1D Array with elements in 2D Array
        for(int index = 0; index < my2DArray.length; index++) {
            for(int i = 0; i < my2DArray[index].length; i++) {  
                counter1D += 1;
                my1DArray[counter1D-1] = my2DArray[index][i];
                msg = String.format("%s ", my2DArray[index][i]);
                entireMsg += msg;
            } //End for
            entireMsg += "\n";
        } //End for
        
        //Print statements
        System.out.println(entireMsg);
        System.out.println(Arrays.toString(my1DArray));
        System.out.println();
        
        //Sort 1D Array
        this.selectionSortString(my1DArray);
        
        //Print sorted 1D Array
        System.out.println(Arrays.toString(my1DArray));
        System.out.println();
        
        //Resets entireMsg
        entireMsg = "";
        
        //Sort 2D Array
        for(int index = 0; index < my2DArray.length; index++) { 
            for(int i = 0; i < my2DArray[index].length; i++) {
                my2DArray[index][i] = my1DArray[counter2D];
                counter2D += 1;
                msg = String.format("%s ", my2DArray[index][i]);
                entireMsg += msg;
            } //End for
            entireMsg += "\n";
        } //End for   
        System.out.println(entireMsg);
    } //End RowSortRubiks
    
    public void ColStringSortRubiks(String[][] my2DArray) {
        String[] my1DArray = new String[counter];
        int counter1D = 0;
        String msg;
        String entireMsg = "";
        
        //Fill 1D Array with elements in 2D Array
        for(int index = 0; index < my2DArray.length; index++) {
            for(int i = 0; i < my2DArray[index].length; i++) {
                counter1D += 1;
                my1DArray[counter1D-1] = my2DArray[index][i];
                msg = String.format("%s ", my2DArray[index][i]);
                entireMsg += msg;
            } //End for
            entireMsg += "\n";
        } //End for
        
        System.out.println(entireMsg);
        System.out.println();
        System.out.println(Arrays.toString(my1DArray));
        //Sort 1D Array
        this.selectionSortString(my1DArray);
        
        System.out.println(Arrays.toString(my1DArray));
        System.out.println();
        //Sort 2D Array
        int j = 0; //Counter for length of inner array
        int c = 0; //Counter for 1D Array
        entireMsg = "";
        for(int index = 0; index < my2DArray.length & c < my1DArray.length; index++) {

            if(j < my2DArray[index].length) {
                my2DArray[index][j] = my1DArray[c];
                c += 1;
            } //End if
            
            if(index + 1 == my2DArray.length) {
                index = -1;
                j += 1;
            } //End if
            
        } //End for
       
        entireMsg = "";
       for(int index = 0; index < my2DArray.length; index++) {
           for(int i = 0; i < my2DArray[index].length; i++) {
               entireMsg += String.format("%s ", my2DArray[index][i]);
           } //End nestted for
           entireMsg += "\n";
       } //End for
       System.out.println(entireMsg);
    } //End ColSortRubiks
    public void recursionBinarySearch(int[] myArray, int desiredValue) {
        if(desiredValue == myArray[myArray.length/2]) {
            //return myArray.length/2;
            System.out.println(myArray.length/2);
        } //End if
        else {
            if(desiredValue < myArray[myArray.length/2]) {
                myArray = Arrays.copyOfRange(myArray, 0, myArray.length/2);
                recursionBinarySearch(myArray, desiredValue);
            } //End if
            if(desiredValue > myArray[myArray.length/2]) {
                myArray = Arrays.copyOfRange(myArray, (myArray.length/2) + 1, myArray.length);
                recursionBinarySearch(myArray, desiredValue);
            } //End if
        } //End else
        
    } //End recursionBinarySearch
    public int binarySearch(int[] myArray, int desiredValue) {
        int index = 0;
        int counter = 0;
        int[] tempArray = Arrays.copyOfRange(myArray, 0, myArray.length);
        //System.out.printf("desiredValue = %d\n", desiredValue);
        if(desiredValue == tempArray[tempArray.length/2])
            index = myArray.length/2;
        else {
            
            while(tempArray.length >= 2) {
                //System.out.printf("index = %d\n", index);
                //System.out.printf("tempArray = %s\n", Arrays.toString(tempArray));
                counter += 1;
                if(desiredValue <= tempArray[tempArray.length/2 -1]) {
                    tempArray = Arrays.copyOfRange(tempArray, 0, tempArray.length/2);
                    //System.out.printf("Changed tempArray = %s\n\n", Arrays.toString(tempArray));
                } //End nested if statement within while
                //if(desiredValue > tempArray[tempArray.length/2 - 1]) {
                else {
                    index += tempArray.length/2;
                    tempArray = Arrays.copyOfRange(tempArray, tempArray.length/2, tempArray.length);
                    //System.out.printf("Changed index = %d\n", index);
                    //System.out.printf("Changed tempArray = %s\n\n", Arrays.toString(tempArray));
                } //End nested else statement within while
            } //End nested while statement           
        } //End else statement within else statement
        
        if(desiredValue != tempArray[0])
                index = -1;
        //System.out.printf("Counter = %d\n", counter);
        return index;
    } //End binarySearch 
    public void SwapSides(int[] myArray) {
        if(myArray.length%2==0) {
            int tempElement;
            tempElement = myArray[myArray.length/2-1];
            myArray[myArray.length/2-1] = myArray[myArray.length/2];
            myArray[myArray.length/2] = tempElement;
        } //End tempif
            //for(int i = 0, j = myArray.length/2 + 1; j < myArray.length; i++, j++) {
              //  tempElement = myArray[i];
                //myArray[i] = myArray[j];
                //myArray[j] = tempElement;
            //} //End for
        //} //End if
        //else {
            int tempElement;
            for(int i = 0, j = myArray.length/2 + 1; j < myArray.length; i++, j++) {
                tempElement = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = tempElement;
            } //End for
        //} //End else
    } //End SwapSides
    public void formatAddrIndustrial(String[] myArray) {
        for(int index = 0; index < myArray.length; index++) {
            StringBuffer tempString = new StringBuffer(myArray[index]);
            int zipLength = 0;
            int ifCounter = 0;
            for(int i = tempString.length()-1; i > 0; i--) {
                if((int) tempString.charAt(i)> 47 & (int) tempString.charAt(i) < 58) {
                    zipLength += 1;
                } //End if
                if(ifCounter == 0 & Character.isUpperCase(tempString.charAt(i)) & Character.isUpperCase(tempString.charAt(i-1))) {
                    ifCounter += 1;
                    tempString.insert(i+1," ");
                    tempString.insert(i-1," ");
                    tempString.insert(i-1,",");
                } //End if
            } //End nested for
            if(zipLength == 9) {
                tempString.insert((tempString.length() - 4), "-");
            } //End if
            myArray[index] = tempString.toString();
        } //End for
    } //End formatAddrIndustrial
    public String[] hexValidation(String[][]  myArray) {
        ArrayList<String> elementLocation = new ArrayList<String>();
        String keyString = " 0 1 2 3 4 5 6 7 8 9 A B C D E F a b c d e f ";
        String tempString;
        String outputString = "";
        for(int colIndex = 0; colIndex < myArray.length; colIndex++) {

            for(int rowIndex = 0; rowIndex < myArray[colIndex].length; rowIndex++) {
                boolean isCorrect = false;
                for(int index = 0; index < myArray[colIndex][rowIndex].length(); index++) { 
                    CharSequence myChar = " " + myArray[colIndex][rowIndex].charAt(index) + " "; //swapped row and col
                    if(!keyString.contains(myChar)) {
                        isCorrect = true;
                    } //End if
                } //End nested for
                if(isCorrect) {
                    tempString = "["+ colIndex + "," + rowIndex + "]";
                    elementLocation.add(tempString);
                    outputString += String.format("Ïnvalid Hex Value %s in Row %d Col %d\n", myArray[colIndex][rowIndex], colIndex, rowIndex);
                } //End nested if
            } //End rowIndex for
        } //End colIndex for
        Object[] finalArray = elementLocation.toArray();
        String[] finalStringArray = Arrays.copyOf(finalArray, finalArray.length, String[].class);
        System.out.println(outputString);
        return finalStringArray;
    } //End hexValidation
    public String diagMatch(int[][] myArray) {
        String finalString = "";
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int[] rowSums = new int[myArray.length];
        int[] colSums = new int[myArray[0].length]; //Works for all cols b/c its a square array
        int tempRowSum = 0;
        int tempColSum = 0;
        boolean hasMatch = false;
        for(int index = 0; index < myArray.length; index++) {   //Outputs String of 2d Array
            for(int j = 0; j < myArray[0].length; j++) {
                finalString += String.format("%4s,", myArray[index][j]);
            } //End for
            finalString += String.format("\n");
            
        } //End for
        for(int i = 0, j = myArray.length-1; j >= 0 & i < myArray.length; i++, j--) {
            leftDiagonal += myArray[i][i];
            rightDiagonal += myArray[i][j];
        } //End leftDiagonal and righDiagonal for
        for(int index = 0; index < myArray.length; index++) {
            tempRowSum = 0;
            tempColSum = 0;
            for(int j = 0; j < myArray[0].length; j++) {
                tempRowSum += myArray[index][j];
                tempColSum += myArray[j][index];
            } //End nested for
            colSums[index] = tempColSum;
            rowSums[index] = tempRowSum;
//            if(leftDiagonal == tempRowSum) {
//                finalString += String.format("\nleftDiagonal equals Row %d = %d", index + 1, tempRowSum);
//            } //End nested if
//            if(rightDiagonal == tempRowSum) {
//                finalString += String.format("\nrightDiagonal equals Row %d = %d", index + 1, tempRowSum);
//            } //End nested if
//            if(leftDiagonal == tempColSum) {
//                finalString += String.format("\nleftDiagonal equals Col %d = %d", index + 1, tempColSum);
//            } //End nested if
//            if(rightDiagonal == tempColSum) {
//                finalString += String.format("\nrightDiagonal equals Col %d = %d", index + 1, tempColSum);
//            } //End nested if
        } //End for
        for(int index = 0; index < rowSums.length; index++) {  //Don't need to check for length of colSums since they are same length
            if(leftDiagonal == rowSums[index]) {
                finalString += String.format("leftDiagonal equals Row %d = %d\n", index + 1, rowSums[index]);
                hasMatch = true;
            } //End leftDiag if
            if(rightDiagonal == rowSums[index]) {
                finalString += String.format("rightDiagonal equals Row %d = %d\n", index + 1, rowSums[index]);
                hasMatch = true;
            } //End rightDiag if
            
            
        } //End for
        for(int index = 0; index < colSums.length; index++) {
            if(leftDiagonal == colSums[index]) {
                finalString += String.format("leftDiagonal equals Col %d = %d\n", index + 1, colSums[index]);
                hasMatch = true;
            } //End leftDiag if
            if(rightDiagonal == colSums[index]) {
                finalString += String.format("rightDiagonal equals Col %d = %d\n", index + 1, colSums[index]);
                hasMatch = true;
            } //End rightDiag if
        } //End for
        if(!hasMatch) {
            finalString += String.format("No Matches Found:\n");
            finalString += String.format("Left Diagonal Sum = %d\n", leftDiagonal);
            finalString += String.format("Right Diagonal Sum = %d\n", rightDiagonal);
        } //End if
        for(int index = 0; index < rowSums.length & !hasMatch; index++) {
            finalString += String.format("Row %d Sum = %d\n", index + 1, rowSums[index]);
        } //End for
        for(int index = 0; index < colSums.length & !hasMatch; index++) {
            finalString += String.format("Col %d Sum = %d\n", index + 1, colSums[index]);
        } //End for
        return finalString;
    } //End diagMatch
    public void nonZeroSort(int[] originalArray) {
        int counter = 0;
        for(int i = 0; i < originalArray.length; i++) {
            if(originalArray[i] != 0)
                counter += 1;
        } //End for
        int[] nonZeroArray = new int[counter];
        int secondCounter = -1;
        for(int index = 0; index < originalArray.length; index++) {
            if(originalArray[index] != 0) {
                secondCounter += 1;
                nonZeroArray[secondCounter] = originalArray[index];
            } //End if
        } //End for
        this.selectionSort(nonZeroArray); //Sorts Array
        int thirdCounter = -1;
        for(int ind = 0; ind < originalArray.length; ind++) {
            if(originalArray[ind] != 0) {
                thirdCounter += 1;
                originalArray[ind] = nonZeroArray[thirdCounter];
            } //End if
        } //End for
    } //End nonZeroSort
    public void lettersOnly(ArrayList<StringBuilder> myList) {
        for(int index = 0; index < myList.size(); index++) {
            StringBuilder myString = new StringBuilder(myList.get(index));
            StringBuilder tempString = new StringBuilder();
            for(int sbIndex = myString.length() - 1; sbIndex >= 0; sbIndex--) {
                
                if(!Character.isLetter(myString.charAt(sbIndex))) {
                    tempString.append(myString.charAt(sbIndex));
                    myString.deleteCharAt(sbIndex);
                } //End if
                //myString.append(tempString);
            } //End  nested for
            myString.append(tempString);
            if(tempString.length() != 0)
                tempString.delete(0, tempString.length() - 1);
            myList.remove(index);
            myList.add(index, myString);
        } //End for
    } //End lettersOnly
    
    
    
    
} //End class SortLib
