package Coach_Athletes;

public class BaskstballCoach extends Coach{
    public BaskstballCoach() {
    }

    public BaskstballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练在吃饭");
    }
}
