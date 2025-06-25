public class FirstSmallestMissingPos{
    public static void main(String[] args) {
        int[]arr = {7,9,8,11,12};
        int ans=missingNUmbers(arr);
        System.out.println(ans);
    }
        static int missingNUmbers(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //serach for first missing number
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index+1;
            }
        }
        //case 2 when N is not present
        return arr.length;
    }

    static void swap(int[]arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}