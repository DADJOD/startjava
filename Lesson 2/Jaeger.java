public class Jaeger {
    private String mark = "X-fighter";
    private String modelName = "Ivan";
    private int height = 170000;
    private int weight = 90000;
    private int age = 2;
    private int armor = 200;

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    String scanKaiju() {
        return "nothing";
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
