import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        int counts = 0;
        boolean flag;
        do {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                    counts++;
                }
            }
        } while (!flag);
        System.out.println("Counts = " + counts);
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[] startArray = new int[]{9, 6, 3, 8, 5, 2, 0, 7, 4, 1, 19, 16, 13, 18, 15, 12, 10, 20, 17, 14, 11};
        System.out.print("Start Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();

        bubbleSort(startArray);
        System.out.print("Sort Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
    }
}

