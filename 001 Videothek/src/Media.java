/* Aus der Aufgabenstellung:
 * [...] ein einfaches Modell des Verleihs von Video-DVDs und Spielen.
 * Für Filme [soll] der Titel und der Regisseur und für Computerspiele 
 * der Titel, der Publisher und das Studio verwaltet werden.
 */

// Da sowohl Spiele, als auch Video-DVDs verliehen werden sollen,
// leiten wir beide von einer Klasse ab, die dann verliehen werden kann
// und auch die gemeinsamen Attribute enthält.
public class Media {
    // Gemeinsames Attribut von Video-DVD und Spiel
    // Geschütz als private, Zugriff über getter und setter
    // analog zum Aufbau in Customer.
    private String title;
    // Constructor for alle Medien-Objekte, hier das Pflicht-Attribut
    // title als Paramter (analog zu Customer), es können also nur 
    // Medien-Objekte mit Titel hergestellt werden.
    // Das heißt als auch alle Video-DVD- und Spiele-Objekte müssen
    // zwingend beim Herstellen einen Titel bekommen.
    public Media(String title) {
        setTitle(title);
    }
    // Getter für den Titel analog zu Custumer.getName()
    public String getTitle() {
        return title;
    }
    // Setters für den Titel analog zu Customer.setName()
    public void setTitle(String title) {
        // Prüfung analog to Customer.setName()
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title must not be empty");
        }
        this.title = title;
    }    
}
