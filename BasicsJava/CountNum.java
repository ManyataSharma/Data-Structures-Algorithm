import java.util.*;
public class CountNum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("Enter the repeating number to be find");
        int num = in.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10 ;
            if(rem == num){
                count ++;
            }
            n = n/10 ;
        }
        System.out.println(count);
    }
}