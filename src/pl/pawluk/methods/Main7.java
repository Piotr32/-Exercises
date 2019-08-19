package pl.pawluk.methods;

/* #### Zadanie 7

W pliku `Main7.java` napisz metodę `checkEvenOdd`, która:

* przyjmie parametr liczbowy `number`,
* będzie zwracać wartość typu `String`,
* zwróci wynik "even", jeśli liczba jest parzysta,
* zwróci wynik "odd", jeśli liczba jest nieparzysta.*/

public class Main7 {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i+": "+checkEvenOdd(i));
        }
    }

    static String checkEvenOdd(int number){
        if (number%2==0) {
            return "even";
        }else{
            return "odd";
        }
    }
}
