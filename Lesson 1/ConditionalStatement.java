public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 20;
        if (age > 20) {
            System.out.println("возраст равен " + age);
        }

        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Это мужчина");
        }

        if (!maleGender) {
            System.out.println("Это не мужчина");
        }

        double weight = 1.90;
        if (weight < 1.80) {
            System.out.println("Рост меньше 180см");
        } else {
            System.out.println("Рост больше 180см");
        }

        String firstLetterOfName = "J";
        if (firstLetterOfName == "M") {
            System.out.println("Первой буквой имени является - М");
        } else if (firstLetterOfName == "I") {
            System.out.println("Первой буквой имени является - I");
        } else {
            System.out.println("Первой буквой имени является - J");
        }
    }
}
