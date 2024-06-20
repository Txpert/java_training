### Alle Jahre wieder


Sie wollen wissen, wann das nächste Schaltjahr ist! Zum Glück gibt es eine Möglichkeit dieses vom Computer berechnen zu lassen. Sie müssen es nur noch programmieren. Ihr Programm soll hierbei zunächst das Jahr einlesen, welches überprüft werden soll. Anschließend wird dieses getestet.

Ein Schaltjahr erfüllt folgende Bedingungen:
- Es ist ein Schaltjahr, wenn die Jahreszahl durch 4 teilbar ist
- Ist es auch ganzzahlig durch 100 teilbar, so ist es kein Schaltjahr, außer ...
  - ... das Jahr ist ebenfalls ganzzahlig durch 400 teilbar

Folgende Jahre sind Schaltjahre:

| 1808 | 1904 | 2000 | 2112 | 2244 | 2332 | 2380 | 2400 |

Ob eine Zahl ganzzahlig durch eine andere Zahl teilbar ist, kann mit dem Modulo-Operator herausgefunden werden.

```java
if (year % 4 == 0) {
    // ...
}
```