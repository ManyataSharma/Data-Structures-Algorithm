import java.util.*;
public class EvenOddFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is even or odd");
        int a = in.nextInt();
        check(a);
    }
    static void check(int a){
        if (a%2 == 0){
            System.out.println("is even");
        }else{
            System.out.println("is odd");
        }
    }
}