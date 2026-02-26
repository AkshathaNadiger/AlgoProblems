import java.util.stream.IntStream;

public class ReverseNumberStreams {
    public static void main(String[] args) {
        int num = 1456;
        String s = String.valueOf(num);

        int reversed = Integer.parseInt(
                IntStream.iterate(s.length()-1,i->i>=0,i->i-1)
                        .mapToObj(s::charAt)
                        .collect(StringBuilder::new,
                                StringBuilder::append,
                                StringBuilder::append)
                        .toString()
        );
        System.out.println("Reversed Number: " +reversed);
    }
}
