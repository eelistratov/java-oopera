// Класс Спектакль
import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    // Метод для печати списка актёров
    public void printActors() {
        System.out.println("Актёры задействованные в спектакле '" + title + "':");
        if (!listOfActors.isEmpty()) {
            for (Actor actor : listOfActors) {
                System.out.println("  - " + actor);
            }
        } else {
            System.out.println("  Актёры еще не назначены");
        }
    }

    // Метод для добавления нового актёра
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже задействован в этом спектакле '" + title + "'");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " включен в спектакль '" + title + "'");
        }
    }

    // Метод для замены актёра
    public void replaceActor(String surnameToReplace, Actor newActor) {
        boolean isUse = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surnameToReplace)) {
                if (listOfActors.contains(newActor)) {
                    System.out.println("Актёр " + newActor + " уже задействован в спектакле '" + title + "'");
                    return;
                }
                Actor oldActor = listOfActors.set(i, newActor);
                System.out.println("Актёр " + oldActor + " заменён на " + newActor + " в спектакле '" + title + "'");
                isUse = true;
                break;
            }
        }
        if (!isUse) {
            System.out.println("Актёр '" + surnameToReplace + "' не задействован в спектакле '" + title + "'");
        }
    }

    @Override
    public String toString() {
        return "Спектакль: '" + title + "', длительность: " + duration + " мин.";
    }
}
