/**
 * Author:Jude
 * Date:2021-05-07 下午8:35
 */
public class lc_1486_xorOperation {

    public int xorOperation(int n, int start) {

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= (start + 2 * i);
        }
        return ans;

    }
}
