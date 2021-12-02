package DataOutputStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.DataOutputStream:数据专属流，这个流可以将数据以及数据的类型一同写入到文件中。
注意：这个文件不是普通文本文档（使用记事本打不开）
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建数据专属的字节输出流
        DataOutputStream data=new DataOutputStream(new FileOutputStream("data01"));
        //刷新
        byte b=100;
        short s=200;
        int i=300;
        long l=400;
        float f= 3.0F;
        double d=3.14;
        boolean sex=false;
        char c='a';

        data.writeByte(b);//把数据及数据的类型一并写入到文件当中
        data.writeShort(s);
        data.writeInt(i);
        data.writeLong(l);
        data.writeFloat(f);
        data.writeDouble(d);
        data.writeBoolean(sex);
        data.writeChar(c);
        data.flush();
        data.close();
    }
}
