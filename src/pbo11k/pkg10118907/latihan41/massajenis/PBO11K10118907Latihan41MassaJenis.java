/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan41.massajenis;


/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan massa jenis menggunakan konsep OOP
 * 
 */
public class PBO11K10118907Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus k = new Kubus();
        
        k.setSisi(5);
        k.setMassa(250);
        
        System.out.println("Massa jenis kubus");
        System.out.println("Sisi : "+k.getSisi());
        System.out.println("Massa : "+k.getMassa());
        
        
        System.out.println("\nHasil Perhitungan");
        System.out.println("Volume : "+k.hitungVolume(k.getSisi()));
        System.out.println("Massa Jenis : "+k.hitungMassaJenis(k.getMassa(), k.hitungVolume(k.getSisi())));
    }
    
}
