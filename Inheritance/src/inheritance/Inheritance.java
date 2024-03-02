/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author ACER
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Ketua ketua = new Ketua("212","Robintang","Laki-Laki","25",2024,2);
    Sekretaris sekretaris = new Sekretaris("121","Rojali","Laki-Laki","21",2024,1);
    Bendahara bendahara = new Bendahara("112","Ratna","Perempuan","24",2024,3);
    
    
    System.out.println("HASIL PEMILIHAN KETUA, SEKRETARIS, BENDAHARA");
    System.out.println("============================================");
    
    System.out.println("Ketua");
    ketua.viewAnggota();
    ketua.viewKetua();
    
    System.out.println("Sekretaris");
    sekretaris.viewAnggota();
    sekretaris.viewSekretaris();
    
    System.out.println("Bendahara");
    bendahara.viewAnggota();
    bendahara.viewBendahara();
    
    System.out.println("HASIL PEMILIHAN KETUA, SEKRETARIS, BENDAHARA");
    }
    
}
