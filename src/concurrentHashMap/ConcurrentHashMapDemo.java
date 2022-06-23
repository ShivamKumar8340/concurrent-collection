package concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> chmp = new ConcurrentHashMap<Integer,String>();
        chmp.put(1,"Shivam");
        chmp.put(2,"kashyap");
        chmp.put(3,"Ravi");


        //does not allow because key 2 is already exist
        chmp.putIfAbsent(2,"kumar");

        //first remove  the key
        chmp.remove(2,"kashyap");

        //after remove put the element
        chmp.putIfAbsent(2,"kumar");



       chmp.put(4,"amit");

        System.out.println(chmp);
    }
}
