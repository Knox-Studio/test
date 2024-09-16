import java.util.Scanner;

public class Barang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step a: Input kode barang
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = input.nextLine();

        // Step b: Input harga barang
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();

        // Step c: Input jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();


        double bayar = hargaBarang * jumlahBarang;

        double discount = 0;

        if (bayar > 150000) {
            discount = bayar * 0.05; // 5% discount jika pembayaran > 150,000
        }

        double totalBayar = bayar - discount;

        System.out.println("Barang Dengan Kode: " + kodeBarang);
        System.out.println("Total bayar setelah diskon: " +  totalBayar);

        input.close();
    }
}

/**
 * Pseudocode:
    Mulai
        Input kode barang
        Input harga barang
        Input jumlah barang

        Hitung total bayar = harga barang * jumlah barang

        Jika total bayar > 150000, 
            Hitung diskon = 5% dari total bayar
        Jika tidak, 
            Diskon = 0

        Hitung total bayar setelah diskon = total bayar - diskon

        Tampilkan kode barang
        Tampilkan total bayar setelah diskon
    Berakhir
 */