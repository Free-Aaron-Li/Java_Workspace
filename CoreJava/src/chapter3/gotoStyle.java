package chapter3;

import java.util.Scanner;

public class gotoStyle {
    public static void main(String[] args) {
        System.out.print("how number? ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int total = 0;
        label_1:
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                total += i;
                System.out.print(total + " ");
                if (total > 30) break label_1;  /* 当执行该语句，将跳转对应带此标签的语句块末尾 */
            }
            System.out.println("hi!");  /* 该语句不会被执行 */
        }
        System.out.println("well!");
    }
}
