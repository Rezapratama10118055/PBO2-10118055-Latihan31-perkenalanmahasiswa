/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan31.perkenalanmahasiswa;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan31PerkenalanMahasiswa {
 public static String ulangi,nim,nama;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa maha = new Mahasiswa();
        maha.Nim="10110269";
        maha.Nama="Rizki Adam Kurniawan";
        maha.perkenalandiri();
        
       
        maha.Nim="10110270";
        maha.Nama="Indra Tiola";
        maha.perkenalandiri();
        
       
        maha.Nim="10110271";
        maha.Nama="Robi Tamzil Ganefi";
        maha.perkenalandiri();
        
       
        maha.Nim="10110272";
        maha.Nama="Muhammad Nur Awaludin";
        maha.perkenalandiri();
        
        
    }
    
}
