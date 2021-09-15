import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        ArrayList<Student01>array=new ArrayList<Student01>();
        while(true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请做出你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addstudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deletestudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updatestudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findallstudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);//java虚拟机退出
            }
        }
    }
    public static void addstudent(ArrayList<Student01> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生学号");
        String sid=sc.nextLine();
        System.out.println("请输入学生姓名");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄");
        String age=sc.nextLine();
        System.out.println("请输入学生居住地");
        String address=sc.nextLine();
        Student01 s=new Student01();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
        System.out.println("添加学生成功");
    }
    public static void findallstudent(ArrayList<Student01> array){
        if(array.size()==0){
            System.out.println("无信息，请先添加信息再查询");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住的");//\t相当于tab键一次
        for(int i=0;i<array.size();i++){
            Student01 s=array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t\t"+s.getAddress()+"\t");
        }
    }
    public static void deletestudent(ArrayList<Student01> array) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除的学生学号：");
        String sid=sc.nextLine();
        int index=-1;
        for (int i = 0; i < array.size(); i++) {
            Student01 s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if(index==-1){
            System.out.println("该信息不存在，请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除成功");
        }
    }
    public static void updatestudent(ArrayList<Student01> array){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号：");
        String sid=sc.nextLine();
        System.out.println("请输入学生新姓名：");
        String name=sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age=sc.nextLine();
        System.out.println("请输入学生新居住的：");
        String address=sc.nextLine();
        Student01 s=new Student01();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        for(int i=0;i<array.size();i++){
            Student01 student = array.get(i);
            if(student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }
        }
        System.out.println("修改学生成功");
    }
}
