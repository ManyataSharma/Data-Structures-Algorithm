import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

        if(CheckPalindrome(num)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
        static boolean CheckPalindrome(int num){
        int temp = num;
        int reverse = 0;
        while(temp!=0){
        reverse = (reverse*10) + (temp%10);
        temp = temp/10;
        }
        return (reverse==num);
        }

}