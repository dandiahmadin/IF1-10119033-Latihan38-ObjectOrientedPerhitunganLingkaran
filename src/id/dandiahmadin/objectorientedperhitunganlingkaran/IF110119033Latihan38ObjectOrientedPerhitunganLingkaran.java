/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.objectorientedperhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung lingkaran dengan konsep pendekatan berbasis objek
 */
public class IF110119033Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    private static String diameter;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukan nilai diameter lingkaran : ");
        diameter = input.next();
        while (!(diameter.matches("[0-9]*"))) {
            System.out.println("Nilai Diameter Tidak Sesuai.");
            System.out.println();
            System.out.print("Masukan nilai diameter lingkaran : ");
            diameter = input.next();
        }
      
        Lingkaran objLingkaran = new Lingkaran();
        objLingkaran.cetakHasil(diameter);
        
    }
    
}
