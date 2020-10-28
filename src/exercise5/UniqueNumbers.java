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

         for(int i = 0; i < uniqueNumbers.length - 1; i++){
            for(int j = 0; j < uniqueNumbers.length - 1 - i; j++){
                int next = j + 1;
                if(numbers[j] > numbers[next]){
                    int temp = numbers [j];
                    numbers [j] = numbers[next];
                    numbers[next] = temp;
                }
            }
        }
        
        int uniqueIndex = 0;
        for (int index = 0; index < numbers.length-1; index++) {
            for(int i = 0; i < numbers.length-index-1; i++) {
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
