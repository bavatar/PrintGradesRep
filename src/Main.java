import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        // Write a program that uses a while loop to prompt the user
        // to enter any number of exam scores
        // and the resulting program will print out the grade, A, B, C, D or F.
        Scanner keyboard = new Scanner(System.in);
        int grade_no = 0;
        String grade = "";
        String continueProc = "Y";

        while ( true ){
            System.out.print("Enter the grade from 0 to 100:");
            grade_no = keyboard.nextInt();
            keyboard.nextLine();

            if (grade_no > 100 || grade_no < 0){
                // Input Error
                System.out.print("Invalid number grade entered ");
                break;
            }

            grade = getGrade(grade_no);
            if (grade.equals(""))
            {
                System.out.print("Invalid grade entered ");
                break;
            }
            System.out.println("Grade: " + grade);
            // Do you want to enter another score (Y/N)?
            System.out.println("Do you want to enter another score (Y/N)?");
            continueProc = keyboard.nextLine();
            if (continueProc.equals("N"))
            {
                System.out.println("Thank You for using the Print Grade");
                break;
            }
        }
    }

    public static String getGrade(int gd)
    {
//        A+ 97 to 100
////        A 94 to 96
////        A- 90 to 93
////        B+ 87 to 89
////        B 84 to 86
////        B- 80 to 83
////        C+ 77 to 79
////        C 74 to 76
////        C- 70 to 73
////        D 60 to 69
////        Go back to School if you get below 60

        if (gd<= 100 && gd >= 97) {
            return "A+";
        } else if (gd <= 96 && gd >= 94) {
            return "A";
        } else if (gd <= 93 && gd >= 90){
            return "A-";
        } else if (gd <= 89 && gd >= 87){
            return "B+";
        } else if (gd <= 86 && gd >= 84){
            return "B";
        } else if (gd <= 83 && gd >= 80){
            return "B-";
        } else if (gd <= 79 && gd >= 77){
            return "C+";
        } else if (gd <= 76 && gd >= 74){
            return "C";
        } else if (gd <= 73 && gd >= 70){
            return "C-";
        } else if (gd <= 69 && gd >= 60){
            return "D";
        } else if (gd < 60 && gd >= 0) {
            return "F";
        }
        return "";
    }
}
