package udemy.homeworks.hw18;

public class homework19_2 {
    static void showArray(String[][] arr1){
        System.out.print("{ ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print("{");
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j]);
                if(j != arr1[i].length-1){
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if(i != arr1.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        showArray(new String[][] {{"Он", "Она"}, {"Мы", "Они"}, {"Ему", "Ей", "Им"}});
    }
}
