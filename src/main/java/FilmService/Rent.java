package FilmService;

import FilmCatalog.FilmGenre;
import Formating.PresentData;


public class Rent {

    public static void familyFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_FAMILY);

    }

    public static void horrorFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_HORROR);

    }
    public static void comedyFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_COMEDY);

    }
    public static void adventureFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_ADVENTURE);

    }
    public static void dramaFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_DRAMA);

    }
    public static void sciFiFilm() {
        System.out.println("CHOSE YOUR FILM:");
        System.out.println("________________");
        PresentData.ofFilmGenreCatalog(FilmGenre.GENRE_SCIFI);

    }
}
