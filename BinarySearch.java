import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] array, int value, int min, int max){
        counts++;
        int midpoint;
        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }
        if (array[midpoint] < value){
            return binarySearch(array, value, midpoint, max);
        } else {
            if (array[midpoint] > value){
                return binarySearch(array, value, min, midpoint);
            } else {
                return midpoint;
            }
        }
    }
    public static int counts = 0;

    public static void main(String[] args) {
        System.out.println("Binary Search");
        int[] startArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.print("Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();
        int element = 20;
        System.out.println("Element = " + element);
        System.out.println("Index = " + binarySearch(startArray, element, 0, startArray.length));
        System.out.println("Counts = " + counts);
    }
}
