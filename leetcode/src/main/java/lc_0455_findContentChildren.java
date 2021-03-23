import java.util.Arrays;

/**
 * 输入: g = [1,2,3], s = [1,1]
 * 输出: 1
 * 解释:
 * 你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
 * 虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
 * 所以你应该输出1。
 */
public class lc_0455_findContentChildren {

    public static void main(String[] args) {
        int[] gg = {1,2,3};
        int[] ss  ={1,1};

        int contentC = findContentC(gg, ss);
        System.out.println(contentC);
    }

    public static int findContentC(int[] g, int[] s) {

        //1 g s 为null
        if (g == null || s == null) return 0;

        //2 排序
        Arrays.sort(g);
        Arrays.sort(s);

        //3 初始化 gi si 值
        int gi = 0, si = 0;

        //4 gi si 的长度小于数组长度
        while (gi < g.length && si < s.length) {
            if (g[gi] <= s[si]) {//如果最小的饼干能够满足最小的胃口，则发放
                gi++;
            }
            si++;
        }
        return gi;
    }
}



