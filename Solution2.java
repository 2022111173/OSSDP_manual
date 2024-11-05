/**
 * @description:
 *
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 *
 *
 * 示例 1：
 *
 * 输入：s = "bcabc"
 * 输出："abc"
 * 示例 2：
 *
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 *
 * 1 <= s.length <= 104
 * s 由小写英文字母组成
 */
public class Solution2 {
    public String removeDuplicateLetters(String s) {
        boolean[] vis = new boolean[26];
        int[] num = new int[26];

        // 统计每个字符的出现次数
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 每遍历一次，将对应字符的计数减1
            num[ch - 'a']--;

            // 如果字符已经在结果中，跳过
            if (vis[ch - 'a']) continue;

            // 移除字典序较大的字符，以保证字典序最小
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                // 如果后面还会出现该字符，则移除它
                if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                    vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    break;
                }
            }
            // 标记字符已在结果中，并将其添加到结果字符串
            vis[ch - 'a'] = true;
            sb.append(ch);
        }
        return sb.toString();
    }
}