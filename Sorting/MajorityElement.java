public class MajorityElement{
    public static void main(String[] args) {
        int[]arr = {3,2,3};
        int MajorityElement = check(arr); 
        System.out.println(MajorityElement);
    }
    static int check(int[]arr){
        sort(arr);
        int middle = arr[arr.length/2];
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==middle){
                count ++;
            }
        }
        return (count>arr.length/2 )? middle : -1;
    }

    static void sort(int[]arr){
        // the outer loop is starting from 1 cause we have to start comparing from second element
        for (int i = 1; i <arr.length; i++) {
            //now second element will be compared to prevoius one
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