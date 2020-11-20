/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan56.umurbarangantik;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menampilkan Umur Barang Antik
 *
 */
public class PBO10K10119901Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio r = new Radio(234);
        
        r.setName("Radio AM");
        
        System.out.println("Nama Barang Antik \t\t : " + r.getName());
        r.tampilUmur();
    }
}
