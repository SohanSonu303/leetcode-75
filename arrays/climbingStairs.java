package arrays;

import java.util.HashMap;
import java.util.Map;

public class climbingStairs {
    public static void main(String[] args){
        int n = 45;
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println(climb(n, map));
        System.out.println(map);
    }

    public static int climb(int n, HashMap map){

        if(map.containsKey(n)){
            return (int) map.get(n);
        }
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }

        int max = climb(n-2,map) + climb(n-1,map);
        map.putIfAbsent(n,max);
        return max;
    }
}
