package leetcode.problem136_halfsolved;

import java.util.HashMap;
import java.util.Map;

public class SolutionMapUniqueNumKeySet {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mapOfInputNums = new HashMap<>();
        for (int mapKey : nums) {
            if (mapOfInputNums.containsKey(mapKey)) {
                int mapValue = mapOfInputNums.get(mapKey)+1;
                mapOfInputNums.put(mapKey, mapValue);
            } else {
                mapOfInputNums.put(mapKey, 1);
            }
        }
        for (int mapKey : mapOfInputNums.keySet()){
            if (mapOfInputNums.get(mapKey) == 1){
                System.out.println(mapKey);
                return mapKey;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SolutionMapUniqueNumKeySet solution = new SolutionMapUniqueNumKeySet();
        solution.singleNumber(new int[]{4, 1, 2, 1, 2});
    }
}

