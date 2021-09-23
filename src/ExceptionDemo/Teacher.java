package ExceptionDemo;

public class Teacher {
    public void checkScore(int score) throws ScoreExpection{
        if(score<0 || score>100){
            throw new ScoreExpection("你给出的分数有误，请重新输入");
        }
        else{
            System.out.println("分数正常");
        }
    }
}
