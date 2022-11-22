public class kadanes {
    public static void main(String args[]){
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        int maximum = Integer.MIN_VALUE;
            int current_sum = 0;
        for(int i = 0; i < array.length; i++){
           current_sum = current_sum + array[i];
           if(current_sum < 0){
            current_sum = 0;
           }
           if(current_sum > maximum){
                maximum = current_sum;
           }
            
        }
        System.out.println(maximum);
    }
}
