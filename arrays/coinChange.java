package arrays;

import java.util.HashMap;

public class coinChange {
    public static void main(String[] args){
        int val = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int x = getCoinChange(new int[]{2},3, map);
        System.out.println(x);

    }

    public static int getCoinChange(int[] coins, int count, HashMap<Integer, Integer> map){

        if(map.containsKey(count)){
            return map.get(count);
        }
        if(count == 0) return 0;
        int val = Integer.MAX_VALUE;
        for(int i =0 ;i < coins.length;i++){

            if( count-coins[i] >= 0){
                int tmp = getCoinChange(coins,count - coins[i], map);
                if(tmp != Integer.MAX_VALUE && tmp+1 < val){
                    val = tmp+1;
                    map.putIfAbsent(count,val);
                }

            }

        }
        return val;
    }
}
