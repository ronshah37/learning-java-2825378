import java.util.Locale;
import java.util.Scanner;

public class SongsApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isSongOnRepeat = true;
        String userInput;
        while ( isSongOnRepeat ) {
            System.out.println("Current song is playing...");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes.");
            userInput = input.next();

            if(userInput.toLowerCase().equals("yes") ) {
                isSongOnRepeat = false;
            }
        }
        System.out.println("Playing next song...");
    }
}

