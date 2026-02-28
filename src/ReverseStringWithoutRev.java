import java.util.stream.IntStream;

public class ReverseStringWithoutRev {
    public static void main(String[] args) {
        String str = "Java";
       // String reversed = " ";

      /*  for(int i = str.length()-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed String: "+reversed);

       */


        //optimized stringBuilder Approach

     /*   StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println("Reversed String: " +sb.toString());

      */

        // Stream based approach

        String reversed = IntStream
                .iterate(str.length()-1, i->i>=0,i->i-1)
                .mapToObj(str::charAt)
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .toString();
        System.out.println("Reversed String: "+reversed);

    }
}
