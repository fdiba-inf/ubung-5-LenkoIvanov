package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];

         
        
        int uniqueIndex = 0;
        for (int index = 0; index < numbers.length-1; index++) {
            for(int i = 0; i < numbers.length-index-1;) {
                if (numbers[index] == numbers[i]) {
                    index++;
                    break;
                }
                break;
            }
            uniqueNumbers[uniqueIndex]=numbers[index];
            uniqueIndex++;

        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
