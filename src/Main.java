import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Pojazd pojazd = new Pojazd("Audi", "A5", 35000);
        System.out.println(pojazd.toString());

        System.out.println("Koszt auta: " + pojazd.koszt() + "\n");
        Motor motor = new Motor("BMW", "S", 15000, 500);

        System.out.println(motor.toString());
        System.out.println("Cena motoru: " + motor.koszt() + "\n");

        Osobowka osobowka1 = new Osobowka("Volksvagen", "Golf", 10000, 1000, 2000);
        System.out.println(osobowka1.toString());
        System.out.println("cena Golfa: " + osobowka1.koszt() + "\n");

        Osobowka osobowka2 = new Osobowka("Mercedes", "Klasa E", 74000, 4200);
        System.out.println(osobowka2.toString());
        System.out.println("Koszt Merca: " + osobowka2.koszt() + "\n");

        List<Pojazd> pojazdList = new ArrayList<>();
        pojazdList.add(pojazd);
        pojazdList.add(motor);
        pojazdList.add(osobowka1);
        pojazdList.add(osobowka2);
        System.out.println(pojazdList);



        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

    }
}
