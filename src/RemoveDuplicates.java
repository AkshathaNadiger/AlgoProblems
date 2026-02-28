import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,2,4,5};
      /*  int n = arr.length;
        int[] temp = new int[n];
        int index =0;

        for(int i=0;i<n;i++){
            boolean isDuplicate = false;

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[index++] = arr[i];
            }
        }
        int[] result = Arrays.copyOf(temp,index);
        System.out.println("Array without Duplicates: "+ Arrays.toString(result));

       */

        //HashSet Approach

      /*  Set<Integer> set = new LinkedHashSet<>();
        for(int num: arr){
            set.add(num);
        }
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Array without Duplicates: "+ Arrays.toString(result));

       */

        //using streams

    /*    int[] result = Arrays.stream(arr)
                .distinct()
                .toArray();
        System.out.println("Array without Duplicates: "+ Arrays.toString(result));

     */

        //using sorting
        Arrays.sort(arr);
        int j=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        int[] result = Arrays.copyOf(arr,j+1);
        System.out.println("Array without Duplicates: "+ Arrays.toString(result));


    }
}
