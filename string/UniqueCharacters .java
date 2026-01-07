import java.util.Scanner;

class UniqueCharacters {

    public static char[] findUnique(String text) {
        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[count++] = text.charAt(i);
        }

        char[] result = new char[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] unique = findUnique(text);

        for (char c : unique) System.out.print(c + " ");
        sc.close();
    }
}
