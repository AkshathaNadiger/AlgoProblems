public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        boolean result = isPalindrome(s);

        if (result) {
            System.out.println(s + " is a Palindrome");
        } else {
            System.out.println(s + " is NOT a Palindrome");
        }
    }

    public static boolean isPalindrome(String s) {

        int i=0;
        int j= s.length()-1;

        //Basic palindrome approach
     /*   while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

      */

        //Two pointer approach
       while(i<j){
            while(i<j&& !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j&& !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) !=
                    Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;

        }
        return true;


    }

    }

