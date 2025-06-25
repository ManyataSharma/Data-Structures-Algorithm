import java.util.*;
public class Sum{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int SumPositiveEven = 0;
        int SumNegative = 0;
        int SumPositiveOdd = 0;
        System.out.println("Enter the number :");
        while(true){
        int number = in.nextInt();
        if (number==0){
            break;
        }
        if (number<0){
            SumNegative += number;
        } else if(number %2 == 0){
            SumPositiveEven += number;
        } else {
            SumPositiveOdd += number;
        }
        }
        System.out.println("Sum of negative numbers " +SumNegative );
        System.out.println("Sum of positive even numbers " +SumPositiveEven );
        System.out.println("Sum of positive odd numbers " +SumPositiveOdd );
    }
    }