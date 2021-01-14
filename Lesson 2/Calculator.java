import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;

public class Calculator {

    public void go() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число: ");
        int firstNum = Integer.parseInt(reader.readLine());

        System.out.println("Какую операцию сделать из этого списка - (+, -, *, /, ^, %) ? ");
        String operation = reader.readLine();

        System.out.println("Введите второе число: ");
        int secondNum = Integer.parseInt(reader.readLine());

        if (firstNum >= 0 & secondNum >= 0) {
            switch (operation) {
                case "+" -> System.out.println(firstNum + secondNum);
                case "-" -> System.out.println(firstNum - secondNum);
                case "*" -> System.out.println(firstNum * secondNum);
                case "/" -> System.out.println(firstNum / secondNum);
                case "^" -> System.out.println(pow(firstNum, secondNum));
                case "%" -> System.out.println(firstNum % secondNum);
            }
        }
    }

    public void returnOperation() throws IOException{
        BufferedReader question = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Хотите продолжить вычисления? [да/нет]:");
        String answer = question.readLine();

        switch (answer) {
            case "нет": break;
            case "да": go();
            default: returnOperation();
        }
    }
}