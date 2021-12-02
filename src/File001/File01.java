package File001;

import java.io.File;
import java.io.IOException;

/*
File
    1、File类和四大家族并无关系，所有File类不能完成文件的读写
    2、File对象代表的是什么？
        文件和路径名的抽象表现形式。
        一个File对象可能是目录，也可能是文件
    3、需要掌握File类中的常用方法
 */
public class File01 {
    public static void main(String[] args) throws Exception {
//        File f1=new File("D:\\file");//创建一个File对象
//        System.out.println(f1.exists());//exists()方法用来判断File是否存在
//        if(!f1.exists()){
//            f1.createNewFile();//如果不存在，就以文件的形式创建出来
//        }
//        if(!f1.exists()){
//            f1.mkdir();//如果不存在，以目录的形式创建出来
//        }
//        File f2=new File("D:/a/b/c/d");
//        if(!f2.exists()){
//            f2.mkdirs();//如果不存在，以多重目录的形式创建出来
//        }
        File f3=new File("C:\\Users\\Lenovo\\Desktop\\java笔记\\temp");
        String path=f3.getParent();
        System.out.println(path);
        File path1=f3.getParentFile();
        System.out.println("获取绝对路径"+path1.getAbsolutePath());
    }
}
