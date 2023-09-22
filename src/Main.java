import javax.naming.Name;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private Controller controller;

    public static void main(String[] args) {
        Main program = new Main();

        Scanner keyboard = new Scanner(System.in);
        Database db = new Database();

        boolean programRunning = true;

        while (programRunning) {
            System.out.println("Velkommen til create a superhero!");
            System.out.println("1. Opret superhelt");
            System.out.println("2. Liste over dine superhelte");
            System.out.println("3. Søg efter superhero");
            System.out.println("9. Afslut");

            int valg = keyboard.nextInt();

            switch (valg) {
                case 1:

                    System.out.println("Påbegynd oprettelsen af din su" +
                            "erhero!");
                    System.out.println("Indtast først et superhero navn:");
                    String superheroName = keyboard.nextLine();
                    keyboard.nextLine();
                    System.out.println("Giv gerne et rigtigt navn til din superhero også:");
                    String realName = keyboard.nextLine();
                    System.out.println("Hvilken form for superpower skal den have?:");
                    String superPower = keyboard.nextLine();
                    System.out.println("Hvilket år er din superhero skabt:");
                    int yearCreated = keyboard.nextInt();
                    System.out.println("Er din superhero et menneske? (ja/nej):");
                    String isHuman = keyboard.nextLine();
                    keyboard.nextLine();
                    System.out.println("Hvor stærk er din superhero fra 1-100?:");
                    int strength = keyboard.nextInt();
                    keyboard.nextLine();

                    /*
                    Superhero superhero = new Superhero();
                    System.out.println(superhero.toString());

                     */


                    db.addSuperhero(superheroName, realName, superPower, yearCreated, isHuman, strength);




                    System.out.println("Din superhelt er blevet oprettet");
                    System.out.println(db.getHeroListe().size() - 1);

                    break;

                case 2:
                    System.out.println("Liste over alle superhelte:");
                    for (Superhero sh : db.getHeroListe()) {
                        System.out.println(sh);
                    }

                case 3:
                    System.out.println("Din søgning gav følgende resultat:");



                case 9:
                    System.out.println("Programmet afsluttes.");
                    programRunning = false;
                    break;

                default:
                    System.out.println("Ugyldigt valg, prøv igen.");

            }

        }





    }
}
