package udemy.lessons2.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunThreadsSynchronized {
    public static void main(String[] args) throws InterruptedException {
        IncrementCounterTest2 incrementCounterTest2 = new IncrementCounterTest2();

        Thread thr1 = new Thread(new Thread1Synchronized(incrementCounterTest2)); // Создаем поток и в параметрах передаем объект, по которому будет происходить синхронизация.
        Thread thr2 = new Thread(new Thread2Synchronized(incrementCounterTest2));

        thr1.start();
        thr2.start();

        thr1.join();
        thr2.join();

        incrementCounterTest2.getCounter();
    }
}

class IncrementCounter {
    Lock lock = new ReentrantLock();
    private int counter = 0;
                                                // Lock method
//    public void setCounter(int value) {
//        lock.lock();
//        for (int i = 0; i < value; i++) {
//            counter++;
//        }
//        lock.unlock();
//    }
                                                // Synchronized method
        public synchronized void setCounter(int value) {
        for (int i = 0; i < value; i++) {
            counter++;
        }
    }

    public void getCounter() {
        System.out.println(counter);
    }
}

class Thread1Synchronized implements Runnable {
    private final IncrementCounterTest2 incrementCounterTest2;        // Создаем переменную, которая хранит адрес объекта по которому происходит синхронизация

    public Thread1Synchronized(IncrementCounterTest2 incrementCounterTest2) {     // Записываем во внутреннюю переменную адрес объекта по которому происходит синхронизация
        this.incrementCounterTest2 = incrementCounterTest2;
    }
    @Override
    public void run() {
        incrementCounterTest2.setCounter(10000);
    }
}

class Thread2Synchronized implements Runnable {
    private final IncrementCounterTest2 incrementCounterTest2;

    public Thread2Synchronized(IncrementCounterTest2 incrementCounterTest2) {
        this.incrementCounterTest2 = incrementCounterTest2;
    }

    @Override
    public void run() {
        incrementCounterTest2.setCounter(10000);
    }
}
