/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author havelr
 */
import java.util.ArrayList;
public class Range {
    private int high;
    private int low;
    public Range(int myLow, int myHigh) {
        low = myLow;
        high = myHigh;
    } //End constructor
    
    public boolean isInRange(int myNumber) {
        boolean inRange = false;
        if(myNumber >= low & myNumber <=high)
            inRange = true;
        return inRange;
    } //End isInRange
    public int getRangeSize() {
        return (high - low + 1);
    } //End getRangeSize
    
    public int getRangeMin() {
        return low;
    } //End getRangeMin
    
    public int getRangeMax() {
        return high;
    } //End getRangeMax
    
} //End class Range
