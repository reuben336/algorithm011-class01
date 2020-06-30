import java.util.Arrays;

class Solution {

  /**
   * 排序：分别对两个字符串排序，看结果是否相同
   * <p>
   * 时间复杂度：(nlogn)
   */
  public boolean isAnagram1(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] str1 = s.toCharArray();
    char[] str2 = t.toCharArray();
    Arrays.sort(str1);
    Arrays.sort(str2);
    return Arrays.equals(str1, str2);
  }

  /**
   * 哈希表：计算两个字符串中字母出现的次数并比较；可以只用一个计数器，s增加，t减少，最后检查是否为零
   * <p>
   * 时间复杂度：O(n)
   */
  public boolean isAnagram2(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] counter = new int[26];
    for (int i = 0; i < s.length(); ++i) {
      counter[s.charAt(i) - 'a']++;
      counter[t.charAt(i) - 'a']--;
    }
    for (int count : counter) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }
}