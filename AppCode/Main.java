import java.util.Scanner;

public class Main {
    private static final int STUDENTS = 30;
    private static final Scanner scanner = new Scanner(System.in);
    static double[] studentMarks = new double[STUDENTS];
    private static String assignmentName;

    public static void main(String[] args) {
        StartApplication();
        InputMarks();
        PrintAllMarks();
        PrintHighestMarks();
        PrintLowestMarks();
    }

    public static void StartApplication() {
        System.out.println("Please enter assignment name :");
        assignmentName = scanner.next();
    }

    public static void InputMarks() {
        for (int i = 0; i < STUDENTS; i++) {
            System.out.print("Enter marks of Student " + (i + 1) + " : ");
            String studentMarkStr = scanner.next();
            try {
                double stdMark = Double.parseDouble(studentMarkStr);
                if (stdMark <= 30 && stdMark >= 0)
                    studentMarks[i] = stdMark;
                else {
                    System.err.println("Number " + stdMark + " is out of Range.\nPlease enter number within valid" +
                            "Range 0 - 30");
                    i--;
                    System.out.println("\n");
                }
            } catch (Exception e) {
                System.err.print("Unable to convert number :" + e.getMessage());
                i--;
                System.out.println("\n");
            }
        }
    }

    public static void PrintAllMarks() {
        System.out.println("\n Done ! All Marks are successfully added! \n");
        System.out.println("Assignment - " + assignmentName);
        for (int i = 0; i < STUDENTS; i++) {
            System.out.println("Student " + (i + 1) + " Marks :" + studentMarks[i]);
        }
        System.out.println("\n");
    }

    public static void PrintHighestMarks() {
        double maxNumber = Double.MIN_VALUE;
        for (double studentMark : studentMarks) {
            if (studentMark > maxNumber)
                maxNumber = studentMark;
        }
        System.out.println("Highest mark that student obtained is :" + maxNumber);
    }

    public static void PrintLowestMarks() {
        double minNumber = Double.MAX_VALUE;
        for (double studentMark : studentMarks) {
            if (studentMark < minNumber)
                minNumber = studentMark;
        }
        System.out.println("Lowest mark that student obtained is :" + minNumber);
    }

}