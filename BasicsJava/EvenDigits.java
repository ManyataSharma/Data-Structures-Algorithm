public class EvenDigits{
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7486};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(checkEvenDigits(nums[i])){
                count ++;
            }
        }
        return count;
    }
    static boolean checkEvenDigits(int num){
        int numberOfDigits = digits(num);
         if (numberOfDigits % 2 == 0){
            return true ;
        }
        return false ;
    }
    static int digits(int num){
        int count = 0;
        while(num>0){
            count ++;
            num = num/10;
        }
        return count ;
    }

}