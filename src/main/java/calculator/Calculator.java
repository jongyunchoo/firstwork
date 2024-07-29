package calculator;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> typeCircle =new ArrayList<>();

    int num1;
    int num2;
    char operator;
    double  result;

    public int calculate(int num1, int num2, char operator) throws InvalidOperatorException {
        double result = 0;

        switch (operator) {
            case '+':
                return  num1 + num2;
            case '-':
                return  num1 - num2;
            case '*':
                return  num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new InvalidOperatorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                }
                return num1 / num2;
            default:
                throw new InvalidOperatorException("지원되지 않은 연산자입니다." + operator);
        }
    }
}
