/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ACER
 */
public class Bendahara extends Anggota {
    private int tahunJabatan;
    private int jabatanKe;
    
public Bendahara(String id, String nama, String jenisKelamin, String usia, int tahunJabatan, int jabatanKe){
    super(id,nama,jenisKelamin,usia);
    this.tahunJabatan = tahunJabatan;
    this.jabatanKe = jabatanKe;
}
public void viewBendahara(){
    System.out.println("Masa Jabatan = " + tahunJabatan);
    System.out.println("Jabatan ke    = " + jabatanKe);
    System.out.println("==========================");
}
}
