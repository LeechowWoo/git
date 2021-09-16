public class Teacher extends Person{
    public Teacher(){

    }

    public Teacher(String name, int age) {
        super(name, age);//通过super传递给父类的成员变量
    }

    public void teach(){
        System.out.println("教书");
    }
}
