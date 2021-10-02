package FileOut;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\gitcode\\fos.txt");
        //通过FileOutputStream往文件C:\Users\Lenovo\Desktop\gitcode\fos.txt中写(write)数据
        /*
        做了三件事情：
        1、调用系统功能创建了文件
        2、创建了字节输出流对象
        3、让字节输出流对象指向创建你好的文件
         */
        fos.write(99);
        fos.close();//close看上去没有任何改变，其实关闭了此文件输出流并释放与此流相关的任何系统资源
    }
}
