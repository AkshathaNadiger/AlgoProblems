import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        boolean result = isIsomorphic(s,t);
        System.out.println("Are Strings isomorphic? " + result);

    }

    public static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }

        Map<Character,Character> mapsT = new HashMap<>();
        Map<Character,Character> mapTs = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(mapsT.containsKey(charS)){
                if(mapsT.get(charS)!=charT){
                    return false;
                }
            }
            else{
                mapsT.put(charS,charT);
            }

            if(mapTs.containsKey(charS)){
                if(mapTs.get(charT)!=charS){
                    return false;
                }
            }
            else{
                mapsT.put(charT,charS);
            }
        }
        return true;
    }
}
