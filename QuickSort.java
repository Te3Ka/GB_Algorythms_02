public class QuickSort {
    public static void quickSort(int[] array, int startPosition, int endPosition){
        counts++;
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition) / 2];
        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);

        if (leftPosition < endPosition) {
            quickSort(array, leftPosition, endPosition);
        }
        if (startPosition < rightPosition) {
            quickSort(array, startPosition, rightPosition);
        }
    }


    public static int counts = 0;
    public static void main(String[] args) {
        System.out.println("Quick Sort");
        int[] startArray = new int[]{9, 6, 3, 8, 5, 2, 0, 7, 4, 1, 19, 16, 13, 18, 15, 12, 10, 20, 17, 14, 11};
        System.out.print("Start Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();
        quickSort(startArray, 0, startArray.length - 1);
        System.out.print("Sort Array = ");
        for (int i = 0; i < startArray.length; i++) {
            System.out.print(startArray[i] + " ");
        }
        System.out.println();
        System.out.println("Counts = " + counts);
    }
}
