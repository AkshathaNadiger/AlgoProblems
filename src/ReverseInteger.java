public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534;
        System.out.println(reverse(x));
    }

    public static int reverse(int x){
        int digit, reverse =0;
        int maxDiv10 = Integer.MAX_VALUE/10;
        int minDiv10 = Integer.MIN_VALUE/10;

        while(x!=0){
            digit = x%10;
            x=x/10;

            if(reverse>maxDiv10||(reverse==maxDiv10&&digit>7)){
                return 0;
            }

            if(reverse<minDiv10||(reverse==minDiv10&&digit<-8)){
                return 0;
            }
            reverse = reverse*10+digit;

        }
        return reverse;
    }
}
