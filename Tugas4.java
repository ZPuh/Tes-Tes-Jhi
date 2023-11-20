package tugas;  
import javax.swing.JOptionPane;
public class Tugas4 {    
    public static void main(String[] args) {
     String nm = JOptionPane.showInputDialog ("Masukan Nama");   
     String al = JOptionPane.showInputDialog ("Masukan Alamat");   
     String um = JOptionPane.showInputDialog ("Masukan Umur");
     int um1 = Integer.parseInt(um);
     
     JOptionPane.showMessageDialog(null,"Nama   : "+nm+" \nAlamat : "+al+"\nUmur    : "+um1);
    }
}
