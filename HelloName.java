public class HelloName {
    public static void main(String[] args) { 
        // Überprüfen, ob genau ein Argument übergeben wurde
        if (args.length == 1) {   // Argumente sind in args-Array gespeichert von der Konsole
            String name = args[0];
            System.out.println("Hallo " + name + "!");
        } else {
            System.out.println("Bitte geben Sie genau einen Namen als Argument ein.");
        }
    }
}