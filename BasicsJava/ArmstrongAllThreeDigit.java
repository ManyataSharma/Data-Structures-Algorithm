public class ArmstrongAllThreeDigit{
public static void main(String[] args) {
    for(int i=100;i<1000;i++){
        if(isArmstrong(i)){
            System.out.println(i + "");
        }
    }
}
static boolean isArmstrong(int n){
    int original = n;
    int sum = 0;
    while(n>0){
        int rem = n%10;
        n = n/10;
        sum = sum + rem*rem*rem;
    }
    return sum == original ;
}
}