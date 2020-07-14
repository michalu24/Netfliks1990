package FilmService;

import FilmCatalog.FilmGenre;
import Formating.PresentData;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class Rent {

    public static void familyFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_FAMILY);
    }
}
