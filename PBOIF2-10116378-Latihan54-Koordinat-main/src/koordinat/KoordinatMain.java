/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koordinat;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi : program ini berisi program koordinat
 */
public class KoordinatMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat koordinat = new Koordinat(10, 4);
    WarnaKoordinat warna = new WarnaKoordinat("Jingga", 10, 4);
    System.out.println("Warna Koordinat : " + warna.getNamaWarna());
    System.out.println("Koordinat Sumbu x : " + koordinat.x + ", " + "y : " + 
                        koordinat.y);
      
    }
    
}
