import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of days in a month:");
        int days= in.nextInt();
        int count = 0;
        int i = 1;
        if (days ==31){
            while(i<=days){
                if(i%2==0){
                    count ++;
                }
                i++;
            }
            System.out.println("Kunal can go out on " +count+ " days in august");
        }else {
            System.out.println("invalid input . august has only 31 days");
        }
}
}

