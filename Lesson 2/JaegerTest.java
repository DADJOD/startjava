public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerFirst = new Jaeger();
        Jaeger jaegerSecond = new Jaeger();

        jaegerFirst.setAge(5);
        jaegerFirst.setArmor(250);
        jaegerFirst.drift();

        jaegerSecond.setAge(7);
        jaegerSecond.setArmor(300);
        jaegerSecond.drift();

    }
}
