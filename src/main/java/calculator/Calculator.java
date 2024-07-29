package calculator;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Integer> typeCircle =new ArrayList<>();

    int firstNumber;
    int secondNumber;
    char operator;
    double  result;

    public int calculate(int firstNumber, int secondNumber, char operator) throws InvalidOperatorException {
        double result = 0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    throw new InvalidOperatorException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                }
                result = firstNumber / secondNumber;
            default:
                throw new InvalidOperatorException("정답" + operator);
        }
        return (int) result;
    }
}
