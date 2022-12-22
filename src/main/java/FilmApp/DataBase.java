package FilmApp;

import FilmApp.FactoriesLib.GenreCreatorFactory;
import FilmApp.FactoriesLib.StudioCreatorFactory;

import java.util.ArrayList;

public class DataBase {
    ArrayList<Film> films = new ArrayList<>();
    ArrayList<Studio> studios = new ArrayList<>();
    ArrayList<Genre> genres = new ArrayList<>();

    public DataBase() {
        Film c1 = new Film(1, "Остров", 1, 1);
        Film c2 = new Film(2, "Сосны", 2, 2);
        Film c3 = new Film(3, "Полет", 1, 3);
        Film c4 = new Film(4, "Крепкий орешек", 2, 4);

        this.addFilm(c1);
        this.addFilm(c2);
        this.addFilm(c3);
        this.addFilm(c4);

        GenreCreatorFactory gcf = new GenreCreatorFactory();
        this.addGenre(gcf.newGenre("Фантастика"));
        this.addGenre(gcf.newGenre("Боевик"));
        this.addGenre(gcf.newGenre("Фэнтэзи"));

        StudioCreatorFactory scf = new StudioCreatorFactory();
        this.addStudio(scf.newStudio("Lionsgate"));
        this.addStudio(scf.newStudio("Paramount Pictures"));
        this.addStudio(scf.newStudio("20th Century Fox"));
        this.addStudio(scf.newStudio("Columbia Pictures"));
    }

    public void addStudio(Studio studio) {
        studios.add(studio);
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public void addFilm(Film film) {
        films.add(film);
    }
}
