public class ContainsDuplicate{
    public static void main(String[] args) {
        int[]arr = {1,3,1,2};
        boolean hasDuplicate = isDuplicate(arr);
        System.out.println(hasDuplicate);
    }
    static boolean isDuplicate(int[]arr){
        sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    }
    static void sort(int[]arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
        }
        }
    }
        static void swap(int[]arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
    }