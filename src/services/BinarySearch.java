package services;

public class BinarySearch {
    public static Integer binarySearch(int[] nums, int x){
        int[] array = nums;

        int l = 0;
        int r = array.length;
        int steps = 0;

        while(l < r){
            steps += 1;
            int mid = l + (r - l) / 2;

            if(array[mid] == x){
                System.out.println(steps);
                return mid;
            }else if(array[mid] < x){
                l = mid + 1;
            }else{
                r = mid;
            }
        }

        return -1;
    }
}
