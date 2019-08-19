package pl.pawluk.methods;

/* ### Zadanie 9

W pliku `Main9.java` napisz metodę `factorial`, która przyjmie jako parametr liczbę naturalną `n`. Metoda ma zwrócić wartość *n!*,
czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1...n.*/

public class Main9 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
        System.out.println(factorial(0));

    }

    static int factorial(int n){
        if(n>0){
            int result = 1;
            for (int i=1;i<=n;i++){
                result *= i;
            }
            return result;
        }else{
            return 1;
        }
    }
}
