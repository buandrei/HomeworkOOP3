package com.siiit.domain.phone;

import com.siiit.domain.utils.CallHistoryEntry;
import com.siiit.domain.utils.Contact;
import com.siiit.domain.utils.MessageHistoryEntry;
import java.util.*;
import static com.siiit.domain.utils.Constants.*;

public abstract class Phone implements IPhone {
    private int batteryLife = MAXBATTERY_LIFE;
    private final String color;
    private final String material;

    private List<Contact> contacts = new ArrayList<>();
    private List<MessageHistoryEntry> messageHistory = new ArrayList<>();
    private List<CallHistoryEntry> callHistory = new ArrayList<>();

    public Phone(String color, String material) {
        this.color = color;
        this.material = material;

    }

    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public void addContact(String firstName, String lastName, String phoneNr) {
        contacts.add(new Contact(firstName, lastName, phoneNr));
    }

    @Override
    public void listContacts() {
        System.out.println(contacts + "\n");
    }

    @Override
    public void sendMessage(String phoneNr, String message) {

        if(message.length() > MAXMESSAGE_CHARS){
            System.out.println("You cannot send a message longer than 500 characters!");
            return;
        }

        if (getContact(phoneNr) == null) {
            System.out.println("Nu am gasit numarul de telefon in contacte");
            return;
        }

        if (batteryLife < 1) {
            System.out.println("Battery low!");

        } else {
            batteryLife = batteryLife - drainBatteryLife4Message();
            System.out.println("Message sent!");
        }

        Contact temp = getContact(phoneNr);
        messageHistory.add(new MessageHistoryEntry(temp, message));

    }

    private Contact getContact(String phoneNr) {

        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNr)) {
                return contact;
            }
        }
        return null;

    }

    @Override
    public void listMessages(String phoneNr) {

        System.out.println("Messages for: " + phoneNr);

        for (MessageHistoryEntry entry : messageHistory) {
            if (entry.getContact().getPhoneNumber().equals(phoneNr)) {
                System.out.println(entry.getMessage());
            }
        }

    }

    @Override
    public void call(String phoneNr) {

        if (getContact(phoneNr) == null) {
            System.out.println("Nu am gasit numarul de telefon in contacte");
            return;
        }

        if (batteryLife < 2) {
            System.out.println("Battery low!");

        } else {
            batteryLife = batteryLife - drainBatteryLife4Calls();
            System.out.println("Calling...");
            System.out.println("Nobody answered");
        }

        Contact temp = getContact(phoneNr);
        callHistory.add(new CallHistoryEntry(temp));

    }

    @Override
    public void viewHistory() {
        System.out.println("Call history: ");

        for (CallHistoryEntry entry : callHistory) {
            System.out.println(entry.getContact());

        }

    }

    public int drainBatteryLife4Message(){
        return 3;
    }

    public int drainBatteryLife4Calls(){
        return 4;
    }
}
