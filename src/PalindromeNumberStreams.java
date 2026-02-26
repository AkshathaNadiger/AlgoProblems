import java.util.stream.IntStream;

public class PalindromeNumberStreams {
    public static void main(String[] args) {
        int num = 12321;
        boolean isPalindrome = num >0&&
                IntStream.range(0,String.valueOf(num).length()/2)
                        .allMatch(i->{
                            String s = String.valueOf(num);
                            return s.charAt(i)==s.charAt(s.length()-1-i);
                        });
        System.out.println("Palindrome: " +isPalindrome);
    }
}
