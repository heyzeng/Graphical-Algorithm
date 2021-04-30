import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author:Jude
 * Date:2021-04-30 下午2:56
 */
public class lc_0414_thirdMax {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,7,5,9};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : nums) {
            if (arrayList.contains(num)){
                continue;
            }
            arrayList.add(num);
        }

        int n = arrayList.size();

        if (n == 0 || n == 1) {
            return arrayList.get(n - 1 );
        }
        return arrayList.get(n - 3);
    }
}
