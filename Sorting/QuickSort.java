import java.util.*;
public class QuickSort{
    public static void main(String[] args) {
        int[]arr={98,56,34,22,3,1,2};
        
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]nums,int low,int high){
        if(low>=high){
            return ;
        }
        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        sort(nums,low,e);
        sort(nums,s,high);
    }
}