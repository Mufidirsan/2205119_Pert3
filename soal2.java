package tugas3;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1, bilangan2;
        char operasi;

        System.out.print("Masukkan bilangan pertama: ");
        bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        bilangan2 = input.nextInt();

        System.out.print("Pilih operasi aritmatika (+, -, *, /, %) : ");
        operasi = input.next().charAt(0);

        if (operasi == '+') {
            System.out.printf("Hasil penjumlahan adalah: %d\n", bilangan1 + bilangan2);
        } else if (operasi == '-') {
            System.out.printf("Hasil pengurangan adalah: %d\n", bilangan1 - bilangan2);
        } else if (operasi == '*') {
            System.out.printf("Hasil perkalian adalah: %d\n", bilangan1 * bilangan2);
        } else if (operasi == '/') {
            if (bilangan2 != 0)
                System.out.printf("Hasil pembagian adalah: %.2f\n",(float)bilangan1 / bilangan2);
            else
                System.out.println("Pembagian dengan nol tidak dibolehkan.");
        } else if (operasi == '%') {
            if (bilangan2 != 0)
                System.out.printf("Hasil modulus adalah: %d\n", bilangan1 % bilangan2);
            else
                System.out.println("Modulus dengan nol tidak dibolehkan.");
        } else {
            System.out.println("Operasi yang dimasukkan tidak valid.");
        }
    }
}
