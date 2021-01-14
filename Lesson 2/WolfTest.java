public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfFirst = new Wolf();
        System.out.println("Wolf name is - " + wolfFirst.getName());
        System.out.println("Wolf color is - " + wolfFirst.getColor());
        wolfFirst.setAge(9);
        System.out.println(wolfFirst.setAge(8));
        wolfFirst.go();
        wolfFirst.howl();
    }
}