
public class Main {
    int min = 5;
    int max = 0;

    void minMax(int[] a) {
        for (int j : a) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println(min + " and " + max);
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.minMax(new int[]{4, 2, 0, 7, -3, -6, 9, 12, 5});
    }
}