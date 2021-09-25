package Generic;

public class GnericDemo1 {
    public static void main(String[] args) {
        Generic<String>g1=new Generic<String>();
        g1.show("林青霞");
        Generic<Integer>g2=new Generic<Integer>();
        g2.show(30);
    }
}
