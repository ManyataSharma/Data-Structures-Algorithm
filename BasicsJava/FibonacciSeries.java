import java.util.*;
public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms in the fibonacci series");
        int n = in.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("Fibonacchi series up to "+n+ "terms");
        for (int i=1;i<=n;i++){
            System.out.println(first);
            int next = first + second ;
            first = second ;
            second = next ;
        }
            }
}