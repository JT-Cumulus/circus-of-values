package dp;

public class Kadane {
    
    public int run(int[] nums){
        int globalMax = nums[0];
        int localMax = nums[0];

        for(int i=1;i<nums.length;++i){
            localMax = Math.max(nums[i], localMax + nums[i]);

            if(localMax > globalMax){
                globalMax = localMax;

            }
        }
        return globalMax;
    }
}
