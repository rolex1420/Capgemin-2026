package Sec;

public class ReplaceCharacter {
    public static String replaceCharacter(String str, char ch1, char ch2) {
        if (str == null) return null;
        if (ch1 == ch2 || (str.indexOf(ch1) == -1 && str.indexOf(ch2) == -1))
            return str;

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch1)       sb.setCharAt(i, ch2);
            else if (sb.charAt(i) == ch2)  sb.setCharAt(i, ch1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceCharacter("apples", 'a', 'p')); // paales
    }
}