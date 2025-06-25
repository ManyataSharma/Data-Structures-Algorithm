import java.util.*;
public class ArmstrongNumber{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number :");
      int n = in.nextInt(); 
      int original = n; 
      int sum = 0;

      int digits = 0;
      int temp = n;
      while(temp>0){
        digits ++;
        temp = temp/10;
      }

      while (n>0){
        int rem = n%10;
        int cube = rem * rem * rem;
        sum = sum + cube;
        n = n/10;
      }
      if(sum==original){
        System.out.println("Is an armstrong number");
      }else {
        System.out.println("Is not an armstrong number");
      }
    }
}