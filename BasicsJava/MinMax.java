import java.util.*;
public class MinMax{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int [5];
        System.out.println("Enter the element of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[]arr){
        int min = arr[0];
        for(int i=0; i<arr.length ; i++){
            if(arr[i]<min)
            min = arr[i];
        }
        return min;
    }
}