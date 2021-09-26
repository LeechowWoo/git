package HashMap01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/*
HashMap作为元素添加到ArrayList集合中
 */

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array=new ArrayList<HashMap<String, String>>();
        HashMap<String,String> map1=new HashMap<>();
        map1.put("孙策","大乔");
        map1.put("周瑜","小乔");
        array.add(map1);
        HashMap<String,String> map2=new HashMap<>();
        map2.put("郭靖","黄蓉");
        map2.put("杨过","小龙女");
        array.add(map2);
        HashMap<String,String> map3=new HashMap<>();
        map3.put("令狐冲","任盈盈");
        map3.put("林平之","岳林珊");
        array.add(map3);
        for(HashMap<String,String> map:array){
            Set<String> keyset=map.keySet();
            for(String key:keyset){
                String value=map.get(key);
                System.out.println(key+"，"+value);
            }
        }
    }
}
