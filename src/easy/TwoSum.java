package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,9,11};
        int target = 9;

        System.out.println(Arrays.toString(twoSumHashMap(nums,target)));
        System.out.println(Arrays.toString(twoSumTwoPointer(nums,target)));

    }

    static int[] twoSumHashMap(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }else{
                map.put(nums[i],i);
            }
        }

        return new int[]{};
    }

    static int[] twoSumTwoPointer(int[] nums, int target){

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            if (nums[left] + nums[right] == target) return new int[]{left,right};
            if (nums[left] + nums[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};

    }



}
