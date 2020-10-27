/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan27;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program huruf besar kecil
 * 
 * 
 */
public class BesarKecil {
    
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        input = scanner.nextLine();
        
        System.out.println("");
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : ".concat(input.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(input.toLowerCase()));
    }
}
