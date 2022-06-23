package iterator.failSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> chmp = new ConcurrentHashMap<String, String>();
        chmp.put("java","190000");
        chmp.put("python","150000");
        chmp.put("php","100000");

        Iterator itr = chmp.keySet().iterator();
        while (itr.hasNext()){
            String key = (String) itr.next();
            System.out.println(key+":"+chmp.get(key));
            //this will reflect in iterator
            //this is not created saparate copy of an object
            chmp.put("javascriprt","200000");
        }
    }
}
