import java.util.Hashtable;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] test2 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDupes(nums));
        System.out.println(containsDupes(test2));
    }

    public static Boolean containsDupes(int[] inputArray){
        Boolean ans = false;

        Hashtable<Integer, Integer> map = new Hashtable<>();

        for (int i = 0; i < inputArray.length; i++){
            if(map.containsKey(inputArray[i]) == false){
                map.put(i, inputArray[i]);
            } else {
                ans = true;
            }
        }

        return ans;
    }
}
