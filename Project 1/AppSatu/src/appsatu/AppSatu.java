package appsatu;

//import java.util.Arrays;
public class AppSatu {

    public static void main(String[] args) {
        //Instansiasi
        FunctionsView FV = new FunctionsView();

        System.out.println("----------------------------------");
        System.out.println("Project 1");
        System.out.println("----------------------------------");
        System.out.println("Fungsi perkalian    : "+FV.perkalian(5,4));
        System.out.println("Fungsi perkalian    : "+FV.perkalian(5,-4));
        System.out.println("Fungsi perkalian    : "+FV.perkalian(-5,4));
        System.out.println("Fungsi perkalian    : "+FV.perkalian(-5,-4));
        System.out.println("Fungsi pemangkatan  : "+FV.pemangkatan(5.5,4.5));
        System.out.println("Fungsi pemangkatan  : "+FV.pemangkatan(5,4));
        System.out.println("Fungsi pemangkatan  : "+FV.pemangkatan(5,-4));
        System.out.println("Fungsi faktorial    : "+FV.faktorial(8));
        System.out.println("Fungsi permutasi    : "+FV.permutasi(5, 4));
        System.out.println("Fungsi kombinasi    : "+FV.kombinasi(5, 4));
      }
}
