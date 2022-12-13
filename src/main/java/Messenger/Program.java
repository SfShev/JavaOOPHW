package Messenger;

import Messenger.ChatLib.ChatCreator;
import Messenger.ChatLib.ChatManager;
import Messenger.ChatLib.Chatroom;
import Messenger.UserLib.User;
import Messenger.UserLib.UserCreator;

public class Program {
    public static void main(String[] args) {
        ChatManager mng1 = new ChatManager();
        ChatCreator chatChreator1 = new ChatCreator();
        UserCreator creator1 = new UserCreator();

        Chatroom chat1 = chatChreator1.createChat("Start");

        User user1 = creator1.createUser("Petya");
        User user2 = creator1.createUser("Igor");
        User user3 = creator1.createUser("Katya");
        User user4 = creator1.createUser("Vasiliy");

        mng1.enterTheChat(chat1, user1);
        mng1.enterTheChat(chat1, user2);
        mng1.enterTheChat(chat1, user3);
        mng1.enterTheChat(chat1, user4);
        System.out.println();

        chat1.printUsers();
        System.out.println();

        mng1.getMessage(chat1, user1, "Hello!");
        mng1.getMessage(chat1, user2, "Hello world!");
        mng1.getMessage(chat1, user3, "Hi, all!");

        mng1.leaveTheChat(chat1, user3);
        System.out.println();
        chat1.printUsers();
        System.out.println();

        chat1.getHistory();
    }
}
