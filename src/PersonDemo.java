public class PersonDemo {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        Teacher t2=new Teacher("风清扬",30);
        t1.setName("林青霞");
        t1.setAge(20);
        System.out.println(t1.getName()+"，"+t1.getAge());
        t1.teach();
        System.out.println(t2.getName()+"，"+t2.getAge());
    }
}
