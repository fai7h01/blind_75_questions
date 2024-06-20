package medium;

public class MaxSubArray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);

    }


    static int maxSubArray(int[] nums){

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            if (currentSum < 0){
                currentSum = 0;
            }

            if (currentSum > maxSum){
                maxSum = currentSum;
            }

        }
        return maxSum;


    }

}
