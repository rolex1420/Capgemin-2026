class CircularTour {
    static int tour(int[] petrol, int[] distance) {
        int start = 0, balance = 0, deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            balance += petrol[i] - distance[i];
            if (balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }
        return balance + deficit >= 0 ? start : -1;
    }
}
