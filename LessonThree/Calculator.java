package LessonThree;
import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number 1:");

            int numberOne = sc.nextInt();
            System.out.println("Select operation:");
            char operation = sc.next().charAt(0);
            System.out.println("Enter number 2:");
            int numberTwo = sc.nextInt();

            Numbers numbers = new Numbers(numberOne, numberTwo);
            System.out.println("Your result " + numbers.getResult(operation));
        }
}
