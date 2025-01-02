public class activity4 {

    public static void main(String[] args) {
        // Initialize an array with numbers in random order
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Display the array before sorting
        System.out.println("Array before sorting:");
        printArray(array);

        // Sort the array using insertion sort
        insertionSort(array);

        // Display the array after sorting
        System.out.println("Array after sorting:");
        printArray(array);
    }

    // Method to implement insertion sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}