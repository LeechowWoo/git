package FileOut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
/*
字节流写数据的三种方法：
1、write(int b) 将指定的字节写入此文件输出流
2、write(byte[]) 将字节数组写入到此文件输出流
3、write(byte[]b,int off,int len)将字节数组中指定的开始到结束的字节写入到此文件输出流
 */

public class FileOutStream02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\gitcode\\fos.txt");
        /*
        "java project\\fos.txt"相当于将字符串路径封装成为一个File对象：new File("java project\\fos.txt")
         */
        //void write(int b)
//        fos.write(97);
//        fos.write(98);
        //void write(byte[] b)
//        byte[]bys={97,98,99,100,101};
//        fos.write(bys);
        byte[]bys="abcde".getBytes(StandardCharsets.UTF_8);
        fos.write(bys,1,3);
        fos.close();
    }
}
