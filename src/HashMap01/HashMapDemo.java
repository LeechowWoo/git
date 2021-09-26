package HashMap01;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student,String> map=new HashMap<>();
        Student s1=new Student("林青霞",30);
        Student s2=new Student("张曼玉",35);
        Student s3=new Student("王祖贤",34);
        Student s4=new Student("王祖贤",34);
        map.put(s1,"西安");
        map.put(s2,"武汉");
        map.put(s3,"郑州");
        map.put(s4,"北京");
        Set<Student> keyset =map.keySet();//得到所有key的集合
        for(Student key:keyset){//增强for遍历集合
            String value=map.get(key);
            System.out.println(key.getName()+"，"+key.getAge()+"，"+value);
        }
    }
}
