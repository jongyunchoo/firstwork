package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[10];
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
            char operator = sc.next().charAt(0);

            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
            }
            System.out.println("결과 : " + result);

            for(int i =0; i<intArray.length; i++) {
                intArray[i] = result++;
            };
            for(int i = 0; i<intArray.length; i++ ) {
                System.out.println(intArray[i] + " ");
            };

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            String exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료하갰습니다.");
                break;
            }

        }
    }
}
