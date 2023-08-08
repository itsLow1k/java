package udemy.lessons2.multithreading;

import java.util.ArrayList;
import java.util.List;

public class RunThreads {
    public static void main(String[] args) {
        Thread1 thr1 = new Thread1();
        thr1.run();
        Thread2 thr2 = new Thread2();
        thr2.run();
    }
}

class SummingArray {
    private List<Integer> summedList = new ArrayList<>();

    public void setList(int max) {
        for (int i = 0; i < max; i++) {
            if (i % 2 == 0) {
                summedList.add(i);
            } else {
                summedList.add(0);
            }
        }
    }

    public void getList() {
        for (int i : summedList){
            System.out.println(i);
        }
    }
}

class Thread1 implements Runnable {
    SummingArray arraySum = new SummingArray();
    @Override
    public void run() {
        arraySum.setList(1000);
        arraySum.getList();
    }
}
class Thread2 implements Runnable {
    SummingArray arraySum = new SummingArray();
    @Override
    public void run() {
        arraySum.setList(1000);
        arraySum.getList();
    }
}
