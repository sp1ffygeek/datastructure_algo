package ds.algo.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sp1ffygeek on 11/5/16.
 */
public class MoveZeroToRight {

    public static void main(String[] args){
        int[] numbers = {0,3,1,0,4,1,5,0,2,0 };

        System.out.println("Results: " + Arrays.toString(moveZeroToRight(numbers, 0, numbers.length-1)));


    }

    private static int[] moveZeroToRight(int[] numbers, int startIndex, int endIndex){

        while(startIndex < endIndex){
            if(numbers[startIndex] ==0 && numbers[endIndex] != 0){
                int t = numbers[endIndex];
                numbers[endIndex] =  numbers[startIndex];
                numbers[startIndex]= t;
                startIndex++;
                endIndex--;
            }else{
                if(numbers[startIndex] != 0) startIndex++;
                if(numbers[endIndex] ==0) endIndex--;
            }
        }
        return numbers;
    }
}
