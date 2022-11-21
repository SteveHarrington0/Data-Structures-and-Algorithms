import java.util.*;
public class subarray {
    public static void main(String args[]){
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int array[] = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += array[k];
                    System.out.print(array[k]);
                }
                System.out.println();
                if(sum > maximum){
                    maximum = sum;
                }
                if(minimum > sum){
                    minimum = sum;
                }
                System.out.println("sum of the sub array is " + sum);
            }
        }
        System.out.println("the maximum sum subarrays sum is "+ maximum);
        System.out.println("the minimum sum of the subarrays is " + minimum);
    }
}
