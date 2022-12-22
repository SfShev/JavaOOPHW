package Messenger.UserLib;

public class User {
    public User(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
