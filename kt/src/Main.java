import Burger.Lisandid;
import Burger.LuxBurger;
import Burger.TavaBurger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Ülesanne 1 käivitamine*/
        /*yl1();*/


        /*Burger 2 käivitamine 02.11.2020*/

        Scanner input = new Scanner(System.in);
        double orderPrice = 0;
        ArrayList<String> burgers = new ArrayList<String>();
        ArrayList <String> order = new ArrayList<String>();
        TavaBurger kanaBurger = new TavaBurger("kanaBurger");
        TavaBurger peekoniBurger = new TavaBurger("peekoniBurger");
        TavaBurger hobuseBurger = new TavaBurger("hobuseBurger");
        LuxBurger koeraBurger = new LuxBurger("koeraBurger");
        burgers.add(kanaBurger.getName());
        burgers.add(peekoniBurger.getName());
        burgers.add(hobuseBurger.getName());
        burgers.add(koeraBurger.getName());
        System.out.println("Saadaval olevad burgerid: " + burgers);

        String cont = "";
        while (true) {
            ArrayList<String> lisandid = new ArrayList<String>();
            System.out.println("Sisesta, milliste lisanditega burgerit soovid (max 4) ning jäta tühjaks, kui oled lisandite tellimise lõpetanud: ");
            String lisand = input.nextLine();
            while (!lisand.isBlank()) {
                lisandid.add(lisand);
                lisand = input.nextLine();
            }
            if (!lisandid.isEmpty() && lisandid.size() <= 4) {
                Lisandid lisandiKomplekt = new Lisandid(lisandid);
                System.out.println("Sisesta burgeri nimi menüüst, mida soovid lisanditega tellida: ");
                String tellitavBurger = input.nextLine();
                if (tellitavBurger.equals("kanaBurger")) {
                    kanaBurger.telliBurger(lisandiKomplekt);
                    orderPrice += kanaBurger.getPrice();
                    order.add(kanaBurger.toString());
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                } else if (tellitavBurger.equals("peekoniBurger")) {
                    peekoniBurger.telliBurger(lisandiKomplekt);
                    orderPrice += peekoniBurger.getPrice();
                    order.add(peekoniBurger.toString());
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                } else if (tellitavBurger.equals("hobuseBurger")) {
                    hobuseBurger.telliBurger(lisandiKomplekt);
                    orderPrice += hobuseBurger.getPrice();
                    order.add(hobuseBurger.toString());
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                } else if (tellitavBurger.equals("koeraBurger")) {
                    koeraBurger.telliLuxBurger(lisandiKomplekt);
                    orderPrice += koeraBurger.getPrice();
                    order.add(koeraBurger.toString());
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                } else {
                    System.out.println("Sellist burgerit ei ole menüüs");
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                }
            } else {
                Lisandid lisandiKomplekt = new Lisandid();
                System.out.println("Sisesta burgeri nimi menüüst, mida soovid lisanditega tellida: ");
                String tellitavBurger = input.nextLine();
                if (tellitavBurger.equals("kanaBurger")) {
                    kanaBurger.telliBurger(lisandiKomplekt);
                    orderPrice += kanaBurger.getPrice();
                    order.add(kanaBurger.toString());
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                } else if (tellitavBurger.equals("peekoniBurger")) {
                    peekoniBurger.telliBurger(lisandiKomplekt);
                    orderPrice += peekoniBurger.getPrice();
                    order.add(peekoniBurger.toString());
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                } else if (tellitavBurger.equals("hobuseBurger")) {
                    hobuseBurger.telliBurger(lisandiKomplekt);
                    orderPrice += hobuseBurger.getPrice();
                    order.add(hobuseBurger.toString());
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                } else if (tellitavBurger.equals("koeraBurger")) {
                    koeraBurger.telliLuxBurger(lisandiKomplekt);
                    orderPrice += koeraBurger.getPrice();
                    order.add(koeraBurger.toString());
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                } else {
                    System.out.println("Sellist burgerit ei ole menüüs");
                    System.out.println("Jätka? (jah/ei): ");
                    cont = input.nextLine();
                }
            }
            if (!cont.equals("jah")) {
                break;
            }
        }
        System.out.println("Tellimus sisaldab: " + order);
        System.out.println("Tellimuse hind kokku: " + orderPrice);
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