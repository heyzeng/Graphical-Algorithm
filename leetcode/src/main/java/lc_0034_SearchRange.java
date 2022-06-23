import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author:Jude
 * Date:2022-05-15 上午12:22
 */
public class lc_0034_SearchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {return new int[] {-1,-1};}

        int[] ints = new int[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ints  = 
            }
        }


        return ints;
    }
}
