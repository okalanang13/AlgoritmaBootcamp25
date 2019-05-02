package Conversion_num;
/*
 * Ini merupakan kelas main 
 * dari tugas nomor 2(converter desimal ke biner,octa, hexa, dan sebaliknya) dan 
 * Author : Fala dan Uki
 */
public class Function {
        public static void main(String[] args) {
        FunctionView function = new FunctionView();
        System.out.print("Fungsi konversi Desimsl ke Binner: ");
        System.out.print(function.converterFromDesBin(15));
        System.out.print("\nFungsi konversi Desimal ke Octal: ");
        System.out.print(function.converterFromDesOcta(212));
        System.out.print("\nFungsi konversi Desimal ke Hexa: ");
        System.out.print(function.converterFromDesHexa(47));
        System.out.print("\nFungsi konversi Biner ke Desimal: ");
        System.out.print(function.converterToDesBin("1010"));
        System.out.print("\nFungsi konversi Octal ke Desimal: ");
        System.out.print(function.converterToDesOcta("324"));
        System.out.print("\nFungs" + "i konversi Hexa ke Desimal: ");
        System.out.println(function.converterToDesHexa("2F"));
    }
}
