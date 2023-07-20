package leetcode.problem136;

import java.util.HashMap;
import java.util.Map;

public class SolutionMapUniqueNumEntrySet {

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
        for (Map.Entry<Integer, Integer> entry: mapOfInputNums.entrySet()){
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SolutionMapUniqueNumEntrySet solution = new SolutionMapUniqueNumEntrySet();
        solution.singleNumber(new int[]{4, 1, 2, 1, 2});
    }
}

