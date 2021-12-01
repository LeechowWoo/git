package FileInputStream001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
    /*
    int read(byte[] b)
    一次最多读取b.length个字节，减少硬盘和内存的交互，往byte数组中读。
     */
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\java笔记\\temp");
            byte[]bytes=new byte[4];//准备一个长度为4的数组，一次最多读取4个字节
            //这个方法的返回值是读取的字节的数量，不是读取到的字节本身
            int readcount=fis.read(bytes);
            System.out.println(readcount);//第一次读到4个字节
            System.out.println(new String(bytes));//数组全部转换成字符串
            System.out.println(new String(bytes,0,readcount));//将读取到的数组全部转换为字符串
            readcount=fis.read(bytes);
            System.out.println(readcount);//总共六个字节，第二次读取只能读取2个字节
            System.out.println(new String(bytes));//数组全部转换成字符串
            System.out.println(new String(bytes,0,readcount));//将读取到的数组全部转换为字符串
            readcount=fis.read(bytes);
            System.out.println(readcount);//一个字节都没有读取到就返回-1
            System.out.println(new String(bytes));//数组全部转换成字符串
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
