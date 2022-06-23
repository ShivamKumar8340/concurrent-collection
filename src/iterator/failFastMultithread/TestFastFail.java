package iterator.failFastMultithread;

import java.util.ArrayList;
import java.util.List;

public class TestFastFail {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(13);
        list.add(11);
        list.add(12);

        FailfastItr t1 = new FailfastItr(list);
        FailFastUpdate t2 = new FailFastUpdate(list);
        FailFastUpdate t3 = new FailFastUpdate(list);
        FailFastUpdate t4 = new FailFastUpdate(list);
        FailFastUpdate t5 = new FailFastUpdate(list);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
