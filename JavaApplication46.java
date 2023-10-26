package javaapplication46;
import java.util.Scanner;
public class JavaApplication46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day,matkul=0;
        String materi=null,hari=null;
        System.out.println("DAFTAR HARI : \n1.Senin\n2.Selasa\n3.Rabu\n4.Kamis");
        System.out.println("DAFTAR MATKUL : \n1.Matematika\n2.Bahasa Indonesia\n3.Fisika\n4.Pancasila\n5.Kewarganegaraan");
        System.out.print("Masukan Hari (1/4) : ");
        day = input.nextInt();
        System.out.print("Masukkan matkul (1/5) : ");
        matkul = input.nextInt();
        if (day == 1 ){
            hari = "senin";
            switch (matkul){
            case 1 :
            materi = "matematika";
            break;
            case 2 :
            materi = "bahasa indonesia";
            break;
            case 3:
            materi = "Fisika";
            break;
            case 4 :
            materi = "pancasila";
            break;
            case 5 :
            materi = "kewarganegaraan";
            break;
            }
            }else if (day == 2) {
            hari = "Selasa";
            switch (matkul){
            case 1 :
            materi = "matematika";
            break;
            case 2 :
            materi = "bahasa indonesia";
            break;
            case 3:
            materi = "Fisika";
            break;
            case 4 :
            materi = "pancasila";
            break;
            case 5 :
            materi = "kewarganegaraan";
            break;
            }
        }else if (day == 3) {
            hari = "Rabu";
            switch (matkul){
            case 1 :
            materi = "matematika";
            break;
            case 2 :
            materi = "bahasa indonesia";
            break;
            case 3:
            materi = "Fisika";
            break;
            case 4 :
            materi = "pancasila";
            break;
            case 5 :
            materi = "kewarganegaraan";
            break;
            }
        }else if (day == 4) {
           switch (matkul){
            case 1 :
            materi = "matematika";
            break;
            case 2 :
            materi = "bahasa indonesia";
            break;
            case 3:
            materi = "Fisika";
            break;
            case 4 :
            materi = "pancasila";
            break;
            case 5 :
            materi = "kewarganegaraan";
            break;
            } 
        }
        else{
        System.out.print("libur");                       
    }
        System.out.println("----------------------------");
        System.out.println("Hari "+hari+" Belajar "+materi);
    
    }
    
}
