package Conversion_num;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Ini merupakan kelas fungsi untuk mencari hasil perhitungan 
 * dari tugas nomor 2(converter desimal ke biner,octa, hexa, dan sebaliknya)
 * Author : Fala dan Uki
 */
public class Conversion_num {
     /**
     * fungsi converterfromDes untuk mengonversi bilangan desimal ke biner, octa, atau hexa dengan dengan parameter
     * string number sebagai bilangan dan integer base sebagai basis bilangan
     * @param desimal
     * @param base
     * @return 
     */
    public static String converterFromDes(int desimal,int base) {
        int tmp = 0;
        String biner = "";
        char chars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (desimal > 0) {
            tmp = desimal % base;
            desimal = desimal / base;
            biner = chars[tmp] + biner;
        }
        return biner;
    }
    
    /**
     * fungsi converterToDes untuk mengonversi bilangan biner, octa, atau hexa menjadi bilangan desimal dengan dengan parameter
     * string number sebagai bilangan dan integer base sebagai basis bilangan
     * @param input
     * @param base
     * @return mengembalikan nilai integer val yaitu bilangan desimal 
     */
    public static int converterToDes(String input, int base) {
        String digits = "0123456789ABCDEF";
        input = input.toUpperCase();
        int val = 0;
        if (base == 2 || base == 8 || base == 16) {
            for (int i = 0; i < input.length(); i++) {
                val = base * val + digits.indexOf(input.charAt(i));
            }
        }
        return val;
    }
}
