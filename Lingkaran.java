import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        // Menghitung luas lingkaran
        double luas = Math.PI * r * r;

        // Menghitung keliling lingkaran
        double keliling = 2 * Math.PI * r;

        // Output hasil
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
        
        input.close();
    }
}
