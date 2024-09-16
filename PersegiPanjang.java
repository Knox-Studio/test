import java.util.Locale;
import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        double panjang, lebar, luas;

        System.out.println("Input panjang persegi: ");
        panjang = input.nextDouble();

        System.out.println("Input lebar persegi: ");
        lebar = input.nextDouble();

        luas = panjang * lebar;
        luas = Math.round(luas * 100) / 100.0;

        System.out.println("Luas persegi adalah: " +  luas);

        input.close();
    }
}


/**
 * Pseudocode:
    Mulai
       input panjang, lebar, luas
       hitung luas panjang persegi panjang dengan:
       luas = panjang * lebar
       baru dibulatkan 
       luat = Math.round(luas * 100)/100.00
       output luas
    Berakhir
 */