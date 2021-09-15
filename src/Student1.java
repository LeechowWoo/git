public class Student1 {
    private String name;
    private int age;
    public Student1(String name,int age){//构造方法，用来完成对象数据的初始化
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
