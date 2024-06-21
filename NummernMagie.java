import java.util.Scanner;

public class NummernMagie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine positive ganze Zahl ein:");
        int zahl = scanner.nextInt();

        // Fallunterscheidung
        if (zahl < 10) {
            System.out.println("Das ist eine kleine Zahl, aber sie hat trotzdem Magie!");
        } else if (zahl <= 50) {
            System.out.println("Eine mittelgroße Zahl, viel Potenzial für Magie!");
        } else {
            System.out.println("Wow, das ist eine große Zahl, die Magie wird erstaunlich sein!");
        }

        // While Schleife für gerade Zahlen
        System.out.println("Gerade Zahlen bis " + zahl + ":");
        int i = 0;
        while (i <= zahl) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // Do-While Schleife für ungerade Zahlen
        System.out.println("Ungerade Zahlen bis " + zahl + ":");
        int j = 0;
        do {
            if (j % 2 != 0) {
                System.out.println(j);
            }
            j++;
        } while (j <= zahl);

        // For Schleife für Quadrate der Zahlen
        System.out.println("Quadrate der Zahlen bis " + zahl + ":");
        for (int k = 0; k <= zahl; k++) {
            System.out.println(k * k);
        }

        scanner.close();
    }
}

