import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordFrequency {
    public static void main(String[] args) {
        String str = "java is java and java is powerful";

    /*    String[] words = str.split("\\s+");
        boolean[] visited = new boolean[words.length];

        for(int i=0;i< words.length;i++){
            if(visited[i]) continue;
            int count = 1;

            for(int j=i+1;j< words.length;j++){
                if(words[i]==words[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(words[i]+ ":" + count);
        }

     */

        //Stream Based approach

        Map<String,Long> wordCount = (Map<String, Long>) java.util.Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        wordCount.forEach((k,v)->
                System.out.println(k + ": " +v));
    }
}
