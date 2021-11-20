import java.util.Scanner;
public class GradingFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Data representation
        System.out.print("Enter the marks of physics:");
        int physics = sc.nextInt();

        System.out.print("Enter the marks of chemistry:");
        int chemistry = sc.nextInt();

        System.out.print("Enter the marks of biology:");
        int biology = sc.nextInt();

        System.out.print("Enter the marks of mathematics");
        int math = sc.nextInt();

        System.out.print("Enter the marks of computer:");
        int computer = sc.nextInt();

        int total = (physics + chemistry + biology + math + computer);

        int final_percentage = (total * 100) / 500 ;

        if (final_percentage >= 90){
            System.out.print("Total Percentage is "+ final_percentage +"You got A");
        }
        else if  (final_percentage >= 80){
            System.out.print("Total Percentage is "+ final_percentage +"You got B");
        }
        else if (final_percentage >= 70){
            System.out.print("Total Percentage is "+ final_percentage +"You got C");
        }
        else if (final_percentage >= 60){
            System.out.print("Total Percentage is "+ final_percentage +"You got D");
        }
        else if (final_percentage >=40){
            System.out.print("Total Percentage is "+ final_percentage +"You got E");
        }
        else {
            System.out.print("Total Percentage is "+ final_percentage +"You got F");
        }
    }
}
