package leetcode.problem35;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
         for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                result = i;
            } else {
                if (target > nums[i]){
                    result = i+1;
                }
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        new SearchInsert().searchInsert(new int[] {1,3,5,6}, 7);
    }
}
