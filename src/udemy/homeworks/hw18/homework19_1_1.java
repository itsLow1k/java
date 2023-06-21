package udemy.homeworks.hw18;

public class homework19_1_1 {
    static void sorted(int[] arr1){
        for (int i = 0; i < arr1.length; i++){
                int min = arr1[i];
            for (int j = i; j < arr1.length; j++){
                if (arr1[j] < min){
                    min = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = min;
                }
            }
            System.out.print(" " + arr1[i]);
        }
    }

    public static void main(String[] args) {
        sorted(new int[] {1,-2,0,-1, 3, 5});
    }
}
