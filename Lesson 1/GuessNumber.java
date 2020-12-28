import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int random = (int) Math.floor(Math.random() * 100);

        int num;
        do {
            System.out.print("Введите искомое число: ");
            num = Integer.parseInt(reader.readLine());
            String answer = (num > random) ? "Введенное вами число больше того, что загадал компьютер" : "Введенное вами число меньше того, что загадал компьютер";

            System.out.println(answer);
        } while (num != random);
        System.out.println("Вы угадали!");
    }
}