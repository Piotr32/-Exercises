package pl.pawluk.methods;

/* #### Zadanie 6

W pliku `Main6.java` napisz metodę `checkMaturity`, która:

* przyjmie parametr liczbowy `age` oznaczający wiek użytkownika,
* sprawdzi czy użytkownik jest pełnoletni,
* zwróci wartość `true` &ndash; jeśli jest pełnoletni,
* zwróci wartość `false` &ndash; jeśli nie jest.*/

public class Main6 {

    public static void main(String[] args) {
        System.out.println("age: "+checkMaturity(18));
        System.out.println("age: "+checkMaturity(19));
        System.out.println("age: "+checkMaturity(20));
        System.out.println("age: "+checkMaturity(17));
        System.out.println("age: "+checkMaturity(16));
    }

    static boolean checkMaturity(int age) {
        return age >= 18;
    }
}

