/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmatask1;

import java.util.Random;

/**
 *
 * @author yosef
 */
public class Functions {

    /**
     *
     * @param bil
     * @param kondisi1
     * @param kondisi2
     * @return
     */
    public char[] getRandom(int bil, boolean kondisi1, boolean kondisi2) {
        // Using numeric values 
        String numbers = "0123456789";
        String kecil = "abcdefghijklmnopqrstuvwxyz";

        String value = numbers + kecil + kecil.toUpperCase() +"";
        // Using random method 
        Random rndm_method = new Random();

        char[] acak = new char[bil];

        for (int i = 0; i < bil; i++) {
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            if (kondisi1) {
                if (bil > numbers.length()) {
                    int iq = 0;
                    String xy = String.valueOf(iq);
                    return xy.toCharArray();
                }
                acak[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
            } else {
                acak[i] = value.charAt(rndm_method.nextInt(value.length()));
            }

            if (kondisi2) {
                for (int j = 0; j < i; j++) {
                    if (acak[i] == acak[j]) {
                        i--;
                        break;
                    }
                }
            }
        }
        return acak;
    }
    public int money(int uang) {
        //System.out.println("Jumlah yang dimasukkan = " + uang);
        if (uang >= 100) {
            if (uang >= 100000) { //membuat kondisi untuk uang seratusribu
                int ratusRibu = uang / 100000;
                System.out.println("Pecahan uang 100000 sebanyak " + ratusRibu);
            } else {
                System.out.println("Pecahan uang 100000 sebanyak 0");
            }
            int sisa1 = uang % 100000;
            if ((sisa1 >= 50000) && (sisa1 < 100000)) {
                int limaPuluh = sisa1 / 50000;
                System.out.println("Pecahan uang 50000 sebanyak " + limaPuluh);
            } else {
                System.out.println("Pecahan uang 50000 sebanyak 0");
            }
            int sisa2 = sisa1 % 50000;
            if ((sisa2 >= 20000) && (sisa2 < 50000)) {
                int duaPuluh = sisa2 / 20000;
                System.out.println("Pecahan uang 20000 sebanyak " + duaPuluh);
            } else {
                System.out.println("Pecahan uang 20000 sebanyak 0");
            }
            int sisa3 = sisa2 % 20000;
            if ((sisa3 >= 10000) && (sisa3 < 20000)) {
                int sepuluhRibu = sisa3 / 10000;
                System.out.println("Pecahan uang 10000 sebanyak " + sepuluhRibu);
            } else {
                System.out.println("Pecahan uang 10000 sebanyak 0");
            }
            int sisa4 = sisa3 % 10000;
            if ((sisa4 >= 5000) && (sisa4 < 10000)) {
                int limaRibu = sisa4 / 5000;
                System.out.println("Pecahan uang 5000 sebanyak " + limaRibu);
            } else {
                System.out.println("Pecahan uang 5000 sebanyak 0");
            }
            int sisa5 = sisa4 % 5000;
            if ((sisa5 >= 2000) && (sisa5 < 5000)) {
                int duaRibu = sisa5 / 2000;
                System.out.println("Pecahan uang 2000 sebanyak " + duaRibu);
            } else {
                System.out.println("Pecahan uang 2000 sebanyak 0");
            }

            int sisa6 = sisa5 % 2000;
            if ((sisa6 >= 1000) && (sisa6 < 2000)) {
                int seRibu = sisa6 / 1000;
                System.out.println("Pecahan uang 1000 sebanyak " + seRibu);
            } else {
                System.out.println("Pecahan uang 1000 sebanyak 0");
            }
            int sisa7 = sisa6 % 1000;
            if ((sisa7 >= 500) && (sisa7 < 1000)) {
                int limaRatus = sisa7 / 500;
                System.out.println("Pecahan uang 500 sebanyak " + limaRatus);
            } else {
                System.out.println("Pecahan uang 500 sebanyak 0");
            }
            int sisa8 = sisa7 % 500;
            if ((sisa8 >= 200) && (sisa8 < 500)) {
                int duaRatus = sisa8 / 200;
                System.out.println("Pecahan uang 200 sebanyak " + duaRatus);
            } else {
                System.out.println("Pecahan uang 200 sebanyak 0");
            }
            int sisa9 = sisa8 % 200;
            if ((sisa9 >= 100) && (sisa9 < 200)) {
                int seRatus = sisa9 / 100;
                System.out.println("Pecahan uang 100 sebanyak " + seRatus);
            } else {
                System.out.println("Pecahan uang 100 sebanyak 0");
            }
            int sisa10 = sisa9 % 100;
            if (sisa10 < 100) {
                System.out.println("Sisa uang sebesar " + sisa10 + " ikhlaskan saja");
            }
        } else {
            System.out.println("Nominal harus di atas 100");
        }
        return uang;
    }

    public static char[] acakChar(int panjang, boolean kondisi1, boolean kondisi2) {

        String kapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String kecil = "abcdefghijklmnopqrstuvwxyz";
        String angka = "0123456789";

        String values = kapital + kecil + angka;

        Random acak = new Random();
        char[] ack = new char[panjang];

        for (int i = 0; i < panjang; i++) {
            // Use of charAt() method : to get character value 
            // Use of nextInt() as it is scanning the value as int 
            if (kondisi1) {
                ack[i] = values.charAt(acak.nextInt(values.length()));
            } else {
                ack[i] = values.charAt(acak.nextInt(values.length()));
            }
            if (kondisi2) {
                for (int j = 0; j < i; j++) {
                    if (ack[i] == ack[j]) {
                        i--;
                        break;
                    }
                }
            }
        }
        return ack;
    }
}