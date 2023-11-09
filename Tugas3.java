import java.util.Scanner;

/**
 * Tugas3
 */
public class Tugas3 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int N;

        do {
            System.out.print("Masukkan nilai N (minimal 3): ");
            N = input20.nextInt();
            if (N < 3) {
                System.out.println("Nilai N minimal 3!");
            }
        } while (N < 3);

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}