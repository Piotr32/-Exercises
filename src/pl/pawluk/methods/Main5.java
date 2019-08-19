package pl.pawluk.methods;

/* #### Zadanie 5

W pliku `Main5.java` napisz metodę `calculateNetto`, która przyjmie argumenty:

* `gross`: kwotę brutto ceny zakupu,
* `vat`: wartość podatku VAT. Możesz założyć, że VAT ma być liczbą zmiennoprzecinkową z zakresu 0 &ndash; 1.

Metoda ma zwrócić wartość netto ceny.*/

public class Main5 {

    public static void main(String[] args) {
        System.out.println("123 PLN = " +
                calculateNetto(123,0.23f));


    }

    static float calculateNetto(float gross, float vat){
        return gross/(1+vat);
    }
    }

