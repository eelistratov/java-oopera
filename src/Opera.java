//Класс Опера
public class Opera extends MusicalShow {
    int choirSize;

    public Opera(String title, int duration, Director director, String musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    @Override
    public String toString() {
        return super.toString() + ". Размер хора (чел): " + choirSize + ". Опера)";
    }
}
