public class RotatedSortedArray{
    public static void main(String[] args) {
       int[]arr={3,4,5,6,7,0,1,2};
       System.out.println(searchPivot(arr));
       int target = 6;
       System.out.println(search(arr, target)); 
    }

    static int search(int[]arr,int target){
        int pivot = searchPivot(arr);
        int start=0;
        int end=arr.length-1;
        //if you did not find a pivot, it means the array is not rotated
        if(pivot==-1){
            //just do normal binary search and find the target
            return BinarySearch(arr,target,0,arr.length-1);
        }
        // if pivot is found, you have two ascending sorted array
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>arr[start]){
            return BinarySearch(arr, target, 0, pivot-1);
        }
        if(target<arr[start]){
            return BinarySearch(arr, target, pivot+1, end);
        }
        return -1;
    }

        static int BinarySearch(int[]arr , int target , int start, int end){

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

    static int searchPivot(int[]arr){
        int start = 0;
        int end= arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            // 4 cases 
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid -1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}