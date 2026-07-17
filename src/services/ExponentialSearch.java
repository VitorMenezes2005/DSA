package services;

import java.util.ArrayList;
import java.util.List;

public class ExponentialSearch {
    public static int binarySearch(int[] nums, Integer x, Integer l, Integer r){
        while(l < r){
            int mid = l + (r - l) / 2;

            if(nums[mid] == x){
                System.out.println(mid);
                return mid;
            }else if(nums[mid] < x){
                l = mid + 1;
            }else{
                r = mid;
            }
        }

        return -1;
    }

    public static int exponentialSearch(int[] nums, int target){
        if(nums[0] == target){
            return 0;
        }

        int n = nums.length;
        int i = 1;

        while(i < n && nums[i] < target){
            i *= 2;

            if(nums[i] == target){
                return i;
            }
        }

        return binarySearch(nums, target, i / 2, Math.min(i, n - 1));
    }
}
