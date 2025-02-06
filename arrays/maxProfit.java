package arrays;

public class maxProfit {
    public static void main(String[] args){
        int[] val = {7,1,5,3,6,4};
        int s = maxProfits(val);
        System.out.println(s);
    }

    public static int maxProfits(int[] prices) {
        int minVal = prices[0];
        int maxProfit = 0;
        for(int i = 0 ; i< prices.length; i++){

            if(minVal > prices[i]){
                minVal = prices[i];
            }
            int tmpProfit =  prices[i] - minVal;
            if(tmpProfit > maxProfit){
                maxProfit = tmpProfit;
            }
        }
        return maxProfit;
    }
}