/**
 * Author:Jude
 * Date:2021-04-14 上午11:50
 */
public class lc_069_sqrtX {
    public static void main(String[] args) {
        System.out.println(sqrtX(8));
    }

    public static int sqrtX(int x) {

        if (x <= 1 ) return x;

        int left = 1 , right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sqr = x / mid;

            if (mid == sqr) {
                return mid;
            }else if (mid > sqr) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}
