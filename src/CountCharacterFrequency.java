import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        String str = "programming";

      /*  char[] chars = str.toCharArray();
        boolean[] visited = new boolean[chars.length];

        for(int i=0;i<chars.length;i++){
            if(visited[i]) continue;

            int count = 1;
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(chars[i] + ":" +count);
        }

       */

        //HashMap Approach

     /*   Map<Character,Integer> freqMap = new HashMap<>();
        for(char c: str.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        freqMap.forEach((k,v)->
                System.out.println(k+":"+v));

      */

        // Stream Based approach

        Map<Character,Long> freqMap =str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        freqMap.forEach((k,v)->
                System.out.println(k + ":" + v));
    }
}
