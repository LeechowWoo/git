package MyDuoTai;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao=new AnimalOperator();
        Cat c=new Cat();
        Dog d=new Dog();
        ao.useAnimal(c);
        ao.useAnimal(d);
    }
}
