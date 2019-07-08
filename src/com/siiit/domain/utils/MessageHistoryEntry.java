package com.siiit.domain.utils;

public class MessageHistoryEntry {

    private final Contact contact;
    private final String message;

    public MessageHistoryEntry(Contact contact, String message) {
        this.contact = contact;
        this.message = message;
    }

    public Contact getContact() {
        return contact;
    }

    public String getMessage() {
        return message;
    }
}
