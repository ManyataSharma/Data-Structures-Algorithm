import java.util.*;
public class Adult{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you age :");
        int age = in.nextInt();
        CanVote(age);
    }
    static void CanVote(int age){
        if(age>=18){
            System.out.println("Can vote");
        }else {
        System.out.println("Can not vote");
        }
    }
}