import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            System.out.println("Podaj liczbę:");
            i = scanner.nextInt();
            if (i > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (i < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (i % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            }
        }
        while (i > 200 || i < 100 || i % 3 != 0);

        System.out.println("Twoja liczba jest prawidłowa");

    }
}
