package iterator.failFastMultithread;

import java.util.List;

public class FailFastUpdate extends Thread{
    public List<Integer> list;

    public FailFastUpdate(List<Integer> list) {
        this.list = list;
    }
    @Override
    public void run(){
        int i =1;
        while (i<10) {
            list.add(i);
            i++;
        }
    }
}
