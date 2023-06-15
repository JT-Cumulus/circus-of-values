import java.util.Random;

public class Quickselect {
    
    private int[] nums;

    public Quickselect(int[] nums) {
        this.nums = nums;
    }

    public int select(int k) {
        return quickSelect(0, nums.length-1, k-1);
    }

    // Partition phase
    private int partition(int firstIndex, int lastIndex){
        int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;

        swap(pivot, lastIndex);

        for(int i = firstIndex; i < lastIndex; i++) {
            if(nums[i] < nums[pivot]) {
                swap(i, firstIndex);
                firstIndex++;
            }
        }

        swap(lastIndex, firstIndex);

        return firstIndex;
    }

    private void swap(int pivot, int lastIndex) {
        int temp = nums[pivot];
        nums[pivot] = nums[lastIndex];
        nums[lastIndex] = temp;
    }

    // Selection phase
    private int quickSelect(int firstIndex, int lastIndex, int k) {

        int pivotIndex = partition(firstIndex, lastIndex);

        if(pivotIndex < k) {
            // we can discard left subarray
            // consider items on right
            return quickSelect(pivotIndex + 1, lastIndex, k);
        } else if(pivotIndex > k) {
            // we can discard the right subarray
            // consider the items on the left
            return quickSelect(firstIndex, pivotIndex - 1, k);
        }

        return nums[pivotIndex];
    }
}
