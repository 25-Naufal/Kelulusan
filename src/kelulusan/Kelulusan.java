/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelulusan;

/**
 *
 * @author ASUS X450JN
 */
public class Kelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
 
 //object
 siswa pelajar = new siswa();

 //pengisian Atribut
 pelajar.nama= "Anya";
 pelajar.nilai= 80;

 //menjalankan method
 pelajar.cetaknilai();

 //menentukan lulus
 if(pelajar.lulus()){
 System.out.println("selamat anda lulus");
 }
 else if(pelajar.tidaklulus()){
 System.out.println("Anda harus belajar lebih giat lagi");
 }
 }

}

