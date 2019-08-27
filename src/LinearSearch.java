import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Linear Search Algorithm");

        System.out.println("Enter total number of elements:");
        int lengthOfTheArray = input.nextInt();

        int[] arrayOfIntegersToSearchIn = new int[lengthOfTheArray];

        System.out.printf("Enter %d integers:%n", lengthOfTheArray);
        for (int i = 0; i < lengthOfTheArray; i++) {
            arrayOfIntegersToSearchIn[i] = input.nextInt();
        }

        System.out.println("Enter number to be searched in an array:");
        int key = input.nextInt();

        int index = linearSearch(arrayOfIntegersToSearchIn, key);

        if (index == -1) {
            System.out.printf("Sorry, %d doesn't exist in this array.%n", key);
        } else {
            System.out.printf("%d has an index of %d.%n", key, index);
        }

        input.close();
    }

    public static int linearSearch(int[] input, int key) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == key) {
                return i;
            }
        }

        return -1;
    }
}
