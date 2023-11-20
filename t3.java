package tugas;
import java.io.File;
import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        try {
            File fl = new File ("src/tugas/Tugas3a");
            Scanner sc = new Scanner (fl);
            
            while (sc.hasNextLine()) {
                String st = sc.nextLine();
                System.out.println(st);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }
    
}
