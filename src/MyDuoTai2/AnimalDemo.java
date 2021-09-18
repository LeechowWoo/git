package MyDuoTai2;
/*
向上转型：
    从子到父
    父类引用指向子类对象
向下转型：
    从父到子
    父类引用转为子类对象
 */

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();//父类引用指向子类对象=向上转型
        a.eat();
        /*
        Cat c=new Cat();
        c.eat();
        c.playgame();

         */
        Cat c=(Cat) a;//向下转型
        c.eat();
        c.playgame();
    }
}
