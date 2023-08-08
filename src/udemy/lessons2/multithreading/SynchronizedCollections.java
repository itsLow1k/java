package udemy.lessons2.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollections {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        } // Заполняем лист числами
        List<Integer> synchList = Collections.synchronizedList(arrayList); // Помещаем ранее созданный лист в новый синхронизированный
        Runnable runnable = (() -> {
            synchronized (synchList) {  // Синхронизируем выполнение кода, чтобы избежать ошибки из-за того, что сразу 2 потока работает с коллекцией
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        }); // C помощью итератора проходимся по листу и проверяем, есть ли следующий объект, пока он есть, выводим его на экран
        Runnable secondRunnable = () -> {   // Не синхронизируем удаление, т.к. у нас 2 операции, одна из которых уже синхронизирована
            for (int i = 0; i < 100; i++) {
                synchList.remove(i * 5);
            }
        }; // Удаляем из листа числа по индексу, 100 раз
        Thread thr1 = new Thread(runnable); // Создаем поток, который будет обрабатывать runnable
        Thread thr2 = new Thread(secondRunnable);
        thr1.start(); // Запускаем поток
        thr2.start();
        thr1.join(); // Ожидаем заваршения работы потока
        thr2.join();
        System.out.println(arrayList);
    }


}
