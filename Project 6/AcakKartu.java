package acakkartu;

import java.util.Random;
/**
 *
 * @author Asrul and gita
 */
public class AcakKartu {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int angkaKartu[] = {00, 11, 22, 33, 44, 55, 66,
            06, 16, 26, 36, 46, 56,
            05, 15, 25, 35, 45,
            04, 14, 24, 34,
            03, 13, 23,
            02, 12,
            01};

        // fungsi acakKartu yang telah dibentuk sebelumnya akan mengacak kartu dari total kartu berjumlah 28. 
        System.out.println("================================================================================");
        System.out.println("===========================APLIKASI RANDOM KARTU DOMINO=========================");
        System.out.println("================================================================================");
        acakKartu(angkaKartu, 28);
        for (int i = 0; i < 28; i++) {
            System.out.print(angkaKartu[i] + " ");
        }
    }

    /**
     * @fungsi acakKartu untuk mengacak posisi kartu berdasarkan posisi terakhir
     * pada index
     * @param Kartu
     * @param jumlahKartu
     * @return pada aplikasi ini masih menggunakan void karena belum mengsilkan
     * nilai kembalian karena masih dalam proses perbaikan untuk menampilkan
     * acak kartu berdasarkan jumlah pemain dan sisa kartu yang dihasilkan.
     */
    public static void acakKartu(int Kartu[], int jumlahKartu) {
        //instansiasi untuk class random pada fungsi acakKartu.
        Random rand = new Random();
        //Perulangan untuk menampilkan posisi angka yang telah diacak
        for (int i = 0; i < jumlahKartu; i++) {
            // Mengacak posisi angka terakhir
            int r = i + rand.nextInt(28 - i);
            //Menukar element
            int temp = Kartu[r];
            Kartu[r] = Kartu[i];
            Kartu[i] = temp;

        }
    }
}
