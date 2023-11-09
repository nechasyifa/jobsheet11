import java.util.Scanner;
import java.util.Random;

public class Quiz20 {
    public static void main(String[] args) {
        Random random20 = new Random();
        Scanner input20 = new Scanner(System.in);
        
        char menu = 'y';
        do {
            int number = random20.nextInt(10)+1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = input20.nextInt();
                input20.nextLine();

                if (answer < number) {
                    System.out.println("Angka terlalu kecil, coba lagi!");
                } else if (answer < number) {
                    System.out.println("Angka terlalu besar, coba lagi!");
                } else {
                    System.out.println("Selamat, tebakan Anda benar!");
                    success = true;
                }
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)? ");
            menu = input20.nextLine().charAt(0);
        } while(menu == 'y' || menu == 'Y');
    }
}