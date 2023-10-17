import java.util.ArrayList;
public class Superhero {

    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private int strength;
    private ArrayList<Superhero> heroList;



    public Superhero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength) {
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
        this.heroList = new ArrayList<>(); // Find ud af om dette skal bruges med Arraylist i Databasen.
    }



    // Find ud af om nedenstående skal bruges sammen med Databasen, Arraylist.
    public ArrayList<Superhero> getSuperhero() {
        return heroList;
    }


    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public String getIsHuman() {
        return isHuman;
    }

    public int getStrength() {
        return strength;
    }



    public String toString() {
        return "\n" + "Name: " + name + "\n " +
                "Real name: " + realName + "\n " +
                "Superpower: " + superPower + "\n " +
                "Year created: " + yearCreated + "\n " +
                "Is Human: " + isHuman + "\n " +
                "Strength: " + strength;
    }









}
