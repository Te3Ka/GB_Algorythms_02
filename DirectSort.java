import java.util.Arrays;

public class DirectSort {
    public static void directSort(int[] array){
        int counts = 0;
        for (int i = 0; i < array.length - 1; i++){
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minPosition]){
                    minPosition = j;
                }
            }
            if (i != minPosition){
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
                counts++;
            }
        }
        System.out.println("Counts = " + counts);
    }

    public static void main(String[] args) {
        System.out.println("Direct Sort");
        int[] startArray = new int[]{9, 6, 3, 8, 5, 2, 0, 7, 4, 1, 19, 16, 13, 18, 15, 12, 10, 20, 17, 14, 11};
        System.out.print("Start Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();

        directSort(startArray);
        System.out.print("Sort Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
    }
}
