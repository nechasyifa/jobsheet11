import java.util.Scanner;

/**
 * Tugas2
 */
public class Tugas2 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int N;

        do {
            System.out.print("Masukkan nilai N (minimal 5): ");
            N = input20.nextInt();
            if (N < 5) {
                System.out.println("Nilai N minimal 5!");
            }
        } while (N < 5);

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}