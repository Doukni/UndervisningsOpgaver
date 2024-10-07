import java.io.*;
import java.util.ArrayList;

public class StudentList {

    public static void main(String[] arg) throws IOException
    {
        FileReader fil = new FileReader("src//StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<String> list = new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null)
        {
            String[] bidder = linje.split(",");     // opdel i bidder efter mellemrum
            String fornavn = bidder[2]; // brug tredje bid
            list.add(fornavn);
            linje = ind.readLine();
        }
        list.sort(null);
        for (String p:list){
            System.out.println(p);
        }
        save(list);
    }

    static void save(ArrayList<String> l) throws IOException {
        FileWriter fil = new FileWriter("src//StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (String s:l){
            ud.println(s);
        }
        ud.close();
    }
}
