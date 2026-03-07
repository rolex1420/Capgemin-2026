package Sec;

public class RatsAndFood {
    public static int ratsAndFood(int r, int unit, int[] arr) {
        if (arr == null) return -1;

        int totalFood = 0;
        for (int food : arr) totalFood += food;

        int totalConsumed = r * unit;
        if (totalFood < totalConsumed) return 0;

        return totalFood - totalConsumed;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 5, 7, 4, 1, 2};
        System.out.println(ratsAndFood(7, 2, arr)); // 4
    }
}