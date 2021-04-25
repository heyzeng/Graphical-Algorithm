import java.util.Arrays;

/**
 * Author:Jude
 * Date:2021-04-25 下午3:51
 */
public class ls_0905_sortArrayByParity {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        
        System.out.println(Arrays.toString(sortArrayByParity(arr)));

    }

    public static int[] sortArrayByParity(int[] arr ){
        int[] ints = new int[arr.length];

        int t = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ints[t ++] = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 1) {
                ints[t++] = arr[i] ;
            }

        }
        return ints;
    }
}


