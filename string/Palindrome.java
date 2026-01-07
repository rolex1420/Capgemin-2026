class Palindrome {

    static boolean logic1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    static boolean logic2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return logic2(s, i + 1, j - 1);
    }

    static boolean logic3(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length];

        for (int i = 0; i < a.length; i++)
            b[i] = s.charAt(a.length - i - 1);

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;

        return true;
    }
}
