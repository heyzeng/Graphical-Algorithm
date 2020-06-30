import java.util.ArrayList;
import java.util.List;

public class lc_0118_pascals_triangle {
    public static void main(String[] args) {
            solution solution = new solution();
            System.out.println(solution.generate(5));


    }
}

class solution {
        public List<List<Integer>> generate(int numRows) {

                ArrayList<List<Integer>> lists = new ArrayList<>();
                for (int i = 0; i <numRows; i++) {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        for (int j = 0; j <= i; j++) {
                                if (j ==0 | j==i){
                                        arrayList.add(1);
                                }else{
                                        arrayList.add(lists.get(i-1).get(j-1) + lists.get(i-1).get(j));
                                }
                        }
                        lists.add(arrayList);

                }

                return lists;
        }

}