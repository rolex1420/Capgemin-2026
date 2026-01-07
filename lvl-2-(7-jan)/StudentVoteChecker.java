import java.util.Scanner;

class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] studentAges = new int[10];

        for (int i = 0; i < studentAges.length; i++) {
            studentAges[i] = scanner.nextInt();
            boolean canVote = checker.canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (Age " + studentAges[i] + "): Can Vote? " + canVote);
        }
    }
}