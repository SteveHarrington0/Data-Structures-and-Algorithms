public class reversearray {
    public static void reverse(int array[]){
        int start = 0;
        int end = array.length - 1;
        while(start < end){
           int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start += 1;
            end -= 1;
        }
        
    }
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6};
        reverse(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
       
    }
}
