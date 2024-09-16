import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        if (isPrime(n)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " tidak adalah bilangan prima.");
        }
        input.close();
    }

    //cek apakah bilangan tersebut ada prima atau bukan
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Pseudocode:
    Mulai
        Input n
        jika n kurang dari 2, maka n bukan bilangan prima.
        Loop dari i = 2 ke sqrt(n):
        jika n % i == 0, maka n bukan bilangan prima.
        jika tidak ada pembagi yang ditemukan, maka n adalah bilangan prima.
    Berakhir
 */