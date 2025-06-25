import java.util.*;
public class SearchIn2DArray{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the elements of 2D array");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Enter the targeted element to find");
        int target = in.nextInt();
        int[] ans = search(arr,target); // format for return value{row,col}
        System.out.println(Arrays.toString(ans));
        int maximum = maxSearch(arr);
        System.out.println("The maximum element in the 2D Array is " + maximum);
        int minimum = minSearch(arr);
        System.out.println("The minimum element in the 2D Array is " + minimum);

    }
    static int[] search(int arr[][] , int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int maxSearch(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    static int minSearch(int arr[][]){
        int min = Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]<min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}