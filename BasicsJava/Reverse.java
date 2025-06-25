import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be reversed :");
        int number = in.nextInt();
        int sum = 0;
        while(number != 0){
            int Lastdigit = number % 10 ;
            sum = sum*10 + Lastdigit;
            number = number/10;
        }
        System.out.println("The reverse of the given number is :" +sum);
    }
}