package Coach_Athletes;

public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员在吃饭");
    }
}
