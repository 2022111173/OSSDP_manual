import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L2022111173_2_Test {

    private final Solution2 solution = new Solution2();

    /**
     *测试不需要改动的的字符串
     */
    @Test
    public void testRemoveDuplicateLetters_AllUnique() {
        String input = "abcdef";
        String expected = "abcdef";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     *测试一个字符多次出现的字符串
     */
    @Test
    public void testRemoveDuplicateLetters_AllSame() {
        String input = "aaaaaa";
        String expected = "a";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     *测试整体升序字符串
     */
    @Test
    public void testRemoveDuplicateLetters_MixedDuplicates() {
        String input = "abacabad";
        String expected = "abcd"; // 字典序最小
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     *测试空串
     */
    @Test
    public void testRemoveDuplicateLetters_EmptyString() {
        String input = "";
        String expected = "";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     *测试一个字符在单词中出现多次
     */
    @Test
    public void testRemoveDuplicateLetters_LongString() {
        String input = "leetcode";
        String expected = "letcod"; // 字典序最小
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     * 测试单个字符
     */
    @Test
    public void testRemoveDuplicateLetters_SingleCharacter() {
        String input = "z";
        String expected = "z";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     *测试期望结果不升序也不降序的情况
     */
    @Test
    public void testRemoveDuplicateLetters_VariedCharacters() {
        String input = "bbcaac";
        String expected = "bac"; // 字典序最小
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }
}