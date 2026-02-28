public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int n =6;
       /* int missing = -1;

        for(int i=1;i<=n; i++){
            boolean found = false;
            for(int num : arr){
                if(num==i){
                    found = true;
                    break;
                }
            }
            if(!found){
                missing = i;
                break;
            }
        }
        System.out.println("Missing number: "+ missing);

        */

        //Sum formula

        int expectedSum = n*(n+1)/2;
        int actualSum =0;

        for(int num: arr){
            actualSum = actualSum+num;
        }
        int missing = expectedSum-actualSum;
        System.out.println("Missing number: "+ missing);

    }


}
