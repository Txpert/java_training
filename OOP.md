![[Sichtbarkeit.png]]
## Konzept der Objektorientierung

- Erlaubt uns das Bündeln von zusammengehörigen Attributen und Methoden
- Wird in sogenannten Klassen gebündelt
- Klassen dienen als Bauplan für Objekte

> Man versucht, Objekte aus der realen Welt im Programm nach zu modellieren

## Klassen und Objekte

- Für jedes Objekt, das wir nachmodellieren möchten, müssen wir eine eigene Klasse erstellen
- Klasse stellt nur einen Bauplan dar (mit dem Erstellen einer Klasse allein wird noch kein Speicherplatz belegt)
- Man muss von der Klasse zunächst ein Objekt erzeugen, damit man mit diesem arbeiten kann
- `new`-Operator sorgt dafür, dass genügend Speicherplatz für alle Attribute innerhalb des Objekts reserviert wird
- Über den Punkt-Operator kann man auf die einzelnen Attribute einer Klasse zugreifen

### Beispiel: Erstellen einer Klasse und eines Objekts

```java
public class Car {
    // Attribute
    String color;
    String model;
    int year;

    // Methode
    void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Hauptklasse mit main-Methode
public class Main {
    public static void main(String[] args) {
        // Objekt erstellen
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.year = 2021;
        
        // Methode aufrufen
        myCar.displayInfo();
    }
}
```

## Methoden in Klassen

- Bisher besteht die Klasse `Car` nur aus Attributen
- Dadurch sind alle Objekte, die man von der Klasse `Car` erstellt, sehr statisch
- Damit Klassen auch Funktionalitäten besitzen, muss man Methoden implementieren
- Alle Funktionen eines Autos werden also innerhalb dieser Klasse `Car` mithilfe von Methoden modelliert

## Der Konstruktor

###Zusammenfassung

- Konstruktor konstruiert das Objekt
- Konstruktor deklariert alle Attribute auf dem vom `new`-Operator reservierten Speicherbereich
- Konstruktor ist eine besondere Methode
- Falls man selbst keinen Konstruktor definiert, wird seitens Java automatisch der sogenannte Standardkonstruktor bereitgestellt
- Konstruktor hat immer den gleichen Bezeichner wie die Klasse selbst
- Konstruktor hat keinen Rückgabewert (Wichtig: das Schlüsselwort `void` muss nicht angegeben werden)
- Über Konstruktor kann man Attribute direkt mit einem gewünschten Wert vorbelegen



Ein Konstruktor ist eine spezielle Methode, die verwendet wird, um Objekte zu initialisieren. Der Konstruktor wird aufgerufen, wenn eine Instanz einer Klasse erstellt wird. Konstruktoren haben den gleichen Namen wie die Klasse und haben keinen Rückgabewert, nicht einmal `void`.

#### Arten von Konstruktoren

1. **Standardkonstruktor**: Ein Konstruktor ohne Parameter. Wenn keine Konstruktoren in einer Klasse definiert sind, stellt der Compiler automatisch einen Standardkonstruktor bereit.
2. **Parametrisierter Konstruktor**: Ein Konstruktor mit einem oder mehreren Parametern, der es ermöglicht, Objekte mit spezifischen Werten zu initialisieren.

### Beispiel für einen Standardkonstruktor

Hier ist eine Klasse `Auto` mit einem Standardkonstruktor:

```java
public class Auto {
    String marke;
    String modell;
    int baujahr;

    // Standardkonstruktor
    public Auto() {
        this.marke = "Unbekannt";
        this.modell = "Unbekannt";
        this.baujahr = 0;
    }

    public void anzeigen() {
        System.out.println("Marke: " + marke);
        System.out.println("Modell: " + modell);
        System.out.println("Baujahr: " + baujahr);
    }

    public static void main(String[] args) {
        // Erstellen eines Objekts mit dem Standardkonstruktor
        Auto meinAuto = new Auto();
        meinAuto.anzeigen();
    }
}
```

- Bisher war der Konstruktor sehr statisch, denn es wurden immer die gleichen Werte an jedes Objekt zugewiesen
- Man kann dem Konstruktor nun aber auch Übergabeparameter mitgeben, sodass man jedem Objekt individuelle Werte zuweisen kann

**Beachte:** Sobald man Übergabeparameter an den Konstruktor übergibt, gibt es den Standardkonstruktor nicht mehr 
> Man muss jetzt also Parameter übergeben, ansonsten kommt es zu einem Fehler

**Lösung:** Den Konstruktor überladen
### Beispiel für einen Parametrisierten Konstruktor

Hier ist eine Klasse `Auto` mit einem parametrisierten Konstruktor:

```java
public class Auto {
    String marke;
    String modell;
    int baujahr;

    // Parametrisierter Konstruktor
    public Auto(String marke, String modell, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public void anzeigen() {
        System.out.println("Marke: " + marke);
        System.out.println("Modell: " + modell);
        System.out.println("Baujahr: " + baujahr);
    }

    public static void main(String[] args) {
        // Erstellen eines Objekts mit dem parametrisierten Konstruktor
        Auto meinAuto = new Auto("BMW", "X5", 2020);
        meinAuto.anzeigen();
    }
}
```

### Konstruktorüberladung

In Java kannst du mehrere Konstruktoren in einer Klasse definieren, indem du verschiedene Parameterlisten verwendest. Dies wird als Konstruktorüberladung bezeichnet.

### Beispiel für Konstruktorüberladung

Hier ist eine Klasse `Auto` mit überladenen Konstruktoren:

```java
public class Auto {
    String marke;
    String modell;
    int baujahr;

    // Standardkonstruktor
    public Auto() {
        this.marke = "Unbekannt";
        this.modell = "Unbekannt";
        this.baujahr = 0;
    }

    // Parametrisierter Konstruktor
    public Auto(String marke, String modell, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public void anzeigen() {
        System.out.println("Marke: " + marke);
        System.out.println("Modell: " + modell);
        System.out.println("Baujahr: " + baujahr);
    }

    public static void main(String[] args) {
        // Erstellen eines Objekts mit dem Standardkonstruktor
        Auto auto1 = new Auto();
        auto1.anzeigen();

        // Erstellen eines Objekts mit dem parametrisierten Konstruktor
        Auto auto2 = new Auto("Audi", "Q5", 2021);
        auto2.anzeigen();
    }
}
```


Konstruktoren sind nützlich, um Objekte beim Erstellen mit sinnvollen Startwerten zu initialisieren und sicherzustellen, dass ein Objekt in einem gültigen Zustand ist, bevor es verwendet wird.

**Wichtig:** Sobald man in der Klasse einen eigenen Konstruktor definiert, wird nicht mehr automatisch der Standardkonstruktor aufgerufen

## Was bedeutet „null“?

- `null` wird immer dann zugewiesen, wenn einer Objektvariable noch kein Objekt zugewiesen wurde
- Das Wort `null` bedeutet „nichts“ (es ist also noch kein Objekt darin enthalten)



## Die Sichtbarkeitsmodifizierer `public` und `private`

- Man sollte nur über Methoden auf die Attribute eines Objekts zugreifen können
- Durch die Verwendung des Sichtbarkeitsmodifizierers `private` kann man dies realisieren
- `private` (privat): nur innerhalb der Klasse sichtbar
- `public` (öffentlich): überall sichtbar
- Wir werden in Zukunft alle Attribute einer Klasse mit dem Schlüsselwort `private` deklarieren (sauberer Programmierstil)

## Getter / Setter

- Aufgrund der Datenkapselung durch die Sichtbarkeitsmodifizierer sind häufig sogenannte Getter und Setter notwendig, um beispielsweise Werte einzelner Attribute auszulesen
- Eine Getter-Methode gibt den Wert eines Attributs zurück
- Eine Set-Methode setzt den Wert eines Attributs

**Vorteil von Getter-Methoden:** Werte können nicht aus Versehen verändert werden

**Vorteil von Set-Methoden:** Die Gültigkeit des eingegebenen Wertes kann direkt überprüft werden

### Beispiel: Getter- und Setter-Methoden

```java
public class Car {
    // Attribute
    private String color;
    private String model;
    private int year;

    // Konstruktor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Getter für color
    public String getColor() {
        return color;
    }

    // Setter für color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter für model
    public String getModel() {
        return model;
    }

    // Setter für model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter für year
    public int getYear() {
        return year;
    }

    // Setter für year
    public void setYear(int year) {
        if (year > 1885 && year <= 2024) { // Beispielhafte Validierung
            this.year = year;
        } else {
            System.out.println("Ungültiges Jahr");
        }
    }
}

// Hauptklasse mit main-Methode
public class Main {
    public static void main(String[] args) {
        // Objekt erstellen
        Car myCar = new Car("Red", "Toyota", 2021);
        
        // Werte über Getter auslesen
        System.out.println("Initial values:");
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Werte über Setter ändern
        myCar.setColor("Blue");
        myCar.setModel("Honda");
        myCar.setYear(2020);

        // Geänderte Werte auslesen
        System.out.println("Updated values:");
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
    }
}
```


### Statische Klassen-Variablen (Felder)

1. **Definition**: Eine statische Variable, auch Klassenvariable genannt, wird mit dem Schlüsselwort `static` deklariert. Sie gehört der Klasse selbst und nicht einzelnen Instanzen der Klasse. Es gibt nur eine Kopie dieser Variable, die von allen Instanzen der Klasse geteilt wird.
   ```java
   public class Beispiel {
       public static int zähler = 0;
   }
   ```

2. **Zugriff**: Statische Variablen können direkt über den Klassennamen zugegriffen werden, ohne eine Instanz der Klasse zu erstellen.
   ```java
   Beispiel.zähler = 5;
   ```

3. **Beispiel**:
   ```java
   public class Beispiel {
       public static int zähler = 0;
       
       public Beispiel() {
           zähler++;
       }
   }

   public class Main {
       public static void main(String[] args) {
           Beispiel obj1 = new Beispiel();
           Beispiel obj2 = new Beispiel();
           System.out.println(Beispiel.zähler); // Ausgabe: 2
       }
   }
   ```

### Statische Methoden

1. **Definition**: Eine statische Methode wird mit dem Schlüsselwort `static` deklariert. Sie kann direkt über den Klassennamen aufgerufen werden, ohne dass eine Instanz der Klasse erstellt wird.
   ```java
   public class Beispiel {
       public static void zeigeNachricht() {
           System.out.println("Hallo, Welt!");
       }
   }
   ```

2. **Zugriff**: Statische Methoden werden ebenfalls über den Klassennamen aufgerufen.
   ```java
   Beispiel.zeigeNachricht();
   ```

3. **Beispiele und Einschränkungen**:
   - **Kein Zugriff auf Instanzvariablen**: Statische Methoden können nicht direkt auf Instanzvariablen oder Instanzmethoden zugreifen, weil sie keinen Bezug zu einer bestimmten Instanz haben.
   - **Nur Zugriff auf statische Mitglieder**: Statische Methoden können nur auf andere statische Variablen und statische Methoden der Klasse zugreifen.
   ```java
   public class Beispiel {
       private int instanzVariable = 10;
       public static int statischeVariable = 20;

       public static void statischeMethode() {
           // instanzVariable++; // Fehler: Nicht-statische Variable kann nicht von einer statischen Methode referenziert werden
           statischeVariable++;
       }

       public void instanzMethode() {
           instanzVariable++;
           statischeVariable++;
       }
   }
   ```

### Zusammenfassung

- **Statische Klassen-Variablen**:
  - Werden mit `static` deklariert.
  - Gehören der Klasse und nicht den Instanzen.
  - Es gibt nur eine Kopie, die von allen Instanzen geteilt wird.
  - Zugriff erfolgt über den Klassennamen.

- **Statische Methoden**:
  - Werden mit `static` deklariert.
  - Können ohne Erstellung einer Instanz aufgerufen werden.
  - Können nicht auf Instanzvariablen oder Instanzmethoden zugreifen.
  - Zugriff erfolgt über den Klassennamen.

Statische Variablen und Methoden sind nützlich für das Verwalten von Daten und Funktionen, die von allen Instanzen einer Klasse geteilt werden sollen. Sie helfen, Speicherplatz zu sparen und ermöglichen den einfachen Zugriff auf gemeinsame Ressourcen.
### Vererbung

**Vererbung** ist ein grundlegendes Konzept der objektorientierten Programmierung (OOP), das es einer Klasse ermöglicht, die Eigenschaften (Felder) und Verhaltensweisen (Methoden) einer anderen Klasse zu übernehmen. Die Klasse, die vererbt, wird als **Basisklasse** oder **Superklasse** bezeichnet, und die Klasse, die erbt, wird als **abgeleitete Klasse** oder **Unterklasse** bezeichnet. 

### Grundlegende Konzepte der Vererbung

1. **Superklasse und Unterklasse**:
   - **Superklasse**: Die Klasse, von der geerbt wird.
   - **Unterklasse**: Die Klasse, die von der Superklasse erbt.
   
   ```java
   class Tier {
       public void essen() {
           System.out.println("Das Tier isst.");
       }
   }

   class Hund extends Tier {
       public void bellen() {
           System.out.println("Der Hund bellt.");
       }
   }
   ```

2. **Vererbung von Methoden und Feldern**:
   - Eine Unterklasse erbt alle öffentlichen (`public`) und geschützten (`protected`) Felder und Methoden der Superklasse.
   
   ```java
   Hund meinHund = new Hund();
   meinHund.essen();  // Ausgabe: Das Tier isst.
   meinHund.bellen(); // Ausgabe: Der Hund bellt.
   ```

3. **Überschreiben von Methoden**:
   - Eine Unterklasse kann die Methoden der Superklasse überschreiben, um spezifisches Verhalten zu definieren.
   
   ```java
   class Hund extends Tier {
       @Override
       public void essen() {
           System.out.println("Der Hund isst.");
       }
   }

   ```

4. **Zugriff auf die Superklasse mit `super`**:
   - Man kann mit `super` auf die Methoden und Konstruktoren der Superklasse zugreifen.
   
   ```java
   class Hund extends Tier {
       @Override
       public void essen() {
           super.essen(); // Ruft die Methode der Superklasse auf
           System.out.println("Der Hund isst.");
       }
   }
   ```



### Praktisches Beispiel

Angenommen, Sie entwickeln eine Bibliothekssystemanwendung, bei der verschiedene Arten von Medien wie Bücher, Zeitschriften und DVDs verwaltet werden. Sie können eine Superklasse `Medium` erstellen und spezifische Klassen wie `Buch`, `Zeitschrift` und `DVD` ableiten.

```java
class Medium {
    String titel;
    String autor;
    
    public void anzeigen() {
        System.out.println("Titel: " + titel + ", Autor: " + autor);
    }
}

class Buch extends Medium {
    int seitenanzahl;

    public void anzeigen() {
        super.anzeigen();
        System.out.println("Seitenanzahl: " + seitenanzahl);
    }
}

class Zeitschrift extends Medium {
    int ausgabe;

    public void anzeigen() {
        super.anzeigen();
        System.out.println("Ausgabe: " + ausgabe);
    }
}

class DVD extends Medium {
    int spieldauer;

    public void anzeigen() {
        super.anzeigen();
        System.out.println("Spieldauer: " + spieldauer + " Minuten");
    }
}

public class Bibliothek {
    public static void main(String[] args) {
        Buch buch = new Buch();
        buch.titel = "Java Programmierung";
        buch.autor = "John Doe";
        buch.seitenanzahl = 450;
        buch.anzeigen();
        
        Zeitschrift zeitschrift = new Zeitschrift();
        zeitschrift.titel = "Tech Weekly";
        zeitschrift.autor = "Jane Smith";
        zeitschrift.ausgabe = 24;
        zeitschrift.anzeigen();
        
        DVD dvd = new DVD();
        dvd.titel = "Inception";
        dvd.autor = "Christopher Nolan";
        dvd.spieldauer = 148;
        dvd.anzeigen();
    }
}
```


