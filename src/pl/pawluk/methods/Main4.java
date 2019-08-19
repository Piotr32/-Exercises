package pl.pawluk.methods;

/* #### Zadanie 4

W pliku `Main4.java` napisz metodę `createName`, która przyjmie następujące parametry:

* `name`: imię,
* `surname`: nazwisko,
* `nickname`: pseudonim.

Metoda ma zwrócić łańcuch tekstowy z połączonymi parametrami, w postaci: "imię pseudonim nazwisko".*/

public class Main4 {

    public static void main(String[] args) {
        System.out.println(createName("Piotr",
                "Pawluk",
                "Piotr32"));

    }

    static String createName(String name, String surname, String nickname){
        return name+ " \"" + nickname + "\" " + surname;
    }
}
