import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Binary Search Algorithm");

        System.out.println("Enter total number of elements:");
        int lengthOfTheArray = input.nextInt();

        int[] arrayOfIntegersToSearchIn = new int[lengthOfTheArray];

        System.out.printf("Enter %d integers:%n", lengthOfTheArray);
        for (int i = 0; i < lengthOfTheArray; i++) {
            arrayOfIntegersToSearchIn[i] = input.nextInt();
        }

        System.out.println("Enter number to be searched in an array:");
        int key = input.nextInt();

        int index = binarySearch(arrayOfIntegersToSearchIn, key);

        if (index == -1) {
            System.out.printf("Sorry, %d doesn't exist in this array.%n", key);
        } else {
            System.out.printf("%d has an index of %d.%n", key, index);
        }

        input.close();
    }

    public static int binarySearch(int[] input, int target) {
        int[] array = sortArray(input);

        int start = 0;
        int end = array.length - 1;

        while (end >= start) {
            int middle = (start + end) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                start = middle + 1;
            } else if (array[middle] > target) {
                end = middle - 1;
            }
        }

        return -1;
    }

    private static int[] sortArray(int[] array) {
        int temp;

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }
}
