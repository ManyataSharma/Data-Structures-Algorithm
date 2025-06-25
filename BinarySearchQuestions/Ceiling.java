public class Ceiling{
    public static void main(String[] args) {
        int[]arr = {2,3,4,11,14,16,18};
        int target = 15;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch (int[] arr, int target){
        int start =0;
        int end = arr.length-1;

     boolean isAsc = arr[start]<arr[end];

while(start<=end){
   int mid = start +(end-start)/2;
   if (arr[mid]==target){
    return mid;
   }
   if (isAsc){
    if(target<arr[mid]){
        end = mid-1;
    }else{
        start = mid+1;
    }
    } else {
        if(target <arr[mid]){
            start = mid+1;
        }else {
            end = mid-1;
        }
    }
   }
   // return the index of the ceiling if target not found
   //ceiling = smallest number greater or equal to target element
   return start ;
}
}