package chapter3;

/**
 * @author AaronLi
 * @date 2023-05-10-下午8:57
 * @license GPL-3.0
 */
public class test {
    public static void main(String[] args) {
        /* 使用以下两种方法检测哪些Unicode字符可以用于标识符 */
        System.out.println(Character.isJavaIdentifierPart('里'));
        System.out.println(Character.isJavaIdentifierStart('$'));

        /* 可以使用关键字var通过变量的初始值推断出它的类型 */
        var vacationDays = 12;
        System.out.println(vacationDays);

        /* Math类中sqrt方法并不会处理任何对象，称为静态方法 */
        System.out.println(Math.sqrt(vacationDays));
        /* 幂方法，pow(x,y)，x的y次方；x,y均为double,返回值也为double */
        System.out.println(Math.pow(10, 3));

        /* 强制类型转换 */
        System.out.println(Math.round(9.997));

        /* 赋值是表达式 */
        int x = 1;
        int y = x += 3;
        System.out.println(y);

        /* 由Unicode字符组成的字符串 */
        String string = "Java\u2122";
        System.out.println(string);

        /* 子串 */
        System.out.println(string.substring(0, 3));

        /* join 方法分隔字符 */
        System.out.println(String.join("/", "L", "i"));

        String string_1 = "this is good!";
        String string_2 = "this is Good!";
        boolean result_1 = string_1.equals(string_2);
        boolean result_2 = string_1.equalsIgnoreCase(string_2);
        /* 比较字符串 */
        System.out.println("this result_1 is " + result_1 + " and result_2 is " + result_2);

        /* 文本块 */
        String text = """
                This is a block of text.
                and It wraps automatically.\
                cool!
                """;
        System.out.println(text);
    }
}
