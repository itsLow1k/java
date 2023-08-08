package udemy.lessons2.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunScheduleSynchronization {
    public static void main(String[] args) {
        IncrementCounterTest2 incrementCounterTest2 = new IncrementCounterTest2();
        System.out.println("Start program");
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);
        for (int i = 0; i < 4; i++) {
            ThreadSchedule threadSchedule = new ThreadSchedule(incrementCounterTest2);
            executorService.schedule(threadSchedule, 3, TimeUnit.SECONDS);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS); // Ожидание завершения нитей
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        incrementCounterTest2.getCounter();
    }
}

class IncrementCounterTest2 {
    Lock lock = new ReentrantLock();
    private int counter = 0;

    public void setCounter(int value) {
        lock.lock();
        for (int i = 0; i < value; i++) {
            counter++;
        }
        lock.unlock();
    }

    public void getCounter() {
        System.out.println(counter);
    }
}

class ThreadSchedule implements Runnable {
    private IncrementCounterTest2 incrementCounterTest2;

    public ThreadSchedule(IncrementCounterTest2 counterTest2) {
        this.incrementCounterTest2 = counterTest2;
    }

    @Override
    public void run() {
        System.out.println("Thread is starting");
        incrementCounterTest2.setCounter(10000);
        System.out.println("Thread is ended");
    }
}
