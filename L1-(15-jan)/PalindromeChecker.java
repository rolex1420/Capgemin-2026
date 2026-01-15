class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(rev);
    }

    public void displayResult() {
        System.out.println(isPalindrome());
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("Madam");
        checker.displayResult();
    }
}
