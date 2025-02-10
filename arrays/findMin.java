package arrays;

public class findMin {
    public static void main(String[] args){
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[]{11,13,15,17}));
    }
    public static int findMin(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int prev = Integer.MAX_VALUE;

        for(int i = 0 ; i< nums.length ;i ++){
            if(ans > nums[i]){
                ans = nums[i];
            }
        }
        return ans;
    }
}
