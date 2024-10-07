import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class dicemanLoop {
    public static void main(String[] args) {
        Random gen = new Random();
        String activity = "";
        int tal = 0;
        Scanner scan = new Scanner(System.in);

        boolean keepGoing = true;


        while (keepGoing) {
            tal = gen.nextInt(6) + 1;

            switch (tal) {
                case 1:
                    activity = "Breakfast";
                    break;
                case 2:
                    activity = "study";
                    break;
                case 3:
                    activity = "swim";
                    break;
                case 4:
                    activity = "fishing";
                    break;
                case 5:
                    activity = "call mom";
                    break;
                case 6:
                    activity = "bed";
                    break;
            }
            System.out.println(activity);
            System.out.println("Do you want to continue yes or no");
            String ans = scan.next();

            if (ans.equals("yes")) keepGoing = true;
            else keepGoing = false;

            JOptionPane.showMessageDialog(null, activity);

        }

    }
}
