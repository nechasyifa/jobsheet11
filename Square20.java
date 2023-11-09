import java.util.Scanner;

public class Square20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input20.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}