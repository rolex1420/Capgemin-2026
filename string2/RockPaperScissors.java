class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return choice == 0 ? "Rock" : choice == 1 ? "Paper" : "Scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper")))
            return "User";
        return "Computer";
    }
}
