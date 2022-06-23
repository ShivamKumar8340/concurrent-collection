package iterator.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shivam");
        list.add("kumar");
        list.add("amit");
        list.add("aditya");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //when we try to add data on iteration time if will throw the concurrent modification exception
            list.add("dinesh");
        }
    }
}
