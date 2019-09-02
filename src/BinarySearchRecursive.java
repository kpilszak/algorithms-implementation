import java.util.Scanner;

public class BinarySearchRecursive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Binary Search Algorithm with recursion");

        System.out.println("Enter total number of elements:");
        int lengthOfTheArray = input.nextInt();

        int[] arrayOfIntegersToSearchIn = new int[lengthOfTheArray];

        System.out.printf("Enter %d integers:%n", lengthOfTheArray);
        for (int i = 0; i < lengthOfTheArray; i++) {
            arrayOfIntegersToSearchIn[i] = input.nextInt();
        }

        System.out.println("Enter number to be searched in an array:");
        int key = input.nextInt();

        int index = recursiveBinarySearch(arrayOfIntegersToSearchIn, key);

        if (index == -1) {
            System.out.printf("Sorry, %d doesn't exist in this array.%n", key);
        } else {
            System.out.printf("%d has an index of %d.%n", key, index);
        }

        input.close();
    }

    public static int recursiveBinarySearch(int[] input, int key) {
        input = sortArray(input);
        return binarySearch(input, 0, input.length - 1, key);
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

    private static int binarySearch(int[] array, int start, int end, int target){
        int middle = (start + end) / 2;
        if (end < start) {
            return -1;
        }

        if (target == array[middle]) {
            return middle;
        } else if (target < array[middle]) {
            return binarySearch(array, start, middle - 1, target);
        } else {
            return binarySearch(array, middle + 1, end, target);
        }
    }
}
