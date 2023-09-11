import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Velkommen til create a superhero!");
        System.out.println("Indtast først et superhero navn");
        keyboard.nextLine();
        System.out.println("Giv gerne et rigtigt navn til din superhero også.");
        keyboard.nextLine();
        System.out.println("Hvilken form for superpower skal den have?");
        keyboard.nextLine();
        System.out.println("Hvilket år er din superhero skabt");
        keyboard.nextLine();
        System.out.println("Er din superhero et menneske?");
        keyboard.nextLine();
        System.out.println("Hvor stærk er din superhero fra 1-100?");
        keyboard.nextLine();

        Database Superhero = new Database();






    }
}
