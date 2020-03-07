/*
Program wypisuje liczby z podanego zakresu. Jeżeli liczba jest podzielna przez 3 to wypisuje Fizz,
jeżeli podzielna przez 5 to Buzz, a jeżeli podzielna jest przez 3 i 5 to wypisuje FizzBuzz.
W przeciwnym wypadku wypisuje samą liczbę.
Program sprawdza czy dolna granica zakresu jest mniejsza od górnej granicy zakresu.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj zakres liczb od A do B, gdzie A to dolna granica, a B to górna.");
        int lowerRange, upperRange;

        do {
            System.out.print("A: ");

            lowerRange = input.nextInt();

            System.out.print("B: ");

            upperRange = input.nextInt();
        }
        while(upperRange<=lowerRange);

        System.out.println("\nWynik:\n");

        for(int i = lowerRange; i<=upperRange; i++){
            if(i==0) System.out.println(i);
            else if(i%3==0 && i%5==0) System.out.println("FizzBuzz");
            else if(i%5==0) System.out.println("Buzz");
            else if(i%3==0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }
}
