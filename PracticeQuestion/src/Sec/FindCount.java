package Sec;

public class FindCount {
    public static int findCount(int[] arr, int length, int num, int diff) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (Math.abs(arr[i] - num) <= diff) count++;
        }
        return count == 0 ? -1 : count;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 14, 56, 77, 13};
        System.out.println(findCount(arr, arr.length, 13, 2)); // 3
    }
}