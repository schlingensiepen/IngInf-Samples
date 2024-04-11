/* Einfaches Beispiel für eine Videothek
 * Es wird das Datenmodell nach JAVA übertragen.
 * 
 * ACHTUNG: Diese Version des Hauptprogrammes entspricht 
 * nicht dem Standardvorgehen. Im Hauptprogramm sind alle
 * Schritte einfach hintereinander geschrieben, weil wir
 * die Unterteilung in Unterprogramme noch nicht geübt haben.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    /*
     * 
     * Aufgabenstellung
     * 
     * Die Videothek „Alles-für'n-Euro“ betreibt ein einfaches Modell des Verleihs
     * von Video-DVDs und Spielen. Jeder Verleihvorgang kostet einen Euro pro Tag.
     * Für die Verwaltung des Leihbestandes soll ein einfaches Datenmodell erstellt
     * werden.
     * 
     * Dabei sollen für Kunden jeweils Name, Vorname und Mitgliedsnummer, für
     * Filme der Titel und der Regisseur und für Computerspiele der Titel, der
     * Publisher und das Studio verwaltet werden.
     * 
     * Mit dem Modell soll es möglich sein,
     * ausgeliehene Medien dem Ausleihenden zuzuordnen und umgekehrt für einen
     * Kunden die gerade ausgeliehenen Medien zu ermitteln.
     * 
     */

    public static void main(String[] args) throws Exception {
        // Ein "Hello World" zur Begrüßung, weil es schon da war.
        System.out.println("Hello, World!");

        // Herstellen eines Scanners, der aus System.in ließt.
        // Den verwenden wir dann um Eingaben vom Nutzenden
        // abzufragen.
        Scanner scanner = new Scanner(System.in);

        // Erstellen einer Liste um alle Kunden abzuspeichern.
        List<Customer> customers = new ArrayList<Customer>();

        // Herstellen von ein paar Beispiel-Kunden.
        // Es wird jeweils eine Variable vom Typ Customer angelegt.
        // Dann folgt eine einfache Zuweisung, der new-Operator
        // stellt dann das eigentliche Objekt her. Die Parameter
        // sind genau die Parameter, die der Constructor bekommt.
        // Also für jeden Kunden der Name, Vorname und Kundennummer

        // Wenn Sie gerade dabei sind den Quelltext durchzurbeiten, 
        // dann sollten Sie sich jetzt die Klasse Customer ansehen, 
        // um zu verstehen, was hier passiert.
        // Danach kehren Sie an diese Stelle zurück und lesen weiter.

        Customer customer1 = new Customer("Smith", "John",
                "001");
        Customer customer2 = new Customer("Doe", "Jane",
                "002");
        Customer customer3 = new Customer("Johnson", "Michael",
                "003");
        // Create seven more customers
        Customer customer4 = new Customer("Schmidt",
                "Otto", "004");
        Customer customer5 = new Customer("Müller", "Karla",
                "005");
        Customer customer6 = new Customer("Johnson", "Renate",
                "006");
        Customer customer7 = new Customer("Smith", "Anne",
                "007");
        Customer customer8 = new Customer("Schneider",
                "Jane", "008");
        Customer customer9 = new Customer("Johnson", "John",
                "009");
        Customer customer10 = new Customer("Jamison", "John",
                "010");
        // Nachdem wir 11 Objekte für Benutzer (vom Typ Customer)
        // hergestellt haben, legen wir alle in der Liste an.
        // Dazu verwenden wir die Methode add() der Liste.
        // Zugriff auf die Elemente (Attribute und Methoden)
        // von Objekten erfolgt über den "."-Operator.
        customers.add(customer1); // Vor dem Punkt das Objekt in der Variablen costumers
        customers.add(customer2); // nach dem Punkt die Methode "add"
        customers.add(customer3); // als Parameter das Objekt, dass eingefügt werden soll.
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        customers.add(customer7);
        customers.add(customer8);
        customers.add(customer9);
        customers.add(customer10);
        // Ausgabe aller Kunden über eine Zählschleife
        // Der Schleifenkopf enthält folgende Statements:

        // int i = 0 -- Initialisierung
        // deklariert einen Integer mit Name i
        // und weißt diesem gleich den Wert 0 zu.

        // i < custumers.size() -- Abbruchbedingung
        // Der Ausdruck kann zu einem Wahrheitwert
        // ausgewertet werden, ist also "wahr" oder "falsch"
        // Solange der Ausdruck "wahr" ist, wird die
        // Schleife ausgeführt. In unserem Fall also
        // solange das i kleiner ist als die Länge der
        // Liste.

        // i++ -- Schritt
        // Wird nach jedem Durchlauf der Schleife ausgeführt
        // und erhöht die Variable i um eins.
        for (int i = 0; i < customers.size(); i++) {
            // Über die Methode get() holen wir uns das
            // Objekt für den Kunden an der Stelle i
            // aus der Liste und weisen es der 
            // neu deklarierten Variable customer zu.
            Customer customer = customers.get(i);
            // Ausgabe des Objektes, implizit wird
            // toString() aufgerufen, um eine Zeichenkette
            // zu erzeugen, die den Kunden darstellt.
            System.out.println(customer);
        }

        // Ausgabe aller Kunden über eine Iteratorschleife.
        // Das Ergebnis ist exakt das gleiche, wie bei der
        // Zählschleife, für jedes Objekt in der Liste costumers
        // wird die Schleife einmal durchlaufen.
        // Das jeweils aktuelle Objekt wird dazu vor dem Druchlauf
        // des Schleifen-Körpers der Variable vor dem Doppelpunkt
        // zugewiesen.
        for (Customer customer : customers) {
            // An dieser Stelle ist das jeweils aktuelle Objekt in 
            // der Variable customer abgelegt.
            System.out.println(customer);   // und kann analog zur
                                            // Zählschleifenversion
                                            // ausgegeben werden.
        }

        // Herstellen von 10 Objekten für Filme, analog zu oben
        // Deklaration von 10 Variablen und Zeuweisung des Objektes
        // nach Herstellung über den new-Operator, Parameter sind
        // hier die Paramter des Constructors von Movie. 

        // Wenn Sie gerade dabei sind den Quelltext durchzurbeiten, 
        // dann sollten Sie sich jetzt die Klassen Media und Movie 
        // ansehen, um zu verstehen, was hier passiert.
        // Danach kehren Sie an diese Stelle zurück und lesen weiter.

        Movie movie1 = new Movie("The Matrix", "Wachowskis");
        Movie movie2 = new Movie("The Matrix Reloaded", "Wachowskis");
        Movie movie3 = new Movie("The Matrix Revolutions", "Wachowskis");
        Movie movie4 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson");
        Movie movie5 = new Movie("The Lord of the Rings: The Two Towers", "Peter Jackson");
        Movie movie6 = new Movie("The Lord of the Rings: The Return of the King",
                "Peter Jackson");
        Movie movie7 = new Movie("The Hobbit: An Unexpected Journey", "Peter Jackson");
        Movie movie8 = new Movie("The Hobbit: The Desolation of Smaug", "Peter Jackson");
        Movie movie9 = new Movie("The Hobbit: The Battle of the Five Armies", "Peter Jackson");
        Movie movie10 = new Movie("Inception", "Christopher Nolan");

        // Herstellen von 10 Objekten für Spiele, analog zu vorher.

        // Wenn Sie gerade dabei sind den Quelltext durchzurbeiten, 
        // dann sollten Sie sich jetzt die Klasse Game 
        // ansehen, um zu verstehen, was hier passiert.
        // Danach kehren Sie an diese Stelle zurück und lesen weiter.

        Game game1 = new Game("The Witcher 3", "CD Projekt Red", "CD Projekt");
        Game game2 = new Game("The Witcher 2", "CD Projekt Red", "CD Projekt");
        Game game3 = new Game("The Witcher", "CD Projekt Red", "CD Projekt");
        Game game4 = new Game("Cyberpunk 2077", "CD Projekt Red", "CD Projekt");
        Game game5 = new Game("The Elder Scrolls V: Skyrim", "Bethesda Softworks", "Bethesda Game Studios");
        Game game6 = new Game("The Elder Scrolls IV: Oblivion", "Bethesda Softworks", "Bethesda Game Studios");
        Game game7 = new Game("The Elder Scrolls III: Morrowind", "Bethesda Softworks", "Bethesda Game Studios");
        Game game8 = new Game("Fallout 4", "Bethesda Softworks", "Bethesda Game Studios");
        Game game9 = new Game("Fallout 3", "Bethesda Softworks", "Bethesda Game Studios");
        Game game10 = new Game("Fallout: New Vegas", "Bethesda Softworks", "Obsidian Entertainment");
        
        // Deklaration und Initialisierung einer Liste für allr verfügbaren Medien.
        List<Media> media = new ArrayList<Media>();
        
        // Alle Objekte für Filme sind auch Objekte für Medien und können 
        // analog zu den Objekten für Benutzer der Liste für die verfügbaren
        // Medien hinzugefügt werden.
        media.add(movie1);
        media.add(movie2);
        media.add(movie3);
        media.add(movie4);
        media.add(movie5);
        media.add(movie6);
        media.add(movie7);
        media.add(movie8);
        media.add(movie9);
        media.add(movie10);
        // Das gleiche gilt für die Objekte für Spiele.
        media.add(game1);
        media.add(game2);
        media.add(game3);
        media.add(game4);
        media.add(game5);
        media.add(game6);
        media.add(game7);
        media.add(game8);
        media.add(game9);
        media.add(game10);
        // Zur Kontrolle einmal die Ausgabe aller verfügbarer Medien
        // mittels einer Iteratorschleife.
        for (Media medium : media) {
            System.out.println(medium);
        }

        // Jetzt implementieren wir als Beispiel eine Schalterfunktion
        // zum Ausleihen von Medien.

        // Nachdem ein Kunde bedient wurde, soll das System für den
        // nächsten Kunden nutzbar sein, daher implementieren wir
        // außenrum eine Endlos-Schleife.
        // Diese Hauptschleife sorgt dafür, dass nach dem Abschluss
        // eines Vorgangs automatisch der nächste Vorgang beginnt.
        while (true) {
            // Kommunikation mit dem Anwender
            System.out.println("Medienverleih");
            System.out.println("Auswahl des Ausleihenden");
            // Anzeigen der Liste der Kunden über Iteratorschleife
            // Initialisierung einer Zählvariable, Startwert 0
            int number = 0;
            for (Customer customer : customers) {
                // Ausgabe der Nummer gefolgt von einem Leerzeichen
                // (ohne Zeilenumbruch)
                System.out.print(number++ + " ");
                // Dann folgt direkt die Zeichenkette für den Kunden
                // implizites toString() (siehe oben)
                System.out.println(customer);
            }
            // Neben der Auwahl eines Kunden soll es auch möglich sein
            // eine Übersich der Ausleihsituation (s. Aufgabenstellung)
            // anzeigen zu lassen.
            // Dafür blenden wir eine zusätzliche Auswahloption ein.
            System.out.println(number + " Übersicht");
            // Auswählen des ausleihenden Kunden
            System.out.print("Wählen Sie den ausleihenden Kunden aus:");
            // Einlesen der Nummer des ausleihenden Kunden.
            int customerNumber = scanner.nextInt();
            // Prüfen ob die Übersichtsfunktion gewählt wurde.
            if (customerNumber == number) {
                // Wurde die Übersichtsfunktion gewählt,
                // wird eine Iteratorschleife über alle Kunden
                // ausgeführt, d.h. der Schleifenkörper wird
                // für jeden Kunden in der Liste ausgeführt.
                for (Customer customer : customers) {
                    // Zunächst geben wir den aktuellen Kunden aus.
                    System.out.println(customer);
                    // Dann beschaffen wir uns vom aktuellen Kunden
                    // die Liste aller ausgeliehenen Medien und
                    // führen eine Iteratorschleife darüber aus.
                    // Ist diese Liste leer, wir der Schleifenkörper
                    // gar nicht ausgeführt.
                    for (Media medium : customer.getBorrowedMedia()) {
                        // Damit die Liste leichter zu lesen ist, 
                        // rücken wir die ausgeliegenen Medien ein.
                        // Es werden also erst in jedem Schleifendurchlauf
                        // zwei Leerzeichen ohne Zeilenumbruch ausgegeben.
                        System.out.print("  ");
                        // Dann folgt direkt die Ausgabe der Zeichenkette,
                        // die das in der Schleife aktuelle Medium darstellt. 
                        System.out.println(medium);
                    }
                }
                // Wenn die Übersichtsfunktion ausgewählt wurde, dann 
                // gibt es keinen aktuellen Benutzer, der etwas ausleihen
                // möchte. In aktuellen Durchlauf der Hauptschleife gibt es
                // also nichts mehr zu tun. Wir beenden diesen Durchgang 
                // daher mit continue.
                // Es wird also nicht die komplette Schleife, sondern nur 
                // der aktuelle Durchlauf beendet. Man kann sich das so 
                // vorstellen, als ob das Programm "nach oben" zum Beginn
                // der Schleife springt.
                continue;
            }
            // Die Übersichtsfunktion wurde nicht ausgewählt, d.h.
            // jetzt wollen wir uns das Objekt beschaffen, dass den
            // aktuellen Kunden repräsentiert.

            // Mit der Methode get() erhalten wir aus der Liste 
            // aller Kunden den Kunden an der Stelle, die der Anwender
            // eben eingegeben hat.
            Customer selectedCustomer = customers.get(customerNumber);

            // Etwas Kommunikation mit dem Anwender, damit klar ist,
            // welches Kunden-Objekt ausgewählt wurde.
            System.out.print("Als ausleihender Kunde ausgewählt: ");
            System.out.println(selectedCustomer);

            // Jetzt implementieren wir eine Schleife für das Ausleihen
            // mehrerer Medien. Auch hier wieder eine Endlosschleife, 
            // weil wir die Schleife mittendrin, nach einer entsprechenden
            // Nutzereingabe verlassen werden.
            while (true) {
                // Anzeige einer Übersicht der verfügbaren Medien
                // analog zur Anzeige der Kunden mit Nummerierung.
                number = 0;
                for (Media medium : media) {
                    System.out.print(number++ + " ");
                    System.out.println(medium);
                }
                // Anzeige einer zusätzlichen Option, um die Auswahl
                // zu beenden und dann in der Hauptschleife den nächsten
                // Kunden auszuwählen.
                System.out.println(number + " Return to customer selection");
                // Auswählen des auszuleihenden Mediums
                int mediaNumber = scanner.nextInt();
                // Prüfen ob die zusätzliche Option gewählt wurde.
                if (mediaNumber == number) {
                    // Wenn die zusätzliche Option gewählt wurde, dann
                    // wird die Schleife für das Ausleihen von Medien verlassen.
                    // Diesmal mit dem Schlüsselwort break, das bewirkt, dass
                    // die Schleife komplett beendet wird und nicht nur der
                    // aktuelle Durchlauf.
                    // Man kann sich das so vorstellen, dass das Programm
                    // "nach unten" springt, also aus der Schleife heraus,
                    // und dann mit der nächsten Anweisung nach der Schleife
                    // weitermacht.
                    break;
                }
                // Die Zusatzoption wurde nicht gewählt, wir wollen also
                // ein Medium verleihen. Das zu verleihende Medium wird aus 
                // der Liste der verfügbaren Medien über die Nummer beschafft
                // und der neu deklarierten Variablen selectedMedia zugewiesen.
                Media selectedMedia = media.get(mediaNumber);

                // Etwas Kommunikation mit dem Anwender, damit klar ist,
                // welches Medium ausgewählt wurde.
                System.out.print("Auszuleihendes Medium: ");
                System.out.println(selectedMedia);

                // Medium zum Kunden zuordnen (in die borrowedMedia-Liste 
                // des Kunden einfügen)
                // Über den "."-Operator greifen wir auf die Methode
                // getBorrowedMedia() zu, beschaffen uns also die Liste
                // der Medien, die dieser Kunde ausgeliehen hat.
                // Dann fügen wir dieser Liste das ausgewählte Medium hinzu.
                // Anwendung des "."-Operators auf diese Liste um deren
                // Funktion add() aufzurufen.
                selectedCustomer.getBorrowedMedia().add(selectedMedia);

                // Entfernen des Mediums aus der Liste der verfügbaren Medien
                // Die Methode remove() funktioniert analog zu add() und entfernt
                // das als Parameter übergeben Element aus der Liste.
                media.remove(selectedMedia);
            }
            // Für die Funktion unnötig, aber eine Frage an den Anwender, ob
            // er noch einen weiteren Kunden bedienen möchte.
            System.out.print("Sollen noch weitere Kunden ausleihen? (J/n)");
            // Einlesen der Antwort
            String answer = scanner.next();
            // Prüfen ob die Antwort "n" ist.
            if (answer.equals("n")) {
                // Wenn die Antwort "n" ist, dann wird die Hauptschleife
                // verlassen, also das Programm beendet.
                break;
            }
        }
        // Schließen des Scanners, weil wir ihn nicht mehr brauchen.
        scanner.close();
    }
}
