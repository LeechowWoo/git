package Hash;

import java.util.HashSet;

public class Hashset01 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("world");
        for(String s:hs){
            System.out.println(s);
        }
    }
}
