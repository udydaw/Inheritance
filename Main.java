/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner luas = new Scanner(System.in);
        int menu;
        int pilih;

        System.out.println("Program Menghitung Luas Bangun Datar");
        System.out.println("Pilihan Bangun Datar: \n 1. Persegi \n 2. Lingkaran \n 3. PersegiPanjang \n");
        System.out.print("Masukkan pilihan: ");
        pilih = luas.nextInt();
        System.out.println("=================");
        System.out.println("");
        switch(pilih){
            case 1: 
                Persegi luas1 = new Persegi();
                luas1.Luas(13);
            break;
            case 2:
                Lingkaran luas2 = new Lingkaran();
                luas2.Luas(8);
            break;
            case 3:
                PersegiPanjang luas3 = new PersegiPanjang();
                luas3.Luas(20, 9);
            break;
            default:
            System.out.println("Maaf, bangun datar belum terinput, terima kasih.");
        }
    }
}

