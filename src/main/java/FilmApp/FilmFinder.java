package FilmApp;

import java.util.ArrayList;

public class FilmFinder {
    DataBase db;

    public FilmFinder(DataBase db) {
        this.db = db;
    }

    public String getFilmInfoById(int id) {
        Film film = db.films.get(id - 1);

        return String.format("ID: %d, Название: %s, Жанр: %s, Студия: %s",
                film.filmId,
                film.name,

                db.genres.get(film.genreId - 1).name,
                db.studios.get(film.studioId - 1).name);
    }

    public String findFilm(String name) {
        ArrayList<Film> films = db.films;

        for (Film film : films) {
            if (name.equals(film.getFilmName())) {
                return String.format("Фильм %s найден! ID: %d, Жанр: %s, Студия: %s",
                        name,
                        film.filmId,
                        db.genres.get(film.genreId - 1).name,
                        db.studios.get(film.studioId - 1).name);
            }
        }
        return String.format("Фильм %s не найден!", name);
    }
}