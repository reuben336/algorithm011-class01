import java.util.HashMap;
import java.util.Map;

class Solution {

  public int[] twoSum1(int[] nums, int target) {
    for (int i = 0; i < nums.length; ++i) {
      for (int j = i + 1; j < nums.length; ++j) {
        if (nums[j] == target - nums[i]) {
          return new int[]{i, j};
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  public int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; ++i) {
      int diff = target - nums[i];
      if (map.containsKey(diff)) {
        return new int[]{diff, i};
      }
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
