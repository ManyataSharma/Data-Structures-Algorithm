public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts =   {{1,2,3},{2,3,2},{1,1,2}};
        System.out.println("The maximum wealth a person's account has is : " + maxWealth(accounts));
    }
    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum = 0;
            for(int account=0;account<accounts[person].length;account++){
                sum = sum + accounts[person][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}