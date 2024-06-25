
### Aufgabe

Erstellen Sie ein kleines Fahrzeugverwaltungssystem, das verschiedene Fahrzeugtypen verwaltet. Implementieren Sie dazu eine Basisklasse `Vehicle` und zwei abgeleitete Klassen `Car` und `Bike`. Verwenden Sie Konstruktoren, Getter- und Setter-Methoden sowie Methoden zur Darstellung der Fahrzeuginformationen. 

### Anforderungen

1. **Basisklasse `Vehicle`**:
    - Attribute:
        - `private String color`
        - `private String model`
        - `private int year`
    - Konstruktor:
        - `public Vehicle(String color, String model, int year)`
    - Getter- und Setter-Methoden für alle Attribute
    - Methode `public void displayInfo()`: Gibt die Fahrzeuginformationen auf der Konsole aus.

2. **Abgeleitete Klasse `Car`**:
    - Zusätzliche Attribute:
        - `private int numberOfDoors`
    - Konstruktor:
        - `public Car(String color, String model, int year, int numberOfDoors)`
    - Getter- und Setter-Methoden für `numberOfDoors`
    - Überschreiben der Methode `displayInfo()`, um die zusätzlichen Informationen auszugeben.

3. **Abgeleitete Klasse `Bike`**:
    - Zusätzliche Attribute:
        - `private boolean hasCarrier`
    - Konstruktor:
        - `public Bike(String color, String model, int year, boolean hasCarrier)`
    - Getter- und Setter-Methoden für `hasCarrier`
    - Überschreiben der Methode `displayInfo()`, um die zusätzlichen Informationen auszugeben.

4. **Hauptklasse `Main`**:
    - Erstellen Sie Objekte von `Car` und `Bike`.
    - Nutzen Sie die Getter- und Setter-Methoden, um die Attribute zu ändern.
    - Geben Sie die Informationen der Fahrzeuge mithilfe der Methode `displayInfo()` aus.


---

Viel Spaß beim Programmieren!