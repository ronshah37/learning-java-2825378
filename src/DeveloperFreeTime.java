import java.util.Scanner;

public class DeveloperFreeTime {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Enter break for tea time");
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        if("break".equals(userInput.toLowerCase())) {
            System.out.println("It's developer tea time!!");
        } else {
            System.out.println("Meeting time!!!");
        }
    }

    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }
}
