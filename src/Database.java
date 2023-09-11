public class Database {

private Superhero[] superheroListe;
int count = 0;

public Database() {
    this.superheroListe = new Superhero[5];
}

public void tilføjSuperHero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength) {
    superheroListe[count++] = new Superhero(name, realName, superPower, yearCreated, isHuman, strength);
}






}
