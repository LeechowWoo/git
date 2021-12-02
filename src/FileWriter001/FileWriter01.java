package FileWriter001;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter：文件字符输出流，写，只能输出普通文本
 */
public class FileWriter01 {
    public static void main(String[] args) {
        FileWriter writer=null;
        try {
            writer=new FileWriter("file01",true);//创建文件字符输出流对象
            char[]chars={'我','是','中','国','人'};
            writer.write(chars);
            writer.write(chars,2,3);
            writer.write("我是一个火龙果");//直接将字符串写入
            writer.flush();//刷新
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
