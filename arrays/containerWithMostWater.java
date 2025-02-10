package arrays;

public class containerWithMostWater {
    public static void main(String[] args){
        //int[] a = new int[]{1,8,6,2,5,4,8,3,7};
        //int[] a = new int[]{1, 5, 4, 3};
        //int[] a = new int[]{3, 1, 2, 4, 5};
        int[] a = new int[]{2, 1, 8, 6, 4, 6, 5, 5};
        int max = a[0] < a[a.length-1]?a[0]*(a.length-1):a[a.length-1]*(a.length-1);
        max = getCountOfWater(0,a.length-1,a.length-1,max,a);
        System.out.println(max);
    }
    public static int getCountOfWater(int i, int j, int dist, int max, int[] arr){
        if(dist == 0){
            return max;
        }
        if(arr[i] <= arr[j]){
            int tmp = arr[i]*dist;
            max = max>tmp?max:tmp;
            max = getCountOfWater(i+1,j,dist-1,max,arr);
        }
        else{
            int tmp = arr[j] * dist;
            max = max>tmp ? max:tmp;
            max = getCountOfWater(i,j-1,dist-1,max,arr);
        }
        return max;
    }

}
