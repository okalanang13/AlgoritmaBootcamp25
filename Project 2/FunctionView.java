package Conversion_num;
/*
 * Ini merupakan kelas view yang mempunyai fungsi untuk menampilkan hasil 
 * dari tugas nomor 2(converter desimal ke biner,octa, hexa, dan sebaliknya)
 * Author : Fala dan Uki
 */
public class FunctionView {
     /**
     * fungsi converterToDesBin merupakan fungsi untuk menampilkan 
     * hasil dari konversi biner ke dalam decimal
     * @param input yang bertipe data integer
     * @return mengembalikan hasil dari nilai konversi biner ke desimal
     *
     */
    public static String converterToDesBin (String input){
        if(isNum(input,2)){
            return Conversion_num.converterToDes(input, 2)+"";
        }
        return "masukan input 0 atau 1";
    } 
    
     /**
     * fungsi converterToDesOcta merupakan fungsi untuk menampilkan 
     * hasil dari konversi Octa ke dalam Decimal
     *
     * @param input yang bertipe data integer
     * @return mengembalikan hasil dari nilai konversi Octa ke decimal 
     *
     */
    public static String converterToDesOcta (String input){
        if(isNum(input,8)){
            return Conversion_num.converterToDes(input, 8)+"";
        }
        return "masukan input antara 0 sampai 7 ";
    } 
    
     /**
     * fungsi converterFromDesHexa merupakan fungsi untuk menampilkan 
     * hasil dari konversi Hexa ke dalam decimal
     *
     * @param input yang bertipe data integer
     * @return mengembalikan hasil dari nilai konversi hexa ke decimal 
     *
     */
    public static String converterToDesHexa (String input){
        if(isNum(input,16)){
            return Conversion_num.converterToDes(input, 16)+"";
        }
        return "masukan input antara 0 sampai 9 atau A sampai F";
    }
    
     /**
     * fungsi converterFromDesBin merupakan fungsi untuk menampilkan 
     * hasil dari konversi decimal ke dalam biner
     *
     * @param input yang bertipe data integer
     * @return mengembalikan hasil dari nilai konversi desimal ke biner
     *dan mengembalikan pesan peringatan ketika inputannya bukan input>=0
     */
    public static String converterFromDesBin (int input){
        if(input>=0){
            return Conversion_num.converterFromDes(input, 2)+"";
        }
        return "masukan input >= 0";
    } 
    
     /**
     * fungsi converterFromDesOcta merupakan fungsi untuk menampilkan 
     * hasil dari konversi decimal ke dalam Octa
     *
     * @param input yang bertipe data integer
     * @return mengembalikan hasil dari nilai konversi desimal ke Octa
     *dan mengembalikan pesan peringatan ketika inputannya bukan input>=0
     */
    public static String converterFromDesOcta (int input){
        if(input>=0){
            return Conversion_num.converterFromDes(input, 8)+"";
        }
        return "masukan input >= 0";
    } 
    
     /**
     * fungsi converterFromDesHexa merupakan fungsi untuk menampilkan 
     * hasil dari konversi decimal ke dalam hexa 
     *
     * @param input yang bertipe data integer
     * @return mengembalikan hasil dari nilai konversi desimal ke hexa
     *dan mengembalikan pesan peringatan ketika inputannya bukan input>=0
     */
    public static String converterFromDesHexa (int input){
        if(input>=0){
            return Conversion_num.converterFromDes(input, 16)+"";
        }
        return "masukan input >= 0";
    }
    
    /**
     * fungsi isNum untuk memeriksa apakah inputan benar berupa bilangan biner, octa, atau hexa desimal dengan parameter
     * string number sebagai bilangan dan integer base sebagai basis bilangan 
     * @param number
     * @param base
     * @return mengembalikan nilai boolean
     */
    public static boolean isNum(String number, int base){
        String digits = "0123456789ABCDEF";
        number = number.toUpperCase();
       for (int i=0; i < number.length();i++){
            if(digits.indexOf(number.charAt(i))>=base || digits.indexOf(number.charAt(i)) < 0){
                return false;
            }
        }
        return true;
    }
}
