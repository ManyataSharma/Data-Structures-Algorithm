import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the targeted element");
        int target = in.nextInt();
        int ans = LinearSearch(arr,target);
        System.out.println("The targeted element is found on index" +ans);
    }
    static int LinearSearch(int[] arr , int target){
        if(arr.length==0){
            return -1;
        }
        for (int idx = 0; idx < arr.length; idx++) {
            int element = arr[idx];
            if(target == element){
            return idx;
            }
        }
        return -1;
    }
}