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

        return arrayToSort;
    }
}
