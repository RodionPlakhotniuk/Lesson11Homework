public class Lesson11App {

    public static void main(String[] args) {


        Person rodion = new Person("Rodion", 22, "student");
        Person karina = new Person("Karina", 21, "financier");
        Person dima = new Person("Dima", 21, "bartender");

        System.out.printf("1. %s\n   %s\n   %s\n", rodion, karina, dima);

        System.out.println();

        System.out.println("2. " + rodion);
        System.out.println("   (Після оновлення професії)");
        rodion.changeProfession("Java developer");
        System.out.println("   " + rodion);


    }
}
