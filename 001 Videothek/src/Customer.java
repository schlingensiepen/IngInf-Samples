import java.util.ArrayList;
import java.util.List;

/*
 * Aus der Aufgabenstellung:
 * Dabei sollen für Kunden jeweils Name, Vorname und 
 * Mitgliedsnummer [...] verwaltet werden.
 */

// Klasse für den Objekttyp "Kunde"
public class Customer {
    // Attribute für den Kunden aus der Aufgabenstellung
    // diese sind private, weil wir sicherstellen wollen,
    // dass man 'von außen' nur über getter und setter
    // auf die Attribute zugreifen kann.
    private String name;
    private String firstName;
    private String membershipNumber;
    // Zusätzliches Attribut zum Speichern der ausgeliehenen Medien
    // dieses Kunden. Man beachte, dass hier gleich auch eine
    // Initialisierung mit einem leeren ArrayList-Objekt erfolgt,
    // d.h. jedes neu erzeugte Kundenobjekt hat automatisch eine
    // leere Liste für die ausgeliehenen Medien.
    private List<Media> borrowedMedia = new ArrayList<Media>();

    // Konstruktor für die Klasse Customer
    // Die Attribute des Kunden aus der Aufgabenstellung
    // sind Pflichtfelder und müssen beim Erzeugen eines
    // Kundenobjekts übergeben werden.
    // Umkehrschluss: Wir können kein Kundenobjekt ohne
    // Namen, Vornamen und Kundennummer erzeugen.
    public Customer(
            String name,
            String firstName,
            String membershipNumber) {
        // Der als Parameter übergebene Name soll im Attribut
        // name abgelegt werden. Dazu weisen wir diesen nicht
        // direkt zu, sondern rufen die Setter-Methode auf.
        // So können wir die Prüfung auf leere Strings oder
        // null-Werte zentral an einer Stelle durchführen.
        setName(name);
        // gilt auch für den Vornamen
        setFirstName(firstName);
        // und gilt auch für die Kundennummer
        setMembershipNumber(membershipNumber);
    }

    // Getter und Setter für alle Attribute
    // Wir lassen den Zugriff auf die Attribute nur über
    // die Getter- und Setter-Methoden zu, um die Prüfung
    // auf leere Strings oder null-Werte zentral an einer
    // Stelle durchführen zu können.
    // Dieser Ansatz nennt sich "Encapsulation" und ist ein
    // wichtiges Konzept in der objektorientierten Programmierung.
    // So können Programme sicherer und wartbarer gemacht werden.
    // Denn jeder, der eines unserer Objekte verwendet, kann sich
    // darauf verlassen, dass die Prüfungen in den Settern
    // durchgeführt werden und keine ungültigen Werte in den
    // Attributen landen. Außerdem kann er sich darauf verlassen,
    // dass die Getter-Methoden immer gültige Werte zurückgeben und
    // das diese Methoden auch nach einer Überarbeitung immer noch
    // vorhanden sind. Man nennt das auch "API-Stabilität".
    // Die Schnittstelle zum Objekt, also alle Methoden, die von
    // außen aufgerufen werden können, bleiben stabil, d.h. sie
    // ändern sich nicht, auch wenn sich die Implementierung des
    // Objektes ändert.

    // Getter für den Namen, Rückgabetyp ist String
    // (der Name des Kunden ist ein Text)
    public String getName() {
        return name; // zurückgegeben wird der Wert des Attributs name
    }

    // Setter für den Namen, der Name ist ein Pflichtfeld
    // und darf nicht leer oder null sein.
    // Der Setter erhält einen Parameter vom Typ String
    // (der neue Name des Kunden)
    // und gibt nichts zurück (void).
    public void setName(String name) {
        // Prüfen ob der Name leer oder null ist
        // null ist ein spezieller Wert, der angibt, dass
        // keine Referenz auf ein Objekt vorhanden ist.
        // Ein leerer String ist ein String-Objekt, das
        // keine Zeichen enthält.
        // Ein null-Wert ist kein String-Objekt, daher kann
        // nicht auf Methoden oder Attribute eines Strings
        // zugegriffen werden.
        // Deshalb verwenden wir den Operator || (oder),
        // weil dann name.isEmpty() nicht aufgerufen wird,
        // wenn name bereits null ist.
        // Das würde eine NullPointerException auslösen.
        // Der Unterschied zwischen null und einem leeren
        // String ist, vergleichbar mit einer Tüte für
        // Buchstaben, die entweder leer ist (isEmpty()) oder
        // gar nicht existiert (== null).
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        this.name = name;
    }

    // Getter für den Vornamen, Aufbau analog zu Customer.getName()
    public String getFirstName() {
        return firstName;
    }

    // Setter für den Vornamen, Aufbau analog zu Customer.setName()
    public void setFirstName(String firstName) {
        // check is name is not empty or null
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name must not be empty");
        }
        this.firstName = firstName;
    }

    // Getter für die Kundennummer, Aufbau analog zu Customer.getName()
    public String getMembershipNumber() {
        return membershipNumber;
    }

    // Setter für die Kundennummer, Aufbau analog zu Customer.setName()
    public void setMembershipNumber(String membershipNumber) {
        // check is name is not empty or null
        if (membershipNumber == null ||
                membershipNumber.isEmpty()) {
            throw new IllegalArgumentException("Membership number must not be empty");
        }
        this.membershipNumber = membershipNumber;
    }

    // Für die Liste der ausgeliehenen Medien sehen wir nur einen
    // getter vor. So kann man sich die interne Liste beschaffen
    // und aus die ausgeliehenen Medien zugreifen, da die Liste
    // über Methoden zum hinzufügen und entfernen von Objekte hat
    // ist damit alles möglich, was man braucht.
    // Würden wir noch einen Setter implementieren, dann könnte
    // man von außen die komplette Liste austauschen, das wollen
    // wir aber nicht, weil wir nur so sicherstellen können, dass
    // die Liste immer vorhanden ist und doe gültige Medienobjekte 
    // enthält.
    // In dieser Art gehen wir mit allen Listen in unseren Klassen
    // um, die wir als Attribut haben. Wir implementieren nur einen
    // getter, aber keinen setter.
    public List<Media> getBorrowedMedia() {
        return borrowedMedia;
    }

    // Die Methode toString() wird von Java aufgerufen, wenn ein
    // Objekt in einen String umgewandelt werden soll. Das passiert
    // z.B. wenn ein Objekt auf der Benutzungsoberfläche ausgegeben
    // wird. Der Rückgabetype ist folgerichtig String. 
    // Die Methoden print() und println() von System.out
    // können auch mit Objekten aufgerufen werden, dann wird
    // automatisch die Methode toString() aufgerufen und deren 
    // Rückgabewert ausgegeben.
    // In dieser konkreten Methode setzen wir den Namen, Vornamen 
    // und die Kundennummer des Kunden zu einem String zusammen und 
    // geben diesen zürück.  
    @Override
    public String toString() {
        return getFirstName() + " " + getName() + " ["
                + getMembershipNumber() + "]";
                // Zugriff auf die Attribute über deren getter,
                // da dieser immer vorhanden bleibt.
    }
}