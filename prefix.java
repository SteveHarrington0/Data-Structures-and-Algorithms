public class prefix {
    public static void main(String args[]){
        int array[] = {1,3,4,5,6};
        int maximum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for (int i = 1; i < array.length; i++){
            prefix[i] = prefix[i-1] + array[i];
        }
        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (sum > maximum){
                    maximum = sum;
                } 
            }
        }
        System.out.println("The maximum sub array sum of the array is " + maximum);
    }
}
