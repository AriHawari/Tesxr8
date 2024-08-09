import java.util.Scanner;

import javax.swing.JOptionPane;

public class tabung {
    public static void main(String[] args)throws
    InterruptedException {

        // System.out.println("Program untuk menghitung luas trapesium :");
        // String rusuk1 = "";
        // rusuk1 = JOptionPane.showInputDialog("Masukkan panjang rusuk atasnya : ");
        // int ru1=Integer.parseInt(rusuk1);
        // String rusuk2 = "";
        // rusuk2 = JOptionPane.showInputDialog("Masukkan panjang rusuk bawahnya : ");
        // int ru2=Integer.parseInt(rusuk2);
        // String tinggi = "";
        // tinggi = JOptionPane.showInputDialog("Masukkan tingginya : ");
        // int t=Integer.parseInt(tinggi);
        // int l1=((ru2-ru1)/2)*t/2;
        // int l2=ru1*t;
        // int s=(((ru2-ru1)/2)*((ru2-ru1)/2))+(t*t);
        // double m=Math.sqrt(s);
        // System.out.println ("Panjang rusuk atasnya = "+(ru1));
        // System.out.println ("Panjang rusuk bawahnya = "+(ru2));
        // System.out.println ("Tingginya = "+(t));
        // System.out.println ("Luasnya = "+((l1*2)+l2));
        // System.out.println ("Kelilingnya = "+((ru1+ru2)+(m*2)));

        double rusukAtas;
        double rusukBawah;
        double tinggi;
        double hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan rusukAtas trapesium: ");
        rusukAtas = input.nextDouble();
        System.out.println("Masukkan rusukBawah trapesium: ");
        rusukBawah = input.nextDouble();
        System.out.println("Masukkan tinggi trapesium: ");
        tinggi  = input.nextDouble();
        hasil = 1/2*rusukAtas+rusukBawah*tinggi;
        System.out.println("Hasil luas trapesium adalah: "+hasil);






    }
}
