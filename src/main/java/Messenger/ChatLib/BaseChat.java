package Messenger.ChatLib;

import Messenger.UserLib.User;

public interface BaseChat {
    void addUser(User user);

    void removeUser(User user);

    void printMessage(User user, String msg);

    void printUsers();

    void getHistory();
}