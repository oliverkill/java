import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*yl1();*/

        /*Ülesanne 2 käivitamine*/
        ArrayList<Burger> burgers = new ArrayList<>();
        System.out.println("Menu:");
        System.out.println("1 - Chicken burger");
        System.out.println("2 - Old Fashioned Cheeseburger");
        System.out.println("3 - New York Burger");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Millist burgerit soovite? (saadaval ainult nr 1 - Chicken burger): ");
            int burxNr = 0;
            burxNr = input.nextInt();
            if (burxNr == 0) {
                break;
            } else if (burxNr == 1) {
                Lisand lisandidKanaBurgelile = new Lisand(true, true, true, true);
                Burger chickenBurger = new Burger("Chicken Burger", "Kana liha", "Valge sai", lisandidKanaBurgelile);
                chickenBurger.koostaBurger(chickenBurger);
            } else if (burxNr == 2) {
                Lisand lisandidJuustuBurgelile = new Lisand(true, true, true, true);
                Burger juustuBurger = new Burger("Juustu Burger", "looma liha", "Valge sai", lisandidJuustuBurgelile);
                juustuBurger.koostaBurger(juustuBurger);
            } else if (burxNr == 3) {
                Lisand lisandidNYBurgelile = new Lisand(true, true, true, true);
                Burger NYBurger = new Burger("NY Burger", "sea liha", lisandidNYBurgelile);
                NYBurger.koostaBurger(NYBurger);
            }
        }
        System.out.println("Vabandame, kokad ei ole kvalifitseeritud");

    }

    private static void yl1() {
        for(int i = 9; i >= 0; i--) {
            System.out.print(i);
            System.out.print(" ");
            for (int j = 8; j >= 0; j--) {
                if (j>i) {
                    System.out.print(i);
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}