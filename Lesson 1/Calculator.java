import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число: ");
        int firstNum = Integer.parseInt(reader.readLine());

        System.out.println("Введите первое число: ");
        int secondNum = Integer.parseInt(reader.readLine());

        if (firstNum >= 0 & secondNum >= 0) {
            System.out.println("Какую операцию сделать из этого списка - (+, -, *, /, ^, %) ? ");
            String operation = reader.readLine();

            if (operation.equals("+")) {
                System.out.println(firstNum + secondNum);
            } else if (operation.equals("-")) {
                System.out.println(firstNum - secondNum);
            } else if (operation.equals("*")) {
                System.out.println(firstNum * secondNum);
            } else if (operation.equals("/")) {
                System.out.println(firstNum / secondNum);
            }else if (operation.equals("^")) {
                System.out.println(pow(firstNum, secondNum));
            } else if (operation.equals("%")) {
                System.out.println(firstNum % secondNum);
            }
        }
    }
    public static int pow(int firstNum, int secondNum) {
        return (int) Math.pow(firstNum, secondNum);
    }
}