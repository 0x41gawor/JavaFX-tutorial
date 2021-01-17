## JavaFX

File --> New --> Project

<img src="img/1.png" alt="1" style="zoom:75%;" />

Projekt utworzony teraz trzeba dodać libke javaFX.

File --> Project Structure --> Libraries

Klikasz "+" i dodajesz folder **lib** z lokalizacji gdzie zainstalowałeś **javafx-sdk**.

<img src="img/2.png" alt="2" style="zoom:75%;" />

No i teraz odpalamy ale nie działa

<img src="img/3.png" alt="3" style="zoom:75%;" />

No bo trzeba dać do buildera odpowiednie componenty JavaFX, żeby je widział z tej libki

Czyli klikamy tu teges:

![4](img/4.png)

I kopiujesz taki tekst:

`--module-path "A:\Program Files\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml`

Czyli ścieżka do **lib** z folderu gdzie zainstalowano **javafx-sdk**.

i dodajemy moduły, z których będzie korzystane. Tu dodane są kontrolki i pliki fxml.

I takie tekst dajemy do VM options:

<img src="img/5.png" alt="5" style="zoom:75%;" />

No i cykenes działa

## ScreenBuilder

https://stackoverflow.com/questions/53177828/failed-to-start-scene-builder

![6](img/6.png)