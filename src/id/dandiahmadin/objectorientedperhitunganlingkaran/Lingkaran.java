/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.objectorientedperhitunganlingkaran;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class Lingkaran
 */
public class Lingkaran {
    private final double PHI = 3.141591;
    private String diameter;
    
    private void setDiameter(String diameter) {
        this.diameter = diameter;
    }
    
    private double hitungJariJari(String diameter) {
        return Double.parseDouble(diameter) / 2;
    }
    
    private double hitungLuas(String diameter) {
        return PHI * Math.pow(hitungJariJari(diameter), 2);
    }
    
    private double hitungKeliling(String diameter) {
        return PHI * Double.parseDouble(diameter);
    }
    
    public void cetakHasil(String diameter) {
        System.out.println("\n===Hasil Perhitungan Lingkaran===");
        System.out.printf("Jari-jari Lingkaran\t= %.0f cm %n",hitungJariJari(diameter));
        System.out.printf("Luas Lingkaran\t\t= %.2f cm %n", hitungLuas(diameter));
        System.out.printf("Keliling Lingkaran\t= %.2f cm %n", hitungKeliling(diameter));
        System.out.println("(Developed by : Dandi Ahmadin)");
    }
}
