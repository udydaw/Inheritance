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
public class PersegiPanjang extends Lingkaran {
    public void Luas(int a, int b) {
        luas = a * b;
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Panjang             : "+20+" cm");
        System.out.println("Lebar               : "+9+" cm");
        System.out.println("Hasil luasnya adalah: "+180+" cm²");
    }
}

