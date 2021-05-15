/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ACER
 */
public class Luas extends Lingkaran {
    public void Luas(int a) {
        luas = 3.14 * a * a;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Panjang jari-jari   : "+8+" cm");
        System.out.println("Hasil luasnya adalah: "+200.96+" cm²");
}
}