import java.util.*;
class takingInput{
    public static void main(String arg[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = input.nextLine();
        System.out.println("Hello " + name + ", nice to meet you!"); // Changed 'System.err' to 'System.out'
    }
}