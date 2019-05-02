/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_28.pkg04;

/**
 * Class View berisikan fungsi fungsi yang digunakan untuk membuat kondisi jika nilai inputan tidak sesuai yang diharapkan. Jika inputan tidak sesuai dengan maka akan ditampilkan peringatan.
 * @author Relion31
 */ 
public class View {
    Fungsi fungsi = new Fungsi();
    /**
     * Membuat kondisi yang berfungsi untuk mengantisipasi jika inputan yang dimasukan kurang dari sama dengan 1.
     * @param batas parameter batas berisi inputan dimana inputan tersebut tidak boleh dibawah 1 atau 1 itu sendiri
     * @return mengembalikan deret bilangan prima yang diambil dari fungsi primaOut.
     */
    public String primaOut(int batas) {
        if (batas <= 1) {
            return "Masukan nilai lebih besar dari 1";
        }
        return fungsi.prima(batas) + "";
    }
    /**
     * Membuat kondisi untuk mengantisipasi jika inputan yang dimasukan lebih kecil dari 0 ataupun 0 itu sendiri.
     * @param batas parameter batas digunakan untuk menampung inputan yang kemudian inputan tersebut akan di cek apakah nilainya kurang dari sama dengan 0 atau tidak.
     * @return mengembalikan deret bilangan fibonacci yang didapat dari fungsi fibbonacciOut.
     */
    public String fibbonacciOut(int batas) {
        if (batas <= 0) {
            return "Masukan nilai lebih besar dari 0";
        }
        return fungsi.fibonacci(batas) + "";
    }
}
