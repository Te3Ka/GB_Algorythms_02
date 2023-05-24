import java.util.Arrays;

public class FindElement {
    public static int findElement(int[] array, int value){
        int counts = 0;
        for (int i = 0; i < array.length; i++){
            counts++;
            if (array[i] == value){
                System.out.println("Counts = " + counts);
                return i;
            }
        }
        System.out.println("Counts = " + counts);
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Find Element");
        int[] startArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.print("Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();

        int element = 8;
        System.out.print("Element = " + element);
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();

        System.out.print("Index = " + findElement(startArray, element));
    }
}
