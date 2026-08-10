package services.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubble(int[] nums){

        for(int i=0; i<nums.length; i++){
            Boolean is_sorted = true;
            System.out.println(Arrays.toString(nums));
            for(int j=0; j< nums.length - 1; j++){
                if(nums[j] > nums[j + 1]){
                    is_sorted = false;
                    int x = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = x;
                }
            }
            if(is_sorted == true){
                return nums;
            }
        }

        return nums;
    }
}
