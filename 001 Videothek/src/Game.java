/* Aus der Aufgabenstellung:
 * [...] ein einfaches Modell des Verleihs von Video-DVDs und Spielen.
 * für Computerspiele [soll] der Titel, der Publisher und das Studio verwaltet werden.
 */

// Da sowohl Spiele, als auch Video-DVDs verliehen werden sollen,
// leiten wir beide von einer Klasse Media ab, die dann verliehen werden kann
// und auch die gemeinsamen Attribute enthält.

// Dazu verwenden wir in Java das Schlüsselwort extends die folgende Zeile
// drückt aus: 
// - Die Klasse Game erweitert die Klasse Media
// - Man sagt auch: "Media ist die Superklasse von Game."
// - Man sagt auch: "Game ist eine von Media abgeleitete Klasse."
// - Alle Objekte vom Typ Game sind also Media
// - Alle Objekte vom Typ Game haben also alle Eigentschaften, 
//   die in Media angelegt sind
// - An Stellen, an denen Media verwendet werden (z.B. Übergabe als Parameter) können
//   immer auch Objekte vom Typ Game verwendet werden.
public class Game extends Media
{
    // Das Attribut Titel haben alle Spiele automatisch, weil sie auch Medien sind.

    // Anlegen der Attribute, analog zu Customer
    private String publisher;
    private String studio;
    
    // Constructor mit der Übergabe von Werten für alle notwendigen 
    // Attribute also der beiden oben deklarierten Attribute und einem
    // Wert für den Titel, weil man Media-Objekte nicht ohne Titel
    // herstellen kann und Spiele-Objekte sind immer Medien-Objekte.
    public Game(String title, String publisher, String studio)
    {
        // Der Titel ist ein Parameter des Constructors der Klasse
        // Media, da dies die Super-Klasse von Game ist kann man
        // deren Construcor über super() aufrufen. Da der Constructor
        // von Media den Titel als Parameter erwartet muss super()
        // im Constructor von Game aufgerufen werden.
        super(title);
        // Aufruf der setter für die übrigen Attribute.
        setPublisher(publisher);
        setStudio(studio);
    }
    
    // Getter für den Publisher, analog zu Customer.getName()
    public String getPublisher()
    {
        return publisher;
    }
    
    // Setter für den Publisher, analog zu Customer.setName()
    public void setPublisher(String publisher)
    {
        if (publisher == null || publisher.isEmpty())
        {
            throw new IllegalArgumentException("Publisher must not be empty");
        }
        this.publisher = publisher;
    }
    
    // Getter für das Studio, analog zu Customer.getName()
    public String getStudio()
    {
        return studio;
    }
    
    // Setter für das Studio, analog zu Customer.setName()
    public void setStudio(String studio)
    {
        if (studio == null || studio.isEmpty())
        {
            throw new IllegalArgumentException("Studio must not be empty");
        }
        this.studio = studio;
    }
    
    // Die Methode toString() wird von Java aufgerufen, wenn ein
    // Objekt in einen String umgewandelt werden soll. Nähere
    // Erläuterungen finden sich in Customer.toString(). 
    // In dieser konkreten Methode setzen wir den Titel, Publisher 
    // und das Studio des Spiels zu einem String zusammen und 
    // geben diesen zürück.  
    @Override
    public String toString()
    {
        return getTitle() + " [" + getPublisher() + ", " + getStudio() + "]";
    }
    
}
