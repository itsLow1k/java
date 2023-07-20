package leetcode.problem136_halfsolved;

import java.util.HashMap;
import java.util.Map;

public class SolutionMapKeySet {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mapOfInputNums = new HashMap<>();
        for (int a : nums) {
            if (mapOfInputNums.containsKey(a)) {
                mapOfInputNums.remove(a, a);        // Решение удовлетворяет условию, что каждый элемент, кроме одного, существует в 2 экземплярах.
            } else {                           // Каждый элемент будет добавлен и удален, если существует в 2ух экземплярах.
                mapOfInputNums.put(a, a);
            }
        }
        for (int a : mapOfInputNums.keySet()) {
            System.out.println(mapOfInputNums.get(a));
            return mapOfInputNums.get(a);          // Решение будет некорректным, если по условию, одинаковых элементов может быть больше 2ух.
        }
        return 0;
    }

    public static void main(String[] args) {
        SolutionMapKeySet s = new SolutionMapKeySet();
        s.singleNumber(new int[]{4, 1, 2, 1, 2});
    }
}

