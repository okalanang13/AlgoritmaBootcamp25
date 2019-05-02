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
     * Fungsi ini mencari bilanagan prima dari 0 sampai batas yang telah di tentukan oleh user. fungsi ini menggunakan arraylist untuk menampung nilai outpunya di setiap perulangan sebelum ditampilkan. Arraylist digunakan karena lebih mudah digunakan dari pada array biasa dan tidak harus menentukan ukurannya.
     * @param batas parameter batas berisikan inputan batas dari deret bilangan prima yang ingin ditampilkan.
     * @return fungsi ini mengembalikan nilai berupa deret bilangan prima yang diperoleh dari hasil setiap perulangan dan ditampung di dalam list.
     */
    public List<Integer> prima(int batas) {
        List<Integer> listprima = new ArrayList<Integer>();
        boolean iniprima;
        for (int i = 2; i <= batas; i++) {
            iniprima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    iniprima = false;
                    break;
                }
            }
            if (iniprima) {
                listprima.add(i);
            }
        }
        return listprima;
    } 
       /**
     * Fungsi untuk membuat deret fibonacci dari 0 sampai batas yang ditentukan oleh user. fungsi ini menggunakan arraylist untuk menampung nilai outpunya di setiap perulangan sebelum ditampilkan. Arraylist digunakan karena lebih mudah digunakan dari pada array biasa dan tidak harus menentukan ukurannya.
     * @param batas parameter batas dari fungsi ini berisikan inputan dari user dimana inputan tersebut adalah batas dari deret fibonacci yang akan di cetak.
     * @return fungsi ini mengembalikan nilai berupa deret fibonacci yang ditampung ke dalam list, list sendiri menampung nilai yang di dapat dari setiap perulangan yang dilakukan di dalam fungsi ini.
     */
    public List<Integer> fibonacci(int batas) {
        List<Integer> list = new ArrayList<Integer>();
        int pass = 0, current = 1, fibonacci = 0;
        for (int i = fibonacci; fibonacci < batas; i++) {
            pass = current;
            current = fibonacci;
            list.add(fibonacci);
            fibonacci = current + pass;
        }
        return list;
    }
}
