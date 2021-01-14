public class Wolf {
    private String gender = "male";
    private String name = "Bio";
    private int weight = 15;
    private int age = 3;
    private String color = "white";
    private String color2 = "white";

    public void go() {
        System.out.println("the wolf is coming");
    }

    public void sit() {
        System.out.println("wolf sitting");
    }

    public void run() {
        System.out.println("the wolf is running");
    }

    public void howl() {
        System.out.println("wolf howling");
    }

    public void hunt() {
        System.out.println("wolf hunts");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else
            this.age = age;
        return age;
    }
}