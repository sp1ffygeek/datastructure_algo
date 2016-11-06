package ds.algo.array;

/**
 * Created by sp1ffygeek on 11/5/16.
 */
public class FindMinMaxRecursive {

    public static void main(String args[]){
        int numbers[] = {1, 3, 5, 7, 9, 13, 15, 17};
        MinMax m = findMinMaxRecursive(numbers, 0, numbers.length-1);

        System.out.println("maximum: " + m.max);
        System.out.println("minimum: " + m.min);
    }

    private static MinMax findMinMaxRecursive(int[] numbers, int startIndex, int endIndex){
        MinMax left, right;

        if(startIndex > endIndex)
            return null;

        if(startIndex == endIndex)
            return new MinMax(numbers[startIndex], numbers[endIndex]);

        left = findMinMaxRecursive(numbers, startIndex, (startIndex+endIndex)/2);
        right = findMinMaxRecursive(numbers, (startIndex+endIndex)/2+1, endIndex);

        if(null == left) {
            return right;
        }
        else if(null == right) {
            return left;
        }else{
            return new MinMax(Math.min(left.min, right.min), Math.max(left.max, right.max));
        }
    }
}

class MinMax
{
    public int min;
    public int max;

    public MinMax(int min, int max)
    {
        this.min = min;
        this.max = max;
    }
}