import java.util.Scanner;

public class VetorInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];

        for (int i = 0; i < 8; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 7; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
