import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            result[i] = 1;

            for(int j=0;j<n;j++){
                if(i!=j){
                    result[i] = result[i] * nums[j];
                }
            }
        }
        System.out.println("The product of Arrays Except self is: " + Arrays.toString(result));
    }
}
