package Copy002;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
使用FileWriter和FileReader进行普通文本文件的拷贝
 */
public class Copy02 {
    public static void main(String[] args) {
        FileWriter out=null;
        FileReader in=null;
        try {
            out=new FileWriter("copy002.java");
            in=new FileReader("src/Copy002/Copy02.java");
            char[]chars=new char[1024*1024];
            int readcount=0;
            while((readcount=in.read(chars))!=-1){
                out.write(chars,0,readcount);
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if ( out!= null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
