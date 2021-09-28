package File;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        //根据一个给定的路径创造一个file
        File srcFile=new File("C:\\Users\\Lenovo\\Desktop\\gitcode");
        getAllFilePath(srcFile);
    }
    public static void getAllFilePath(File srcFile){
        File[]fileArray=srcFile.listFiles();
        if(fileArray!=null){
            for(File file:fileArray){
                if(file.isDirectory()){
                    getAllFilePath(file);
                }
                else{
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
