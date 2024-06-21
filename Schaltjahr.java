import java.util.Scanner;

public class Schaltjahr {
 // Methode zur Überprüfung, ob ein Jahr ein Schaltjahr ist
 public static boolean istSchaltjahr(int jahr) {
    if (jahr % 4 == 0) {
        if (jahr % 100 == 0) {
            if (jahr % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    } else {
        return false;
    }
}

public static void findeSchaltjahreImBereich(int start, int ende) {
    for (int jahr = start; jahr <= ende; jahr++) { 
        if (istSchaltjahr(jahr)) {
            System.out.println(jahr);
        }
    }
}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Gib ein Jahr ein: ");
        // int jahr = scanner.nextInt();

        // boolean schaltjahr = istSchaltjahr(jahr);

        // System.out.println("Ist dieses Jahr ein Schaltjahr " + schaltjahr);

        //Benutzer nach dem Start- und Endjahr fragen
        System.out.print("Gib das Startjahr ein: ");
        int startJahr = scanner.nextInt();

        System.out.print("Gib das Endjahr ein: ");
        int endJahr = scanner.nextInt();

        // Liste der Schaltjahre berechnen
        System.out.println("Schaltjahre von " + startJahr + " bis " + endJahr + ":");
        findeSchaltjahreImBereich(startJahr, endJahr);

        scanner.close();
    }
  
}