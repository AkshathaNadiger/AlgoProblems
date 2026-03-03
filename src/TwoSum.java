import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(numbers,target);
        System.out.println("Index 1: " +result[0]);
        System.out.println("Index 2: " +result[1]);
    }

//    public static int[] twoSum(int[] numbers,int target){
//        for(int i=0;i<numbers.length;i++){
//            int num = numbers[i];
//            int rem = target-num;
//
//            for(int j=i+1;j<numbers.length;j++){
//                if(numbers[j]==rem){
//                    return new int[]{i+1,j+1};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }

    //HashMap Approach

//    public static int[] twoSum(int[] numbers,int target){
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int i=0;i<numbers.length;i++){
//            int num = numbers[i];
//            int rem = target-num;
//
//            if(hm.containsKey(rem)){
//                return new int[]{hm.get(rem)+1,i+1};
//            }
//            hm.put(num,i);
//        }
//        return new int[]{};
//    }

    //Two pointer approach

    public static int[] twoSum(int[] numbers,int target){
        int left =0;
        int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];

            if(sum==target){
                return new int[]{left+1,right+1};
            } else if (sum<target) {
                left++;

            }else{
                right--;
            }
        }
        return new int[]{};
    }
    //Stream based approach

//    public static int[] twoSum(int[] numbers, int target) {
//
//        return java.util.stream.IntStream.range(0, numbers.length)
//                .boxed()
//                .flatMap(i ->
//                        java.util.stream.IntStream.range(i + 1, numbers.length)
//                                .filter(j -> numbers[i] + numbers[j] == target)
//                                .mapToObj(j -> new int[]{i + 1, j + 1})
//                )
//                .findFirst()
//                .orElse(new int[]{-1, -1});
//    }
}


