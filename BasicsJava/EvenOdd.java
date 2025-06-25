import java.util.*;
public class EvenOdd{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = input.nextInt();
    if(number%2==0){
        System.out.println("Is even number");
    }else {
        System.out.println("Is not an even number");
    }
}
}
