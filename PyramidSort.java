public class PyramidSort {
    public static void sortElement(int[] array, int arrayLength, int rootIndex) {
        int max = rootIndex;
        int leftRootElement = 2 * rootIndex + 1;
        int rightRootElement = 2 * rootIndex + 2;

        if (leftRootElement < arrayLength && array[leftRootElement] > array[max])
            max = leftRootElement;
        if (rightRootElement < arrayLength && array[rightRootElement] > array[max])
            max = rightRootElement;

        if (max != rootIndex) {
            counts++;
            int temp = array[rootIndex];
            array[rootIndex] = array[max];
            array[max] = temp;

            sortElement(array, arrayLength, max);
        }
    }

    public static void pyramidSort(int[] array) {
        for (int i =  array.length / 2 - 1; i >= 0; i--)
            sortElement(array, array.length, i);

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            sortElement(array, i, 0);
        }
    }

    public static int counts = 0;

    public static void main(String[] args) {
        System.out.println("Pyramid Sort");
        int[] startArray = new int[]{9, 6, 3, 8, 5, 2, 0, 7, 4, 1, 19, 16, 13, 18, 15, 12, 10, 20, 17, 14, 11};
        System.out.print("Start Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();
        pyramidSort(startArray);
        System.out.print("Sort Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();
        System.out.println("Counts = " + counts);
    }
}

