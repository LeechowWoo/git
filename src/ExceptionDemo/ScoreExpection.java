package ExceptionDemo;

public class ScoreExpection extends Exception{
    public ScoreExpection() {
    }

    public ScoreExpection(String message) {
        super(message);
    }
}
