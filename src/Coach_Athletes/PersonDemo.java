package Coach_Athletes;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangAthlete p=new PingPangAthlete();
        p.setName("王浩");
        p.setAge(20);
        System.out.println(p.getName()+"，"+p.getAge()+"岁");
        p.eat();
        p.study();
        p.speak();
    }
}
