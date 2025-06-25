 public class MountainArray{
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,6,4,3,2};
        int ans = PeakElement(arr);
        System.out.println(ans);
    }
    static int PeakElement(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start <end){
            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in decresing part,we will search for peak element in left side 
                end = mid;
            } else {
                // you are in incresing part cause arr[mid]<arr[mid+1],search in right side
                start = mid+1;
            }
        }
        // in the end start==end and both will be pointing to the same
        // element which is the max which we were finding by above two checks
        return start; // or end cause end==start
    }
 }