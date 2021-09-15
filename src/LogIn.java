import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String username="wulichao";
        String password="abcd";
        for(int i=0;i<3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if(2-i==0){
                    System.out.println("你的账户被锁定");
                }
                else{System.out.println("登录失败,你还有"+(2-i)+"次机会");}
            }
        }
    }
}
