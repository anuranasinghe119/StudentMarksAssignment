import java.util.Scanner;

public class Main {
    private static final int STUDENTS = 30;
    private static final Scanner scanner = new Scanner(System.in);
    static double[] studentMarks = new double[STUDENTS];

    public static void main(String[] args) {
        StartApplication();
        InputMarks();
    }

    public static void StartApplication() {
        System.out.println("Please enter assignment name :");
        String assignmentName = scanner.next();
    }

    public static void InputMarks() {
        for (int i = 0; i < STUDENTS; i++) {
            System.out.print("Enter marks of Student " + i + " : ");
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

}