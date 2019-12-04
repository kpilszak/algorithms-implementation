import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insertion Sort Algorithm");

        System.out.println("Enter total number of elements:");
        int lengthOfTheArray = input.nextInt();

        int[] arrayOfIntegersToSort = new int[lengthOfTheArray];

        System.out.printf("Enter %d integers:%n", lengthOfTheArray);
        for (int i = 0; i < lengthOfTheArray; i++) {
            arrayOfIntegersToSort[i] = input.nextInt();
        }

        int[] sortedArray = insertionSort(arrayOfIntegersToSort);

        System.out.printf("Sorted array using Insertion Sort Algorithm: %s%n",
                Arrays.toString(sortedArray));

        input.close();
    }

    private static int[] insertionSort(int[] arrayToSort) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arrayToSort.length; firstUnsortedIndex++) {
            int newElement = arrayToSort[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && arrayToSort[i - 1] > newElement; i--) {
                arrayToSort[i] = arrayToSort[i - 1];
            }

            arrayToSort[i] = newElement;
        }
        return arrayToSort;
    }
}
