/**
 * Author:ZJF
 * Date:2021-03-16 上午11:03
 */
public class xn {
    public static void main(String[] args) {

        System.out.println(Fuc(3,2));
        System.out.println(Fuc2(3,2));
    }
    // x的n次方
    // 时间复杂度为o(n)
    public static int Fuc(int x,int n) {
        // x的0次方为1
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

    //递归
    public static int Fuc2(int x ,int n) {

        if (n == 0) return 1;

        return Fuc2(x ,n -1 ) * x;
    }
}
