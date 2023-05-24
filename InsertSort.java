import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] array){
        int counts = 0;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    counts++;
                }
            }
        }
        System.out.println("Counts = " + counts);
    }

    public static void main(String[] args) {
        System.out.println("Insert Sort");
        int[] startArray = new int[]{9, 6, 3, 8, 5, 2, 0, 7, 4, 1, 19, 16, 13, 18, 15, 12, 10, 20, 17, 14, 11};
        System.out.print("Start Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();

        insertSort(startArray);
        System.out.print("Sort Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
    }
}