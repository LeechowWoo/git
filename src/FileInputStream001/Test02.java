package FileInputStream001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\java笔记\\temp");
//            while(true){
//                int readdata=fis.read();
//                if(readdata==-1)break;
//                System.out.println(readdata);
//            }
            int readdata=0;
            while((readdata=fis.read())!=-1){
                System.out.println(readdata);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
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
