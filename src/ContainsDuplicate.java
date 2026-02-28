import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,1};
        int k=3;
        System.out.println(containsNearByDuplicate(nums,k));
    }

    public static boolean containsNearByDuplicate(int[] nums, int k){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&(i-j)<=k){
                    return true;
                }
            }
        }
        return false;



        //Sliding window hashSet


    /*   Set<Integer> window = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(window.contains(nums[i])){
                return true;
            }
            window.add(nums[i]);

            if(i>k){
                window.remove(nums[i-k]);
            }
        }
        return false;


     */


        //sliding window HashMap

    /*    Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int previndex = map.get(nums[i]);

                if(i-previndex<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;

     */
    }
}


