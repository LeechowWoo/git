public class Demo {
    public static void main(String[] args) {
        Fu f=new Fu();
        f.show();
        Zi z=new Zi();
        z.method();
        z.show();//子类调用父类的方法
    }
}
