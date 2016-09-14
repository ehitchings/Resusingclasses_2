package ReusingClasses_2;

/**
 * Created by evanhitchings on 9/14/16.
 */
public class ReusingClasses_2 {
    public static void main(String[] args) {

        Human nelson = new Human("Horatio Nelson", 40, "Male", "Admiral for the Royal Navy", "England");
        System.out.println(nelson.getOccupation());

        SuperHuman gambit = new SuperHuman("Remy Lebeau", 33, "Male", "Professional Thief", "New Orleans", "Gambit", "Can imbue object with kinetic energy, causing them to explode", "Good (mostly)");
        System.out.println(gambit.getOccupation());
        System.out.println(gambit.getAddress());
        SuperHuman deadpool = new SuperHuman("Wade Wilson", 33, "Male", "Mercenary", "???", "Deadpool", "Regeration, Comic awareness", "Good (mostly");
        System.out.println(deadpool.getName());
        System.out.println(deadpool.getGender());


    }
}
