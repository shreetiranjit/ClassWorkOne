// 1. write a program to find maximum between two numbers
import java.util.Scanner ;
public class MaxNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int first = sc.nextInt();

        System.out.print("Enter the second number:");
        int second = sc.nextInt();

        if (first > second) {
            System.out.print(first + "is maximum .");
        }
        if (first == second){
            System.out.print("both are equal");
        }
        else {
            System.out.print(second + "is maximum.");
        }




    }
}
