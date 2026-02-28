import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "programming";

       /* char[] chars = str.toCharArray();
        System.out.println("Duplicate Characters: ");

        for(int i=0;i<chars.length;i++){
            int count =1;
            for(int j =i+1; j<chars.length;j++){
                if(chars[i]==chars[j]&&chars[i]!='0'){
                    count++;
                    chars[j]='0';
                }
            }
            if(count>1&&chars[i]!='0'){
                System.out.println(chars[i] + " ");
            }
        }

        */

        //HashMap approach

     /*   Map<Character,Integer> map = new HashMap<>();

        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println("Duplicate characters: ");
        map.forEach((k,v)->{
            if(v>1){
                System.out.println(k + " ");
            }
        });

      */

        // Stream Based Approach

        System.out.println("Duplicate Characters:");
        str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .forEach(e-> System.out.println(e.getKey() + " "));

    }
}
