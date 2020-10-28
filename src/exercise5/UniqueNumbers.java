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

         
        
          for (int index = 0; index < numbers.length-1; index++) {
            for(int i = index + 1; i < numbers.length; i++) {
                if (numbers[index] == numbers[i]) {
                    numbers[i] = 0;
                }
            }
        }

        for(int i = 0; i < uniqueNumbers.length; i++){
            for(int j = i + 1; j < uniqueNumbers.length; j++){
                if(numbers[i] == 0){
                    int temp = numbers [j];
                    numbers [i] = temp;
                    numbers[j] = 0;
                }
            }
            uniqueNumbers[i] = numbers[i];
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
