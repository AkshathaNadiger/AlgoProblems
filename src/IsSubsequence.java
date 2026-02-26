public class IsSubsequence {
    public static void main(String[] args) {


        String s = "abc";
        String t = "ahbgdc";
        boolean result = isSubsequence(s, t);

        System.out.println("Is Subsequence: " + result);
    }


    public static boolean isSubsequence(String s, String t) {

        int i = 0;
        for (int j = 0; j < t.length(); j++) {
            if (i == s.length()) {
                return true;
            }
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }
}


