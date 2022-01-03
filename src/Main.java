import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student student = new Student();
        student.imie = "Lukasz";
        student.nazwisko = "Balwierz";
        student.wiek = 24;
        student.czy_zdal = false;

        List<Object> student1 = new ArrayList<>();
        student1.add(student.imie);
        student1.add(student.nazwisko);
        student1.add(student.wiek);
        student1.add(student.czy_zdal);

        for (Object el : student1) {
            System.out.println(el);
        }

        Student studentB = new Student();
        student.imie = "Patryk";
        student.nazwisko = "Kowalski";
        student.wiek = 21;
        student.czy_zdal = true;

        List<Object> student2 = new ArrayList<>();
        student2.add(student.imie);
        student2.add(student.nazwisko);
        student2.add(student.wiek);
        student2.add(student.czy_zdal);

        System.out.println("--------------");

        for (Object el : student2) {
            System.out.println(el);
        }

        Student studentC = new Student();
        studentC.imie = "Marian";
        studentC.nazwisko = "Kokos";
        studentC.wiek = 20;
        studentC.czy_zdal = true;

        List<Object> student3 = new ArrayList<>();
        student3.add(studentC.imie);
        student3.add(studentC.nazwisko);
        student3.add(studentC.wiek);
        student3.add(studentC.czy_zdal);

        System.out.println("--------------");

        for (Object el : student3) {
            System.out.println(el);
        }

    }
}
