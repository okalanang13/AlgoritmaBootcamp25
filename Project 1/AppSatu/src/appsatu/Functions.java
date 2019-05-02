package appsatu;

//import java.util.Random;

public class Functions {
    
    protected double kali_old(double a, double b) {
        double hasil;
        double hasila = 0;
        double hasilb = 0;
        double length, tmpa, tmpb;
        //5 4.5
        length = (int) b;
        tmpa = a;
        tmpb = b - length;

        if (b > 0) {
            for (int i = 0; i < length; i++) {
                hasila = hasila + tmpa;
            }
            for (int i = 0; i <= length; i++) {
                hasilb = hasilb + tmpb;
            }
            hasil = hasila + hasilb;
        } else {
            for (int i = 0; i > length; i--) {
                hasila = hasila - tmpa;
            }
            for (int i = 0; i >= length; i--) {
                hasilb = hasilb - tmpb;
            }
            hasil = hasila + hasilb;
        }
        return hasil;
    }

    // Belum Yakin (^_^)
//    public float bagi(int a, int b) {
//        int hasil = 0;
//        for (int i = 0; i < a; i += b) {
//            hasil += 1;
//        }
//        return hasil;
//    }

//    public double kali_old2(double a, double b) {
//        double hasil;
//        double hasila = 0;
//        double hasilb = 0;
//        double length, tmpa, tmpb;
//        if (a > 0) {
//            if (b > a) {
//                length = (int) b;
//                tmpa = a;
//                tmpb = b - length;
//            } else {
//                length = (int) a;
//                tmpa = b;
//                tmpb = a - length;
//            }
//            for (int i = 0; i < length; i++) {
//                hasila = hasila + tmpa;
//            }
//            for (int i = 0; i <= length; i++) {
//                hasilb = hasilb + tmpb;
//            }
//            hasil = hasila + hasilb;
//        } else {
//            if (a > b) {
//                length = (int) b;
//                tmpa = a;
//                tmpb = b - length;
//            } else {
//                length = (int) a;
//                tmpa = b;
//                tmpb = a - length;
//            }
//            for (int i = 0; i > length; i--) {
//                hasila = hasila - tmpa;
//            }
//            for (int i = 0; i >= length; i--) {
//                hasilb = hasilb - tmpb;
//            }
//            hasil = hasila + hasilb;
//        }
//
//        return hasil;
//    }
    
    protected double kali(double bil1, double bil2) {
        return bil1 * bil2;
    }

//    public double kali_1(double a, double b) {
//        double hasil = 0;
//        double bilA, bilB;
//        double hasila = 0, hasilb = 0;
//
//        bilA = a - (int) a;
//        bilB = b - (int) b;
//
//        if ((int) a > 0 && (int) b > 0) {
//            if (a % 1 == 0 && b % 1 == 0) {
//                for (int i = 0; i < (int) b; i++) {
//                    hasil = hasil + (int) a;
//                }
//            } else {
//
//                for (int i = 0; i < (int) b; i++) {
//                    hasila = hasila + (int) a;
//                }
//                for (int i = 0; i <= (int) b; i++) {
//                    hasilb = hasilb + bilA;
//                }
//                hasil = hasila + hasilb;
//            }
//        }
//
//        return hasil;
//    }


    //Comot Orang
//    public float bagi2(int a, int b) {
//        if (a < b) {
//            return 0;
//        } else {
//            return 1 + bagi2(a - b, b);
//        }
//    }

//    public final long bagi3(int a, int b) {
//        int absA = Math.abs(a);
//        int absB = Math.abs(b);
//
//        long temp = absA;
//        long result = 0;
//        while (temp >= 0) {
//            temp -= absB;
//            if (temp >= 0) {
//                result++;
//            }
//        }
//        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
//    }

//    public float bagi4(float a, float b) {
//        float hasil = 0;
//
//        return hasil;
//    }
    /**
     * 
     * @param number
     * @return 
     */
    protected double abslolut(double bil) {
        if (bil < 0) {
            return kali(bil, -1);
        }
        return bil;
    }

    protected double akarKuadrat(double number) {
        double temp;

        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }

//    public double root(double number, double number2) {
//        return root(number, number2, .0001);
//    }
//
//    public double root(double number, double number2, double number3) {
//        double temp;
//
//        double sr = number / number2;
//
//        do {
//            temp = sr;
//            sr = (temp + (number / temp)) / number2;
//        } while ((temp - sr) != number3);
//
//        return sr;
//    }
//
//    public double nthroot(int n, double x, double p) {
//        if (x < 0) {
//            System.err.println("Negative!");
//            return -1;
//        }
//        if (x == 0) {
//            return 0;
//        }
//        double x1 = x;
//        double x2 = x / n;
//        while (Math.abs(x1 - x2) > p) {
//            x1 = x2;
//            x2 = ((n - 1.0) * x2 + x / Math.pow(x2, n - 1.0)) / n;
//        }
//        return x2;
//    }

    protected double pangkat(double a, double b) {
        double hasil = 1;
        //experiment
        double tmpa = 0, tmpb;
        for (int count = 1; count < b; count++) {
            tmpa += 1;
        }
        tmpb = b % 1; //0.5?

        if (a > 0 && b > 0) {
            if (tmpb != 0) {
                for (int i = 0; i < tmpa; i++) {
                    hasil = kali(hasil, a);
                }
                hasil = kali(hasil, akarKuadrat(a));
            } else {
                for (int i = 0; i < b; i++) {
                    hasil = kali(hasil, a);

                }
            }
        } else if (a > 0 && b < 0) {
            if (tmpb != 0) {
                for (int i = 0; i > tmpa; i++) {
                    hasil = kali(hasil, a);
                }
                hasil = kali(hasil, akarKuadrat(a));
            } else {
                for (int i = 0; i > b; i++) {
                    hasil = kali(hasil, a);
                }
            }
            hasil = 1 / hasil;
        } else if (a < 0 && b > 0) {
            if (tmpb != 0) {
                for (int i = 0; i < b; i--) {
                    hasil = kali(hasil, a);
                }
                hasil = kali(hasil, akarKuadrat(a));
            } else {
                for (int i = 0; i < b; i--) {
                    hasil = kali(hasil, a);
                }
            }
        } else {
            if (tmpb != 0) {
                for (int i = 0; i > b; i--) {
                    hasil = kali(hasil, a);
                }
                hasil = kali(hasil, akarKuadrat(a));
            } else {
                for (int i = 0; i > b; i--) {
                    hasil = kali(hasil, a);
                }
            }
            hasil = 1 / hasil;
        }

        return hasil;
    }
    
    public double pangkat_2(double a, double b){
        double hasil = 1;
        if (a > 0 && b > 0) {
            for(int i = 0;i < b; i++){
                hasil = kali((int)hasil,a);
            } 
        } else if (a > 0 && b < 0) {
            for(int i = 0;i > b; i--){
                hasil = kali((int)hasil,a);
            }
            hasil = 1/hasil;
        } else if (a < 0 && b > 0) {
            for(int i = 0;i < b; i++){
                hasil = kali((int)hasil,a);
            } 
        } else {
            for(int i = 0;i > b; i--){
                hasil = kali((int)hasil,a);
            } 
            hasil = 1/hasil;
        }
        
        return hasil;
    }

    /**
     * Fungsi faktorial merupakan hasil perkalian antara bilangan bulat positif 
     * yang kurang dari atau sama dengan n.
     * @param bil merupakan variabel yang bernilai bilangan bulat
     * @return pengembailan nilai yang dihasilkan dengan menghitung perkalian
     * yang dilakukan sebanyak n * (n - 1) dan nilai yang di kembailkan bertipe integer
     */
    protected int faktorial(int bil) {
        int hasil = 1;
        if (bil >= 0) {
            for (int i = bil; i >= 1; i--) {
                hasil = (int) kali(hasil, (i));
            }
            return hasil;
        }
        return -1;
    }
    
    protected double permutasi(int bil1, int bil2) {
        double hasil = -1;
        if (bil1 >= bil2 && bil2 >= 0) {
            int hitung = faktorial(bil1)/ faktorial(bil1 - bil2);
            hasil = hitung;
        }
        return hasil;
    }

    protected double kombinasi(int bil1, int bil2) {
        double hasil = -1;
        if (bil1 >= bil2 && bil2 >= 0) {
            int hitung = faktorial(bil1)/ (int) kali(faktorial(bil1 - bil2), faktorial(bil2));
            hasil = hitung;
        }
        return hasil;
    }
}
