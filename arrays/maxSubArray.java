package arrays;

public class maxSubArray {
    public static void main(String[] args){
        System.out.println(maxSubArrays(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArrays(int[] nums) {

        int max = Integer.MIN_VALUE;

        int sum = 0;

        for(int i =0 ; i< nums.length; i++){
            sum = nums[i]+ sum;

            if(sum<0)
                sum =0;
            if(sum > max)
                max = sum;
        }
        return sum;
    }

}

