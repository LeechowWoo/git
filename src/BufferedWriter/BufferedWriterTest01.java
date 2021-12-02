package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
BufferedWriter：带有缓冲的字符输出流
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws IOException {
        //带有缓冲区的字符输出流
        BufferedWriter out=new BufferedWriter(new FileWriter("copy03"));
        out.write("hello world");
        out.flush();
        out.close();
    }
}
