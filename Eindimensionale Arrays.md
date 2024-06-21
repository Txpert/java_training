
### Deklaration und Initialisierung

#### 1. Deklaration eines Arrays

Zuerst musst du ein Array deklarieren. Dabei gibst du den Typ der Elemente und die eckigen Klammern `[]` an.

```java
int[] numbers;
String[] names;
```

#### 2. Initialisierung eines Arrays

Nach der Deklaration kannst du das Array initialisieren. Es gibt mehrere Möglichkeiten, dies zu tun:

##### a. Mit einer festen Größe

```java
numbers = new int[5];
names = new String[3];
```

##### b. Mit direkten Werten

```java
int[] numbers = {1, 2, 3, 4, 5};
String[] names = {"Alice", "Bob", "Charlie"};
```

### Zugriff auf Array-Elemente

Du kannst auf die einzelnen Elemente eines Arrays über ihren Index zugreifen. Der Index beginnt bei 0.

```java
int firstNumber = numbers[0]; // Zugriff auf das erste Element
names[1] = "Robert"; // Ändern des zweiten Elements
```

### Iteration über Arrays

#### 1. For-Schleife

Die klassische Methode, um über ein Array zu iterieren, ist die Verwendung einer `for`-Schleife.

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println("Number: " + numbers[i]);
}

```

Beispiel:

```java
int[] number = {1, 2, 3, 4, 5};

for (int i = 0; i < number.length; i++)

System.out.println("Element at index " + i + " : " + number[i]);
```


noch eins:

```java

class GFG {
    public static void main(String[] args)
    {
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        // so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + " : " + arr[i]);
    }
}

```


#### 2. For-Each-Schleife

Eine einfachere Methode, um über ein Array zu iterieren, ist die Verwendung der `for-each`-Schleife.

```java
for (String name : names) {
    System.out.println("Name: " + name);
}
```





