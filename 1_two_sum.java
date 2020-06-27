import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            numsMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            if(numsMap.containsKey(target - nums[i])) {
                int index = numsMap.get(target - nums[i]);
                if (i != index) {
                    res[0] = i;
                    res[1] = index;
                    return res;
                }
            }
        }
        return res;
    }
}