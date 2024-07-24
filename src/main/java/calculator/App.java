package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int a1 = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int b1 = sc.nextInt();

        System.out.println( " a1 + a2 " + "," + a1 + " , "+b1);

    }
}
