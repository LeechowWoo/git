package BufferedReader02;

import java.io.*;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("copy002.java");
        InputStreamReader reader=new InputStreamReader(in);//通过转换流将字节流转换为字符流
        //这行代码中，in是节点流，reader是包装流
        BufferedReader br=new BufferedReader(reader);
        //在这行代码中reader是节点流，br是包装流
        String line=null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
