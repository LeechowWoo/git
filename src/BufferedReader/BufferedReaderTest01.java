package BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader:带有缓冲区的字符输入流
使用该流的时候，不需要自己创建char[]数组或byte[]数组，自带缓冲。
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("copy002.java");
        /*
        当一个流的构造方法中需要一个流作为它的参数传入时，被传入的流称为：节点流。
        外部负责包装的流称为：包装流，或叫处理流。
        该程序中FileReader就是节点流，BufferedReader是处理流/包装流
         */
        BufferedReader br=new BufferedReader(reader);
        //关闭流时，只需要关闭最外层的即可，里面的节点流会自动关闭
        //readLine读取一行,但不带换行符
        /*
        String line=br.readLine();
        System.out.println(line);
        String line1=br.readLine();
        System.out.println(line1);
        String line2=br.readLine();
        System.out.println(line2);

         */
        String s=null;
        while((s= br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
    }
}
