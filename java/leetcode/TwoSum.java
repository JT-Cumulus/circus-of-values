package leetcode;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Hashtable;

class TwoSum{
    
public static void main(String[] args) {
    
    /*
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    int[] nums = {2,3,4};
    int target = 6;

    System.out.println(Arrays.toString(twoSum(nums, target)));


    }

    public static int[] twoSum(int[] inputArray, int targetNumber){
        Hashtable<Integer, Integer> output = new Hashtable<>();
        int[] ans = new int[2];
        output.put(inputArray[0], 0);
        for(int i = 0; i < inputArray.length; i++){
            int value = targetNumber - inputArray[i];

            if(output.containsKey(value)){
                ans[0] = inputArray[i];
                ans[1] = value;
            } else {
                output.put(inputArray[i], i);
            }
        }

        return ans;

    }
}
