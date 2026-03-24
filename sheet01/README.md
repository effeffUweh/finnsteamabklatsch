# Sheet 01

Sie sollten bereits Ihre Entwicklungsumgebung eingerichtet und die
Vorlesungsmaterialien geklont haben. Wenn Sie das noch nicht gemacht haben,
folgen Sie zunächst der entsprechenden Anleitung:

| [Windows](https://github.com/pi-tuebingen/material/setup/windows/README.md) | [Mac](https://github.com/pi-tuebingen/material/setup/mac/README.md) | [Linux](https://github.com/pi-tuebingen/material/setup/linux/README.md) |
|-------------|---------------------------------------------------------------------|-------------------------------------------------------------------------|

Jetzt müssen Sie dieses Repository, Ihr Team Repository, klonen. Folgen Sie dazu
den gleichen Schritten wie beim klonen von `pi-tuebingen/material`, wählen aber
`pi2-tuebingen-teams/teamNNN` aus, wobei `teamNNN` der Name dieses Repositories
ist. Wenn Sie einen Ordner `sheet01` mit dieser Anleitung in IntelliJ sehen,
kann es losgehen!

Folgen Sie generell diesen Schritten, illustriert am Beispiel der ersten
Aufgabe `Fizzbuzz`.

- **Run**: Öffnen Sie im Projektbaum `sheet01/main/Fizzbuzz`. Klicken Sie auf
  das obere grüne Dreieck neben dem Inhalt der Datei. Im unteren Bereich von
  IntelliJ sehen Sie jetzt die Ausgabe des Programms. Da sollte nun "Alles
  funktioniert!" stehen.

- **Test**: Öffnen Sie anschließend `sheet01/test/FizzBuzzTest`. Klicken Sie auf
  das obere grüne Dreieck neben dem Inhalt der Datei, um den Test auszuführen.
  Der Test wird fehlschlagen, das ist gewollt. Ihre erste Aufgabe ist es, den
  Code in `FizzBuzz.java` so zu korrigieren, dass der Test erfolgreich ist.

- **Edit**: Öffnen Sie im Projektbaum wieder `sheet01/main/FizzBuzz`.
  Korrigieren Sie das Programm, so dass es die oben beschriebene Ausgabe
  erzeugt.

- **Run**: Probieren Sie den von Ihnen geänderten Code nochmal aus. Tun Sie dies
  möglichst oft.

- **Test**: Testen Sie Ihren Code erneut und stellen sie sicher, dass alle Tests
  erfolgreich sind.

- **Edit**: Wenn die Tests noch nicht erfolgreich sind, bearbeiten Sie das
  Programm wieder und wieder.

- **Push**: Wählen Sie oben in der Menüleiste "Git" → "Commit". Geben Sie eine
  kurze Beschreibung Ihrer Änderungen, zum Beispiel "FizzBuzz done", ein und
  klicken Sie auf "Commit and Push".

- **Check**: Öffnen Sie Ihr Team Repository auf GitHub im Browser und überprüfen
  Sie, dass Ihre Änderungen angekommen sind. Nach einer Weile sollte ein grüner
  Haken neben der Beschreibung Ihrer Änderungen erscheinen.

**Erfolg!** Erledigen Sie die anderen Aufgaben nach demselben Schema.

## Aufgabe 1: Fizzbuzz

FizzBuzz gibt die Zahlen von 1 bis n aus. Dabei gilt:

Für Vielfache von 3 wird statt der Zahl Fizz ausgegeben.
Für Vielfache von 5 wird statt der Zahl Buzz ausgegeben.
Für Vielfache von 3 und 5 wird FizzBuzz ausgegeben.

Beispiel für n = 15:

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

Schreiben Sie ein Programm `Fizzbuzz.main`, welches genau diese Ausgabe erzeugt.

## Aufgabe 2: Kreiszahl π

Die Kreiszahl π lässt sich durch die Leibniz-Formel approximieren:

$$
4 \cdot \sum_{k=0}^{n} \frac{(-1)^k}{2k+1} = 4 \cdot \left(1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \ldots\right)
$$

Ergänzen Sie das Programm `LeibnizPi.main`, welches diese Summe für ein festgelegtes `n = 1_000_000` ausgibt.

Beispiel für n = 1_000_000:

```
3.1415936535887745
```

## Aufgabe 3: Primfaktorzerlegung

Jede natürliche Zahl lässt sich als Produkt von Primzahlen darstellen.

Beispiel für n = 12:

```
2
2
3
```

Beispiel für n = 60:

```
2
2
3
5
```

Schreiben Sie ein Programm `PrimeFactors.main` welches alle Primfaktoren von `n = 60` ausgibt, jeden auf einer eigenen Zeile.

