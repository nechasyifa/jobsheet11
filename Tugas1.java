import java.util.Scanner;

/**
 * Tugas1
 */
public class Tugas1 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int N = 0;

        while (N < 3) {
            System.out.print("Masukkan nilai N (minimal 3): ");
            N = input20.nextInt();

            if (N < 3) {
                System.out.println("Nilai N minimal 3!");
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
