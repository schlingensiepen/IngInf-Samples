package com.example.springboot;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import inginf.Item;


/* Diese Klasse gibt es im Kontext der Applikation nur einmal
 * und wird von Spring verwaltet. Sie ist ist Platzhalter für einen
 * Datenbankzugriff, der hier nicht implementiert ist.
 */

@ApplicationScope 
@Component
public class AppStore {

    private java.util.ArrayList<inginf.Item> itemStore 
        = new java.util.ArrayList<inginf.Item>();
    public inginf.Item addNewItem(inginf.Item item) {
        if (itemStore.size() == 0)
            item.Id = 1;
        else
            item.Id = itemStore.get(itemStore.size()-1).Id + 1;
        itemStore.add(item);
        return item;
    }  

    // Diese Methode nur aufrufen, wenn die Datenbank leer ist
    // und man icht erst einmal Testdaten einfügen möchte.
    public void fillBySampleData() {
        for (Item item : inginf.SampleStructure.createSampleCar())
            addNewItem(item);
    }

    public java.util.ArrayList<inginf.Item> getItemStore() {
        // Auskommentieren, wenn man blank starten möchte
        if (itemStore.size() == 0)
            fillBySampleData();
        return itemStore;        
    }
}
