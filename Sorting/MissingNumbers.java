public class MissingNumbers{
    public static void main(String[] args) {
        int[] arr = {4,0,1,2};
        int missing = missingNUmbers(arr);
        System.out.println(missing);
    }
    static int missingNUmbers(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //serach for first missing number
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
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