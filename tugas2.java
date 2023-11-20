package tugas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Tugas2 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Angka : ");
        String st = rd.readLine();
        int angka = Integer.parseInt(st);
        
        int total = 0;
        for (int i = 1; i <= angka; i++) {
            System.out.print("Angka ke-"+i+" : ");
            st = rd.readLine();
            int nilai = Integer.parseInt(st);
            total += nilai;
        }
        double rata = (double)total/angka;
        System.out.println("Rata-Rata = "+rata);
    }
}
