package File;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1=new File("E:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("--------------");
        File f2=new File("E:\\itcast\\javaee");
        System.out.println(f2.mkdir());
        File f3=new File("E:\\itcast\\javase\\javac");
        System.out.println(f3.mkdirs());
    }
}
