import java.util.*;
public class AreaProblems {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        Float r = in.nextFloat();
        float area = 22/7*r*r ;
        System.out.println(area);
    }
}