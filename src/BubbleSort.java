import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bubble Sort Algorithm");

        System.out.println("Enter total number of elements:");
        int lengthOfTheArray = input.nextInt();

        int[] arrayOfIntegersToSort = new int[lengthOfTheArray];

        System.out.printf("Enter %d integers:%n", lengthOfTheArray);
        for (int i = 0; i < lengthOfTheArray; i++) {
            arrayOfIntegersToSort[i] = input.nextInt();
        }

        int[] sortedArray = bubbleSort(arrayOfIntegersToSort);

        System.out.printf("Sorted array using Bubble Sort Algorithm: %s%n",
                Arrays.toString(sortedArray));

        input.close();
    }

    private static int[] bubbleSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = arrayToSort.length - 1; j > i; j--) {
                if (arrayToSort[j] < arrayToSort [j - 1]) {
                    swap(arrayToSort, j, j - 1);
                }
            }
        }
        return arrayToSort;
    }

    private static void swap(int[] array, int from, int to){
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}
