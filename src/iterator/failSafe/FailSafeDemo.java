package iterator.failSafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[] {1,3,2,5});
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            System.out.println(i);
            if (i==3){
                list.add(15);
                // it will not be printed
                // this means it is created a copy of the collection
            }
        }
    }
}
