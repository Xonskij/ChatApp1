package ru.trait.chatapp;

/**
 * Created by Anatole on 19.05.2016.
 */
public class ChatMessage {
    boolean left;
    String message;

    public ChatMessage(boolean left, String message) {
        super();
        this.left=left;
        this.message = message;
    }
}
