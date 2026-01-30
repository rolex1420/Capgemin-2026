import java.util.*;

class ZeroSumSubarrays {
    static List<int[]> findSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;
        map.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int idx : map.get(sum)) {
                    result.add(new int[]{idx + 1, i});
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }
}
