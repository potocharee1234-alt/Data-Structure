
import java.util.ArrayList;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int num : initial_numbers) {
            numbers.add(num);
        }

        int lastDigit = 5;       
        int secondLastDigit = 2; 
       
        
        System.out.print("Enter number to add at the end: ");
        int addEnd = scanner.nextInt();
        numbers.add(addEnd);

        System.out.print("Enter number to insert at index " + lastDigit + ": ");
        int insertVal = scanner.nextInt();
        numbers.add(lastDigit, insertVal);

        numbers.remove(lastDigit);

        int studyDate = 7; 
        numbers.set(secondLastDigit, studyDate);

        System.out.println("Final ArrayList: " + numbers);

        scanner.close();
    }
}