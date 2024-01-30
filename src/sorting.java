public class sorting{

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {
                // Compare adjacent elements
                if (array[i - 1] > array[i]) {
                    // Swap them if they are in the wrong order
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    // Set swapped to true to indicate a swap occurred
                    swapped = true;
                }
            }

            // After each pass, the largest unsorted element is at the end
            // Reduce the array size for the next pass
            n--;
        } while (swapped);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1};

        // Call bubbleSort to sort the array
        bubbleSort(numbers);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
