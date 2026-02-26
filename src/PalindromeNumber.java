import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num,original = 0,digit,reverse =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        original = num;

        while(num!=0){
            digit = num%10;
            reverse = reverse *10+digit;
            num = num/10;
        }
        if(original==reverse){
            System.out.println("The given number is Palindrome");
        }else{
            System.out.println("The given number is not a Palindrome");
        }
    }
}

