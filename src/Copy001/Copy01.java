package Copy001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用FileInputStream和FileOutputStream进行拷贝，拷贝的过程是一边读一边写
使用该方法进行拷贝时，任何类型的文件都适用
 */
public class Copy01 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\001.mp4");//创建一个输入流对象
            fos=new FileOutputStream("D:\\001.mp4");//创建一个输出流对象
            byte[]bytes=new byte[1024*1024];
            int readcount=0;
            while((readcount=fis.read(bytes))!=-1){
                fos.write(bytes,0,readcount);
            }
            fos.flush();//输出流最后要刷新
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭两个流的时候应该分开将两个流try，如果其中一个流出现异常不影响另外一个流的关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
