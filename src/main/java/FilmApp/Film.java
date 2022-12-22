package FilmApp;

public class Film {
    int filmId;
    String name;
    int genreId;

    int studioId;

    public Film(int filmId, String name, int genreId, int studioId) {
        this.filmId = filmId;
        this.studioId = studioId;
        this.name = name;
        this.genreId = genreId;
    }

    public String getFilmName() {
        return name;
    }
}