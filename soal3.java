package tugas3;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int jamMulai, menitMulai, jamSelesai, menitSelesai, selisihMenit, lamaJam, lamaMenit;

        System.out.print("Jam Mulai (Jam, Menit) : ");
        jamMulai = masukan.nextInt();
        menitMulai = masukan.nextInt();

        System.out.print("Jam Selesai (Jam, Menit) : ");
        jamSelesai = masukan.nextInt();
        menitSelesai = masukan.nextInt();

        selisihMenit = (jamSelesai * 60 + menitSelesai) - (jamMulai * 60 + menitMulai);

        if (jamSelesai < jamMulai) {
            selisihMenit += 12 * 60;
        }
        System.out.println("Lama (menit) : " + selisihMenit);

        lamaJam = selisihMenit / 60;
        lamaMenit = selisihMenit % 60;

        System.out.println("Lama (Jam, Menit) : " + lamaJam  + " jam " + lamaMenit + " menit");

    }
}
