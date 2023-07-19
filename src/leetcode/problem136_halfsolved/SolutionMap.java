package leetcode.problem136_halfsolved;

import java.util.HashMap;
import java.util.Map;

public class SolutionMap {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> inputNums = new HashMap<>();
        for (int a : nums) {
            if (inputNums.containsKey(a)) {
                inputNums.remove(a, a);        // Решение удовлетворяет условию, что каждый элемент, кроме одного, существует в 2 экземплярах.
            } else {                           // Каждый элемент будет добавлен и удален, если существует в 2ух экземплярах.
                inputNums.put(a, a);
            }
        }
        for (int a : inputNums.keySet()) {
            System.out.println(inputNums.get(a));
            return inputNums.get(a);          // Решение будет некорректным, если по условию, одинаковых элементов может быть больше 2ух.
        }
        return 0;
    }

    public static void main(String[] args) {
        SolutionMap s = new SolutionMap();
        s.singleNumber(new int[]{4, 1, 2, 1, 2});
    }
}

