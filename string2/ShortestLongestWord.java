class ShortestLongestWord {

    public static int[] findShortestLongest(String[][] table) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String[] row : table) {
            int len = Integer.parseInt(row[1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }
}
