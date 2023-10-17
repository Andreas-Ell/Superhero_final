import java.util.ArrayList;

public class Database {



    private ArrayList<Superhero> heroList = new ArrayList<>();

    public void addSuperhero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength) {
        heroList.add(new Superhero(name, realName, superPower, yearCreated, isHuman, strength));
    }

    public ArrayList<Superhero> getHeroList() {
        return heroList;
    }





}
