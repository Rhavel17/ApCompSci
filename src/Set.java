/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/*
 *
 * @author havelr
 */
public class Set {
    private ArrayList<Range> rangeList = new ArrayList<Range>();
    
    public String displaySet() {
        String finalString = "{";
        for(int index = 0; index < rangeList.size(); index++) {
            finalString += "(" + rangeList.get(index).getRangeMin() + " ... " + rangeList.get(index).getRangeMax() + ")";
            if(index != rangeList.size() - 1)
                finalString += " , ";
        } //End for
        finalString += "}";
        finalString += "\nSize: " + rangeList.size();
        return finalString;
    } //End String
    public boolean isEmpty() {
        return rangeList.isEmpty();
    } //End isEmpty
    
    public int getElementCount() {
        int sumOfElements = 0;
        for(int index = 0; index < rangeList.size(); index ++) {
            sumOfElements += rangeList.get(index).getRangeSize();
        } //End for
        return sumOfElements;
    } //End getElementCount
    
    public int getLargestElement() {
        int number;
        number = rangeList.get(rangeList.size() - 1).getRangeMax();
        return number;
    } //End getLargestElement
    
    public int getSmallestElement() {
        int number; 
        number = rangeList.get(0).getRangeMin();
        return number;
    } //End getSmallestElement
    
    public int addRange(Range myObject) {
        int number = 0; // 1 if range was added   2 if partial add   -1 if nothing was added
        
        //Adds object to set if set is empty
        if(rangeList.isEmpty()) {
            rangeList.add(myObject);
            number = 1;
        } //End if
        
        for(int index = 0; index <= (rangeList.size() - 1) & number == 0; index++) { //Originally was rangeList.size() - 1
            
            if(myObject.getRangeMin() > (rangeList.get(index).getRangeMax() + 1) & index == (rangeList.size() - 1)) {
                rangeList.add(myObject);
                number = 1;
            } //End if
               
            //Adds element in correct position if it is directly inbetween two other elements
            if( myObject.getRangeMin() > (rangeList.get(index).getRangeMax() + 1) & myObject.getRangeMax() < (rangeList.get(index + 1).getRangeMin() - 1)) {
                rangeList.add(index + 1, myObject);
                number = 1;
            } //End if
            
            //Extends the range of a set element if the currently reviewed object's 'low' doesn't already exist in the set but its 'high' does
            if(myObject.getRangeMin() > (rangeList.get(index).getRangeMax() + 1) & rangeList.get(index+1).isInRange(myObject.getRangeMax()) & !rangeList.get(index+1).isInRange(myObject.getRangeMin())) {
                int upperBound = rangeList.get(index+1).getRangeMax();
                int lowerBound = myObject.getRangeMin();
                
                //Creates updated Range object
                Range updatedRange = new Range(lowerBound, upperBound);
                
                //Appends updated Range object in between the current and next (obsolete) set element
                rangeList.add(index+1, updatedRange);
                
                //Deletes obsolete set element that contains the incorrect low and high range values
                rangeList.remove(index+2);
                
                number = 2;
            } //End if
            
            //Extends the range of a set element if the currently reviewed object's 'high' doesn't already exist in the set but its 'low' does
            if(rangeList.get(index).isInRange(myObject.getRangeMin()) & myObject.getRangeMax() < (rangeList.get(index+1).getRangeMin() - 1) & !rangeList.get(index).isInRange(myObject.getRangeMax())) {
                int upperBound = myObject.getRangeMax();
                int lowerBound = rangeList.get(index).getRangeMin();
                
                //Creates updated Range object
                Range updatedRange = new Range(lowerBound, upperBound);
                
                //Appends updated Range object in front of the current (obsolete) set element
                rangeList.add(index, updatedRange);
                
                //Deletes obsolete set element that contains the incorrect low and high range values
                rangeList.remove(index+1);
                
                number = 2;
            } //End if
            
            //Doesn't add range to the set because it is already in the current set element
            if(rangeList.get(index).isInRange(myObject.getRangeMin()) & rangeList.get(index).isInRange(myObject.getRangeMax()))
                number = -1;
            
            //Doesn't add range to the set because it is already in the next set element (my for loop counter never reaches the last element)
            if(rangeList.get(index+1).isInRange(myObject.getRangeMin()) & rangeList.get(index+1).isInRange(myObject.getRangeMax()))
                number = -1;
            
            //Combines two set elements whenever needed
            if((myObject.getRangeMin() == (rangeList.get(index).getRangeMax() + 1) || rangeList.get(index).isInRange(myObject.getRangeMin())) & (myObject.getRangeMax() == (rangeList.get(index+1).getRangeMin()- 1) || rangeList.get(index+1).isInRange(myObject.getRangeMax()))) {
                int upperBound = rangeList.get(index+1).getRangeMax();
                int lowerBound = rangeList.get(index).getRangeMin();
                Range updatedRange = new Range(lowerBound, upperBound);
                
                rangeList.remove(index);
                rangeList.remove(index);
                rangeList.add(index, updatedRange);
                
                if(myObject.getRangeMin() == (rangeList.get(index).getRangeMax() + 1) & myObject.getRangeMax() == (rangeList.get(index+1).getRangeMin()- 1))
                    number = 1;
                else {
                    number = 2;
                } //End else
            } //End if
        } //End for
        return number;
    } //End addRange
    
} //End class Set
    