//3.

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year to check the whether it's leap year or  not:");
        int year = sc.nextInt();

        if (year % 4 == 0){
            System.out.print(year + " is a leap year.");
        }
        else {
            System.out.print(year + " is not a leap year.");
        }
    }
}
