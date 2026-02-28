import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,20,20,40,50};

     /*   int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;

        for(int num: arr){
            if(num>largest){
                secLar = largest;
                largest = num;
            } else if (num>secLar&&num!=largest) {
                secLar = num;

            }
        }
        System.out.println("Second largest: " +secLar);

      */

        //sorting Approach

      /*  Arrays.sort(arr);
        System.out.println("Second largest: "+arr[arr.length-2]);

       */
        //Stream based approach

        java.util.OptionalInt secondLargest = Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(Arrays.stream(arr).distinct().count() - 2)
                .findFirst();
        System.out.println("Second Largest: " +secondLargest.getAsInt());
    }
}
