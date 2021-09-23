package ExceptionDemo;

import java.util.Scanner;

public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        int score =sc.nextInt();
        Teacher t=new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreExpection e) {
            e.printStackTrace();
        }
    }
}
