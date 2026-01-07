class SpringSeason {

    public boolean isSpringSeason(int month, int day) {
        boolean isSpring = false;
        if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            isSpring = true;
        }
        return isSpring;
    }

    public static void main(String[] args) {
        SpringSeason seasonChecker = new SpringSeason();
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        boolean result = seasonChecker.isSpringSeason(month, day);

        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}