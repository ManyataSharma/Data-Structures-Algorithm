import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the value of a");
       int a = in.nextInt(); 
       System.out.println("Enter the value of b");
       int b = in.nextInt(); 
       System.out.println("Enter the value of c");
       int c = in.nextInt(); 
       if(a>b && a>c){
        System.out.println("a is largest number");
       } else if(b>c && b>a){
        System.out.println("b is largest number");
       } else {
        System.out.println("c is largest number");
       }
    }
}