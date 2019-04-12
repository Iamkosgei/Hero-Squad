public class Hero {
    private String name;
    private int age;
    private String special_power;
    private  String weakness;

    public Hero(String name, int age, String special_power, String weakness) {
        this.name = name;
        this.age = age;
        this.special_power = special_power;
        this.weakness = weakness;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecial_power() {
        return special_power;
    }

    public String getWeakness() {
        return weakness;
    }
}
