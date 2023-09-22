import java.util.ArrayList;
import java.util.List;
public class Database {
    private ArrayList<Superhero> heroListe = new ArrayList<>();

    public void addSuperhero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength) {
        heroListe.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));
    }

    public ArrayList<Superhero> getHeroListe() {
        return heroListe;
    }





}
