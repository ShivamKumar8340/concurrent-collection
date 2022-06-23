package iterator.failFastMultithread;

import java.util.Iterator;
import java.util.List;

public class FailfastItr extends Thread {
    public List <Integer> list;

    public FailfastItr(List<Integer> list) {
        this.list = list;
    }
    @Override
  public  void run() {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
