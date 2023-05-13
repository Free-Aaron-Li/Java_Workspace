package chapter3.demo;

import java.io.Console;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

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
        String string = "Java™";
        System.out.println(string);

        /* 子串 */
        System.out.println(string.substring(0, 3));

        /* join 方法分隔字符 */
        System.out.println(String.join("/", "L", "i"));

        String string_1 = "this is good!";
        String string_2 = "this is Good!";
        /* 比较字符串 */
        System.out.println("this result_1 is " + string_1.equals(string_2) + " and result_2 is " + string_1.equalsIgnoreCase(string_2));

        /* 文本块 */
        String text = """
                This is a block of text.
                and It wraps automatically.\
                cool!
                """;
        System.out.println(text);
        /*  会自动换行 */
        System.out.println("Hello World!");
        /* 不会换行 */
        System.out.print("Hello World!");

        System.out.println("*************************");

        /* 构造Scanner对象 */
        Scanner input = new Scanner(System.in);
        /* 读取姓名和年龄 */
        System.out.print("请问您的姓名是：");
        String name = input.nextLine();
        System.out.print("请问您的年龄是：");
        int age = input.nextInt();
        System.out.println("姓名：" + name + "\n年龄：" + age);

        /* 由于IDEA无法调用系统控制台，所以console为null。需自己在控制台编译 */
        /* 用于输入密码等需要隐藏信息的内容 */
        Console console = System.console();
        if (console != null) {
            String user_name = console.readLine("Username: ");
            char[] password = console.readPassword("Password: ");
            System.out.println("user_name is:" + user_name + " password is:" + String.valueOf(password));
        } else {
            System.out.println("error console is null!");
        }

        /* 文件读取 */
        /* 获取启动目录 */
        System.out.println(System.getProperty("user.dir"));
        Scanner input_2;
        try {
            input_2 = new Scanner(Path.of("asset/data.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(input_2.nextLine());

    }
}
