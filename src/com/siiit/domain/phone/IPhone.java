package com.siiit.domain.phone;

public interface IPhone {

    void addContact(String firstName, String lastName, String phoneNr);
    void listContacts();

    void sendMessage(String phoneNr, String message);
    void listMessages(String phoneNr);

    void call(String phoneNr);
    void viewHistory();


}
