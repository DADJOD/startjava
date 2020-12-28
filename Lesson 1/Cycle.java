public class Cycle {
    public static void main(String[] args) {
        System.out.println("Все числа от [0, 20]");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("Все числа от [6, -6] (с шагом итерации 2)");
        int counter = -6;
        while (counter <= 6) {
            System.out.println(counter);
            counter += 2;
        }

        int j = 10;
        int sum = 0;
        do{
            j += 1;
            if (j % 2 != 0) {
                sum += j;
            }
        } while (j <= 20);
        System.out.println("Сумма нечетных чисел от 10 до 20 равна - " + sum);
    }
}
