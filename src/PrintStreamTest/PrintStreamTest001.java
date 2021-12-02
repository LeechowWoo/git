package PrintStreamTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
java.io.PrintStream：标准的字节输出流，默认输出到控制台，不需要手动关闭
 */
public class PrintStreamTest001 {
    public static void main(String[] args) throws Exception {
        System.out.println("hello world");
        PrintStream PS=System.out;//System.out返回的就是一个PrintStream
        PS.println("HELLO");
        PS.println("world");
        //标准输出流不需要手动close();
        //标准输出流不再指向控制台，指向Log文件
        PrintStream ps=new PrintStream(new FileOutputStream("log"));
        System.setOut(ps);
        System.out.println("hello world!!!");
        System.out.println("hello kitty!!!");
    }
}
