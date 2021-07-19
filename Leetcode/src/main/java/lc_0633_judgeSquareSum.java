

/*
    输入: 5
    输出: True
    解释: 1 * 1 + 2 * 2 = 5
 */
public class lc_0633_judgeSquareSum {
    public static void main(String[] args) {

        boolean b = judgeSquareSum(21);
        System.out.println(b);
    }

    public static boolean judgeSquareSum(int target) {
        if (target < 0) {
            return false;
        }

        int i = 0;
        int j = (int) Math.sqrt(target);
        while (i <= j) {

            int num = i * i + j * j;

            if (target == num) {
                return true;
            } else if (num < target) {
                i++;
            } else {
                j--;
            }
        }
        throw new IllegalArgumentException("no have");
    }
}