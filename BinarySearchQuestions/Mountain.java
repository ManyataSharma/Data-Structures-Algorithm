public class Mountain{
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,6,4,3,2};
        int target = 4;
        System.out.println(search(arr, target));
    }
    static int search(int[]arr,int target){
        int peak=PeakElement(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }

        // try to search in second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    static int PeakElement(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[]arr , int target , int start, int end){

        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start = mid+1;
                }else {
                    end=mid-1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}