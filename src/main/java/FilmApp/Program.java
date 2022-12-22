package FilmApp;

public class Program {
    public static void main(String[] args) {
        DataBase db1 = new DataBase();
        FilmFinder finder = new FilmFinder(db1);


        System.out.println(finder.findFilm("Крепкий орешек"));
        System.out.println(finder.getFilmInfoById(1));
    }
}