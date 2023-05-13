package chapter3;

/**
 * @author AaronLi
 * @date 2023-05-10-下午11:58
 * @license GPL-3.0
 */
public class StringCodePoint {
    public static void main(String[] args) {
        /* length方法返回UTF-16编码表示给定字符串所需的代码单元个数 */
        String string = "Hello";
        int n = string.length();    /* 5 */

        /* 想要得到实际长度，即码点个数 */
        int codepoint = string.codePointCount(0, n);    /* 5 */

        /* 若想要返回位置n处的代码单元 */
        char first_char = string.charAt(0); /* H */
        char last_char = string.charAt(n - 1);  /* o */

        String new_string = "\uD83C\uDF7Ais no one code point ";

        /* ™需要两个代码点 */
        System.out.println(new_string);
        char two_char = new_string.charAt(1);
        System.out.println(two_char);   /* 显示空格，准确来说是🍺的第二个代码单元 */

        /* 字符串代码单元流 */
        int[] code_points = new_string.codePoints().toArray();
    }
}
