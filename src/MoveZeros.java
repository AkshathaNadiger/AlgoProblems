import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int n = nums.length;
        int[] result = new int[n];

        int j =0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                result[j++] = nums[i];

            }
        }
        System.out.println("The result array after moving zeros is: " + Arrays.toString(result));


        //Two pointer approach

        int left=0;
        int temp =0;
        for(int right =0; right<n; right++){
            if(nums[right]!=0){
                temp = nums[left];
                nums[left++] = nums[right];
                nums[right]=temp;
            }
        }
        System.out.println("After moving zeros : " + Arrays.toString(nums));


    }
}
