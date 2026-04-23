/*****************************************************
 * Name: Lastazia Dickens
 * Date: 04/23/2026
 * Assignment: SDC230 Week 3 PA Calculations and Unique Numbers
 * 
 * Main application (program) class
 * Description: This application collects 10 integers from a user, 
 * identifies unique values, and calculates statistics 
 * (count, sum, average) for both the full set and unique set.
 */
import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lastazia Dickens Week 3 PA - Calculations and Unique Numbers");
        System.out.println();

        Scanner input = new Scanner(System.in);

        //Get 10 integers and store in an array
        int[] getNumbers = new int[10];

        //Prepare the ArrayList for the unique numbers
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter an integer value: ");
            int num = input.nextInt();

            //Store numbers in the array
            getNumbers[i] = num;

            //Store in ArrayList if it is unique
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

System.out.println(); // Space before output

        // Array Statistics (Full set)
        int totalSum = calculateSum(getNumbers);
        int totalCount = getNumbers.length;
        System.out.println("The count of integers entered is: " + totalCount);
        System.out.println("The sum of integers entered is: " + totalSum);
        System.out.println("The average of integers entered is: " + (totalSum / totalCount));

        System.out.println(); // Space between sections

        // ArrayList Statistics (Unique set)
        int uniqueSum = calculateSum(uniqueNumbers);
        int uniqueCount = uniqueNumbers.size();
        System.out.println("The count of unique integers entered is: " + uniqueCount);
        System.out.println("The sum of unique integers entered is: " + uniqueSum);
        // Protect against division by zero just in case
        int uniqueAvg = (uniqueCount == 0) ? 0 : (uniqueSum / uniqueCount);
        System.out.println("The average of unique integers entered is: " + uniqueAvg);

        input.close();
    }

    // Overloaded method for Array sum
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }

    // Overloaded method for ArrayList sum
    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }
}
    

