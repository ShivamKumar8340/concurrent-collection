package concurrentHashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapIteratorDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> cham = new ConcurrentHashMap<Integer,String>();

        cham.put(101,"shivam");
        cham.put(102,"amit");
        cham.put(103,"kashyap");

       Iterator<Map.Entry<Integer,String>> itr = cham.entrySet().iterator();
       while (itr.hasNext()) {
           Map.Entry<Integer,String> entry = itr.next();
           System.out.println(entry.getKey()+":"+entry.getValue());
       }
    }
}
