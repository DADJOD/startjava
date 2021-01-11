public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfFirst = new Wolf();
        System.out.println("Wolf name is - " + wolfFirst.name);
        System.out.println("Wolf color is - " + wolfFirst.color);
        wolfFirst.go();
        wolfFirst.howl();
    }
}