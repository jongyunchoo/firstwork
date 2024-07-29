package calculator;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> title= new ArrayList<>();
        title.add(0);

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

            for(int i = 0; i <title.size(); i++)    {
                Integer num = title.get(i);
                System.out.println(i + " : " + num);
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제 아니면 add 입력 시 다시)");

            String power = sc.next();
            if(power.equals("remove")) {
                title.remove(0);
                System.out.println("삭제하겠습니다.");
            } else if (power.equals("add")) {
                title.add(0, num1);
                System.out.println("다시 하겠습니다.");
                continue;
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            for(int inquiry: title) {
                System.out.println(inquiry + " " );
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            String exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료하겠습니다.");
                break;
            }

        }
    }
}