package Coach_Athletes;

public class PingPangAthlete extends Athlete implements SpeakEnglish{
    public PingPangAthlete() {
    }

    public PingPangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员在吃饭");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员在学习英语");
    }
}
