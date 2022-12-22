package FilmApp;

import java.util.ArrayList;

public class Producer {
    private String fullName;
    private int age;
    private ArrayList<String> filmography;

    public String getFullName(){
        return fullName;

    }

    public int getAge(){
        return age;
    }

    public ArrayList<String> getFilmography(){
        return filmography;
    }

    public void setFullName(){
        this.fullName=fullName;
    }

    public void setAge(){
        this.age=age;
    }

    public void setFilmography(){
        this.filmography=filmography;
    }

    Producer(String fullName, int age, ArrayList<String>filmography){
        this.fullName=fullName;
        this.age=age;
        this.filmography=new ArrayList<>();
    }
}