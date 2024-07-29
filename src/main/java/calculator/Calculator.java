package calculator;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> corn =new ArrayList<>();

    int num1;
    int num2;
    char operator;
    double result;

    public int calculate(int num1, int num2, char operator) throws InvalidOperatorException {
        double result = 0;

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
                    throw new InvalidOperatorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                }
                result = num1 / num2;
            default:
                throw new InvalidOperatorException("정답" + operator);
        }
        return (int) result;
    }
}
