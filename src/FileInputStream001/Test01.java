package FileInputStream001;
/*
java.io.FileInputStream:
    1、文件字节输入流，万能的，任何类型的文件都可以使用这个流进行读取。
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//main方法中一般通过try catch来解决异常
public class Test01 {
    public static void main(String[] args){
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\java笔记\\temp");
            int reardata=fis.read();//这个方法的返回值是读取到的字节本身
            int reardata1=fis.read();
            System.out.println(reardata);
            System.out.println(reardata1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            //在finall语句块中确保流一定被关闭，但关闭的前提是流不为空
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
