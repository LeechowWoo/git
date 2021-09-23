package ExceptionDemo;

public class ExceptionDemo {
    public static void main(String[] args) {
        method();
    }
    //编译时异常
    public static void method2(){

    }
    //运行时异常
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
