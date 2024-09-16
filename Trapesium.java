import java.util.Scanner;

public class Trapesium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sisi-sisi trapesium
        System.out.print("Masukkan panjang sisi alas a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan panjang sisi atas b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan panjang garis miring c: ");
        double c = input.nextDouble();
        System.out.print("Masukkan panjang garis miring d: ");
        double d = input.nextDouble();
        System.out.print("Masukkan tinggi trapesium t: ");
        double t = input.nextDouble();

        // Menghitung luas trapesium
        double luas = ((a + b) * t) / 2;
        
        // Menghitung keliling trapesium
        double keliling = a + b + c + d;

        // Output hasil
        System.out.println("Luas Trapesium: " + luas);
        System.out.println("Keliling Trapesium: " + keliling);
        
        input.close();
    }
}


/**
 * Pseudocode:
    Mulai
       Input panjang sisi alas a
        Input panjang sisi atas b
        Input panjang garis miring c
        Input panjang garis miring d
        Input tinggi trapesium t

        Hitung luas trapesium:
            luas = ((a + b) * t) / 2

        Hitung keliling trapesium:
            keliling = a + b + c + d

        Tampilkan luas trapesium
        Tampilkan keliling trapesium
    Berakhir
 */