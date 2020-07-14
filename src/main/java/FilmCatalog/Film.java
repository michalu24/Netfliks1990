package FilmCatalog;

import java.time.LocalDate;

public class Film {

    private String title;
    private FilmGenre genre;
    private LocalDate premierDate;
    private String description;

    public String getTitle() {
        return title;
    }

    public FilmGenre getGenre() {
        return genre;
    }

    public LocalDate getPremierDate() {
        return premierDate;
    }

    public String getDescription() {
        return description;
    }

    public Film() {
    }

    public static class Builder {

        private String title;
        private FilmGenre genre;
        private LocalDate premierDate;
        private String description;

        public Builder(String title, FilmGenre genre) {
            this.title = title;
            this.genre = genre;
        }

        public Builder withPremierDate(LocalDate date) {
            this.premierDate = date;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Film build() {

            Film film = new Film();
            film.title = this.title;
            film.genre = this.genre;
            film.premierDate = this.premierDate;
            film.description = this.description;

            return film;
        }


    }
}
