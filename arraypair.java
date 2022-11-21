public class arraypair {
    public static void main(String args[]){
        int total_pairs = 0;
        int array[] = {1,2,3,4,5};
        for(int i = 0; i < array.length-1; i++){
            for(int j = i + 1; j < array.length; j++){
                System.out.print("(" + array[i] + "," + array[j] + ")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("the total number of pairs " + total_pairs);
    }
}
