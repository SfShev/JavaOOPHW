package FilmApp.FactoriesLib;

import FilmApp.Studio;

public class StudioCreatorFactory {
    int count = 1;


    public Studio newStudio(String name) {
        Studio studio = new Studio();
        studio.studioId = count++;
        studio.name = name;
        return studio;
    }
}