import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int n = nums.length;
        for(int i =0 ; i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>n/2){
                //return nums[i];
                System.out.println("Majority element: " +nums[i]);
                return;
            }
        }
        System.out.println("Majority element not found");


        //Sorting Approach


        Arrays.sort(nums);
        int majority = nums[n / 2];

        System.out.println("Majority Element: " + majority);



        // Boyer-Morre voting algorithm Approach

        int candidate = 0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];

            if(count ==0){
                candidate = num;

            }
            if(num == candidate){
                count++;
            }
            else {
                count--;
            }
        }
        System.out.println("Majority Element: " + candidate);
    }
}
