package FileInputStream001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\java笔记\\temp1");
            byte[]bytes=new byte[4];
            /*
            while(true){
                int readcount=fis.read(bytes);
                if(readcount==-1)break;
                System.out.print(new String(bytes,0,readcount));
            }

             */
            int readcount=0;
            while ((readcount=fis.read(bytes))!=-1){
                System.out.print(new String(bytes,0,readcount));
            }
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
