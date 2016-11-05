package ds.algo.array;

import java.util.Arrays;

/**
 * Created by sp1ffygeek on 11/5/16.
 */
public class LeastDifference {

    public static void main(String[] args){
        int[] numbers = {1, 1111, 99, 39, 18, 130};
        Arrays.sort(numbers);

        System.out.println("Least difference: " + findLeastDifference(numbers));
    }

    private static Integer findLeastDifference(int[] numbers){
        int diff=Integer.MAX_VALUE, i =0;

        for(; i < numbers.length-1; i++){
            int d = numbers[i+1]-numbers[i];
            if(d < diff)
                diff = d;
        }

        return diff;
    }
}
