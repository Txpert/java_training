### Variablen und Daten-Typen

![[data-types-768.png]]
#### Deklaration und Initialisierung von Variablen

In Java werden Variablen mit einem bestimmten Datentyp deklariert und können initialisiert werden. 

```java
// Deklaration einer Variable
int zahl;

// Initialisierung einer Variable
zahl = 10;

// Deklaration und Initialisierung in einem Schritt
double pi = 3.14;
```

#### Wichtige primitive Datentypen

Java bietet mehrere primitive Datentypen, darunter:

- `int`: Ganzzahl
- `double`: Gleitkommazahl
- `char`: Einzelnes Zeichen
- `boolean`: Wahrheitswert (true oder false)

Beispiele:

```java
int alter = 25;
double temperatur = 36.5;
char buchstabe = 'A';
boolean istJavaEinfach = true;
```

### ![[Screenshot 2024-06-19 at 11.41.06 1.png]]Fallunterscheidungen

#### If, if-else

Mit `if` und `if-else` kannst du Bedingungenauswerten und entsprechend handeln.

```java
int zahl = 10;

if (zahl > 0) {
    System.out.println("Die Zahl ist positiv.");
} else {
    System.out.println("Die Zahl ist negativ oder null.");
}
```

#### Switch-case

`Switch-case` ist nützlich, wenn du eine Variable mit mehreren möglichen Werten vergleichen möchtest.

```java
int tag = 3;
switch (tag) {
    case 1:
        System.out.println("Montag");
        break;
    case 2:
        System.out.println("Dienstag");
        break;
    case 3:
        System.out.println("Mittwoch");
        break;
    default:
        System.out.println("Unbekannter Tag");
        break;
}
```

#### Shorthand ternary if-else

Der ternäre Operator ermöglicht es, eine einfache Bedingung in einer kompakten Form zu schreiben.

```java
int zahl = 10;
String ergebnis = (zahl > 0) ? "positiv" : "negativ oder null";
System.out.println("Die Zahl ist " + ergebnis);
```

### Benutzer-Eingabe mit Scanner

Die Klasse `Scanner` wird verwendet, um Benutzereingaben von `System.in` zu lesen.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.print("Gib deinen Namen ein: ");
String name = scanner.nextLine();

System.out.println("Hallo, " + name + "!");
```

### Vergleich mit `==` und `equals`

Der Vergleich mit `==` überprüft, ob zwei Referenzen auf dasselbe Objekt zeigen, während `equals` den Inhalt von Objekten vergleicht.

```java
String a = new String("Hallo");
String b = new String("Hallo");

// Vergleich der Referenzen
if (a == b) {
    System.out.println("a und b zeigen auf dasselbe Objekt");
} else {
    System.out.println("a und b zeigen auf unterschiedliche Objekte");
}

// Vergleich des Inhalts
if (a.equals(b)) {
    System.out.println("a und b haben denselben Inhalt");
} else {
    System.out.println("a und b haben unterschiedlichen Inhalt");
}
```

