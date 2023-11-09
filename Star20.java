import java.util.Scanner;

public class Star20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input20.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.print("*");
        }
    }
}