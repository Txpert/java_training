

### 1. `while` Schleife
Die `while` Schleife wiederholt eine Anweisung oder einen Anweisungsblock, solange eine bestimmte Bedingung `true` ist.

#### Syntax
```java
while (Bedingung) {
    // Anweisungen
}
```

#### Beispiel
```java
int i = 0;
while (i < 5) {
    System.out.println("i ist: " + i);
    i++;
}
```
In diesem Beispiel wird der Code innerhalb der Schleife so lange ausgeführt, wie die Bedingung `i < 5` `true` ist.

### 2. `do-while` Schleife
Die `do-while` Schleife ist ähnlich wie die `while` Schleife, aber der Schleifenkörper wird mindestens einmal ausgeführt, da die Bedingung am Ende der Schleife geprüft wird.

#### Syntax
```java
do {
    // Anweisungen
} while (Bedingung);
```

#### Beispiel
```java
int i = 0;
do {
    System.out.println("i ist: " + i);
    i++;
} while (i < 5);
```
In diesem Beispiel wird der Code innerhalb der Schleife mindestens einmal ausgeführt, unabhängig davon, ob die Bedingung zu Beginn `true` oder `false` ist.

### 3. `for` Schleife
Die `for` Schleife wird oft verwendet, wenn die Anzahl der Wiederholungen bereits im Voraus bekannt ist. Sie besteht aus drei Teilen: Initialisierung, Bedingung und Inkrement/Dekrement.

#### Syntax
```java
for (Initialisierung; Bedingung; Inkrement/Dekrement) {
    // Anweisungen
}
```

#### Beispiel
```java
for (int i = 0; i < 5; i++) {
    System.out.println("i ist: " + i);
}
```
In diesem Beispiel wird die Schleife von `i = 0` bis `i < 5` durchlaufen, wobei `i` nach jeder Iteration um 1 erhöht wird.

### Situationsgerechter Einsatz

#### `while` Schleife
- **Einsatz**: Wird verwendet, wenn die Anzahl der Iterationen nicht im Voraus bekannt ist.
- **Beispiel**: Lesen von Benutzereingaben, bis eine bestimmte Eingabe erfolgt.
```java
Scanner scanner = new Scanner(System.in);
String input;
while (!(input = scanner.nextLine()).equals("exit")) {
    System.out.println("Eingabe: " + input);
}
```

#### `do-while` Schleife
- **Einsatz**: Wird verwendet, wenn der Schleifenkörper mindestens einmal ausgeführt werden soll, unabhängig von der Bedingung.
- **Beispiel**: Menüanzeige, die mindestens einmal angezeigt werden soll, bis der Benutzer "Beenden" auswählt.
```java
Scanner scanner = new Scanner(System.in);
String input;
do {
    System.out.println("Menü: [Option1, Option2, Beenden]");
    input = scanner.nextLine();
} while (!input.equals("Beenden"));
```

#### `for` Schleife
- **Einsatz**: Wird verwendet, wenn die Anzahl der Iterationen im Voraus bekannt ist.
- **Beispiel**: Durchlaufen eines Arrays.
```java
int[] zahlen = {1, 2, 3, 4, 5};
for (int i = 0; i < zahlen.length; i++) {
    System.out.println("Zahl: " + zahlen[i]);
}
```

