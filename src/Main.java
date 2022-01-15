import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


         /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */
        List<Student> studentList = new ArrayList<>();

        Student student = new Student();
        student.wydzial = WydzialEnum.Informatyki;
        student.nazwa = "Patryk";
        studentList.add(student);


        student = new Student();
        student.nazwa = "Lukasz";
        student.wydzial = WydzialEnum.Matematyki;
        studentList.add(student);


        for (Student s : studentList) {
            System.out.println(s.nazwa + " - " +  s.wydzial);

        }


    }


}
class Student {
    String nazwa;
    WydzialEnum wydzial;

    public String getNazwa(String nazwa) {
        return nazwa;
    }
    public void setImie(String nazwa) {
        this.nazwa = "Tomasz";
    }


}


        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        class Osoba {
            private String imie;
            private String nazwisko;
            private Integer indeks;


            Osoba(String imie, String nazwisko, Integer indeks) {

                this.imie = "Patryk";
                this.nazwisko = "Nowak";
                this.indeks = 12345;

            }
            public String getImie() {
                return imie;
            }
            public String getNazwisko() {
                return nazwisko;
            }
            public int getIndeks() {
                return indeks;
            }

            public void setImie(String imie) {
                this.imie = "Marek";
            }
            public void setNazwisko(String nazwisko) {
                this.nazwisko = "Kowalski";
            }
            public void setIndeks(int indeks) {
                this.indeks = 54321;
            }

            public void Informacje_o_osobie() {
                System.out.println("Imie: " + imie + ", Nazwisko: " + nazwisko);
            }
        }



        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */



