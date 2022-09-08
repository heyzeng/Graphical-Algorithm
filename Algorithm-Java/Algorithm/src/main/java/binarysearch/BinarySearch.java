package binarysearch;

/**
 * Author:Jude
 * Date:2021-04-15 下午5:16
 */
public class BinarySearch {
    public static void main(String[] args) {

        System.out.println("hello world");
        int[] arr = {0, 1, 33};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 33, (arr.length - 1) / 2));
    }

    public static int binarySearch(int[] arr, int left, int right, int findNum, int midNum) {
        if (left > right)
            return -1;
        midNum = (left + right) / 2; //去mid中间值
        if (findNum == arr[midNum]) { //找到的值相等，则返回
            return midNum;
        } else if (findNum > arr[midNum]) {
            return binarySearch(arr, midNum + 1, right, findNum, midNum); // 边界条件 left = midNum + 1
        } else {
            return binarySearch(arr, left, midNum - 1, findNum, midNum); //  边界条件 right = midNum - 1
        }
    }
}
