//  2. write a program to find maximum between three numbers
import java.util.Scanner ;
public class MaxThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int first = sc.nextInt();

        System.out.print("Enter the second number:");
        int second = sc.nextInt();

        System.out.print("Enter the third number");
        int third = sc.nextInt();

        if (first > second) {
            System.out.print(first + "is maximum .");
        }
        if (first == second && second == third ) {
            System.out.print("All are equal");
        }

        if (second > third) {
            System.out.print(second + "is maximum.");
        }
        else {
            System.out.print(third + " is maximum.");
        }

    }
}