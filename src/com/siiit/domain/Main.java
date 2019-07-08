package com.siiit.domain;

import com.siiit.domain.models.HMate20Lite;
import com.siiit.domain.models.SGalaxyS10;
import com.siiit.domain.phone.Phone;

import static com.siiit.domain.utils.Constants.MAXBATTERY_LIFE;

public class Main {

    public static void main(String[] args) {

        Phone phone = new SGalaxyS10();

        System.out.println("Battery full! " + MAXBATTERY_LIFE + " hours");

        phone.addContact("Andrei", "Bu", "0751827031");
        phone.addContact("Catalin", "Popescu", "0755414855");

        phone.listContacts();

        phone.sendMessage("0751827031", "Salut. Ai 2 minute?");
        System.out.println("Your current battery life: " + phone.getBatteryLife());


        phone.listMessages("0751827031");
        System.out.println("\n\n");

        phone.call("0755414855");
        System.out.println("Your current battery life: " + phone.getBatteryLife());

        phone.viewHistory();
/*

        Phone phone = new HMate20Lite();

        System.out.println("Battery full! " + MAXBATTERY_LIFE + " hours");

        phone.addContact("Andrei", "Bu", "0751827031");
        phone.addContact("Catalin", "Popescu", "0755414855");

        phone.listContacts();

        phone.sendMessage("0751827031", "Salut. Ai 2 minute?");
        System.out.println("Your current battery life: " + phone.getBatteryLife());


        phone.listMessages("0751827031");
        System.out.println("\n\n");

        phone.call("0755414855");
        System.out.println("Your current battery life: " + phone.getBatteryLife());

        phone.viewHistory();

*/
    }
}
