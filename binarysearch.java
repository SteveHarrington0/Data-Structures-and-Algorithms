public class binarysearch {
    public static int binary(int array[],int key){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(array[mid] == key){
                return mid;
            }
            else if(array[mid] > key){
                end = mid - 1;
            }
            else if (array[mid] < key){
                start = mid + 1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7,8,9};
        int key = 10;
        int result = binary(array,key);
        if (result != -1){
            System.out.println("the key is found at " + result);
        }
        else{
            System.out.println("key is not present");
        }


    }
    
}
