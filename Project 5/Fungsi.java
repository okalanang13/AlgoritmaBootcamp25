/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_28.pkg04;

import java.util.ArrayList;
import java.util.List;

/**
 * Ini adalah class yang terdapat beberapa fungsi seperti, Deret bilangan prima, Deret Fibonacci, Auto Increment, dan Auto Decrement. 
 * @author Relion31
 */
public class Fungsi {
    /**
     * Fungsi untuk membuat auto increment dimana nilai akan ditambahkan secara terus menerus sampai batas yang ditentukan. fungsi ini menggunakan list untuk menampung nilai outpunya di setiap perulangan sebelum ditampilkan.
     * @param awal parameter awal berfungsi untuk menampung nilai inputan untuk batas awal nilai increment
     * @param akhir parameter awal berfungsi untuk menampung nilai inputan untuk batas akhir nilai increment
     * @return Mengembalikan nilai dari setiap perulangan yang sudah ditampung ke dalam list.
     */     
    public List<Integer> autoIncrement(int awal, int akhir) {
        List<Integer> list = new ArrayList<Integer>();
        akhir = akhir - awal;
        for (int i = 0; i <= akhir; i++) {
            list.add(awal);
            awal = awal + 1;
        }
        return list;
    }
    /**
     * Fungsi untuk membuat auto decrement dimana nilai akan dikurangi secara terus menerus sampai batas yang ditentukan. fungsi ini menggunakan list untuk menampung nilai outpunya di setiap perulangan sebelum ditampilkan.
     * @param awal parameter awal berfungsi untuk menampung nilai inputan untuk batas awal nilai decrement
     * @param akhir parameter awal berfungsi untuk menampung nilai inputan untuk batas akhir nilai decrement
     * @return Mengembalikan nilai dari setiap perulangan yang sudah ditampung ke dalam list.
     */
    public List<Integer> autoDecrement(int awal, int akhir) {
        List<Integer> list = new ArrayList<Integer>();
        int batas;
        batas = akhir - awal;
        for (int i = 0; i <= batas; i++) {
            list.add(akhir);
            akhir = akhir - 1;
        }
        return list;
    }
}
