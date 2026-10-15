import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        Notatka pierwsza = new Notatka("Nauka", "Powtórzyć zadania z Javy", true);
        System.out.println("Podaj tytuł drugiej notatki:");
        Notatka druga = new Notatka(wejscie.nextLine());
        pierwsza.wypisz();
        druga.wypisz();
    }
}

class Notatka {
    public String tytul;
    public String tresc;
    public boolean priorytet;
    public LocalDate dataDodania;

    public Notatka(String tytul, String tresc, boolean priorytet) {
        this.tytul = tytul;
        this.tresc = tresc;
        this.priorytet = priorytet;
        dataDodania = LocalDate.now();
    }

    public Notatka(String tytul) {
        this.tytul = tytul;
        tresc = "";
        priorytet = false;
        dataDodania = LocalDate.now();
    }

    public void wypisz() {
        System.out.println("____________________");
        if (priorytet) {
            System.out.println("Notatka WAŻNA! " + tytul);
        } else {
            System.out.println("Notatka " + tytul);
        }
        System.out.println(tresc);
        System.out.println(dataDodania);
        System.out.println("____________________");
    }
}
