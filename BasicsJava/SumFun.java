import java.util.*;
public class SumFun{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers a and b :");
        int a = in.nextInt();
        int b = in.nextInt();
        sum(a,b);
    }
    static void sum(int a, int b){
        int sum = 0;
        sum = a + b;
        System.out.println(sum);
    }
}