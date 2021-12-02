package FileOutputStream001;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件字节输出流，负责从内存到硬盘的写的过程。
 */
public class Test01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //myfile文件不存在的时候会自动新建
            //这种方式谨慎使用，会将原文件清空再重新写入
            fos=new FileOutputStream("myfile");
            byte[]bytes={97,98,99,100};
            fos.write(bytes);
            fos.write(bytes,0,2);
            /*fos=new FileOutputStream("myfile",true);//append参数为true时，会在文件的末尾添加，而不是清空原文件再写
            byte[]bytes1={101,102,103,104};
            fos.write(bytes1);
            //写完之后一定要刷新

             */
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
