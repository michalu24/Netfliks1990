package FilmCatalog;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {

    @Test
    void getTitle() {

        //Given
        Film film = new Film.Builder("NAME", FilmGenre.GENRE_DRAMA)
                .build();
        //When
        String result = film.getTitle();

        //Then
        assertEquals("NAME",result);

    }

    @Test
    void getGenre() {
        //Given
        Film film = new Film.Builder("NAME", FilmGenre.GENRE_DRAMA)
                .build();
        //When
        FilmGenre result = film.getGenre();

        //Then
        assertEquals(FilmGenre.GENRE_DRAMA,result);
    }

    @Test
    void getPremierDate() {

        //Given
        Film film = new Film.Builder("NAME", FilmGenre.GENRE_DRAMA)
                .withPremierDate(LocalDate.of(1990,3,5))
                .build();
        //When
        LocalDate result = film.getPremierDate();

        //Then
        assertEquals(LocalDate.of(1990,3,5),result);


    }

    @Test
    void getDescription() {

        //Given
        Film film = new Film.Builder("NAME", FilmGenre.GENRE_DRAMA)
                .withPremierDate(LocalDate.of(1990, 3, 5))
                .withDescription("Short description")
                .build();
        //When
        String result = film.getDescription();

        //Then
        assertEquals("Short description",result);

    }
}