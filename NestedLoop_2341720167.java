import java.util.Scanner;

public class NestedLoop_2341720167 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        double temps[][] = new double[5][7];
        double rata2[] = new double[5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            double jml = 0.0; 
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = input20.nextDouble();
                jml += temps[i][j];
            }
            rata2[i] = jml / temps[0].length;
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println("Rata-rata: " + rata2[i]);
        }
    }
}