package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java"); 
        Iterator<String>it= c.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
