import java.util.*;
   public class PRT {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the principal amount");
    Float Principal = input.nextFloat();
         System.out.println("Enter the Rate amount");
    Float Rate = input.nextFloat();
        System.out.println("Enter the Time");
    Float Time = input.nextFloat();
    Float PRT = Principal*Rate*Time / 100;
    System.out.println("The Simple Interest is " + PRT);
    }
} 