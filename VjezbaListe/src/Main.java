


/*
    Zadataka je kreirati popis za kupnju u obliku liste. Funkcionalnosti koje popis za kupnju mora uključivati
    su: dodavanje stvari na popis, brisanje stvari, ažuriranje stvari, ispis stvari, pronalaženje stvari.

    Funkcionalnosti su korisniku dostupne kroz izbornik. Izbornik je izveden kroz switch slučajeve.
 */



import java.util.Scanner;

public class Main {

    private static PopisZaKupnju popisZaKupnju = new PopisZaKupnju();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        boolean prekiniProgram = false;
        int izbor = 0;
        prikaziIzbornik();
        while (!prekiniProgram){
            System.out.println("Unesi svoj izbor:");
            izbor = Integer.valueOf(scanner.nextLine());

            switch (izbor){
                case 0:
                    prikaziIzbornik();
                    break;
                case 1:
                    popisZaKupnju.ispišiPopisZaKupnju();
                    break;
                case 2:
                    dodajStvar();
                    break;
                case 3:
                    azurirajStvar();
                    break;
                case 4:
                    ukloniStvar();
                    break;
                case 5:
                    pronadiStvar();
                    break;
                case 6:
                    prekiniProgram = true;
                    break;
            }
        }


    }
    public static void prikaziIzbornik() {
        System.out.println(" Pritisni: ");
        System.out.println(" 0 - Za prikaz izbornika.");
        System.out.println(" 1 - Za ispis popisa za kupnju.");
        System.out.println(" 2 - Za dodati stvar na popis za kupnju.");
        System.out.println(" 3 - Za ažuriranje stvari sa popisa za kupnju.");
        System.out.println(" 4 - Za ukloniti stvar sa popisa za kupnju.");
        System.out.println(" 5 - Za pronalazak stvari sa popisa za kupnju.");
        System.out.println(" 6 - Za prekinuti program.");
    }
    public static void dodajStvar(){
        System.out.println("Unesi stvar na popis za kupnju:");
        popisZaKupnju.dodajStvar(scanner.nextLine());
    }
    public static void azurirajStvar(){
        System.out.println("Unesi broj pod kojim se stvar trenutno nalazi:");
        int trenutnaStvar = Integer.valueOf(scanner.nextLine());
        System.out.println("Unesi novu stvar:");
        String novaStvar = scanner.nextLine();
        popisZaKupnju.azurirajStvarNaPopisu(trenutnaStvar -1, novaStvar);
    }
    public static void ukloniStvar(){
        System.out.println("Unesi broj pod kojim se stvar trenutno nalazi:");
        int trenutnaStvar = Integer.valueOf(scanner.nextLine());
        popisZaKupnju.ukloniStvarSaPopisa(trenutnaStvar -1);
    }
    public static void pronadiStvar(){
        System.out.println("Stvar koju tražiš:");
        String trazenaStvar = scanner.nextLine();
        if(popisZaKupnju.pronadiStvar(trazenaStvar) != null){
            System.out.println("Stvar " + trazenaStvar + " je pronađena na popisu!");
        } else {
            System.out.println(trazenaStvar + " se ne nalazi na popisu za kupnju!");
        }
    }

}
