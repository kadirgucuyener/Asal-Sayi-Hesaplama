import java.util.Scanner;

public class Main {
    static boolean isPrime(int sayi, int i) {
        if (i == sayi)
            return true;
        else if (sayi % i == 0)
            return false;

        return isPrime(sayi, i + 1);
    }
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int exp;
        do {
            System.out.print("Sayı Giriniz: ");
            exp = num.nextInt();

        } while (exp <= 0);
        if (isPrime(exp,2))
            System.out.println(exp + " sayısı asal sayıdır.");
        else System.out.println(exp + " sayısı asal sayı değildir.");
    }
}
