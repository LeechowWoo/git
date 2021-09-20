package Interface_Dog_Cat;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j=new Cat();
        j.jump();
        System.out.println("----------------");
        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+'，'+a.getAge()+"岁");
        a.eat();
    }
}