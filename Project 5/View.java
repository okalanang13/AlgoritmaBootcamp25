/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_28.pkg04;

/**
 *
 * @author Relion31
 */
public class View {
    Fungsi fungsi = new Fungsi();
    /**
     * Fungsi ini membuat kondisi dimana nilai awal tidak boleh lebih besar dari nilai akhir. jika nilai awal lebih besar makan akan ditampilkan pesan peringatan. 
     * @param batas parameter awal dan akhir adalah parameter yang berisi inputan batas awal dan akhir dari nilai yang akan di incrementkan.
     * @return mengembalikan deret auto increment dari fungsi autoIncrementOut.
     */
    public String autoIncrementOut(int awal, int akhir) {
        if (awal > akhir) {
            return "tidak bisa increment. nilai awal lebih besar dari nilai akhir";
        }
        return fungsi.autoIncrement(awal, akhir) + "";
    }
     /**
     * Fungsi ini membuat kondisi dimana nilai awal tidak boleh lebih besar dari nilai akhir. jika nilai awal lebih besar makan akan ditampilkan pesan peringatan. 
     * @param batas parameter awal dan akhir adalah parameter yang berisi inputan batas awal dan akhir dari nilai yang akan di decrement.
     * @return mengembalikan deret auto increment dari fungsi autoDecrementOut.
     */
    public String autoDecrementOut(int awal, int akhir) {
        if (awal > akhir) {
            return "tidak bisa increment. nilai awal lebih besar dari nilai akhir";
        }
        return fungsi.autoDecrement(awal, akhir) + "";
    }

}
