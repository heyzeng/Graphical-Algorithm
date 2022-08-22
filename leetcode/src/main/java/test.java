import java.util.Arrays;

/**
 * Author:ZJF
 * Date:2021-03-28 上午10:00
 */
public class test {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5};
        System.out.println(Arrays.toString(twoSum(arr, 3)));

    }
    public static int[] twoSum(int[] arr,int target){

        int i = 0;
        int j = arr.length - 1;

       while (i < j) {
           if (target == arr[i] + arr[j]){
               return new int[]{i,j};
           } else if (target > arr[i] + arr[j]) {
               i++;
           }else {
               j--;
           }
       }
       throw new IllegalArgumentException("NO HAVE");
    }
    /**
     * 斐波那契
     * 1 1 2 3 5
     */
    public static int x (int n ) {
        if (n == 1 || n==2 ) return n;
        return x(n-1) + x(n-2);
    }
}
