/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ACER
 */
public class Anggota {
    private String id;
    private String nama;
    private String jenisKelamin;
    private String usia;
    
public Anggota (String id, String nama, String jenisKelamin, String usia) {
    this.id = id;
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
    this.usia = usia;
    
}
public void viewAnggota(){
    System.out.println("ID            : " + id);
    System.out.println("NAMA          : " + nama);
    System.out.println("JENIS KELAMIN : " + jenisKelamin);
    System.out.println("UMUR          : " + usia);
            
}
}
