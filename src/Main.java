import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World from IntelliJ IDE!!!");
        int studentAge = 15;
        double studentGPA = 3.45;

        boolean hasPerfectAttendance = true;
        String studentFirstName = "Ronak";
        String studentLastName = "Shah";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of "+ studentGPA);
        System.out.println("What value of GPA do you want?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " has now GPA of "+ studentGPA);
    }
}
