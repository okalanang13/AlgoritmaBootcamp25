/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsatu;

/**
 * Fungsi untuk menampilkan tampilan berupa output dari class Functions
 *
 * @author Okala
 */
public class FunctionsView {
    
    Functions functions = new Functions();
    
    /**
     * Fungsi untuk menampilkan hasil dari perhitungan 
     * fungsi perkalian yang telah ada pada class Functions.
     * @param bil1 parameter bernilai bilangan bulat atau bertipe integer
     * @param bil2 parameter bernilai bilangan bulat atau bertipe integer
     * @return kembalian nilai yang dihasil pada fungsi ini berupa string namun
     * yang sudah di konversi pada bentuk integer
     */
    public String perkalian(int bil1, int bil2) {
        return (int)functions.kali_old(bil1, bil2) + "";
    }
    
    /**
     * Fungsi untuk menampilkan hasil dari perhitungan 
     * fungsi pemangkatan yang telah ada pada class Functions.
     * @param bil1 parameter bernilai bilangan bulat atau bertipe integer
     * @param bil2 parameter bernilai bilangan bulat atau bertipe integer
     * @return kembalian nilai yang dihasil pada fungsi ini adalah pemangkatan
     * yang hasilnya berupa bilangan bulat.
     */
    public String pemangkatan(int bil1, int bil2) {
        return functions.pangkat_2(bil1, bil2) + "";
    }
     
    /**
     * Fungsi untuk menampilkan hasil dari perhitungan 
     * fungsi pemangkatan yang telah ada pada class Functions.
     * @param bil1 parameter bernilai bilangan bulat atau bertipe double
     * @param bil2 parameter bernilai bilangan bulat atau bertipe double
     * @return kembalian nilai yang dihasil pada fungsi ini adalah pemangangkatan
     * yang hasilnya berupa bilangan pecahan.
     */
    public String pemangkatan(double bil1, double bil2) {
        return functions.pangkat(bil1, bil2) + "";
    }
    
    /**
     * Fungsi untuk menampilkan hasil dari perhitungan 
     * fungsi faktorial yang telah ada pada class Functions.
     * @param bil parameter bernilai bilangan bulat atau bertipe integer
     * @return kembalian nilai yang dihasil pada fungsi ini apa bila kodisi
     * tidak memenuhi maka akan ditampilkan pesan untuk memasukan nilai bilangan
     * lebih dari 0.
     */
    public String faktorial(int bil) {
        if (functions.faktorial(bil) < 0) {
            return "tolong masukan a ≥ 0";
        }
        return functions.faktorial(bil) + "";
    }
    
    /**
     * Fungsi untuk menampilkan dari perhitungan 
     * fungsi permutasi yang telah ada pada class Functions.
     * @param bil1 parameter bernilai bilangan bulat atau bertipe integer
     * @param bil2 parameter bernilai bilangan bulat atau bertipe integer
     * @return kembalian nilai yang dihasil pada fungsi ini apa bila kodisi
     * tidak memenuhi maka akan ditampilkan pesan untuk memasukan nilai bilangan
     * lebih dari 0.
     */
    public String permutasi(int bil1, int bil2) {
        if(functions.permutasi(bil1, bil2) < 0){
           return "tolong masukan a ≥ 0"; 
        }
        return (int)functions.permutasi(bil1, bil2)+"";
    }
    
    /**
     * Fungsi untuk menampilkan dari perhitungan 
     * fungsi kombinasi yang telah ada pada class Functions.
     * @param bil1 parameter bernilai bilangan bulat atau bertipe integer
     * @param bil2 parameter bernilai bilangan bulat atau bertipe integer
     * @return kembalian nilai yang dihasil pada fungsi ini apa bila kodisi
     * tidak memenuhi maka akan ditampilkan pesan untuk memasukan nilai bilangan
     * lebih dari 0.
     */
    public String kombinasi(int bil1, int bil2) {
        if(functions.kombinasi(bil1, bil2) < 0){
           return "tolong masukan a ≥ 0"; 
        }
        return (int)functions.kombinasi(bil1, bil2)+"";
    }
}
