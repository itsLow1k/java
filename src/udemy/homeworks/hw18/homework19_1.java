package udemy.homeworks.hw18;
import java.util.Arrays;
public class homework19_1 {
    static void sorted(int[] arr1){
        Arrays.sort(arr1);
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {
        sorted(new int[] {1,-2,0,15,21,5,9,-5,-12});
    }
}
