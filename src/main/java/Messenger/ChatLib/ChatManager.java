package Messenger.ChatLib;

import Messenger.UserLib.User;

public class ChatManager {
    public void enterTheChat(Chatroom chatroom, User user) {
        chatroom.addUser(user);
    }

    public void leaveTheChat(Chatroom chatroom, User user) {
        chatroom.removeUser(user);
    }

    public void getMessage(Chatroom chatroom, User user, String msg) {
        chatroom.printMessage(user, msg);
    }
}
