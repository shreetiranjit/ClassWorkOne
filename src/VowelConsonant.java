import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Data representation

        System.out.print("Enter a character :");

        char input_char = sc.nextLine().charAt(0);

        if (input_char == 'a' || input_char == 'e' || input_char == 'i'  || input_char == 'o' || input_char == 'u' || input_char == 'A' || input_char == 'E' || input_char == 'I' || input_char == 'O' || input_char == 'U') {
            System.out.print("This is a vowel");
        }
        else{
            System.out.print("This is not a vowel");
        }
    }



}