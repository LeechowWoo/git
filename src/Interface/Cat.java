package Interface;

public class Cat implements Jumpping {//类实现了接口
    @Override
    public void jump() {
        System.out.println("猫可以跳高");
    }
}
