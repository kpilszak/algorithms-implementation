import java.util.Arrays;
import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mergesort Algorithm");

        System.out.println("Enter total number of elements:");
        int lengthOfTheArray = input.nextInt();

        int[] arrayOfIntegersToSort = new int[lengthOfTheArray];

        System.out.printf("Enter %d integers:%n", lengthOfTheArray);
        for (int i = 0; i < lengthOfTheArray; i++) {
            arrayOfIntegersToSort[i] = input.nextInt();
        }

        int[] sortedArray = mergesort(arrayOfIntegersToSort);

        System.out.printf("Sorted array using Mergesort Algorithm: %s%n",
                Arrays.toString(sortedArray));

        input.close();
    }

    private static int[] mergesort(int[] arrayToSort) {
        mergeSortRecursively(arrayToSort, 0, arrayToSort.length);
        return arrayToSort;
    }

    public static void mergeSortRecursively(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSortRecursively(input, start, mid);
        mergeSortRecursively(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];
        while (i < mid && j < end) {
            tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }
}
