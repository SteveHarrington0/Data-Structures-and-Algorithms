public class trappingrainwater {
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        int left_max_array[] = new int[height.length];
        int right_max_array[] = new int[height.length];
        for(int i = 0; i < height.length; i++){
            if(i == 0){
                left_max_array[i] = height[i];
            }
            else{
                left_max_array[i] = height[i] > left_max_array[i - 1] ? height[i] : left_max_array[i - 1];
            }
        }
        for(int i = height.length - 1; i >= 0; i--){
            if(i == height.length - 1)
            {
                right_max_array[i] = height[i];
            }
            else
            {
                right_max_array[i] = height[i] > right_max_array[i + 1] ? height[i] : right_max_array[i + 1];
            }
        }
        int trapped_rain_water = 0;
        int width = 1;
        for(int i = 0; i < height.length; i++){
            int water_height = Math.min(left_max_array[i],right_max_array[i]);
            trapped_rain_water = trapped_rain_water + ((water_height - height[i]) * width);
            System.out.println(trapped_rain_water);
            if (trapped_rain_water < 0){
                trapped_rain_water = 0;
            }
        }
        System.out.println("The area of trapped water is " + trapped_rain_water);
    }
}
