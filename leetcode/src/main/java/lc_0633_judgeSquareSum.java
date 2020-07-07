

/*
    输入: 5
    输出: True
    解释: 1 * 1 + 2 * 2 = 5
 */
public class lc_0633_judgeSquareSum {
    public static void main(String[] args) {

        judgeSquareSum squareSum = new judgeSquareSum();

        boolean squareSum1 = squareSum.judgeSquareSum(11);
        System.out.println(squareSum1);
    }

}
class judgeSquareSum{
    public boolean judgeSquareSum(int target){

        //判断target是否为正
        if (target <0) return false;
        int i = 0;
        int j = (int)Math.sqrt(target);

        while(i <= j){
            int powSum = i * i + j * j;
            if (powSum == target){
                return true;
            }else if (powSum > target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }

}