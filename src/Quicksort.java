import java.util.Arrays;
import java.util.Scanner;

public class Quicksort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quicksort Algorithm");

        System.out.println("Enter total number of elements:");
        int lengthOfTheArray = input.nextInt();

        int[] arrayOfIntegersToSort = new int[lengthOfTheArray];

        System.out.printf("Enter %d integers:%n", lengthOfTheArray);
        for (int i = 0; i < lengthOfTheArray; i++) {
            arrayOfIntegersToSort[i] = input.nextInt();
        }

        int[] sortedArray = quicksort(arrayOfIntegersToSort);

        System.out.printf("Sorted array using Quicksort Algorithm: %s%n",
                Arrays.toString(sortedArray));

        input.close();
    }

    private static int[] quicksort(int[] arrayToSort) {
        if (arrayToSort == null || arrayToSort.length == 0) {
            return arrayToSort;
        }
        quicksortRecursive(0, arrayToSort.length - 1);
        return arrayToSort;
    }
}
