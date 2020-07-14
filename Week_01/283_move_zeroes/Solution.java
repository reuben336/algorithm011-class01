class Solution {

  public void moveZeroes1(int[] nums) {
    if (nums == null || nums.length < 2) {
      return;
    }

    int j = 0;
    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] != 0) {
        nums[j++] = nums[i];
      }
    }
    for (int i = j; i < nums.length; ++i) {
      nums[i] = 0;
    }
  }

  public void moveZeroes2(int[] nums) {
    if (nums == null || nums.length < 2) {
      return;
    }

    int pos = 0;
    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] != 0) {
        if (i != pos) {
          nums[pos] = nums[i];
          nums[i] = 0;
        }
        pos++;
      }
    }
  }
}

