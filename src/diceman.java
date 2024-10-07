import java.util.Random;
import javax.swing.JOptionPane;

public class diceman {
    public static void main(String[] args) {
        Random gen = new Random();
        int tal = gen.nextInt(6)+1;
        String activity = "";

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
        JOptionPane.showMessageDialog(null, activity);


    }
}
