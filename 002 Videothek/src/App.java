    /* Einfaches Beispiel für eine Videothek
 * Es wird das Datenmodell nach JAVA übertragen.
 * 
 * Diese Version unterteilt das Hauptprogramm in Methoden.
 * Es sind weniger Kommentare vorhanden, da die Methoden
 * selbsterklärend sind. In der Vorversion finden Sie
 * mehr Erläuterungen.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // Scanner-Objekt für die Eingabe von der Konsole
    // hier als static deklariert, damit es von allen
    // Methoden im Programm verwendet werden kann.
    public static Scanner scanner = new Scanner(System.in);

    // Liste für alle Kunden, die im Programm angelegt werden.
    // Auch diese Liste ist static, damit sie von allen Methoden
    // im Programm verwendet werden kann.
    public static List<Customer> customers = new ArrayList<Customer>();

    // Liste für alle Medien, die im Programm angelegt werden.
    // Auch diese Liste ist static, damit sie von allen Methoden
    // im Programm verwendet werden kann.
    public static List<Media> media = new ArrayList<Media>();

    // Methoden für die Auswahl von Objekten aus Listen
    // Können wir also für alle Listen verwenden, die wir
    // im Programm haben.
    public static Object selectObject(        
        List<?> objects, 
        String message, 
        String specialFunction) {
        int number = 0;
        for (Object object : objects) {
            System.out.print(number++ + " ");
            System.out.println(object);
        }
        System.out.println(number + " " + specialFunction);
        int objectNumber = scanner.nextInt();
        if (objectNumber >= objects.size()) {
            return null;
        }        
        return objects.get(objectNumber);
    }    

    public static void createSampleMedia()
    {
        media.add(new Movie(
                "The Matrix", 
             "Wachowskis"));
        media.add(new Movie(
                "The Matrix Reloaded", 
             "Wachowskis"));
        media.add(new Movie(
                "The Matrix Revolutions", 
             "Wachowskis"));
        media.add(new Movie(
                      "The Lord of the Rings: The Fellowship of the Ring", 
                      "Peter Jackson"));
        media.add(new Movie("The Lord of the Rings: The Two Towers", 
                "Peter Jackson"));
        media.add(new Movie("The Lord of the Rings: The Return of the King",
                "Peter Jackson"));
        media.add(new Movie("The Hobbit: An Unexpected Journey", "Peter Jackson"));
        media.add(new Movie("The Hobbit: The Desolation of Smaug", "Peter Jackson"));
        media.add(new Movie("The Hobbit: The Battle of the Five Armies", "Peter Jackson"));
        media.add(new Movie("Inception", "Christopher Nolan"));

        media.add(new Game("The Witcher 3", "CD Projekt Red", "CD Projekt"));
        media.add(new Game("The Witcher 2", "CD Projekt Red", "CD Projekt"));
        media.add(new Game("The Witcher", "CD Projekt Red", "CD Projekt"));
        media.add(new Game("Cyberpunk 2077", "CD Projekt Red", "CD Projekt"));
        media.add(new Game("The Elder Scrolls V: Skyrim", "Bethesda Softworks", "Bethesda Game Studios"));
        media.add(new Game("The Elder Scrolls IV: Oblivion", "Bethesda Softworks", "Bethesda Game Studios"));
        media.add(new Game("The Elder Scrolls III: Morrowind", "Bethesda Softworks", "Bethesda Game Studios"));
        media.add(new Game("Fallout 4", "Bethesda Softworks", "Bethesda Game Studios"));
        media.add(new Game("Fallout 3", "Bethesda Softworks", "Bethesda Game Studios"));
        media.add(new Game("Fallout: New Vegas", "Bethesda Softworks", "Obsidian Entertainment"));
    }
    public static void createSampleCustomer()
    {
        customers.add (
            new Customer("Smith", "John",
        "001"));
        customers.add (
            new Customer("Doe", "Jane",
        "002"));
        customers.add (
            new Customer("Johnson", "Michael",
        "003"));
        customers.add (
            new Customer("Schmidt",
        "Otto", "004"));
        customers.add (
            new Customer("Müller", "Karla",
        "005"));
        customers.add (
            new Customer("Johnson", "Renate",
        "006"));
        customers.add (
            new Customer("Smith", "Anne",
        "007"));
        customers.add (
            new Customer("Schneider",
        "Jane", "008"));
        customers.add (
            new Customer("Johnson", "John",
        "009"));
        customers.add (
            new Customer("Jamison", "John",
        "010"));
    }

    public static void main(String[] args) throws Exception {
        // Ein "Hello World" zur Begrüßung, weil es schon da war.
        System.out.println("Hello, World!");

        createSampleCustomer();
        createSampleMedia();


        // Hauptschleife des Programms, die so lange läuft, bis
        // der Anwender das Programm beendet.
        while (true) {
            // Kommunikation mit dem Anwender
            System.out.println("Medienverwaltung");
            System.out.println("1 Ausleihe");
            System.out.println("2 Rückgabe");
            System.out.println("3 Übersicht");
            System.out.println("4 Beenden");
            System.out.print("Wählen Sie eine Option:");
            // Einlesen der gewählten Option
            int option = scanner.nextInt();
            switch (option)
            {
                case 1:
                    borrowMedia();
                    break;
                case 2:
                    returnMedia();
                    break;
                case 3:
                    showOverview();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Ungültige Option");
            }
        }
    }

    private static void showOverview() {
        System.out.println("Übersicht");
        for (Customer customer : customers) {
            System.out.println(customer);
            for (Media medium : customer.getBorrowedMedia()) {
                System.out.println("  " + medium);
            }
        }
    }

    private static void returnMedia() {
        System.out.println("Rückgabe");
        Customer customer = (Customer) selectObject(customers, 
                "Wählen den rückgebenden Kunden aus", 
                "Rückgabe beenden");
        if (customer == null) return;            

        while (true)
        {
            Media medium = (Media) selectObject(            
            customer.getBorrowedMedia(),
            "Wählen Sie ein zurückzugebendes Medium aus", 
            "Beenden");
            if (medium == null) return;
            media.add(medium);
            customer.getBorrowedMedia().remove(medium);
        }
    }

    private static void borrowMedia() {
        System.out.println("Ausleihe");        
        
        Customer customer = (Customer) selectObject(customers, 
                "Wählen Sie den ausleihenden Kunden aus", 
                "Ausleihe beenden");
        if (customer == null) return;            

        while (true)
        {
            Media medium = (Media) selectObject(            
            media, 
            "Wählen Sie ein auszuleihendes Medium aus", 
            "Beenden");
            if (medium == null) return;
            media.remove(medium);
            customer.getBorrowedMedia().add(medium);
        }
    }
}

