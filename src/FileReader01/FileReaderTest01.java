package FileReader01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader:文件字符输入流，只能读取普通文本文件，读取文本内容时，比较快捷，方便。
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fir=null;
        try {
            fir=new FileReader("myfile");//创建字符输入流
            char[]chars=new char[4];
            int readcount=0;
            while((readcount=fir.read(chars))!=-1){
                System.out.print(new String(chars,0,readcount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fir != null) {
                try {
                    fir.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
