package FileInputStream001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream的其他常用方法：
int available():返回流中剩余的没有读取到的字节数量
long skip(long n):跳过几个字节不读
 */
public class Test05 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\java笔记\\temp");
            System.out.println(fis.available());
            /*
            int readbyte=fis.read();
            System.out.println(fis.available());
             */
            //在读取前通过available获取数组的长度，就不需要循环，直接建一个相应长度的数组，全部填进去
            byte[]bytes=new byte[fis.available()];//这种方式不适合太大的文件，因为byte[]数组不能太大
            int readcount=fis.read(bytes);
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
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
