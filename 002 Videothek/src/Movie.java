/* Aus der Aufgabenstellung:
 * [...] ein einfaches Modell des Verleihs von Video-DVDs und Spielen.
 * Für Filme [soll] der Titel und der Regisseur und für Computerspiele 
 * der Titel, der Publisher und das Studio verwaltet werden.
 */
public class Movie extends Media {
    private String director;

    public Movie(String title, String director){
        super(title);
        setDirector(director);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        // check is title is not empty or null
        if (director == null || director.isEmpty()) {
            throw new IllegalArgumentException("Director must not be empty");
        }
        this.director = director;
    }

    @Override
    public String toString() {
        return getTitle() + " [" + getDirector() + "]";
    }

}
