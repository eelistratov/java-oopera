// Класс спектакль музыкальный
public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    // Печать либретто
    public void printLibretto() {
        System.out.println("Либретто " + getTitle() + ":");
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return super.toString() + ". Автор музыки: " + musicAuthor + ". Музыкальный спектакль";
    }
}
