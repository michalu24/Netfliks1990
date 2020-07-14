package FilmService;

import FilmCatalog.FilmGenre;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Service {


    public static void filmRent(FilmGenre filmGenre) {

        //Metoda film rent będzie odczytywała dany gatunek oraz z tabeli filmów
        //przedstawiała dostępne!! propozycje w konsoli. Po wybraniu danego
        //filmu zmieni się jego status w pliku docelowym i po wyporzyczeniu
        // nie będzie możliwości wyświetlenia go w metodzie filmRent

        switch (filmGenre) {
            case GENRE_FAMILY:
                try {
                    InputStream inp = new FileInputStream("Family.xls");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }


        }

    }

    public static void filmReturn(FilmGenre filmGenre, String title) {
        //Ta metoda z kolei będzie zwracać dany film, czyli zmieniać jego status

    }

    public static void showRented() {
        // Ta metoda ma za zadanie pokazać w konsoli listę wypoorzyczonych filmów
    }
}
